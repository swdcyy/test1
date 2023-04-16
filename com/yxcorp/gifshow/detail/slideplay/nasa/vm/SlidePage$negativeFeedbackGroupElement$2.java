package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$negativeFeedbackGroupElement$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import az9.i0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qp7.t0;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qrd.p;

public final class SlidePage$negativeFeedbackGroupElement$2 extends Lambda implements a	// class@0017e4
{
    public final SlidePage this$0;

    public void SlidePage$negativeFeedbackGroupElement$2(SlidePage p0){
       this.this$0 = p0;
       super(0);
    }
    public final i0 invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SlidePage$negativeFeedbackGroupElement$2 obj = PatchProxy.applyWithListener(objArray, this, SlidePage$negativeFeedbackGroupElement$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyWithListener(objArray, obj, SlidePage.class, "23");
       if (objArray1 != patchProxyRe) {
       }else if(obj.U().i0()){
          String str = "8";
          objArray = PatchProxy.applyWithListener(objArray, obj, SlidePage.class, str);
          if (objArray != patchProxyRe) {
          }else {
             objArray = obj.g1.getValue();
             PatchProxy.onMethodExit(SlidePage.class, str);
          }
       }
       PatchProxy.onMethodExit(SlidePage.class, "23");
       objArray1 = objArray;
       PatchProxy.onMethodExit(SlidePage$negativeFeedbackGroupElement$2.class, "1");
       return objArray1;
    }
    public Object invoke(){
       return this.invoke();
    }
}
