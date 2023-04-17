package com.UST.InterviewSchedule.service.impl;

import com.UST.InterviewSchedule.dao.InterviewscheduleRepository;
import com.UST.InterviewSchedule.entity.Interviewschedule;
import com.UST.InterviewSchedule.service.InterviewscheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class InterviewscheduleServiceImpl implements InterviewscheduleService {
    private final InterviewscheduleRepository repository;

    public InterviewscheduleServiceImpl(InterviewscheduleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Interviewschedule save(Interviewschedule entity) {
        return repository.save(entity);
    }

    @Override
    public List<Interviewschedule> save(List<Interviewschedule> entities) {
        return (List<Interviewschedule>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Interviewschedule entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Interviewschedule> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Interviewschedule> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Interviewschedule> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Interviewschedule> findAll() {
        return (List<Interviewschedule>) repository.findAll();
    }

    @Override
    public Iterable<Interviewschedule> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Iterable<Interviewschedule> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Interviewschedule> findAll(Pageable pageable) {
        Page<Interviewschedule> entityPage = repository.findAll(pageable);
        List<Interviewschedule> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public Interviewschedule update(Interviewschedule entity, Long id) {
        Optional<Interviewschedule> optional = findById(id) ;
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}