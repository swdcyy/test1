package com.yxcorp.gifshow.activity.share.bubble.BubbleImageView$a;
import com.yxcorp.gifshow.activity.share.bubble.BubbleImageView$BubbleTriangleDirection;
import java.lang.Enum;

public class BubbleImageView$a	// class@001378
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleImageView$BubbleTriangleDirection.values().length];
       try{
          BubbleImageView$a.a = ointArray;
          ointArray[BubbleImageView$BubbleTriangleDirection.LEFT.ordinal()] = 1;
          try{
             BubbleImageView$a.a[BubbleImageView$BubbleTriangleDirection.RIGHT.ordinal()] = 2;
             try{
                BubbleImageView$a.a[BubbleImageView$BubbleTriangleDirection.TOP.ordinal()] = 3;
                try{
                   BubbleImageView$a.a[BubbleImageView$BubbleTriangleDirection.BOTTOM.ordinal()] = 4;
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
