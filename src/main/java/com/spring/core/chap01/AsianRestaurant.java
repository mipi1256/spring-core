package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant{

   private KimuraChef chef = new KimuraChef();
   private SushiCourse course = new SushiCourse();

   public void order() {
      System.out.println("스시 오마카세를 주문합니다.");
      // 요리 코스 메뉴를 구성해야 한다.
      course.combineMenu();
      // 요리사에게 요리 명령을 내려야 한다.
      chef.cook();
   }

}












































