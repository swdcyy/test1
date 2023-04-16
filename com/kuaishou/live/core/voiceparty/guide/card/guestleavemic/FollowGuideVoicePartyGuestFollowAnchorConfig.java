package com.kuaishou.live.core.voiceparty.guide.card.guestleavemic.FollowGuideVoicePartyGuestFollowAnchorConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FollowGuideVoicePartyGuestFollowAnchorConfig implements Serializable	// class@0014fb
{
    public final int anchorShowTimesPerday;
    public final int guestShowTimesPerday;

    public void FollowGuideVoicePartyGuestFollowAnchorConfig(int p0,int p1){
       super();
       this.anchorShowTimesPerday = p0;
       this.guestShowTimesPerday = p1;
    }
    public static FollowGuideVoicePartyGuestFollowAnchorConfig copy$default(FollowGuideVoicePartyGuestFollowAnchorConfig p0,int p1,int p2,int p3,Object p4){
       FollowGuideVoicePartyGuestFollowAnchorConfig anchorShowTi;
       FollowGuideVoicePartyGuestFollowAnchorConfig guestShowTim;
       if (p3 & 0x01) {
          anchorShowTi = p0.anchorShowTimesPerday;
       }
       if (p3 & 0x02) {
          guestShowTim = p0.guestShowTimesPerday;
       }
       return p0.copy(anchorShowTi, guestShowTim);
    }
    public final int component1(){
       return this.anchorShowTimesPerday;
    }
    public final int component2(){
       return this.guestShowTimesPerday;
    }
    public final FollowGuideVoicePartyGuestFollowAnchorConfig copy(int p0,int p1){
       if (PatchProxy.isSupport(FollowGuideVoicePartyGuestFollowAnchorConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FollowGuideVoicePartyGuestFollowAnchorConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FollowGuideVoicePartyGuestFollowAnchorConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FollowGuideVoicePartyGuestFollowAnchorConfig && (this.anchorShowTimesPerday == p0.anchorShowTimesPerday && this.guestShowTimesPerday == p0.guestShowTimesPerday))) {
          return true;
       }
       return false;
    }
    public final int getAnchorShowTimesPerday(){
       return this.anchorShowTimesPerday;
    }
    public final int getGuestShowTimesPerday(){
       return this.guestShowTimesPerday;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FollowGuideVoicePartyGuestFollowAnchorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.anchorShowTimesPerday * 31) + this.guestShowTimesPerday);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowGuideVoicePartyGuestFollowAnchorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowGuideVoicePartyGuestFollowAnchorConfig\(anchorShowTimesPerday="+this.anchorShowTimesPerday+", guestShowTimesPerday="+this.guestShowTimesPerday+"\)";
    }
}
