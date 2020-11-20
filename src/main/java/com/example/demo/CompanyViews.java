package com.example.demo;

import lombok.Data;

@Data
public class CompanyViews {

    public static class Normal{};

    public static class Manager extends Normal{};

    public static class HR extends Normal{};

}