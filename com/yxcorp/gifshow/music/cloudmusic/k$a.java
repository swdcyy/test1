package com.yxcorp.gifshow.music.cloudmusic.k$a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public class k$a	// class@002022
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       try{
          k$a.a = ointArray;
          ointArray[FragmentEvent.DESTROY.ordinal()] = 1;
          try{
             k$a.a[FragmentEvent.PAUSE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
