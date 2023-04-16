package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter$d;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SelectMediaMode;
import java.lang.Enum;

public class SwapPresenter$d	// class@001c2c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SelectMediaMode.values().length];
       try{
          SwapPresenter$d.a = ointArray;
          ointArray[SelectMediaMode.SINGLE_IMAGE.ordinal()] = 1;
          try{
             SwapPresenter$d.a[SelectMediaMode.MULTI_IMAGES.ordinal()] = 2;
             try{
                SwapPresenter$d.a[SelectMediaMode.SINGLE_VIDEO.ordinal()] = 3;
                try{
                   SwapPresenter$d.a[SelectMediaMode.MULTI_VIDEOS.ordinal()] = 4;
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
