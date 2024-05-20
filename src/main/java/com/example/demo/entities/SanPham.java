package com.example.demo.entities;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class SanPham {
    private Integer id;

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank
    private String ten;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    private int trangThai;
}
