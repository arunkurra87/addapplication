package com.tmo.bootcamp.model;

public class AddApplicationResponse {
    private String sum;

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "AdderAppResponse{" +
                "sum='" + sum + '\'' +
                '}';
    }
}
