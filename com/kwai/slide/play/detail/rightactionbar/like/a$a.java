package com.kwai.slide.play.detail.rightactionbar.like.a$a;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import java.lang.Enum;

public class a$a	// class@001863
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LikeAnimationEnum.values().length];
       try{
          a$a.a = ointArray;
          ointArray[LikeAnimationEnum.STOP.ordinal()] = 1;
          try{
             a$a.a[LikeAnimationEnum.DISLIKE_TO_LIKE.ordinal()] = 2;
             try{
                a$a.a[LikeAnimationEnum.LIKE_TO_DISLIKE.ordinal()] = 3;
                try{
                   a$a.a[LikeAnimationEnum.DISLIKE_TO_LIKE_ENLARGE.ordinal()] = 4;
                   try{
                      a$a.a[LikeAnimationEnum.LIKE_TO_DISLIKE_ENLARGE.ordinal()] = 5;
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
