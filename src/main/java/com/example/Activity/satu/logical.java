/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Activity.satu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author AliFzaL
 */
@Controller
public class logical {

//    @GetMapping("/index")
//    public String viewForm(Model model){
//        model.addAttribute("fruit", fruit);
//        return "index";
//    }
    @PostMapping("/result")
    @ResponseBody
    public String resultform(@ModelAttribute Fruit fruit, BindingResult result, Model model) {
        model.addAttribute("Fruit", fruit);
        return "result";

    }

    @RequestMapping("/jumlah")
    public String getJumlah(Model model, HttpServletRequest tambah) {
        String harga = tambah.getParameter("inta");
        String beli = tambah.getParameter("intb");
        String name = tambah.getParameter("string1");
        int a = Integer.valueOf(harga);
        int b = Integer.valueOf(beli);
        int bayar = a * b;
        int diskon;
        if (bayar > 16000 && bayar <= 25000) {
            diskon = bayar * 10 / 100;
        } else if (bayar > 25000) {
            diskon = bayar * 15 / 100;
        } else {
            diskon = 0;
        }
        int total = bayar - diskon;

        model.addAttribute("nama", "Nama : "+ name);
        model.addAttribute("bayar1", "Jumlah Bayar : " + bayar);
        model.addAttribute("diskon1", "Diskon : " + diskon);
        model.addAttribute("total1", "Total : " + total);
        return "MuhAlifAlizal";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Integer add() {
        int a = 4;
        int b = 5000;
        int c = a * b;
        return c;
    }

}
