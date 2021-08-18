package mz.co.restcalculator.controller;

import mz.co.restcalculator.service.CalculatorService;
import mz.co.restcalculator.utils.Constants;
import mz.co.restcalculator.utils.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


/**
 * @author Dário Silvano Maxaieie
 * This is the rest controller of the calculator with the endpoints of the operations
 */
@RestController
public class CalculatorController {


    @Autowired
    CalculatorService calculatorService;

    Logger logger = Logger.getLogger(getClass().getName());


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return The sum of the two parameters (a & b) as a JSON
     */
    @GetMapping(value="/sum")
    @ResponseBody
    public ResponseEntity<Map<String,Object>> calcSum(@RequestParam(value = "a") String a,
                                                      @RequestParam(value = "b") String b){

        Map<String, Object> payload = new HashMap<>();

        payload.put(Constants.SESSION_ID, System.currentTimeMillis());

        if(Helper.containsConsonant(a) || Helper.containsConsonant(b)){

            payload.put(Constants.BAD_PARAMETER, true);

            logger.warning("Error: " + Constants.BAD_PARAMETER);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        } else {

            logger.info("calculating the sum...");

            payload.put(Constants.RESULT, calculatorService.sum(a, b));
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        }

    }


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return The difference of the two parameters (a & b) as a JSON
     */
    @GetMapping(value="/difference")
    public ResponseEntity<Map<String,Object>> calcDifference(@RequestParam(value = "a") String a,
                                                             @RequestParam(value = "b") String b){

        Map<String, Object> payload = new HashMap<>();

        payload.put(Constants.SESSION_ID, System.currentTimeMillis());

        if(Helper.containsConsonant(a) || Helper.containsConsonant(b)){

            payload.put(Constants.BAD_PARAMETER, true);

            logger.warning("Error: " + Constants.BAD_PARAMETER);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        } else {

            logger.info("calculating the difference...");

            payload.put(Constants.RESULT, calculatorService.difference(a, b));
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        }
    }


    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return The product of the two parameters (a & b) as a JSON
     */
    @GetMapping(value="/product")
    public ResponseEntity<Map<String,Object>> calcProduct(@RequestParam(value = "a") String a,
                                                          @RequestParam(value = "b") String b){

        Map<String, Object> payload = new HashMap<>();

        payload.put(Constants.SESSION_ID, System.currentTimeMillis());

        if(Helper.containsConsonant(a) || Helper.containsConsonant(b)){

            payload.put(Constants.BAD_PARAMETER, true);

            logger.warning("Error: " + Constants.BAD_PARAMETER);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        } else {

            logger.info("calculating the product...");

            payload.put(Constants.RESULT, calculatorService.product(a, b));
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        }
    }



    /**
     * @param a this is the first operand
     * @param b this is the second operand
     * @return The division of the two parameters (a & b) as a JSON
     */
    @GetMapping(value="/division")
    public ResponseEntity<Map<String,Object>> calcDivision(@RequestParam(value = "a") String a,
                                                           @RequestParam(value = "b") String b){

        Map<String, Object> payload = new HashMap<>();

        payload.put(Constants.SESSION_ID, System.currentTimeMillis());

        if(Helper.containsConsonant(a) || Helper.containsConsonant(b)){

            payload.put(Constants.BAD_PARAMETER, true);

            logger.warning("Error: " + Constants.BAD_PARAMETER);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        } else {

            logger.info("calculating the division...");

            payload.put(Constants.RESULT, calculatorService.division(a, b));
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                    .body(payload);
        }
    }


    
}
