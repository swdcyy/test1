package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$c;
import erd.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;
import kotlin.jvm.internal.a;

public final class NeoAppAdvanceReportUtil$c implements g	// class@00178b
{
    public final BaseFeed b;
    public final PhotoAdvertisement$NeoReportInfo c;

    public void NeoAppAdvanceReportUtil$c(BaseFeed p0,PhotoAdvertisement$NeoReportInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NeoAppAdvanceReportUtil$c.class, "1")) {
       }else {
          a.o(p0, "data");
          NeoAppAdvanceReportUtil.a.d(this.b, this.c, p0);
       }
       return;
    }
}
