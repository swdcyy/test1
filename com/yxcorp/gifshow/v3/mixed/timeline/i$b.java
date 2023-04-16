package com.yxcorp.gifshow.v3.mixed.timeline.i$b;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import java.lang.Enum;

public class i$b	// class@00156c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MixStatus.values().length];
       try{
          i$b.a = ointArray;
          ointArray[MixStatus.EDITING.ordinal()] = 1;
          try{
             i$b.a[MixStatus.PREVIEWING.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
