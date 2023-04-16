package com.kuaishou.live.common.core.component.pendant.pendantgroup.b$a;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.lang.Enum;

public class b$a	// class@001715
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePendantRelation.values().length];
       try{
          b$a.a = ointArray;
          ointArray[LivePendantRelation.CHAT.ordinal()] = 1;
          try{
             b$a.a[LivePendantRelation.VOICE_PARTY_SCENE.ordinal()] = 2;
             try{
                b$a.a[LivePendantRelation.PK_CRITICAL_HIT_ANIMATION.ordinal()] = 3;
                try{
                   b$a.a[LivePendantRelation.LIVE_PK.ordinal()] = 4;
                   try{
                      b$a.a[LivePendantRelation.RECRUIT_EXPLAIN.ordinal()] = 5;
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
