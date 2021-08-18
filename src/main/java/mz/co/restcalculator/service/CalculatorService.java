package mz.co.restcalculator.service;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Dário Silvano Maxaieie
 * This is the service of the Calculator operations, we have all the basic operations here
 */
@Service
public class CalculatorService {

    private BigDecimal aValue;
    private BigDecimal bValue;
    private BigDecimal result;


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return the sum of the two parameters (a & b)
     */
    public String sum(String a, String b){


        aValue = new BigDecimal(a);

        bValue = new BigDecimal(b);

        result = aValue.add(bValue);

        return String.valueOf(result);

    }

    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return the difference of the two parameters (a & b)
     */
    public String difference(String a, String b){


        aValue = new BigDecimal(a);

        bValue = new BigDecimal(b);

        result = aValue.subtract(bValue);

        return String.valueOf(result);

    }


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return the product of the two parameters (a & b)
     */
    public String product(String a, String b){


        aValue = new BigDecimal(a);

        bValue = new BigDecimal(b);

        result = aValue.multiply(bValue);

        return String.valueOf(result);

    }


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return the division of the two parameters (a & b)
     */
    public String division(String a, String b){


        aValue = new BigDecimal(a);

        bValue = new BigDecimal(b);

        result = aValue.divide(bValue);

        return String.valueOf(result);

    }



}
