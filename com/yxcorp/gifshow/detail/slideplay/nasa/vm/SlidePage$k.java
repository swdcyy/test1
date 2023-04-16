package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$k;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v6a.m0;
import kotlin.jvm.internal.a;
import mrd.a;
import java.util.HashMap;
import java.util.Map;

public final class SlidePage$k implements g	// class@0017e1
{
    public final SlidePage b;

    public void SlidePage$k(SlidePage p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$k.class, "1")) {
       }else if(p0.intValue() > 0){
          m0 o0 = this.b.d1().o0;
          a.o(o0, "callerContext.mEntranceShownCountSubject");
          HashMap hashMap = o0.i();
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          hashMap.put("bottomGroup", p0);
          this.b.d1().o0.onNext(hashMap);
       }
       PatchProxy.onMethodExit(SlidePage$k.class, "1");
       return;
    }
}
