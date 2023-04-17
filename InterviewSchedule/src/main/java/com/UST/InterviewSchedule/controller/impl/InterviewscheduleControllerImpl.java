package com.UST.InterviewSchedule.controller.impl;

import com.UST.InterviewSchedule.controller.InterviewscheduleController;
import com.UST.InterviewSchedule.dto.InterviewscheduleDTO;
import com.UST.InterviewSchedule.entity.Interviewschedule;
import com.UST.InterviewSchedule.mapper.InterviewscheduleMapper;
import com.UST.InterviewSchedule.service.InterviewscheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/interviewschedule")
@RestController
public class InterviewscheduleControllerImpl implements InterviewscheduleController {
    private final InterviewscheduleService interviewscheduleService;
    private final InterviewscheduleMapper interviewscheduleMapper;

    public InterviewscheduleControllerImpl(InterviewscheduleService interviewscheduleService, InterviewscheduleMapper interviewscheduleMapper) {
        this.interviewscheduleService = interviewscheduleService;
        this.interviewscheduleMapper = interviewscheduleMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InterviewscheduleDTO save(@RequestBody InterviewscheduleDTO interviewscheduleDTO) {
        Interviewschedule interviewschedule = interviewscheduleMapper.asEntity(interviewscheduleDTO);
        return interviewscheduleMapper.asDTO(interviewscheduleService.save(interviewschedule));
    }

    @Override
    @GetMapping("/{id}")
    public InterviewscheduleDTO findById(@PathVariable("id") Long id) {
        Interviewschedule interviewschedule = interviewscheduleService.findById(id).orElse(null);
        return interviewscheduleMapper.asDTO(interviewschedule);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        interviewscheduleService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<InterviewscheduleDTO> list() {
        return interviewscheduleMapper.asDTOList((List<Interviewschedule>) interviewscheduleService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<InterviewscheduleDTO> pageQuery(Pageable pageable) {
        Page<Interviewschedule> interviewschedulePage = interviewscheduleService.findAll(pageable);
        List<InterviewscheduleDTO> dtoList = interviewschedulePage
                .stream()
                .map(interviewscheduleMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, interviewschedulePage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public InterviewscheduleDTO update(@RequestBody InterviewscheduleDTO interviewscheduleDTO, @PathVariable("id") Long id) {
        Interviewschedule interviewschedule = interviewscheduleMapper.asEntity(interviewscheduleDTO);
        return interviewscheduleMapper.asDTO(interviewscheduleService.update(interviewschedule, id));
    }
}