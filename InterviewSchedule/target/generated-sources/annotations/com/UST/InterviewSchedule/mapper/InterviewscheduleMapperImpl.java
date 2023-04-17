package com.UST.InterviewSchedule.mapper;

import com.UST.InterviewSchedule.dto.InterviewscheduleDTO;
import com.UST.InterviewSchedule.entity.Interviewschedule;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-11T14:57:17+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class InterviewscheduleMapperImpl implements InterviewscheduleMapper {

    @Override
    public InterviewscheduleDTO asDTO(Interviewschedule entity) {
        if ( entity == null ) {
            return null;
        }

        InterviewscheduleDTO interviewscheduleDTO = new InterviewscheduleDTO();

        interviewscheduleDTO.setId( entity.getId() );
        interviewscheduleDTO.setName( entity.getName() );
        interviewscheduleDTO.setEmail( entity.getEmail() );
        interviewscheduleDTO.setPhnumber( entity.getPhnumber() );
        interviewscheduleDTO.setSkills( entity.getSkills() );
        interviewscheduleDTO.setExperience( entity.getExperience() );
        interviewscheduleDTO.setDate( entity.getDate() );
        interviewscheduleDTO.setTime( entity.getTime() );
        interviewscheduleDTO.setLink( entity.getLink() );
        interviewscheduleDTO.setPoc( entity.getPoc() );

        return interviewscheduleDTO;
    }

    @Override
    public List<Interviewschedule> asEntityList(List<InterviewscheduleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Interviewschedule> list = new ArrayList<Interviewschedule>( dtoList.size() );
        for ( InterviewscheduleDTO interviewscheduleDTO : dtoList ) {
            list.add( asEntity( interviewscheduleDTO ) );
        }

        return list;
    }

    @Override
    public List<InterviewscheduleDTO> asDTOList(List<Interviewschedule> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<InterviewscheduleDTO> list = new ArrayList<InterviewscheduleDTO>( entityList.size() );
        for ( Interviewschedule interviewschedule : entityList ) {
            list.add( asDTO( interviewschedule ) );
        }

        return list;
    }

    @Override
    public Interviewschedule asEntity(InterviewscheduleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Interviewschedule interviewschedule = new Interviewschedule();

        interviewschedule.setName( dto.getName() );
        interviewschedule.setEmail( dto.getEmail() );
        interviewschedule.setPhnumber( dto.getPhnumber() );
        interviewschedule.setSkills( dto.getSkills() );
        interviewschedule.setExperience( dto.getExperience() );
        interviewschedule.setDate( dto.getDate() );
        interviewschedule.setTime( dto.getTime() );
        interviewschedule.setLink( dto.getLink() );
        interviewschedule.setPoc( dto.getPoc() );

        return interviewschedule;
    }
}
