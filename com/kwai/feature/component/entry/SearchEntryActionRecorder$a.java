package com.kwai.feature.component.entry.SearchEntryActionRecorder$a;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import java.lang.Enum;

public class SearchEntryActionRecorder$a	// class@001202
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SearchEntryActionRecorder$SignalType.values().length];
       try{
          SearchEntryActionRecorder$a.a = ointArray;
          ointArray[SearchEntryActionRecorder$SignalType.USER_VV_COUNT.ordinal()] = 1;
          try{
             SearchEntryActionRecorder$a.a[SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT.ordinal()] = 2;
             try{
                SearchEntryActionRecorder$a.a[SearchEntryActionRecorder$SignalType.USER_SHOW_COUNT.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
