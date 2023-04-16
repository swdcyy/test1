package com.yxcorp.gifshow.v3.widget.EditorTimeLineView$c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Enum;

public class EditorTimeLineView$c	// class@00163f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Action$Type.values().length];
       try{
          EditorTimeLineView$c.a = ointArray;
          ointArray[Action$Type.TEXT.ordinal()] = 1;
          try{
             EditorTimeLineView$c.a[Action$Type.SUBTITLE.ordinal()] = 2;
             try{
                EditorTimeLineView$c.a[Action$Type.DECORATION.ordinal()] = 3;
                try{
                   EditorTimeLineView$c.a[Action$Type.VIDEO_OPENING.ordinal()] = 4;
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
