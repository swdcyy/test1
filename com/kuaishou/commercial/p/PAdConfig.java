package com.kuaishou.commercial.p.PAdConfig;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PAdConfig extends Enum	// class@00150f
{
    public final long pageId;
    public final long subPageId;
    public static final PAdConfig[] $VALUES;
    public static final PAdConfig P_SLIDE;
    public static final PAdConfig P_SLIDE_NEBULA;
    public static final PAdConfig P_SLIDE_SMALL_WINDOW;
    public static final PAdConfig P_SLIDE_SMALL_WINDOW_NEBULA;

    static {
       PAdConfig pAdConfig;
       PAdConfig[] pAdConfigArr = new PAdConfig[]{v10,pAdConfig,pAdConfig,pAdConfig};
       pAdConfig = new PAdConfig("P_SLIDE", 0, 0x5f6388a, 0x5f6388b, 0x4568);
       PAdConfig.P_SLIDE = v10;
       PAdConfig pAdConfig1 = new PAdConfig("P_SLIDE_NEBULA", 1, 0x5f6388a, 0x5f6388c, 0x4569);
       PAdConfig.P_SLIDE_NEBULA = pAdConfig;
       PAdConfig pAdConfig2 = new PAdConfig("P_SLIDE_SMALL_WINDOW", 2, 0x5f62fbb, 0x5f6388d, 0x456a);
       PAdConfig.P_SLIDE_SMALL_WINDOW = pAdConfig;
       pAdConfig2 = new PAdConfig("P_SLIDE_SMALL_WINDOW_NEBULA", 3, 0x5f62fc0, 0x5f6388e, 0x456b);
       PAdConfig.P_SLIDE_SMALL_WINDOW_NEBULA = pAdConfig;
       PAdConfig.$VALUES = pAdConfigArr;
    }
    public void PAdConfig(String p0,int p1,long p2,long p3,long p4){
       super(p0, p1);
       this.pageId = p2;
       this.subPageId = p3;
    }
    public static PAdConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PAdConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PAdConfig.class, p0);
    }
    public static PAdConfig[] values(){
       Object obj = PatchProxy.apply(null, null, PAdConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PAdConfig.$VALUES.clone();
    }
    public final long getPageId(){
       return this.pageId;
    }
    public final long getSubPageId(){
       return this.subPageId;
    }
}
