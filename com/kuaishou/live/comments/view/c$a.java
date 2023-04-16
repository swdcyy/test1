package com.kuaishou.live.comments.view.c$a;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import java.lang.Enum;

public class c$a	// class@000e4e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LayoutParamsType.values().length];
       try{
          c$a.a = ointArray;
          ointArray[LayoutParamsType.VISIBILITY.ordinal()] = 1;
          try{
             c$a.a[LayoutParamsType.RIGHT_MARGIN.ordinal()] = 2;
             try{
                c$a.a[LayoutParamsType.BOTTOM_MARGIN.ordinal()] = 3;
                try{
                   c$a.a[LayoutParamsType.FADING_EDGE_TOP.ordinal()] = 4;
                   try{
                      c$a.a[LayoutParamsType.HEIGHT.ordinal()] = 5;
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
