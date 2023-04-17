package com.UST.InterviewSchedule.mapper;


import com.UST.InterviewSchedule.dto.InterviewscheduleDTO;
import com.UST.InterviewSchedule.entity.Interviewschedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface InterviewscheduleMapper extends GenericMapper<Interviewschedule, InterviewscheduleDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Interviewschedule asEntity(InterviewscheduleDTO dto);
}