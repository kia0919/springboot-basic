package com.umsuhyun.basic.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.umsuhyun.basic.dto.request.student.PostStudentRequestDto;
import com.umsuhyun.basic.service.studentService;

@Service
public class StudentServiceImplement implements studentService {
    
    @Override
    public ResponseEntity<String>
    postStudent(PostStudentRequestDto dto) {
        return null;
    }
}
