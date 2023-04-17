package com.UST.InterviewSchedule.controller;

import com.UST.InterviewSchedule.dto.InterviewscheduleDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Interviewschedule API")
public interface InterviewscheduleController {
    @ApiOperation("Add new data")
    public InterviewscheduleDTO save(@RequestBody InterviewscheduleDTO interviewschedule);

    @ApiOperation("Find by Id")
    public InterviewscheduleDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<InterviewscheduleDTO> list();

    @ApiOperation("Pagination request")
    public Page<InterviewscheduleDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public InterviewscheduleDTO update(@RequestBody InterviewscheduleDTO dto, @PathVariable("id") Long id);
}