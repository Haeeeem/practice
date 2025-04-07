package com.choongang.stm.repository;

import java.util.ArrayList;
import java.util.List;

import com.choongang.stm.dto.StudentDto;

// 여기 코드 이제는 의미 있음. 이해 및 반복 추가
public class Repository {

    private List<StudentDto> studentList = new ArrayList<>();

    public void save(StudentDto studentDto) {
        studentList.add(studentDto);
    }

    public List<StudentDto> findAll() {
        // 얕게 복사해서 리턴
        List<StudentDto> result = new ArrayList<>();

        for(StudentDto e : studentList) {
            result.add(e);
        }

        return result;
    }

    public List<StudentDto> findByName(String searchName) {

        List<StudentDto> result = new ArrayList<>();

        for(StudentDto e : studentList) {
            if(e.getName().contains(searchName)) {
                result.add(e);
            }
        }
        
        return result;
    }

    public int removeByName(String deleteName) {
        // 주의 사항: 앞으로 List 사용시 remove를 활용할 일은 거의 없음
        // 특정 List를 반복하는 도중에 그 List에 요소를 추가 삭제 할 수 없음
        // 우회하기 위한 코드
        // 살짝 넘어가도 되는 코드
        List<StudentDto> deleteStudentList = new ArrayList<>();
        for(StudentDto e : studentList) {
            if(e.getName().equals(deleteName)) {
                deleteStudentList.add(e);
            }
        }
        for(StudentDto e : deleteStudentList) {
            studentList.remove(e);
        }

        return deleteStudentList.size();
    }


}
