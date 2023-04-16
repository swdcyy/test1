package com.facebook.react.views.scroll.ScrollEventType$a;
import com.facebook.react.views.scroll.ScrollEventType;
import java.lang.Enum;

public class ScrollEventType$a	// class@0013eb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ScrollEventType.values().length];
       try{
          ScrollEventType$a.a = ointArray;
          ointArray[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
          try{
             ScrollEventType$a.a[ScrollEventType.END_DRAG.ordinal()] = 2;
             try{
                ScrollEventType$a.a[ScrollEventType.SCROLL.ordinal()] = 3;
                try{
                   ScrollEventType$a.a[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
                   try{
                      ScrollEventType$a.a[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
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
