package com.kuaishou.live.gzone.v2.activity.c$c;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import java.lang.Enum;

public class c$c	// class@001cb5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGzoneAudienceFeatureEntranceItem.values().length];
       try{
          c$c.a = ointArray;
          ointArray[LiveGzoneAudienceFeatureEntranceItem.GUESS.ordinal()] = 1;
          try{
             c$c.a[LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE.ordinal()] = 2;
             try{
                c$c.a[LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX.ordinal()] = 3;
                try{
                   c$c.a[LiveGzoneAudienceFeatureEntranceItem.COMPETITION_PREDICTION.ordinal()] = 4;
                   try{
                      c$c.a[LiveGzoneAudienceFeatureEntranceItem.GIFT.ordinal()] = 5;
                      try{
                         c$c.a[LiveGzoneAudienceFeatureEntranceItem.GZONE_VOTE.ordinal()] = 6;
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
