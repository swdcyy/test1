package com.kuaishou.merchant.basic.fragment.f$a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public class f$a	// class@0015c1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       try{
          f$a.a = ointArray;
          ointArray[FragmentEvent.CREATE.ordinal()] = 1;
          try{
             f$a.a[FragmentEvent.CREATE_VIEW.ordinal()] = 2;
             try{
                f$a.a[FragmentEvent.RESUME.ordinal()] = 3;
                try{
                   f$a.a[FragmentEvent.STOP.ordinal()] = 4;
                   try{
                      f$a.a[FragmentEvent.DESTROY_VIEW.ordinal()] = 5;
                      try{
                         f$a.a[FragmentEvent.DESTROY.ordinal()] = 6;
                         try{
                            f$a.a[FragmentEvent.PAUSE.ordinal()] = 7;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
