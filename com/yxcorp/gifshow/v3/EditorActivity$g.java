package com.yxcorp.gifshow.v3.EditorActivity$g;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import com.kuaishou.edit.draft.Workspace$Type;

public class EditorActivity$g	// class@000d19
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;

    static {
       int[] ointArray = new int[Workspace$Source.values().length];
       EditorActivity$g.d = ointArray;
       try{
          int i = 1;
          ointArray[Workspace$Source.SAME_FRAME.ordinal()] = i;
          int i1 = 2;
          try{
             EditorActivity$g.d[Workspace$Source.FOLLOW_SHOOT.ordinal()] = i1;
             int i2 = 3;
             try{
                EditorActivity$g.d[Workspace$Source.INTOWN.ordinal()] = i2;
                int[] ointArray1 = new int[EditorActivity$PreviewTabInfo.values().length];
                try{
                   EditorActivity$g.c = ointArray1;
                   ointArray1[EditorActivity$PreviewTabInfo.VIDEO.ordinal()] = i;
                   try{
                      EditorActivity$g.c[EditorActivity$PreviewTabInfo.LONGPICTURE.ordinal()] = e0;
                      try{
                         EditorActivity$g.c[EditorActivity$PreviewTabInfo.ATLAS.ordinal()] = i2;
                         ointArray1 = new int[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.values().length];
                         try{
                            EditorActivity$g.b = ointArray1;
                            ointArray1[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Changed.ordinal()] = i;
                            try{
                               EditorActivity$g.b[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled.ordinal()] = e0;
                               try{
                                  EditorActivity$g.b[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Failed.ordinal()] = i2;
                                  try{
                                     EditorActivity$g.b[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Completed.ordinal()] = 4;
                                     ointArray1 = new int[Workspace$Type.values().length];
                                     try{
                                        EditorActivity$g.a = ointArray1;
                                        ointArray1[Workspace$Type.ATLAS.ordinal()] = i;
                                        try{
                                           EditorActivity$g.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = e0;
                                           try{
                                              EditorActivity$g.a[Workspace$Type.LONG_PICTURE.ordinal()] = i2;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
