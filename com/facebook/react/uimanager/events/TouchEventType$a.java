package com.facebook.react.uimanager.events.TouchEventType$a;
import com.facebook.react.uimanager.events.TouchEventType;
import java.lang.Enum;

public class TouchEventType$a	// class@001343
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TouchEventType.values().length];
       try{
          TouchEventType$a.a = ointArray;
          ointArray[TouchEventType.START.ordinal()] = 1;
          try{
             TouchEventType$a.a[TouchEventType.END.ordinal()] = 2;
             try{
                TouchEventType$a.a[TouchEventType.MOVE.ordinal()] = 3;
                try{
                   TouchEventType$a.a[TouchEventType.CANCEL.ordinal()] = 4;
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
