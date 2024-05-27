package com.example.demo.controllers;

import com.example.demo.entities.SanPham;
import com.example.demo.repositories.assignment2.SanPhamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamRepository spRepo;

    @GetMapping("index")
    public String index(Model model)
    {
        List<SanPham> ds = this.spRepo.findAll();
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("data") SanPham sp)
    {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(Model model, @Valid SanPham sp, BindingResult validateResult) {
        if (validateResult.hasErrors()) {
            List<FieldError> listFieldError = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();
            for (FieldError e: listFieldError) {
                errors.put(e.getField(), e.getDefaultMessage());
            }

            model.addAttribute("errors", errors);
            model.addAttribute("data", sp);
            return "san_pham/create";
        }

        this.spRepo.save(sp);
        return "redirect:/san-pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)
    {
        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model)
    {
        SanPham sp = this.spRepo.findById(id).get();
        model.addAttribute("data", sp);
        return "san_pham/edit";
    }

    @PostMapping("update/{id}")
    public String update(SanPham sp)
    {
        this.spRepo.save(sp);
        return "redirect:/san-pham/index";
    }
}
