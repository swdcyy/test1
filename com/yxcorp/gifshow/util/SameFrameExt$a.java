package com.yxcorp.gifshow.util.SameFrameExt$a;
import com.yxcorp.gifshow.util.SameFrameExt$InfoGetType;
import java.lang.Enum;

public class SameFrameExt$a	// class@001f2c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SameFrameExt$InfoGetType.values().length];
       try{
          SameFrameExt$a.a = ointArray;
          ointArray[SameFrameExt$InfoGetType.SameFrameInfo.ordinal()] = 1;
          try{
             SameFrameExt$a.a[SameFrameExt$InfoGetType.QPhoto.ordinal()] = 2;
             try{
                SameFrameExt$a.a[SameFrameExt$InfoGetType.None.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
