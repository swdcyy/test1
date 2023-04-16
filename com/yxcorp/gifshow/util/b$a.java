package com.yxcorp.gifshow.util.b$a;
import com.yxcorp.gifshow.model.ActionType;
import java.lang.Enum;

public class b$a	// class@001f5b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ActionType.values().length];
       try{
          b$a.a = ointArray;
          ointArray[ActionType.REPORT.ordinal()] = 1;
          try{
             b$a.a[ActionType.WEB.ordinal()] = 2;
             try{
                b$a.a[ActionType.INNER_REDIRECT.ordinal()] = 3;
                try{
                   b$a.a[ActionType.QQ_FRIENDS.ordinal()] = 4;
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
