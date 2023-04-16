package hy1.l;
import hy1.f;
import lp3.a;
import java.util.HashMap;
import hy1.i;
import hy1.j;
import hy1.g;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import hy1.h;
import java.lang.Runnable;
import hy1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import hy1.b;
import ekd.k1;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import java.util.Collection;
import qk.m;
import hy1.k;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import hy1.e;
import hy1.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class l extends a implements f	// class@0027c7
{
    public final Map d;
    public a e;
    public boolean f;
    public final Runnable g;
    public final Runnable h;
    public final b i;
    public a j;
    public boolean k;

    public void l(boolean p0){
       super();
       this.d = new HashMap();
       this.f = false;
       this.g = new i(this);
       this.h = new j(this);
       this.i = new g(this);
       if (p0) {
          a uoa = new a(ViewElement.TOP_BROADCAST, new h(this));
          this.j = uoa;
          uoa.c();
       }
       return;
    }
    public void Do(int p0,a p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ol, "10")) {
          return;
       }
       this.d.remove(Integer.valueOf(p0));
       p1.f(null);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, l.class, "12")) {
          return;
       }
       this.d.clear();
       this.e = null;
       this.f = false;
       k1.n(this);
       l tj = this.j;
       if (tj != null) {
          tj.b();
       }
       return;
    }
    public final void So(long p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ol, "5")) {
          return;
       }
       k1.m(this.g);
       k1.s(this.g, this, p0);
       return;
    }
    public final void To(long p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ol, "7")) {
          return;
       }
       k1.m(this.h);
       k1.s(this.h, this, p0);
       return;
    }
    public final void Uo(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "2")) {
          return;
       }
       l tj = this.j;
       if (tj != null && !tj.a()) {
          return;
       }
       if (this.f != null) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray1 = PatchProxy.apply(objArray, this, ol, "3");
       if (objArray1 != patchProxyRe) {
       }else {
          l td = this.d;
          ImmutableList immutableLis = PatchProxy.applyOneRefs(td, this, ol, "4");
          if (immutableLis != patchProxyRe) {
          }else {
             immutableLis = m.s(td.values()).E(k.b);
          }
          Iterator iterator = immutableLis.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.g()) {
                td = this.e;
                int i = 0;
                if (td != null && uoa != td) {
                   i = 1;
                }
                if (!i) {
                   objArray = uoa;
                   break ;
                }
             }
          }
          objArray1 = objArray;
       }
       if (objArray1 == null) {
          return;
       }else {
          e uoe = objArray1.c();
          if (uoe == null) {
             return;
          }else {
             d uod = uoe.a();
             if (uod != null) {
                uod.b(uoe);
             }
             if (uod != null && !uod.a(uoe)) {
                return;
             }else {
                objArray1.d(uoe);
                this.e = objArray1;
                this.So((uoe.b() + 5000));
                this.f = true;
                this.To(uoe.b());
                return;
             }
          }
       }
    }
    public void Y8(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       if (this.k != null) {
          b.Z(LiveLogTag.LIVE_TOP_TEMP_MESSAGE, "disable add msg");
          return;
       }else {
          a uoa = this.d.get(Integer.valueOf(p0.a));
          if (uoa == null) {
             b.Z(LiveLogTag.LIVE_TOP_TEMP_MESSAGE, "unsupported messageType");
             return;
          }else {
             uoa.e(p0);
             return;
          }
       }
    }
    public void dk(int p0,a p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ol, "9")) {
          return;
       }
       if (this.d.containsKey(Integer.valueOf(p0))) {
          b.Z(LiveLogTag.LIVE_TOP_TEMP_MESSAGE, "pool already exist");
          return;
       }else {
          p1.f(this.i);
          this.d.put(Integer.valueOf(p0), p1);
          return;
       }
    }
    public void eg(boolean p0){
       this.k = p0;
    }
    public void ld(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       this.So(5000);
       this.To(0);
       return;
    }
}
