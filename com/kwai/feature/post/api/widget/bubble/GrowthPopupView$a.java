package com.kwai.feature.post.api.widget.bubble.GrowthPopupView$a;
import com.kwai.feature.post.api.widget.bubble.GrowthPopupView$ArrowPosition;
import java.lang.Enum;

public class GrowthPopupView$a	// class@001495
{
    public static final int[] a;

    static {
       int[] ointArray = new int[GrowthPopupView$ArrowPosition.values().length];
       try{
          GrowthPopupView$a.a = ointArray;
          ointArray[GrowthPopupView$ArrowPosition.TOP.ordinal()] = 1;
          try{
             GrowthPopupView$a.a[GrowthPopupView$ArrowPosition.LEFT.ordinal()] = 2;
             try{
                GrowthPopupView$a.a[GrowthPopupView$ArrowPosition.RIGHT.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
