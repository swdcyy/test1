package com.yxcorp.gifshow.v3.f$c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class f$c	// class@001522
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          f$c.a = ointArray;
          ointArray[Workspace$Type.VIDEO.ordinal()] = 1;
          try{
             f$c.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 2;
             try{
                f$c.a[Workspace$Type.ATLAS.ordinal()] = 3;
                try{
                   f$c.a[Workspace$Type.SINGLE_PICTURE.ordinal()] = 4;
                   try{
                      f$c.a[Workspace$Type.LONG_PICTURE.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
