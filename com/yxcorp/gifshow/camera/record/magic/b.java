package com.yxcorp.gifshow.camera.record.magic.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.d;
import brd.t;
import ce9.a0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import m4b.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import f4b.k;
import ce9.t;
import com.kuaishou.live.common.core.basic.tools.h;
import a5b.e;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.concurrent.ConcurrentHashMap;
import c5b.c;
import c5b.d;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import a5b.c;
import a5b.d;

public final class b implements Runnable	// class@000e28
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void run(){
       e b;
       e r = this.b.r;
       Objects.requireNonNull(r);
       if (PatchProxy.applyVoid(null, r, l.class, "6")) {
       }else {
          l m = r.m;
          if (m != null) {
             n.a(m);
          }
          r.p.a(RxBus.f.f(d.class).subscribe(new a0(r), Functions.e));
          MagicBusinessId magicBusines = r.p.k0();
          if (magicBusines != MagicBusinessId.VIDEO || (!r.p.O() && !r.p.T())) {
             Object[] objArray = new Object[0];
             b.D().E("MagicHandler", "[magicface][keypath][remote] ", "/rest/n/magicFace/page start "+magicBusines+" afterResume", objArray);
             k.b(magicBusines, r.n.a()).subscribe(new t(r, magicBusines), h.b);
          }
          if (r.p.W()) {
             b = e.b;
             String str = r.p.X();
             Objects.requireNonNull(b);
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(magicBusines, Boolean.FALSE, str, b, e.class, "1")) {
                a.p(magicBusines, "businessId");
                if (e.a.get(Integer.valueOf(magicBusines.mId)) == null) {
                   c.b.a().a(magicBusines.mId, str).map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new c(magicBusines), d.b);
                }
             }
          }
       }
    label_00ee :
       return;
    }
}
