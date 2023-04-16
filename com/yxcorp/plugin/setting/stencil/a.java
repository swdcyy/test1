package com.yxcorp.plugin.setting.stencil.a;
import io.reactivex.g;
import com.yxcorp.plugin.setting.stencil.d;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import brd.g;
import java.util.concurrent.atomic.AtomicReference;
import brd.t;
import vgd.o;
import t45.d;
import brd.z;
import vgd.u;
import erd.g;
import vgd.q;
import brd.w;
import vgd.r;
import vgd.v;
import ixb.a1;
import erd.a;
import crd.b;

public final class a implements g	// class@0008f5
{
    public final d b;
    public final SettingPage c;

    public void a(d p0,SettingPage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(tc, p0, tb, uod, "3")) {
       }else {
          a uoa = tb.c(tc);
          if (uoa.j()) {
             p0.onNext(uoa.i());
             p0.onComplete();
          }else {
             AtomicReference uAtomicRefer = new AtomicReference();
             t ot = PatchProxy.applyOneRefs(tc, tb, uod, "7");
             if (ot != patchProxyRe) {
             }else {
                ot = t.create(new o(tb, tc)).subscribeOn(d.c).observeOn(d.a);
             }
             ot = ot.doOnNext(new u(uAtomicRefer));
             t ot1 = PatchProxy.applyTwoRefs(uoa, uAtomicRefer, tb, uod, "4");
             if (ot1 != patchProxyRe) {
             }else {
                ot1 = t.create(new q(tb, uoa, uAtomicRefer));
             }
             Objects.requireNonNull(p0);
             t.concat(ot, ot1).subscribe(new r(p0), new v(uAtomicRefer, tc, p0), new a1(p0));
          }
       }
       return;
    }
}
