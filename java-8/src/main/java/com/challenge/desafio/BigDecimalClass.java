package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;

import java.math.BigDecimal;

public class BigDecimalClass {
    public BigDecimalClass(BigDecimal number){
        setBig1(number);
        setBig2(number);
        setBig3(number);
        setBig4(number);
    }

    @Somar
    public BigDecimal big1;

    @Somar
    public BigDecimal big2;

    @Subtrair(subtrair = true)
    public BigDecimal big3;

    @Subtrair(subtrair = true)
    public BigDecimal big4;

    public String bigDecimalString1;
    public String bigDecimalString2;

    public BigDecimal getBig1() {
        return big1;
    }

    public void setBig1(BigDecimal big1) {
        this.big1 = big1;
    }

    public BigDecimal getBig2() {
        return big2;
    }

    public void setBig2(BigDecimal big2) {
        this.big2 = big2;
    }

    public BigDecimal getBig3() {
        return big3;
    }

    public void setBig3(BigDecimal big3) {
        this.big3 = big3;
    }

    public BigDecimal getBig4() {
        return big4;
    }

    public void setBig4(BigDecimal big4) {
        this.big4 = big4;
    }
}
