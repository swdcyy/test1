package com.hhh.smartwidget.bubble.a$c;
import com.hhh.smartwidget.bubble.BubbleInterface$Position;
import java.lang.Enum;

public class a$c	// class@00057a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleInterface$Position.values().length];
       try{
          a$c.a = ointArray;
          ointArray[BubbleInterface$Position.LEFT.ordinal()] = 1;
          try{
             a$c.a[BubbleInterface$Position.RIGHT.ordinal()] = 2;
             try{
                a$c.a[BubbleInterface$Position.TOP.ordinal()] = 3;
                try{
                   a$c.a[BubbleInterface$Position.BOTTOM.ordinal()] = 4;
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
