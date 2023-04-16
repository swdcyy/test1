package com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.c$b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import java.lang.Enum;

public class c$b	// class@000ef3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AudienceBizRelation.values().length];
       try{
          c$b.a = ointArray;
          ointArray[AudienceBizRelation.PK.ordinal()] = 1;
          try{
             c$b.a[AudienceBizRelation.LIVE_MULTI_PK.ordinal()] = 2;
             try{
                c$b.a[AudienceBizRelation.LIVE_LINE.ordinal()] = 3;
                try{
                   c$b.a[AudienceBizRelation.LIVE_MULTI_LINE.ordinal()] = 4;
                   try{
                      c$b.a[AudienceBizRelation.VOICE_PARTY.ordinal()] = 5;
                      try{
                         c$b.a[AudienceBizRelation.VOICE_PARTY_KTV.ordinal()] = 6;
                         try{
                            c$b.a[AudienceBizRelation.VOICE_PARTY_TEAM_PK.ordinal()] = 7;
                            try{
                               c$b.a[AudienceBizRelation.VOICE_PARTY_THEATER.ordinal()] = 8;
                               try{
                                  c$b.a[AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN.ordinal()] = 9;
                                  try{
                                     c$b.a[AudienceBizRelation.VOICE_PARTY_THEATER_LANDSCAPE_FULL_SCREEN.ordinal()] = 10;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
