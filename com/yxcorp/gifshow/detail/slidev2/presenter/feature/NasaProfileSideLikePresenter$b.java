package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter$b;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import java.lang.Enum;

public class NasaProfileSideLikePresenter$b	// class@00191b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LikeAnimationEnum.values().length];
       try{
          NasaProfileSideLikePresenter$b.a = ointArray;
          ointArray[LikeAnimationEnum.STOP.ordinal()] = 1;
          try{
             NasaProfileSideLikePresenter$b.a[LikeAnimationEnum.DISLIKE_TO_LIKE.ordinal()] = 2;
             try{
                NasaProfileSideLikePresenter$b.a[LikeAnimationEnum.LIKE_TO_DISLIKE.ordinal()] = 3;
                try{
                   NasaProfileSideLikePresenter$b.a[LikeAnimationEnum.DISLIKE_TO_LIKE_ENLARGE.ordinal()] = 4;
                   try{
                      NasaProfileSideLikePresenter$b.a[LikeAnimationEnum.LIKE_TO_DISLIKE_ENLARGE.ordinal()] = 5;
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
