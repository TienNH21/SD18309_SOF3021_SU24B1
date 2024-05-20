package com.example.demo.controllers;

import com.example.demo.entities.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    @Qualifier("bean1")
    private SanPham sp;

    @RequestMapping("hello")
    public String sayHello()
    {
        this.sp.setTrangThai(1);

        System.out.println(this.sp.getId());
        System.out.println(this.sp.getMa());
        System.out.println(this.sp.getTen());
        System.out.println(this.sp.getTrangThai());
        return "hello";
    }
}
