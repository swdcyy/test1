package com.yxcorp.gifshow.v3.bubble.d$c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class d$c	// class@000d32
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          d$c.a = ointArray;
          ointArray[Workspace$Type.SINGLE_PICTURE.ordinal()] = 1;
          try{
             d$c.a[Workspace$Type.LONG_PICTURE.ordinal()] = 2;
             try{
                d$c.a[Workspace$Type.ATLAS.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
