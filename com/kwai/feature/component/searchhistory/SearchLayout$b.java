package com.kwai.feature.component.searchhistory.SearchLayout$b;
import com.kwai.feature.component.searchhistory.SearchLayout$KeyboardShownMode;
import java.lang.Enum;

public class SearchLayout$b	// class@001290
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SearchLayout$KeyboardShownMode.values().length];
       try{
          SearchLayout$b.a = ointArray;
          ointArray[SearchLayout$KeyboardShownMode.SHOW_HISTORY.ordinal()] = 1;
          try{
             SearchLayout$b.a[SearchLayout$KeyboardShownMode.ADJUST_NOTHING.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
