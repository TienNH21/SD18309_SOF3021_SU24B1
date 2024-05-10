package com.example.demo.controllers;

import com.example.demo.entities.SanPham;
import com.example.demo.repositories.assignment1.SanPhamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {
    private SanPhamRepository spRepo = new SanPhamRepository();

    @GetMapping("index")
    public String index(Model model)
    {
        List<SanPham> ds = this.spRepo.findAll();
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create()
    {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(SanPham sp) {
        this.spRepo.create(sp);
        return "san_pham/create";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)
    {
        this.spRepo.deleteById(id);
        return "san_pham/create";
    }
}
