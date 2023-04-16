package com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.LiveRedPackRainForbiddenBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveRedPackRainForbiddenBiz extends Enum	// class@000ef0
{
    public int mType;
    public String mValue;
    public static final LiveRedPackRainForbiddenBiz[] $VALUES;
    public static final LiveRedPackRainForbiddenBiz LIVE_END;
    public static final LiveRedPackRainForbiddenBiz LIVE_LINE;
    public static final LiveRedPackRainForbiddenBiz NOT_FORBIDDEN;
    public static final LiveRedPackRainForbiddenBiz PAGE_HIDE;
    public static final LiveRedPackRainForbiddenBiz PAGE_PAUSE;
    public static final LiveRedPackRainForbiddenBiz PK;
    public static final LiveRedPackRainForbiddenBiz VOICE_PARTY;

    static {
       LiveRedPackRainForbiddenBiz liveRedPackR = new LiveRedPackRainForbiddenBiz("NOT_FORBIDDEN", 0, 0, "NOT_FORBIDDEN");
       LiveRedPackRainForbiddenBiz.NOT_FORBIDDEN = liveRedPackR;
       LiveRedPackRainForbiddenBiz liveRedPackR1 = new LiveRedPackRainForbiddenBiz("PK", 1, 1, "PK");
       LiveRedPackRainForbiddenBiz.PK = liveRedPackR1;
       LiveRedPackRainForbiddenBiz liveRedPackR2 = new LiveRedPackRainForbiddenBiz("LIVE_END", 2, 2, "LIVE_END");
       LiveRedPackRainForbiddenBiz.LIVE_END = liveRedPackR2;
       LiveRedPackRainForbiddenBiz liveRedPackR3 = new LiveRedPackRainForbiddenBiz("VOICE_PARTY", 3, 3, "VOICE_PARTY");
       LiveRedPackRainForbiddenBiz.VOICE_PARTY = liveRedPackR3;
       LiveRedPackRainForbiddenBiz liveRedPackR4 = new LiveRedPackRainForbiddenBiz("PAGE_HIDE", 4, 4, "PAGE_HIDE");
       LiveRedPackRainForbiddenBiz.PAGE_HIDE = liveRedPackR4;
       LiveRedPackRainForbiddenBiz liveRedPackR5 = new LiveRedPackRainForbiddenBiz("PAGE_PAUSE", 5, 5, "PAGE_PAUSE");
       LiveRedPackRainForbiddenBiz.PAGE_PAUSE = liveRedPackR5;
       LiveRedPackRainForbiddenBiz liveRedPackR6 = new LiveRedPackRainForbiddenBiz("LIVE_LINE", 6, 6, "LIVE_LINE");
       LiveRedPackRainForbiddenBiz.LIVE_LINE = liveRedPackR6;
       LiveRedPackRainForbiddenBiz[] liveRedPackR7 = new LiveRedPackRainForbiddenBiz[]{liveRedPackR,liveRedPackR1,liveRedPackR2,liveRedPackR3,liveRedPackR4,liveRedPackR5,liveRedPackR6};
       LiveRedPackRainForbiddenBiz.$VALUES = liveRedPackR7;
    }
    public void LiveRedPackRainForbiddenBiz(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mType = p2;
       this.mValue = p3;
    }
    public static LiveRedPackRainForbiddenBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPackRainForbiddenBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRedPackRainForbiddenBiz.class, p0);
    }
    public static LiveRedPackRainForbiddenBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRedPackRainForbiddenBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRedPackRainForbiddenBiz.$VALUES.clone();
    }
    public boolean isForbidden(){
       boolean b = (this.mType > null)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainForbiddenBiz.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackRainForbiddenReason{mType="+this.mType+", mValue=\'"+this.mValue+'''+'}';
    }
}
