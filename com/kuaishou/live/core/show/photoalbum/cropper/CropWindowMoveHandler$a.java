package com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$a;
import com.kuaishou.live.core.show.photoalbum.cropper.CropWindowMoveHandler$Type;
import java.lang.Enum;

public class CropWindowMoveHandler$a	// class@000d66
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CropWindowMoveHandler$Type.values().length];
       try{
          CropWindowMoveHandler$a.a = ointArray;
          ointArray[CropWindowMoveHandler$Type.TOP_LEFT.ordinal()] = 1;
          try{
             CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.TOP_RIGHT.ordinal()] = 2;
             try{
                CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.BOTTOM_LEFT.ordinal()] = 3;
                try{
                   CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.BOTTOM_RIGHT.ordinal()] = 4;
                   try{
                      CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.LEFT.ordinal()] = 5;
                      try{
                         CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.TOP.ordinal()] = 6;
                         try{
                            CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.RIGHT.ordinal()] = 7;
                            try{
                               CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.BOTTOM.ordinal()] = 8;
                               try{
                                  CropWindowMoveHandler$a.a[CropWindowMoveHandler$Type.CENTER.ordinal()] = 9;
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
