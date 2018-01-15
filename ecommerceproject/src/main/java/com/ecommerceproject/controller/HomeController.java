package com.ecommerceproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
public String land()
{
	return "index";
}

@RequestMapping("log")
public String login()
{
	return "login";
}

@RequestMapping("ch")
public String checkout()
{
	return "checkout";

}
@RequestMapping("sh")
public String shop()
{
	return "shop";

}
@RequestMapping("sng")
public String single()
{
	return "single";

}
}

