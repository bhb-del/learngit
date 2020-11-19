package com.imooc.springboot;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Digits;

@Data
public class User {
//数据校验用户输入的数字是否为正确的数字，是返回Bingo,否则返回try again

    //1.该注解两边均为闭区间
    @Range(min = 100000,max = 999999,message = "猜测的数字要在随机数之间")
    private int number;


}
