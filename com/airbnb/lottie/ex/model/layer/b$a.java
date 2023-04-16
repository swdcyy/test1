package com.airbnb.lottie.ex.model.layer.b$a;
import com.airbnb.lottie.ex.model.layer.Layer$MatteType;
import java.lang.Enum;

public class b$a	// class@000dbc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Layer$MatteType.values().length];
       try{
          b$a.a = ointArray;
          ointArray[Layer$MatteType.ADD.ordinal()] = 1;
          try{
             b$a.a[Layer$MatteType.INVERT.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
