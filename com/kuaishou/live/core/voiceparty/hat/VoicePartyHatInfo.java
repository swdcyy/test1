package com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserHatInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class VoicePartyHatInfo implements Serializable	// class@0014fe
{
    public int mHatLevel;
    public boolean mIsBehindHat;
    public boolean mIsDisplay;
    public static final long serialVersionUID = 0x49647ab83a7044a1;

    public void VoicePartyHatInfo(){
       super();
    }
    public static VoicePartyHatInfo convertFromProto(LiveStreamMessages$MicSeatUserHatInfo p0){
       Object obj = null;
       VoicePartyHatInfo obj1 = PatchProxy.applyOneRefs(p0, obj, VoicePartyHatInfo.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new VoicePartyHatInfo();
       obj1.mHatLevel = p0.hatLevel;
       obj1.mIsDisplay = p0.isDisplay;
       obj1.mIsBehindHat = p0.isStrawHat;
       return obj1;
    }
    public static long getSerialVersionUID(){
       return 0x49647ab83a7044a1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyHatInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mHatLevel != p0.mHatLevel) {
          return false;
       }
       if (this.mIsDisplay != p0.mIsDisplay) {
          return false;
       }
       if (this.mIsBehindHat != p0.mIsBehindHat) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((((this.mHatLevel * 31) + this.mIsDisplay) * 31) + this.mIsBehindHat);
    }
}
