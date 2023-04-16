package com.kuaishou.merchant.live.basic.common.LiveCommonLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommonLogBiz extends Enum implements a	// class@001884
{
    public final String mBiz;
    public static final LiveCommonLogBiz[] $VALUES;
    public static final LiveCommonLogBiz SPIKE;
    public static final LiveCommonLogBiz TRUST_CARD;
    public static final LiveCommonLogBiz WELFARE;

    static {
       LiveCommonLogBiz liveCommonLo = new LiveCommonLogBiz("TRUST_CARD", 0, "LiveTrustCard");
       LiveCommonLogBiz.TRUST_CARD = liveCommonLo;
       LiveCommonLogBiz liveCommonLo1 = new LiveCommonLogBiz("SPIKE", 1, "LiveSpike");
       LiveCommonLogBiz.SPIKE = liveCommonLo1;
       LiveCommonLogBiz liveCommonLo2 = new LiveCommonLogBiz("WELFARE", 2, "LiveWelfare");
       LiveCommonLogBiz.WELFARE = liveCommonLo2;
       LiveCommonLogBiz[] liveCommonLo3 = new LiveCommonLogBiz[]{liveCommonLo,liveCommonLo1,liveCommonLo2};
       LiveCommonLogBiz.$VALUES = liveCommonLo3;
    }
    public void LiveCommonLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static LiveCommonLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommonLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommonLogBiz.class, p0);
    }
    public static LiveCommonLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommonLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
