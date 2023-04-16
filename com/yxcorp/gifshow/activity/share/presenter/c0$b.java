package com.yxcorp.gifshow.activity.share.presenter.c0$b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;

public class c0$b	// class@0013c7
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ActivityEvent.values().length];
       c0$b.b = ointArray;
       try{
          int i = 1;
          ointArray[ActivityEvent.PAUSE.ordinal()] = i;
          int i1 = 2;
          try{
             c0$b.b[ActivityEvent.RESUME.ordinal()] = i1;
             int[] ointArray1 = new int[Workspace$Type.values().length];
             try{
                c0$b.a = ointArray1;
                ointArray1[Workspace$Type.VIDEO.ordinal()] = i;
                try{
                   c0$b.a[Workspace$Type.LONG_VIDEO.ordinal()] = e0;
                   try{
                      c0$b.a[Workspace$Type.KTV_MV.ordinal()] = 3;
                      try{
                         c0$b.a[Workspace$Type.KTV_SONG.ordinal()] = 4;
                         try{
                            c0$b.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 5;
                            try{
                               c0$b.a[Workspace$Type.KUAISHAN.ordinal()] = 6;
                               try{
                                  c0$b.a[Workspace$Type.ALBUM_MOVIE.ordinal()] = 7;
                                  try{
                                     c0$b.a[Workspace$Type.AI_CUT.ordinal()] = 8;
                                     try{
                                        c0$b.a[Workspace$Type.UNKNOWN.ordinal()] = 9;
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
