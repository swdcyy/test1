package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment$a;
import com.kuaishou.android.model.feed.MerchantCardType;
import java.lang.Enum;

public class GrootMerchantRecommendUserFragment$a	// class@001784
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MerchantCardType.values().length];
       try{
          GrootMerchantRecommendUserFragment$a.a = ointArray;
          ointArray[MerchantCardType.TYPE_MERCHANT_RECOMMEND_V1.ordinal()] = 1;
          try{
             GrootMerchantRecommendUserFragment$a.a[MerchantCardType.TYPE_MERCHANT_RECOMMEND_V2.ordinal()] = 2;
             try{
                GrootMerchantRecommendUserFragment$a.a[MerchantCardType.TYPE_MERCHANT_DYNAMIC.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
