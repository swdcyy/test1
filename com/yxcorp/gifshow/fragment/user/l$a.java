package com.yxcorp.gifshow.fragment.user.l$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class l$a	// class@00128b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          l$a.a = ointArray;
          ointArray[Workspace$Type.SINGLE_PICTURE.ordinal()] = 1;
          try{
             l$a.a[Workspace$Type.ATLAS.ordinal()] = 2;
             try{
                l$a.a[Workspace$Type.LONG_PICTURE.ordinal()] = 3;
                try{
                   l$a.a[Workspace$Type.KTV_SONG.ordinal()] = 4;
                   try{
                      l$a.a[Workspace$Type.KTV_MV.ordinal()] = 5;
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
