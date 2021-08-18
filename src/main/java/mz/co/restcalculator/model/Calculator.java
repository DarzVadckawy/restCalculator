package mz.co.restcalculator.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigDecimal;

/**
 * @author Dário Silvano Maxaieie
 * This is the model of the Calculator to future use creating, manipulating and storing the calculations
 */
public class Calculator {

    private int id;
    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal result;
    private char operator;

    public Calculator() {
    }


    public Calculator(int id, BigDecimal a, BigDecimal b, BigDecimal result, char operator) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.result = result;
        this.operator = operator;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
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
