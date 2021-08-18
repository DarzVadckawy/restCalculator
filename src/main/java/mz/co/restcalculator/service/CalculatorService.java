package mz.co.restcalculator.service;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Dário Silvano Maxaieie
 */
@Service
public class CalculatorService {

    private BigDecimal a_value;
    private BigDecimal b_value;
    private BigDecimal result;


    public String sum(String a, String b){


        a_value = new BigDecimal(a);

        b_value = new BigDecimal(b);

        result = a_value.add(b_value);

        return String.valueOf(result);

    }

    public String difference(String a, String b){


        a_value = new BigDecimal(a);

        b_value = new BigDecimal(b);

        result = a_value.subtract(b_value);

        return String.valueOf(result);

    }

    public String product(String a, String b){


        a_value = new BigDecimal(a);

        b_value = new BigDecimal(b);

        result = a_value.multiply(b_value);

        return String.valueOf(result);

    }

    public String division(String a, String b){


        a_value = new BigDecimal(a);

        b_value = new BigDecimal(b);

        result = a_value.divide(b_value);

        return String.valueOf(result);

    }



}
