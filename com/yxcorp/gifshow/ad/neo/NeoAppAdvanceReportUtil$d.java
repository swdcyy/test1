package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$d;
import erd.g;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil;

public final class NeoAppAdvanceReportUtil$d implements g	// class@00178c
{
    public final BaseFeed b;

    public void NeoAppAdvanceReportUtil$d(BaseFeed p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NeoAppAdvanceReportUtil$d.class, "1")) {
       }else {
          NeoAppAdvanceReportUtil.a.c(this.b, p0);
       }
       return;
    }
}
