package com.UST.InterviewSchedule.service;

import com.UST.InterviewSchedule.entity.Interviewschedule;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface InterviewscheduleService extends PagingAndSortingRepository<Interviewschedule, Long> {
    List<Interviewschedule> save(List<Interviewschedule> entities);

    Interviewschedule update(Interviewschedule entity, Long id);
}