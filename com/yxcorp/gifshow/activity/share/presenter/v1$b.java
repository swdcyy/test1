package com.yxcorp.gifshow.activity.share.presenter.v1$b;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.kuaishou.edit.draft.VisibilityTimeType;

public class v1$b	// class@00143c
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       v1$b.b = ointArray;
       try{
          int i = 1;
          ointArray[Workspace$Type.VIDEO.ordinal()] = i;
          int i1 = 2;
          try{
             v1$b.b[Workspace$Type.PHOTO_MOVIE.ordinal()] = i1;
             try{
                v1$b.b[Workspace$Type.ATLAS.ordinal()] = 3;
                try{
                   v1$b.b[Workspace$Type.SINGLE_PICTURE.ordinal()] = 4;
                   try{
                      v1$b.b[Workspace$Type.LONG_PICTURE.ordinal()] = 5;
                      int[] ointArray1 = new int[VisibilityTimeType.values().length];
                      try{
                         v1$b.a = ointArray1;
                         ointArray1[VisibilityTimeType.HOURS_24.ordinal()] = i;
                         try{
                            v1$b.a[VisibilityTimeType.DAYS_3.ordinal()] = e0;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
