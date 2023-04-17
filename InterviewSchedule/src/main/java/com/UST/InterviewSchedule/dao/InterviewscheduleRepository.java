package com.UST.InterviewSchedule.dao;

import com.UST.InterviewSchedule.entity.Interviewschedule;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewscheduleRepository extends PagingAndSortingRepository<Interviewschedule, Long> {
}