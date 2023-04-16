package com.kuaishou.live.ad.fanstop.NeoPendentType;
import java.lang.Enum;
import com.kuaishou.live.ad.fanstop.NeoPendentType$NEO_MERCHANT_PENDANT;
import java.lang.String;
import com.kuaishou.live.ad.fanstop.NeoPendentType$FEEDS_TO_LIVE_NEO;
import com.kuaishou.live.ad.fanstop.NeoPendentType$H5_TO_LIVE_NEO_COMMON;
import com.kuaishou.live.ad.fanstop.NeoPendentType$VIDEO_DETAIL_NEO_LIVE;
import com.kuaishou.live.ad.fanstop.NeoPendentType$a;
import nsd.u;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class NeoPendentType extends Enum	// class@00099b
{
    public static final NeoPendentType[] $VALUES;
    public static final NeoPendentType$a Companion;
    public static final NeoPendentType FEEDS_TO_LIVE_NEO;
    public static final NeoPendentType H5_TO_LIVE_NEO_COMMON;
    public static final NeoPendentType NEO_MERCHANT_PENDANT;
    public static final NeoPendentType VIDEO_DETAIL_NEO_LIVE;

    static {
       NeoPendentType$NEO_MERCHANT_PENDANT nEO_MERCHANT;
       NeoPendentType$FEEDS_TO_LIVE_NEO uFEEDS_TO_LI;
       NeoPendentType$H5_TO_LIVE_NEO_COMMON h5_TO_LIVE_N;
       NeoPendentType$VIDEO_DETAIL_NEO_LIVE vIDEO_DETAIL;
       NeoPendentType[] neoPendentTy = new NeoPendentType[]{nEO_MERCHANT,uFEEDS_TO_LI,h5_TO_LIVE_N,vIDEO_DETAIL};
       nEO_MERCHANT = new NeoPendentType$NEO_MERCHANT_PENDANT("NEO_MERCHANT_PENDANT", 0);
       NeoPendentType.NEO_MERCHANT_PENDANT = nEO_MERCHANT;
       uFEEDS_TO_LI = new NeoPendentType$FEEDS_TO_LIVE_NEO("FEEDS_TO_LIVE_NEO", 1);
       NeoPendentType.FEEDS_TO_LIVE_NEO = uFEEDS_TO_LI;
       h5_TO_LIVE_N = new NeoPendentType$H5_TO_LIVE_NEO_COMMON("H5_TO_LIVE_NEO_COMMON", 2);
       NeoPendentType.H5_TO_LIVE_NEO_COMMON = h5_TO_LIVE_N;
       vIDEO_DETAIL = new NeoPendentType$VIDEO_DETAIL_NEO_LIVE("VIDEO_DETAIL_NEO_LIVE", 3);
       NeoPendentType.VIDEO_DETAIL_NEO_LIVE = vIDEO_DETAIL;
       NeoPendentType.$VALUES = neoPendentTy;
       NeoPendentType.Companion = new NeoPendentType$a(null);
    }
    public void NeoPendentType(String p0,int p1){
       super(p0, p1);
    }
    public void NeoPendentType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static final boolean shouldUse(NeoPendentType p0,LiveAdNeoMerchantParam p1,LiveBizParam p2,PhotoAdvertisement p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, NeoPendentType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return NeoPendentType.Companion.a(p0, p1, p2, p3);
    }
    public static NeoPendentType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NeoPendentType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NeoPendentType.class, p0);
    }
    public static NeoPendentType[] values(){
       Object obj = PatchProxy.apply(null, null, NeoPendentType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NeoPendentType.$VALUES.clone();
    }
    public abstract boolean valid(LiveAdNeoMerchantParam p0,LiveBizParam p1,PhotoAdvertisement p2);
}
