package com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a;
import erd.g;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC;
import ip3.a;
import xa3.a;
import kg1.f;

public final class LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a implements g	// class@0009b2
{
    public final LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1 b;

    public void LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a(LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a.class, "1")) {
       }else {
          b.Z(LiveLiteLogTag.HIGH_FREQUENCY, "showFansGroupAudienceDialog");
          p0 = this.b.this$0.t.get();
          if (p0 != null) {
             p0.A1();
          }
       }
       return;
    }
}
