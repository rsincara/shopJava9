package com.mylab.shop.controllers;

import com.mylab.shop.services.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PurchaseBoughtController {

    PurchasesService purchasesService;

    @ResponseBody
    @RequestMapping(path = "/purchase/{id}/bought", method = RequestMethod.POST)
    public void buy(@PathVariable("id") Long id) {
        PurchasesService.setIsBought(id);
    }

}
