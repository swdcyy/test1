package com.yxcorp.gifshow.share.screenshot.r$a;
import uo7.d;
import com.yxcorp.gifshow.share.screenshot.r;
import java.lang.Object;
import java.lang.String;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import uic.g0;
import brd.t;
import uic.f0;
import java.util.concurrent.Callable;
import uic.d0;
import com.kwai.framework.model.feed.BaseFeed;
import android.net.Uri;
import erd.o;
import uic.g;
import com.yxcorp.gifshow.share.screenshot.q;
import erd.g;
import crd.b;

public class r$a implements d	// class@001c64
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public boolean M3(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       return false;
    }
    public Bitmap h3(Bitmap p0,String p1,String p2,String p3,ShareAnyResponse$ShareObject p4){
       r$a uoa = r$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p0 = PatchProxy.apply(objArray, this, uoa, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       r$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p4, tb, r.class, "11")) {
          r q = tb.q;
          r w = tb.w;
          t ot = PatchProxy.applyThreeRefs(p4, q, w, null, g0.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.fromCallable(new f0(p4)).map(new d0(q, w));
          }
          ot.subscribe(new g(tb), q.b);
       }
       return this.b.y;
    }
}
