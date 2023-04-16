package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$d;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import java.lang.Enum;

public class FragmentAudioRecordPanel$d	// class@001f3d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentAudioRecorder$Status.values().length];
       try{
          FragmentAudioRecordPanel$d.a = ointArray;
          ointArray[FragmentAudioRecorder$Status.INIT.ordinal()] = 1;
          try{
             FragmentAudioRecordPanel$d.a[FragmentAudioRecorder$Status.START.ordinal()] = 2;
             try{
                FragmentAudioRecordPanel$d.a[FragmentAudioRecorder$Status.PAUSE.ordinal()] = 3;
                try{
                   FragmentAudioRecordPanel$d.a[FragmentAudioRecorder$Status.STOP.ordinal()] = 4;
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
