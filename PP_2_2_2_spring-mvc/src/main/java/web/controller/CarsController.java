package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImp;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarDao carDao;

    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping
    public String anyCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carDao.countCarsList(0));
        } else {
            model.addAttribute("cars", carDao.countCarsList(CarDaoImp.getCarId() - count));
        }
        return "cars";
    }


}
