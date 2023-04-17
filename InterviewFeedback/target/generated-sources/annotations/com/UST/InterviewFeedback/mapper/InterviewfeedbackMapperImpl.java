package com.UST.InterviewFeedback.mapper;

import com.UST.InterviewFeedback.dto.InterviewfeedbackDTO;
import com.UST.InterviewFeedback.entity.Interviewfeedback;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T16:42:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class InterviewfeedbackMapperImpl implements InterviewfeedbackMapper {

    @Override
    public InterviewfeedbackDTO asDTO(Interviewfeedback entity) {
        if ( entity == null ) {
            return null;
        }

        InterviewfeedbackDTO interviewfeedbackDTO = new InterviewfeedbackDTO();

        interviewfeedbackDTO.setId( entity.getId() );
        interviewfeedbackDTO.setUserid( entity.getUserid() );
        interviewfeedbackDTO.setCandidateName( entity.getCandidateName() );
        interviewfeedbackDTO.setPosition( entity.getPosition() );
        interviewfeedbackDTO.setInterviewerName( entity.getInterviewerName() );
        interviewfeedbackDTO.setInterviewerEmpid( entity.getInterviewerEmpid() );
        interviewfeedbackDTO.setRating( entity.getRating() );
        interviewfeedbackDTO.setStatus( entity.getStatus() );

        return interviewfeedbackDTO;
    }

    @Override
    public List<Interviewfeedback> asEntityList(List<InterviewfeedbackDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Interviewfeedback> list = new ArrayList<Interviewfeedback>( dtoList.size() );
        for ( InterviewfeedbackDTO interviewfeedbackDTO : dtoList ) {
            list.add( asEntity( interviewfeedbackDTO ) );
        }

        return list;
    }

    @Override
    public List<InterviewfeedbackDTO> asDTOList(List<Interviewfeedback> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<InterviewfeedbackDTO> list = new ArrayList<InterviewfeedbackDTO>( entityList.size() );
        for ( Interviewfeedback interviewfeedback : entityList ) {
            list.add( asDTO( interviewfeedback ) );
        }

        return list;
    }

    @Override
    public Interviewfeedback asEntity(InterviewfeedbackDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Interviewfeedback interviewfeedback = new Interviewfeedback();

        interviewfeedback.setId( dto.getId() );
        interviewfeedback.setUserid( dto.getUserid() );
        interviewfeedback.setCandidateName( dto.getCandidateName() );
        interviewfeedback.setPosition( dto.getPosition() );
        interviewfeedback.setInterviewerName( dto.getInterviewerName() );
        interviewfeedback.setInterviewerEmpid( dto.getInterviewerEmpid() );
        interviewfeedback.setRating( dto.getRating() );
        interviewfeedback.setStatus( dto.getStatus() );

        return interviewfeedback;
    }
}
