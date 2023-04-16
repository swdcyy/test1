package com.yxcorp.gifshow.detail.slidev2.presenter.feature.f$b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Enum;

public class f$b	// class@001941
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ActivityEvent.values().length];
       try{
          f$b.a = ointArray;
          ointArray[ActivityEvent.RESUME.ordinal()] = 1;
          try{
             f$b.a[ActivityEvent.PAUSE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
