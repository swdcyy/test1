package com.kuaishou.commercial.component.f$c;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams$Type;
import java.lang.Enum;

public class f$c	// class@00149e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsToastParams$Type.values().length];
       try{
          f$c.a = ointArray;
          ointArray[JsToastParams$Type.SUCCESS.ordinal()] = 1;
          try{
             f$c.a[JsToastParams$Type.ERROR.ordinal()] = 2;
             try{
                f$c.a[JsToastParams$Type.NORMAL.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
