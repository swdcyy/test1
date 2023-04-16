package com.tachikoma.component.container.round.RoundTKYogaLayout$a;
import com.tachikoma.component.container.round.RoundTKYogaLayout$RadiusMode;
import java.lang.Enum;

public class RoundTKYogaLayout$a	// class@000cec
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RoundTKYogaLayout$RadiusMode.values().length];
       try{
          RoundTKYogaLayout$a.a = ointArray;
          ointArray[RoundTKYogaLayout$RadiusMode.ALL.ordinal()] = 1;
          try{
             RoundTKYogaLayout$a.a[RoundTKYogaLayout$RadiusMode.TOP_LEFT.ordinal()] = 2;
             try{
                RoundTKYogaLayout$a.a[RoundTKYogaLayout$RadiusMode.TOP_RIGHT.ordinal()] = 3;
                try{
                   RoundTKYogaLayout$a.a[RoundTKYogaLayout$RadiusMode.BOTTOM_LEFT.ordinal()] = 4;
                   try{
                      RoundTKYogaLayout$a.a[RoundTKYogaLayout$RadiusMode.BOTTOM_RIGHT.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
