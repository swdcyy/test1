package com.kuaishou.live.common.core.component.pendant.pendantgroup.d$a;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.lang.Enum;

public class d$a	// class@001718
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePendantRelation.values().length];
       try{
          d$a.a = ointArray;
          ointArray[LivePendantRelation.CHAT.ordinal()] = 1;
          try{
             d$a.a[LivePendantRelation.VOICE_PARTY_SCENE.ordinal()] = 2;
             try{
                d$a.a[LivePendantRelation.PK_CRITICAL_HIT_ANIMATION.ordinal()] = 3;
                try{
                   d$a.a[LivePendantRelation.SCREEN_LANDSCAPE.ordinal()] = 4;
                   try{
                      d$a.a[LivePendantRelation.LIVE_PK.ordinal()] = 5;
                      try{
                         d$a.a[LivePendantRelation.RECRUIT_EXPLAIN.ordinal()] = 6;
                         try{
                            d$a.a[LivePendantRelation.GZONE_LIVE.ordinal()] = 7;
                            try{
                               d$a.a[LivePendantRelation.MERCHANT_FAST_PAY_BUBBLE.ordinal()] = 8;
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
