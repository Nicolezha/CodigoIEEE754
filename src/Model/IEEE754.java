/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Nicole Hernandez
 */
public class IEEE754 {

    private String sign32bits, sign64bits, expo32bits, expo64bits, mantisa32bits, mantisa64bits,
            ieee64bits, ieee32bits;
    private double decimal32bits, decimal64bits;

    public IEEE754() {
    }

    public void iEEE32bitsToDecimal(String cadena) {
        int sign = 1;
        if (cadena.charAt(0) == '1') {
            this.setSign32bits("1");
            sign = -1;
        } else {
            this.setSign32bits("0");
        }

        int exponent = this.binaryToDecimal(cadena.substring(1, 9));
        exponent = Math.max(127, exponent) - Math.min(127, exponent);
        this.setExpo32bits(cadena.substring(1, 9));
        String mantisa = cadena.substring(9, 32);
        this.setMantisa32bits(mantisa);
        double decimal = this.mantisaToDecimal(cadena.substring(9, 32)) * Math.pow(2, exponent);
        this.setDecimal32bits(decimal * sign);
    }

    public void iEEE64bitsToDecimal(String cadena) {
        int sign = 1;
        if (cadena.charAt(0) == '1') {
            this.setSign64bits("1");
            sign = -1;
        } else {
            this.setSign64bits("0");
        }

        int exponent = this.binaryToDecimal(cadena.substring(1, 12));
        exponent = Math.max(1023, exponent) - Math.min(1023, exponent);
        this.setExpo64bits(cadena.substring(1, 12));
        String mantisa = cadena.substring(12, 52);
        this.setMantisa64bits(mantisa);
        double decimal = this.mantisaToDecimal(cadena.substring(12, 52)) * Math.pow(2, exponent);
        this.setDecimal64bits(decimal * sign);
    }

    public void decimalToIEEE32bits(double amount) {
        if (amount < 0) {
            this.setSign32bits("1");
        } else {
            this.setSign32bits("0");
        }
        amount = amount < 0 ? amount * -1 : amount;
        double tmpAmount = amount;
        boolean inside = false;
        int i = 0, exponent;

        if (amount < 1) {
            while (tmpAmount < 1) {
                tmpAmount = amount * Math.pow(2, i);
                i++;
                inside = true;
            }
            exponent = inside ? 127 - (i - 1) : 127;

        } else {
            while (tmpAmount >= 2) {
                tmpAmount = amount / Math.pow(2, i);
                i++;
                inside = true;
            }
            exponent = inside ? 127 + (i - 1) : 127;
        }
        this.setExpo32bits(this.decimalToBinary(exponent, 8));
        this.setMantisa32bits(this.findMantisabits(tmpAmount, 23));
        this.setIeee32bits(this.sign32bits + this.expo32bits + this.mantisa32bits);
    }

    public void decimalToIEEE64bits(double amount) {
        if (amount < 0) {
            this.setSign64bits("1");
        } else {
            this.setSign64bits("0");
        }
        amount = amount < 0 ? amount * -1 : amount;
        double tmpAmount = amount;
        int i = 0, exponent;
        boolean inside = false;

        if (amount < 1) {
            while (tmpAmount < 1) {
                tmpAmount = amount * Math.pow(2, i);
                i++;
                inside = true;
            }
            exponent = inside ? 1023 - (i - 1) : 1023;

        } else {
            while (tmpAmount >= 2) {
                tmpAmount = amount / Math.pow(2, i);
                i++;
                inside = true;
            }
            exponent = inside ? 1023 + (i - 1) : 1023;
        }
        this.setExpo64bits(this.decimalToBinary(exponent, 11));
        this.setMantisa64bits(this.findMantisabits(tmpAmount, 52));
        this.setIeee64bits(this.sign64bits + this.expo64bits + this.mantisa64bits);
    }

    private String findMantisabits(double value, int bits) {
        String mantisa = "";
        value -= 1;
        while (value > 0 && mantisa.length() < bits) {
            value *= 2;
            int entirePart = (int) value;
            value -= entirePart;
            mantisa += entirePart + "";
        }

        while (mantisa.length() < bits) {
            mantisa += "0";
        }
        return mantisa;
    }

    private double mantisaToDecimal(String mantisa) {
        double answer = 0;
        for (int i = 0; i < mantisa.length(); i++) {
            int digit = mantisa.charAt(i) == '1' ? 1 : 0;
            answer += (digit * Math.pow(2, (i + 1) * -1));
        }
        return answer + 1;
    }

    private int binaryToDecimal(String something) {
        int decimal = 0, exponent = 0;
        int value;

        for (int i = something.length() - 1; i >= 0; i--) {
            value = something.charAt(i) == '1' ? 1 : 0;
            decimal += value * (Math.pow(2, exponent));
            exponent += 1;
        }

        return decimal;
    }

    private String decimalToBinary(int decimal, int bits) {
        int logBase2;
        String binary = "";

        logBase2 = (int) (Math.log(decimal) / Math.log(2));

        for (int j = logBase2; j >= 0; j--) {
            if (decimal - Math.pow(2, j) >= 0) {
                binary += "1";
                decimal -= Math.pow(2, j);
            } else {
                binary += "0";
            }
        }

        while (binary.length() < bits) {
            binary = "0" + binary;
        }
        return binary;
    }
    
    public boolean isBinary(String cadenaIEEE){
        return cadenaIEEE.matches("[01]+");
    }
            
    public boolean isDecimal(String decimal){
        long itspoint = 0;
        for(int i=0; i<decimal.length(); i++){
            if(itspoint>1){
                return false;
            }
            if(Character.isLetter(decimal.charAt(i))){
                return false;
            }
            if(decimal.charAt(i)=='.'){
                itspoint++;
            }
            if(decimal.charAt(i)==' '){
                return false;
            }
        }
       return true;
    }

    public String getSign32bits() {
        return sign32bits;
    }

    public String getSign64bits() {
        return sign64bits;
    }

    public String getExpo32bits() {
        return expo32bits;
    }

    public String getExpo64bits() {
        return expo64bits;
    }

    public String getMantisa32bits() {
        return mantisa32bits;
    }

    public String getMantisa64bits() {
        return mantisa64bits;
    }

    public double getDecimal32bits() {
        return decimal32bits;
    }

    public double getDecimal64bits() {
        return decimal64bits;
    }

    public String getIeee64bits() {
        return ieee64bits;
    }

    public String getIeee32bits() {
        return ieee32bits;
    }

    public void setSign32bits(String sign32bits) {
        this.sign32bits = sign32bits;
    }

    public void setSign64bits(String sign64bits) {
        this.sign64bits = sign64bits;
    }

    public void setExpo32bits(String expo32bits) {
        this.expo32bits = expo32bits;
    }

    public void setExpo64bits(String expo64bits) {
        this.expo64bits = expo64bits;
    }

    public void setMantisa32bits(String mantisa32bits) {
        this.mantisa32bits = mantisa32bits;
    }

    public void setMantisa64bits(String mantisa64bits) {
        this.mantisa64bits = mantisa64bits;
    }

    public void setDecimal32bits(double decimal32bits) {
        this.decimal32bits = decimal32bits;
    }

    public void setDecimal64bits(double decimal64bits) {
        this.decimal64bits = decimal64bits;
    }

    public void setIeee64bits(String ieee64bits) {
        this.ieee64bits = ieee64bits;
    }

    public void setIeee32bits(String ieee32bits) {
        this.ieee32bits = ieee32bits;
    }

}
