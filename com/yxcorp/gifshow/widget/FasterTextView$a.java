package com.yxcorp.gifshow.widget.FasterTextView$a;
import android.text.TextUtils$TruncateAt;

public class FasterTextView$a	// class@001844
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextUtils$TruncateAt.values().length];
       try{
          FasterTextView$a.a = ointArray;
          ointArray[TextUtils$TruncateAt.START.ordinal()] = 1;
          try{
             FasterTextView$a.a[TextUtils$TruncateAt.MIDDLE.ordinal()] = 2;
             try{
                FasterTextView$a.a[TextUtils$TruncateAt.END.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
