package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$feedbackElement$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import jh5.a;
import az9.i0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;

public final class SlidePage$feedbackElement$2 extends Lambda implements a	// class@0017da
{
    public final a $dispatcherContext;
    public final SlidePage this$0;

    public void SlidePage$feedbackElement$2(SlidePage p0,a p1){
       this.this$0 = p0;
       this.$dispatcherContext = p1;
       super(0);
    }
    public final i0 invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, SlidePage$feedbackElement$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       SlidePage$feedbackElement$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       SlidePage slidePage = PatchProxy.applyWithListener(objArray, tthis$0, SlidePage.class, "1");
       if (slidePage != patchProxyRe) {
       }else {
          slidePage = tthis$0.V;
          if (slidePage == null) {
             a.S("activity");
          }
          PatchProxy.onMethodExit(SlidePage.class, "1");
       }
       PatchProxy.onMethodExit(SlidePage$feedbackElement$2.class, "1");
       return new i0(slidePage, this.$dispatcherContext);
    }
    public Object invoke(){
       return this.invoke();
    }
}
