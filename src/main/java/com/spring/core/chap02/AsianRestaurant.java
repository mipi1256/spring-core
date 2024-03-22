package com.spring.core.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ar")
public class AsianRestaurant implements Restaurant {

   private Chef chef;
   private SushiCourse course = new SushiCourse();

   @Autowired
   public AsianRestaurant(@Qualifier("kc") Chef chef) {
      this.chef = chef;
   }

   public void order() {
      System.out.println("스시 오마카세를 주문합니다.");
      // 요리 코스 메뉴를 구성해야 한다.
      course.combineMenu();
      // 요리사에게 요리 명령을 내려야 한다.
      chef.cook();
   }

}












































