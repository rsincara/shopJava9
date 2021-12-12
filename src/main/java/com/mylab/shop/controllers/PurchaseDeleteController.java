package com.mylab.shop.controllers;

import com.mylab.shop.services.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PurchaseDeleteController {

    PurchasesService purchasesService;

    @RequestMapping(path = "purchase/{id}/delete", method = RequestMethod.POST)
    public String deletePurchase(@PathVariable("id") Long id) {
        PurchasesService.removeById(id);
        return "redirect:/";
    }

}