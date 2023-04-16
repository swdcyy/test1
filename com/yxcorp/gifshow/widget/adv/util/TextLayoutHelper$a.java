package com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper$a;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import java.lang.Enum;

public class TextLayoutHelper$a	// class@001930
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextBubbleConfig$ScaleMode.values().length];
       try{
          TextLayoutHelper$a.a = ointArray;
          ointArray[TextBubbleConfig$ScaleMode.NONE.ordinal()] = 1;
          try{
             TextLayoutHelper$a.a[TextBubbleConfig$ScaleMode.HORIZONTAL.ordinal()] = 2;
             try{
                TextLayoutHelper$a.a[TextBubbleConfig$ScaleMode.VERTICAL.ordinal()] = 3;
                try{
                   TextLayoutHelper$a.a[TextBubbleConfig$ScaleMode.BOTH.ordinal()] = 4;
                   try{
                      TextLayoutHelper$a.a[TextBubbleConfig$ScaleMode.FREE.ordinal()] = 5;
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
