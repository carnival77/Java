package com.app1;

class Circle {

    int radius;                      

    Circle(int radius) {

        this.radius = radius;

    }

    double getArea() {

        return radius * radius * 3.14;

    }

}

 

class TestExam01  {

    public static void main(String args[]) {

        Circle obj = new Circle(5);

        System.out.println("������ = " + obj.radius);

        System.out.println("���� = " + obj.getArea());

    }

}