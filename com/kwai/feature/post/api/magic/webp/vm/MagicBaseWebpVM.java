package com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import w36.a;
import androidx.lifecycle.ViewModel;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$a;
import nsd.u;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$WebpLruMap;
import w36.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import t45.d;
import brd.z;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$b;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import java.lang.Boolean;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$d;
import erd.o;
import java.util.Map;
import java.lang.Integer;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import java.util.LinkedHashMap;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$e;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$c;
import java.util.concurrent.Callable;

public abstract class MagicBaseWebpVM extends ViewModel implements a	// class@0013fe
{
    public final Map b;
    public boolean c;
    public static final MagicBaseWebpVM$a d;

    static {
       MagicBaseWebpVM.d = new MagicBaseWebpVM$a(null);
    }
    public void MagicBaseWebpVM(){
       super();
       this.b = new MagicBaseWebpVM$WebpLruMap();
    }
    public void E(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicBaseWebpVM.class, "5")) {
          return;
       }
       a.p(p0, "magicWebpData");
       this.o0().observeOn(d.a).subscribe(new MagicBaseWebpVM$b(this, p0));
       return;
    }
    public t T(b p0){
       t ot;
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicBaseWebpVM.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "magicWebpData");
       if (Build$VERSION.SDK_INT == 23) {
          ot = t.just(Boolean.FALSE);
          a.o(ot, "Observable.just\(false\)");
          return ot;
       }else {
          ot = this.o0().observeOn(d.a).map(new MagicBaseWebpVM$d(this, p0));
          a.o(ot, "getCountMap\(\)\n      .obs¡­ return@map allow\n      }");
          return ot;
       }
    }
    public void i0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicBaseWebpVM.class, "4")) {
          return;
       }
       a.p(p0, "magicWebpData");
       if (p0.b() > 0 && this.c != null) {
          Integer integer = this.b.get(p0.f());
          int i = 0;
          int i1 = (integer != null)? integer.intValue(): 0;
          i1 = i1 + 1;
          Object[] objArray = new Object[i];
          p3.D().w("MagicFaceBaseWebpVM", "count...magicWebpData:"+p0+", count:"+i1, objArray);
          this.b.put(p0.f(), Integer.valueOf(i1));
       }
       return;
    }
    public void n0(){
       if (PatchProxy.applyVoid(null, this, MagicBaseWebpVM.class, "6")) {
          return;
       }
       t.just(new LinkedHashMap(this.b)).subscribeOn(d.c).subscribe(new MagicBaseWebpVM$e(this));
       return;
    }
    public final t o0(){
       t obj = PatchProxy.apply(null, this, MagicBaseWebpVM.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c != null) {
          obj = t.just(this.b).subscribeOn(d.a);
          a.o(obj, "Observable.just\(countMap¡­beOn\(KwaiSchedulers.MAIN\)");
       }else {
          obj = t.fromCallable(new MagicBaseWebpVM$c(this)).subscribeOn(d.c);
          a.o(obj, "Observable.fromCallable ¡­eOn\(KwaiSchedulers.ASYNC\)");
       }
       return obj;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, MagicBaseWebpVM.class, "7")) {
          return;
       }
       super.onCleared();
       Object[] objArray = new Object[0];
       p3.D().w("MagicFaceBaseWebpVM", "onCleared", objArray);
       if (this.c != null) {
          this.n0();
       }
       this.b.clear();
       this.c = false;
       return;
    }
    public final boolean p0(){
       return this.c;
    }
    public abstract Map q0();
    public synchronized Map r0(){
       Map obj = PatchProxy.apply(null, this, MagicBaseWebpVM.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = this.q0();
          if (obj != null) {
             this.b.putAll(obj);
          }
          this.c = true;
          Object[] objArray = new Object[0];
          p3.D().w("MagicFaceBaseWebpVM", "initCountMap size:"+this.b.size(), objArray);
       }
       return this.b;
    }
    public abstract void s0(Map p0);
}
