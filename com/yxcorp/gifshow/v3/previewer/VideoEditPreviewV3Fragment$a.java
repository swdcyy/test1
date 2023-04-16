package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;

public class VideoEditPreviewV3Fragment$a	// class@001581
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[EditorDelegate$ShowLoggerType.values().length];
       VideoEditPreviewV3Fragment$a.b = ointArray;
       try{
          int i = 1;
          ointArray[EditorDelegate$ShowLoggerType.FILTER.ordinal()] = i;
          int i1 = 2;
          try{
             VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.PRETTIFY.ordinal()] = i1;
             try{
                VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.MAKEUP.ordinal()] = 3;
                try{
                   VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.FILTER_EFFECT.ordinal()] = 4;
                   try{
                      VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.TIME_EFFECT.ordinal()] = 5;
                      try{
                         VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.BUILT_MUSIC.ordinal()] = 6;
                         try{
                            VideoEditPreviewV3Fragment$a.b[EditorDelegate$ShowLoggerType.THEME.ordinal()] = 7;
                            int[] ointArray1 = new int[Workspace$Type.values().length];
                            try{
                               VideoEditPreviewV3Fragment$a.a = ointArray1;
                               ointArray1[Workspace$Type.KTV_SONG.ordinal()] = i;
                               try{
                                  VideoEditPreviewV3Fragment$a.a[Workspace$Type.KTV_MV.ordinal()] = e0;
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
