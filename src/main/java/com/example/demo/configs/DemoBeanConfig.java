package com.example.demo.configs;

import com.example.demo.entities.SanPham;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoBeanConfig {
    @Bean(name = "bean1")
    public SanPham getSPBean1()
    {
        SanPham sp = new SanPham(1, "PH1", "Ao Nam", 1);
        return sp;
    }

    @Bean(name = "bean2")
    public SanPham getSPBean2()
    {
        SanPham sp = new SanPham(2, "PH2", "Ao Nu", 1);
        return sp;
    }
}
