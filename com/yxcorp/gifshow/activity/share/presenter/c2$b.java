package com.yxcorp.gifshow.activity.share.presenter.c2$b;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.Enum;

public class c2$b	// class@0013d2
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TopicItemType.values().length];
       try{
          c2$b.a = ointArray;
          ointArray[TopicItemType.RECOMMEND.ordinal()] = 1;
          try{
             c2$b.a[TopicItemType.HISTORY.ordinal()] = 2;
             try{
                c2$b.a[TopicItemType.TAG_STICKER.ordinal()] = 3;
                try{
                   c2$b.a[TopicItemType.SEARCH_RESULT.ordinal()] = 4;
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
