package com.airbnb.lottie.model.layer.a$a;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import java.lang.Enum;
import com.airbnb.lottie.model.layer.Layer$LayerType;

public class a$a	// class@000dd4
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[Mask$MaskMode.values().length];
       a$a.b = ointArray;
       try{
          int i = 1;
          ointArray[Mask$MaskMode.MASK_MODE_SUBTRACT.ordinal()] = i;
          int i1 = 2;
          try{
             a$a.b[Mask$MaskMode.MASK_MODE_INTERSECT.ordinal()] = i1;
             int i2 = 3;
             try{
                a$a.b[Mask$MaskMode.MASK_MODE_ADD.ordinal()] = i2;
                int[] ointArray1 = new int[Layer$LayerType.values().length];
                try{
                   a$a.a = ointArray1;
                   ointArray1[Layer$LayerType.SHAPE.ordinal()] = i;
                   try{
                      a$a.a[Layer$LayerType.PRE_COMP.ordinal()] = e0;
                      try{
                         a$a.a[Layer$LayerType.SOLID.ordinal()] = i2;
                         try{
                            a$a.a[Layer$LayerType.IMAGE.ordinal()] = 4;
                            try{
                               a$a.a[Layer$LayerType.NULL.ordinal()] = 5;
                               try{
                                  a$a.a[Layer$LayerType.TEXT.ordinal()] = 6;
                                  try{
                                     a$a.a[Layer$LayerType.UNKNOWN.ordinal()] = 7;
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
