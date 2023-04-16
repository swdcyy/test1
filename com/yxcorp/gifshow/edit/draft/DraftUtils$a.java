package com.yxcorp.gifshow.edit.draft.DraftUtils$a;
import com.kuaishou.edit.draft.Music$Type;
import java.lang.Enum;

public class DraftUtils$a	// class@001ae0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Music$Type.values().length];
       try{
          DraftUtils$a.a = ointArray;
          ointArray[Music$Type.IMPORT.ordinal()] = 1;
          try{
             DraftUtils$a.a[Music$Type.OPERATION.ordinal()] = 2;
             try{
                DraftUtils$a.a[Music$Type.ONLINE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
