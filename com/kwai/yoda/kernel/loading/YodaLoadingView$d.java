package com.kwai.yoda.kernel.loading.YodaLoadingView$d;
import erd.o;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import wy7.c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.yoda.kernel.loading.YodaLoading;
import wy7.a;
import wy7.b;
import com.kwai.yoda.kernel.YodaException;

public final class YodaLoadingView$d implements o	// class@0012ae
{
    public final YodaLoadingView b;
    public final c c;

    public void YodaLoadingView$d(YodaLoadingView p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, YodaLoadingView$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          p0 = YodaLoading.g.f("none");
          if (p0 != null) {
             p0 = p0.a();
             if (p0 != null) {
                this.b.setLoadingImageProvider(p0);
                YodaLoadingView$d tb = this.b;
                YodaLoadingView$d tc = this.c;
                c b = (tc != null)? tc.b: null;
                ot = tb.e(p0, R.drawable.arg_RES_7f082587, b);
             }
          }
          throw new YodaException(0x1e84d, "Yoda loading not support this format - none");
       }
       return ot;
    }
}
