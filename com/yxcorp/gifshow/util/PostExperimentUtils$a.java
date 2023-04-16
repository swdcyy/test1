package com.yxcorp.gifshow.util.PostExperimentUtils$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class PostExperimentUtils$a	// class@001f18
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          PostExperimentUtils$a.a = ointArray;
          ointArray[Workspace$Type.VIDEO.ordinal()] = 1;
          try{
             PostExperimentUtils$a.a[Workspace$Type.LONG_VIDEO.ordinal()] = 2;
             try{
                PostExperimentUtils$a.a[Workspace$Type.SINGLE_PICTURE.ordinal()] = 3;
                try{
                   PostExperimentUtils$a.a[Workspace$Type.ATLAS.ordinal()] = 4;
                   try{
                      PostExperimentUtils$a.a[Workspace$Type.LONG_PICTURE.ordinal()] = 5;
                      try{
                         PostExperimentUtils$a.a[Workspace$Type.AI_CUT.ordinal()] = 6;
                         try{
                            PostExperimentUtils$a.a[Workspace$Type.ALBUM_MOVIE.ordinal()] = 7;
                            try{
                               PostExperimentUtils$a.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 8;
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
