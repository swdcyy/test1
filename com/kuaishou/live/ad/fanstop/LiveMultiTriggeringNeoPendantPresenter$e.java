package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$e;
import erd.c;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveMultiTriggeringNeoPendantPresenter$e implements c	// class@00098a
{
    public static final LiveMultiTriggeringNeoPendantPresenter$e a;

    static {
       LiveMultiTriggeringNeoPendantPresenter$e.a = new LiveMultiTriggeringNeoPendantPresenter$e();
    }
    public void LiveMultiTriggeringNeoPendantPresenter$e(){
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiTriggeringNeoPendantPresenter$e.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "response");
          a.p(p1, "<anonymous parameter 1>");
       }
       return p0;
    }
}
