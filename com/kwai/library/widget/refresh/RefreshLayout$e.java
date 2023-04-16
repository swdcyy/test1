package com.kwai.library.widget.refresh.RefreshLayout$e;
import com.kwai.library.widget.refresh.RefreshLayout$RefreshStyle;
import java.lang.Enum;

public class RefreshLayout$e	// class@0009c9
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RefreshLayout$RefreshStyle.values().length];
       try{
          RefreshLayout$e.a = ointArray;
          ointArray[RefreshLayout$RefreshStyle.FLOAT.ordinal()] = 1;
          try{
             RefreshLayout$e.a[RefreshLayout$RefreshStyle.PINNED.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
