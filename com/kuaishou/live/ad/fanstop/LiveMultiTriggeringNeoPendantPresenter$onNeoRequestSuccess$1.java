package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$onNeoRequestSuccess$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;

public final class LiveMultiTriggeringNeoPendantPresenter$onNeoRequestSuccess$1 extends Lambda implements a	// class@00098e
{
    public final ProvideNeoInfo$Data $data;
    public final LiveMultiTriggeringNeoPendantPresenter this$0;

    public void LiveMultiTriggeringNeoPendantPresenter$onNeoRequestSuccess$1(LiveMultiTriggeringNeoPendantPresenter p0,ProvideNeoInfo$Data p1){
       this.this$0 = p0;
       this.$data = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter$onNeoRequestSuccess$1.class, "1")) {
          return;
       }
       if (this.$data.mHasRemain != null && this.this$0.S8()) {
          Object[] objArray = new Object[0];
          j0.f("LiveMultiTriggeringNeoPendantPresenter", "Start next countdown task", objArray);
          this.this$0.h9();
       }else {
          this.this$0.Y8();
          LiveMultiTriggeringNeoPendantPresenter$onNeoRequestSuccess$1 tthis$0 = this.this$0;
          tthis$0.x = 0;
          LiveMultiTriggeringNeoPendantPresenter y = tthis$0.y;
          if (y != null) {
             j.d(y);
          }
       }
       return;
    }
}
