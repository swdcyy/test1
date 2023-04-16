package com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$onBindData$1$appendBridgeGroup$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$onBindData$1$appendBridgeGroup$1;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zy8.b;
import lnc.y0;
import com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView;

public final class AdActionBarElementView$onBindData$1$appendBridgeGroup$1$1 extends Lambda implements l	// class@00154f
{
    public final AdActionBarElementView$onBindData$1$appendBridgeGroup$1 this$0;

    public void AdActionBarElementView$onBindData$1$appendBridgeGroup$1$1(AdActionBarElementView$onBindData$1$appendBridgeGroup$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdActionBarElementView$onBindData$1$appendBridgeGroup$1$1.class, "1")) {
          return;
       }
       a.p(p0, "json");
       int i = p0.optInt("actionBarHeight");
       if (i > 0) {
          this.this$0.this$0.b.o = y0.b(i);
       }
       return;
    }
}
