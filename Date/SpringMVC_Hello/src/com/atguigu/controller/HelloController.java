package com.atguigu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/handle01")
	public String handle01(Map<String, Object> map) {
		map.put("msg", "你好啊");
		return "success";
	}
	
	@RequestMapping("/handle02")
	public String handle02(Model model) {
		model.addAttribute("msg", "你好坏！！！");
		return "success";
	}
/*
	*//**
	 * 1、给页面携带数据的几种办法： 1）、返回值变成ModelAndView（既携带模型数据，又有页面地址信息） 默认放在request域中
	 * 2）、可以给方法入参位置， 写一个Map，Model，ModelMap
	 *//*
	@RequestMapping("/testmodelandview")
	public ModelAndView handle01() {
		// 携带数据给success.jsp页面
		// 传入之前return的东西。传入的视图名会经过视图解析器进行拼串
		// ModelAndView mv = new ModelAndView("WEB-INF/success");
		// mv.addObject("msg", "你好");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/success");
		mv.addObject("msg", "我也好");
		return mv;
	}

	*//**
	 * Map，Model，ModelMap;给她们里面保存的数据都放在了request域中 BindingAwareModelMap;
	 * 
	 * 
	 * 
	 * Map Model(接口) || || || || \/ || ModelMap || \\ || \\ \/ ExtendedModelMap ||
	 * || BindingAwareModelMap 相当于给BindingAwareModelMap中保存的数据会被放在请求域中
	 * 
	 * method.invoke(obj,args)
	 * 
	 * @return
	 *//*
	@RequestMapping("/testmap")
	public String handle02(Map<String, Object> map) {
		map.put("msg", "汇源。。。");
		System.out.println(map.getClass());
		return "WEB-INF/success";
	}

	@RequestMapping("/testmodel")
	public String handle03(Model model) {
		model.addAttribute("msg", "果汁");
		System.out.println(model.getClass());
		return "WEB-INF/success";
	}

	@RequestMapping("/testmodelmap")
	public String handle04(ModelMap mm) {
		mm.addAttribute("msg", "肾宝");
		System.out.println(mm.getClass());
		return "WEB-INF/success";
	}*/

}
