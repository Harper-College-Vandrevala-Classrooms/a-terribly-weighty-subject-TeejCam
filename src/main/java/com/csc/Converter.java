package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    //throw new UnsupportedOperationException("Unimplemented method 'toPounds'");
    double pounds = ounces / 16.0;
    //double poundDecimal = static_cast<double> (ounces)/16;
    //System.out.printf(" %.4f lbs\n", pounds);
    if (pounds == 1){
      return String.format("%.4f %s", pounds, "lb");
    }
    else {
        return String.format("%.4f %s", pounds, "lbs");
    }
  }

  public String toPoundsAndOunces(int ounces) {
    //throw new UnsupportedOperationException("Unimplemented method 'toPoundsAndOunces'");
    int pounds = ounces / 16;
    int remainOunces = ounces % 16;

    if (pounds == 1){
      return pounds + " lb " + remainOunces + " oz";

    }
    else {
      return pounds + " lbs " + remainOunces + " oz";
    }
  }

  public String toOunces(int pounds, int ounces)
  {
    int ounceFromPounds = (pounds * 16) + ounces;
    return String.format("%.4s %s", ounceFromPounds, "oz");
  }

  public static void main(String[] args)
  {
    Converter converter = new Converter();

    converter.toPounds(0); // will return the string "0.0000 lbs"
    converter.toPounds(16); // will return the string "1.0000 lb"
    converter.toPoundsAndOunces(18); // will return the string "1 lb 2 oz"
    converter.toPoundsAndOunces(36);
  }
}


