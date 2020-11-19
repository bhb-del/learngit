package com.imooc.springboot;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Data
@Service
@RestController
public class RanNumService {



    @PostMapping("/startGame()")
    public void number(){
        //主代码
        Random r = new Random();
        List<Integer> list = new LinkedList<Integer>();
        boolean x = true;
        while (x) {
            int a = r.nextInt(999999 - 99999) + 99999;
            int b = r.nextInt(999999 - 99999) + 99999;
            int c = r.nextInt(999999 - 99999) + 99999;
            if (a != b && a != c && b != c) {
                list.add(a);
                list.add(b);
                list.add(c);
                x = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("第" + (i + 1) + "个数:" + list.get(i));
            System.out.println();
        }
        //系统从a,b,c中随机选择以一个正确答案的数字
        int d = r.nextInt(3);
        int correctNum = list.get(d);
        //用户选择其中一个数字
        boolean y = true;
        while (y) {
            System.out.println("请选择其中一个数字");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            //校验
            if (data == correctNum) {
                System.out.println("bingo");
                y = false;
            } else if (data != correctNum) {
                System.out.println("try again");
            } else {
                System.out.println("格式错误，只能选择输入以下三个数字，请重新输入...");
            }
        }
        System.out.println("游戏结束");
    }
}
