package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$hdrElement$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import jh5.a;
import java.lang.Object;
import yx9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlidePage$hdrElement$2 extends Lambda implements a	// class@0017dd
{
    public final a $dispatcherContext;

    public void SlidePage$hdrElement$2(a p0){
       this.$dispatcherContext = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, SlidePage$hdrElement$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(SlidePage$hdrElement$2.class, "1");
       return new c(this.$dispatcherContext);
    }
}
