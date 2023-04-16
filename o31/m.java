package o31.m;
import ry1.b;
import lp3.a;
import ok.x;
import crd.a;
import ry1.d;
import o31.m$a;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ds5.c;
import ds5.a;
import java.util.List;
import java.lang.Throwable;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import brd.v;
import brd.g;
import gw1.a;
import z12.e;
import java.lang.StringBuilder;
import d61.g;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import o31.b;
import io.reactivex.g;
import t45.d;
import brd.z;
import fg6.a;
import com.google.gson.Gson;
import o31.d;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import lp3.e;
import xp5.g;
import lp3.c;

public class m extends a implements b	// class@00346a
{
    public final a d;
    public final d e;
    public final d f;
    public final x g;
    public LiveUserStatusResponse h;
    public LiveTimeConsumingUserStatusResponse i;
    public Throwable j;
    public Throwable k;
    public final List l;
    public final List m;
    public final c n;

    public void m(x p0){
       super();
       this.d = new a();
       this.e = new d();
       this.f = new d();
       this.n = new m$a(this);
       this.g = p0;
       this.l = new LinkedList();
       this.m = new LinkedList();
    }
    public LiveUserStatusResponse D1(){
       return this.h;
    }
    public c Hl(){
       return this.f;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       this.Uo().J.gd(this.n);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, m.class, "9")) {
          return;
       }
       this.Uo().J.fo(this.n);
       this.d.d();
       this.l.clear();
       this.m.clear();
       this.j = null;
       this.k = null;
       return;
    }
    public final void So(Throwable p0,List p1){
       String[] stringArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "7")) {
          return;
       }
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onError(p0);
             }
          }
          p1.clear();
       }
       int i = 0;
       if (a.c()) {
          stringArray = new String[i];
          e.a("[live/userStatus]", "error", p0, stringArray);
       }else {
          stringArray = new String[i];
          e.c("[live/userStatus]", "error: "+g.e(p0), stringArray);
       }
       return;
    }
    public t T3(){
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new b(this)).observeOn(d.a);
    }
    public final void To(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "6")) {
          return;
       }
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onNext(p0);
                ov.onComplete();
             }
          }
          p1.clear();
       }
       if (!a.c()) {
          String[] stringArray = new String[0];
          e.c("[live/userStatus]", "result: "+a.a.q(p0), stringArray);
       }
       return;
    }
    public final a0 Uo(){
       Object obj = PatchProxy.apply(null, this, m.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get();
    }
    public t W(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new d(this)).observeOn(d.a);
    }
    public c Xh(){
       return this.e;
    }
    public LiveTimeConsumingUserStatusResponse d0(){
       return this.i;
    }
    public final String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Po().a(g.class).getLiveStreamId();
    }
    public void k2(){
       this.h = null;
       this.i = null;
    }
}
