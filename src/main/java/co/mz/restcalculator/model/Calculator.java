package co.mz.restcalculator.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigDecimal;

/**
 * @author Dário Silvano Maxaieie
 */
public class Calculator {

    private BigDecimal a;
    private BigDecimal b;
    private char operator;

    public Calculator() {
    }


    public Calculator(BigDecimal a, BigDecimal b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }


    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = getClass().getSimpleName()+"\n";

        try {

            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);

        }catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }

        return jsonString;
    }
}
