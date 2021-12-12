package com.mylab.shop.controllers;

import com.mylab.shop.services.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PurchaseViewController {

    PurchasesService purchasesService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("purchases", PurchasesService.getAllPurchases());
        return "index";
    };


}
