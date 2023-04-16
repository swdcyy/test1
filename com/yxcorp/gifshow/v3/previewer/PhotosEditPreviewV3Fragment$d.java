package com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$d;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;

public class PhotosEditPreviewV3Fragment$d	// class@00157f
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       PhotosEditPreviewV3Fragment$d.b = ointArray;
       try{
          int i = 1;
          ointArray[Workspace$Type.LONG_PICTURE.ordinal()] = i;
          int i1 = 2;
          try{
             PhotosEditPreviewV3Fragment$d.b[Workspace$Type.ATLAS.ordinal()] = i1;
             int i2 = 3;
             try{
                PhotosEditPreviewV3Fragment$d.b[Workspace$Type.SINGLE_PICTURE.ordinal()] = i2;
                int[] ointArray1 = new int[EditorDelegate$ShowLoggerType.values().length];
                try{
                   PhotosEditPreviewV3Fragment$d.a = ointArray1;
                   ointArray1[EditorDelegate$ShowLoggerType.FILTER.ordinal()] = i;
                   try{
                      PhotosEditPreviewV3Fragment$d.a[EditorDelegate$ShowLoggerType.PRETTIFY.ordinal()] = e0;
                      try{
                         PhotosEditPreviewV3Fragment$d.a[EditorDelegate$ShowLoggerType.MAKEUP.ordinal()] = i2;
                         try{
                            PhotosEditPreviewV3Fragment$d.a[EditorDelegate$ShowLoggerType.BUILT_MUSIC.ordinal()] = 4;
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
