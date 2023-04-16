package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$f;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse$LiveNeoPendentTasksData;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;

public final class LiveMultiTriggeringNeoPendantPresenter$f implements g	// class@00098b
{
    public final LiveMultiTriggeringNeoPendantPresenter b;

    public void LiveMultiTriggeringNeoPendantPresenter$f(LiveMultiTriggeringNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiTriggeringNeoPendantPresenter$f.class, "1")) {
       }else {
          LiveMultiTriggeringNeoPendantPresenter$f tb = this.b;
          boolean b = true;
          tb.B = b;
          p0 = p0.mData;
          if (p0 != null && p0.mTaskFinished == b) {
             p0 = new Object[0];
             j0.f("LiveMultiTriggeringNeoPendantPresenter", "Show no pendent when all task finished", p0);
             p0 = this.b;
             p0.x = 0;
             p0 = p0.y;
             if (p0 != null) {
                j.d(p0);
             }
          }else {
             tb.X8();
          }
       }
       return;
    }
}
