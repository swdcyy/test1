package com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MarqueeConfig extends Enum	// class@00142a
{
    public final int height;
    public final boolean needFilterFeed;
    public final int placeHolderItemCount;
    public final boolean simpleEnabled;
    public final String url;
    public static final MarqueeConfig[] $VALUES;
    public static final MarqueeConfig FRIEND;
    public static final MarqueeConfig STATUS_DETAIL;

    static {
       MarqueeConfig marqueeConfi1;
       MarqueeConfig[] marqueeConfi = new MarqueeConfig[]{v11,marqueeConfi1};
       marqueeConfi1 = new MarqueeConfig("STATUS_DETAIL", 0, "/rest/n/profile/mood/bullet", false, 0, 0, false, 28, null);
       MarqueeConfig.STATUS_DETAIL = v11;
       MarqueeConfig marqueeConfi2 = new MarqueeConfig("FRIEND", 1, "n/feed/friends/bullet", false, 0, 0, false, 28, null);
       MarqueeConfig.FRIEND = marqueeConfi1;
       MarqueeConfig.$VALUES = marqueeConfi;
    }
    public void MarqueeConfig(String p0,int p1,String p2,boolean p3,int p4,int p5,boolean p6){
       super(p0, p1);
       this.url = p2;
       this.needFilterFeed = p3;
       this.height = p4;
       this.placeHolderItemCount = p5;
       this.simpleEnabled = p6;
    }
    public void MarqueeConfig(String p0,int p1,String p2,boolean p3,int p4,int p5,boolean p6,int p7,u p8){
       int i = (p7 & 0x04)? a1.d(0x7f070a89): p4;
       int i1 = (p7 & 0x08)? 3: p5;
       boolean b = (p7 & 0x10)? false: p6;
       super(p0, p1, p2, p3, i, i1, b);
       return;
    }
    public static MarqueeConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MarqueeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MarqueeConfig.class, p0);
    }
    public static MarqueeConfig[] values(){
       Object obj = PatchProxy.apply(null, null, MarqueeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MarqueeConfig.$VALUES.clone();
    }
}
