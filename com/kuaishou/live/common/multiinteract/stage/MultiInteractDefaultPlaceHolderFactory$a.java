package com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory$a;
import erd.o;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory;
import java.lang.Object;
import fe3.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import fe3.d;
import oe3.h;
import brd.t;
import java.util.Map;
import java.util.Objects;
import android.graphics.Bitmap;
import qrd.p;
import mrd.a;

public final class MultiInteractDefaultPlaceHolderFactory$a implements o	// class@0017fe
{
    public final MultiInteractDefaultPlaceHolderFactory b;

    public void MultiInteractDefaultPlaceHolderFactory$a(MultiInteractDefaultPlaceHolderFactory p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, MultiInteractDefaultPlaceHolderFactory$a.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "_window");
          p0 = p0.h();
          Object obj = null;
          p0 = (p0 != null)? p0.b(): obj;
          MultiInteractDefaultPlaceHolderFactory$a uoa = (p0 == null || !p0.length())? 1: null;
          if (uoa) {
             ot = t.just(new h(obj));
          }else {
             MultiInteractDefaultPlaceHolderFactory b = this.b.b;
             a uoa1 = b.get(p0);
             if (uoa1 == null) {
                MultiInteractDefaultPlaceHolderFactory$a tb = this.b;
                Objects.requireNonNull(tb);
                obj = PatchProxy.apply(obj, tb, MultiInteractDefaultPlaceHolderFactory.class, "1");
                if (obj != patchProxyRe) {
                }else {
                   obj = tb.a.getValue();
                }
                uoa1 = a.h(new h(obj));
                a.o(uoa1, "BehaviorSubject.createDefault\(Maybe\(defaultImg\)\)");
                b.put(p0, uoa1);
             }
             ot = uoa1;
          }
       }
       return ot;
    }
}
