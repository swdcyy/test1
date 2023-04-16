package com.kuaishou.commercial.component.c$c;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams$Type;
import java.lang.Enum;

public class c$c	// class@001498
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsToastParams$Type.values().length];
       try{
          c$c.a = ointArray;
          ointArray[JsToastParams$Type.SUCCESS.ordinal()] = 1;
          try{
             c$c.a[JsToastParams$Type.ERROR.ordinal()] = 2;
             try{
                c$c.a[JsToastParams$Type.NORMAL.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
