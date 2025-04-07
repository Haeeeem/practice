package com.choongang.stm.dto;

// DTO = 핵심 자료의 형태 (기능 존재 X, 단 setter, getter는 존재)
public class StudentDto {
    // 필드
    private String name;
    private int age;
    private int score;

    // 생성자
    public StudentDto() {}
    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // setter: 문법적으로는 메서드, 개념적으로는 기능 X
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(int score) {
        this.score = score;
    }

    // getter: 문법적으로는 메서드, 개념적으로는 기능 X
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }


}
