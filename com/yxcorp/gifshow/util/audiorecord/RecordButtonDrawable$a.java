package com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$a;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$State;
import java.lang.Enum;

public class RecordButtonDrawable$a	// class@001f47
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RecordButtonDrawable$State.values().length];
       try{
          RecordButtonDrawable$a.a = ointArray;
          ointArray[RecordButtonDrawable$State.INIT.ordinal()] = 1;
          try{
             RecordButtonDrawable$a.a[RecordButtonDrawable$State.PLAY.ordinal()] = 2;
             try{
                RecordButtonDrawable$a.a[RecordButtonDrawable$State.PAUSE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
