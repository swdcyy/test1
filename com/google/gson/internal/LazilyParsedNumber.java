package com.google.gson.internal.LazilyParsedNumber;
import java.lang.Number;
import java.lang.String;
import java.lang.Double;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number	// class@000568
{
    public final String value;

    public void LazilyParsedNumber(String p0){
       super();
       this.value = p0;
    }
    public double doubleValue(){
       return Double.parseDouble(this.value);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof LazilyParsedNumber) {
          return false;
       }
       LazilyParsedNumber tvalue = this.value;
       p0 = p0.value;
       if (tvalue != p0 && !tvalue.equals(p0)) {
          b = false;
       }
       return b;
    }
    public float floatValue(){
       return Float.parseFloat(this.value);
    }
    public int hashCode(){
       return (this.value).hashCode();
    }
    public int intValue(){
       try{
          return Integer.parseInt(this.value);
       }catch(java.lang.NumberFormatException e0){
          try{
             return (int)Long.parseLong(this.value);
          }catch(java.lang.NumberFormatException e0){
             return new BigDecimal(this.value).intValue();
          }
       }
    }
    public long longValue(){
       try{
          return Long.parseLong(this.value);
       }catch(java.lang.NumberFormatException e0){
          return new BigDecimal(this.value).longValue();
       }
    }
    public String toString(){
       return this.value;
    }
    public final Object writeReplace(){
       return new BigDecimal(this.value);
    }
}
