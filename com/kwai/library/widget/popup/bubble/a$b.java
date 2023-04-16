package com.kwai.library.widget.popup.bubble.a$b;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;

public class a$b	// class@000976
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleInterface$Position.values().length];
       try{
          a$b.a = ointArray;
          ointArray[BubbleInterface$Position.LEFT.ordinal()] = 1;
          try{
             a$b.a[BubbleInterface$Position.TOP.ordinal()] = 2;
             try{
                a$b.a[BubbleInterface$Position.RIGHT.ordinal()] = 3;
                try{
                   a$b.a[BubbleInterface$Position.BOTTOM.ordinal()] = 4;
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
