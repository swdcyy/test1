package com.yxcorp.gifshow.bubble.e$a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;

public class e$a	// class@001c7a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleInterface$Position.values().length];
       try{
          e$a.a = ointArray;
          ointArray[BubbleInterface$Position.LEFT.ordinal()] = 1;
          try{
             e$a.a[BubbleInterface$Position.RIGHT.ordinal()] = 2;
             try{
                e$a.a[BubbleInterface$Position.BOTTOM.ordinal()] = 3;
                try{
                   e$a.a[BubbleInterface$Position.TOP.ordinal()] = 4;
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
