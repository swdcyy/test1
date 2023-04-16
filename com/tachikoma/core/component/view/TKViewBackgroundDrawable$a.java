package com.tachikoma.core.component.view.TKViewBackgroundDrawable$a;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderStyle;
import java.lang.Enum;

public class TKViewBackgroundDrawable$a	// class@000db4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TKViewBackgroundDrawable$BorderStyle.values().length];
       try{
          TKViewBackgroundDrawable$a.a = ointArray;
          ointArray[TKViewBackgroundDrawable$BorderStyle.DASHED.ordinal()] = 1;
          try{
             TKViewBackgroundDrawable$a.a[TKViewBackgroundDrawable$BorderStyle.DOTTED.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
