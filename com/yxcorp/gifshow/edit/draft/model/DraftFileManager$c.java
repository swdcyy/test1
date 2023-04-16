package com.yxcorp.gifshow.edit.draft.model.DraftFileManager$c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class DraftFileManager$c	// class@001aeb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          DraftFileManager$c.a = ointArray;
          ointArray[Workspace$Type.VIDEO.ordinal()] = 1;
          try{
             DraftFileManager$c.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 2;
             try{
                DraftFileManager$c.a[Workspace$Type.KTV_MV.ordinal()] = 3;
                try{
                   DraftFileManager$c.a[Workspace$Type.LONG_VIDEO.ordinal()] = 4;
                   try{
                      DraftFileManager$c.a[Workspace$Type.KUAISHAN.ordinal()] = 5;
                      try{
                         DraftFileManager$c.a[Workspace$Type.ALBUM_MOVIE.ordinal()] = 6;
                         try{
                            DraftFileManager$c.a[Workspace$Type.AI_CUT.ordinal()] = 7;
                            try{
                               DraftFileManager$c.a[Workspace$Type.KTV_SONG.ordinal()] = 8;
                               try{
                                  DraftFileManager$c.a[Workspace$Type.SINGLE_PICTURE.ordinal()] = 9;
                                  try{
                                     DraftFileManager$c.a[Workspace$Type.LONG_PICTURE.ordinal()] = 10;
                                     try{
                                        DraftFileManager$c.a[Workspace$Type.ATLAS.ordinal()] = 11;
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
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
