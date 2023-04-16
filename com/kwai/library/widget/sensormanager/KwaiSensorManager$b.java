package com.kwai.library.widget.sensormanager.KwaiSensorManager$b;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;

public class KwaiSensorManager$b	// class@0009f5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Lifecycle$Event.values().length];
       try{
          KwaiSensorManager$b.a = ointArray;
          ointArray[Lifecycle$Event.ON_START.ordinal()] = 1;
          try{
             KwaiSensorManager$b.a[Lifecycle$Event.ON_STOP.ordinal()] = 2;
             try{
                KwaiSensorManager$b.a[Lifecycle$Event.ON_DESTROY.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
