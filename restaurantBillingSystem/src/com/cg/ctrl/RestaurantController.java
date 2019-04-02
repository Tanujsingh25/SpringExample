package com.cg.ctrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.dto.Order;
import com.cg.service.RestaurantService;
@Controller
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService=null;
	public RestaurantService getRestaurantService() {
		return restaurantService;
	}
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	public RestaurantController() {	}
	@RequestMapping(value="generateInvoice", method=RequestMethod.POST)
	public String displayInvoice(Model model,@ModelAttribute(value="orderItem") @Valid Order orderItem,BindingResult result) {
		
		return "ConfirmOrder";
	}
}
