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
}


