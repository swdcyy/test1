package com.yxcorp.gifshow.v3.editor.enhancefilter.b;
import com.yxcorp.gifshow.v3.editor.enhancefilter.model.a$a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import tqc.h;
import qrd.p;
import brd.t;
import tqc.e;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.enhancefilter.b$a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.b$b;
import erd.g;
import crd.b;
import crd.a;

public final class b implements a$a	// class@000f86
{
    public final EnhanceFilterViewModel a;

    public void b(EnhanceFilterViewModel p0){
       this.a = p0;
       super();
    }
    public final void a(List p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       EnhanceFilterViewModel a = ta.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.apply(null, ta, EnhanceFilterViewModel.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = ta.h.getValue();
       }
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, h.class, "1");
       if (ot != patchProxyRe) {
       }else {
          ot = t.create(new e(obj, p0));
       }
       a.c(ot.subscribe(b$a.b, b$b.b));
       return;
    }
}
