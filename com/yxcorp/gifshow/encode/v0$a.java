package com.yxcorp.gifshow.encode.v0$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class v0$a	// class@000d52
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          v0$a.a = ointArray;
          ointArray[Workspace$Type.VIDEO.ordinal()] = 1;
          try{
             v0$a.a[Workspace$Type.LONG_VIDEO.ordinal()] = 2;
             try{
                v0$a.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 3;
                try{
                   v0$a.a[Workspace$Type.KTV_MV.ordinal()] = 4;
                   try{
                      v0$a.a[Workspace$Type.KTV_SONG.ordinal()] = 5;
                      try{
                         v0$a.a[Workspace$Type.KUAISHAN.ordinal()] = 6;
                         try{
                            v0$a.a[Workspace$Type.ALBUM_MOVIE.ordinal()] = 7;
                            try{
                               v0$a.a[Workspace$Type.AI_CUT.ordinal()] = 8;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
