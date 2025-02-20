package pe.edu.idat.demo_api_rest.service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FundamentosService
        implements IFundamentosService {


    @Override
    public String validarNumeroPrimo(int numero) {
        if (numero < 2) {
            return " No es PRIMO";
        }
        for (int i = 0; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "No es PRIMO";
            }
        }
        return "Es PRIMO";
    }

    @Override
    public String calcularFactorial(int numero) {
        if (numero < 0) {
            return "Factorial no válido";
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return "El factorial es = " + factorial;
    }

    @Override
    public List<Integer> calcularFibonacci(int numero) {
        List<Integer> fibonacci = new ArrayList<>();
        if (numero <= 0) {
            return fibonacci;
        }
        int a = 0, b = 1;
        for (int i = 0; i < numero; i++) {
            fibonacci.add(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
        return fibonacci;
    }
}

