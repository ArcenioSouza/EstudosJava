package br.com.erudio.apirestwithspringboot.controllers;

import br.com.erudio.apirestwithspringboot.exceptions.UnsupportedMathOperationException;
import br.com.erudio.apirestwithspringboot.repository.MathRepositories;
import br.com.erudio.apirestwithspringboot.services.MathServices;
import org.springframework.web.bind.annotation.*;


@RestController
public class MathController {

    @RequestMapping(value ="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo)
    throws Exception{
        if (!MathServices.isNumeric(numberOne) || !MathServices.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a number please");
        }
        return MathRepositories.sum(MathServices.convertToDouble(numberOne), MathServices.convertToDouble(numberTwo));
    }
}