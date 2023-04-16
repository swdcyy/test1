package com.yxcorp.gifshow.listcomponent.module.b;
import java.lang.Object;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$State;
import java.util.ArrayList;
import java.util.HashSet;
import y0b.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z0b.b;
import java.lang.ref.WeakReference;
import androidx.lifecycle.LifecycleOwner;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import z0b.c;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import im8.c;
import y0b.h;
import com.yxcorp.gifshow.listcomponent.event.a;
import o0b.a;
import qvb.n0;
import t0b.c;
import com.yxcorp.gifshow.listcomponent.module.a;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine;
import java.lang.Boolean;
import com.google.common.collect.ImmutableTable;
import java.util.Iterator;
import i1b.d;
import java.lang.StringBuilder;
import q87.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qvb.a;

public abstract class b	// class@001a89
{
    public KsModuleStateMachine$State b;
    public boolean c;
    public WeakReference d;
    public Object[] e;
    public Context f;
    public PresenterV2 g;
    public List h;
    public Set i;
    public View j;
    public b k;
    public n0 l;
    public final LifecycleObserver m;
    public ArrayList n;
    public c o;
    public c p;
    public static final Object q;

    static {
       b.q = new Object();
    }
    public void b(){
       super();
       this.b = KsModuleStateMachine$State.INIT;
       this.c = false;
       this.h = new ArrayList();
       this.i = new HashSet();
       this.m = new f(this);
    }
    public void f(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.e = p0;
       KsModuleStateMachine$State bIND = KsModuleStateMachine$State.BIND;
       if (this.b == bIND) {
          this.c = true;
       }
       this.q(bIND);
       return;
    }
    public void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.k = p0;
       this.d = new WeakReference(this.k.j());
       this.f = this.k.getContext();
       if (this.j == null) {
          this.j = this.u(this.k.h0());
       }
       this.j.setTag(R.id.host_fragment, p0);
       this.n = this.t();
       this.q(KsModuleStateMachine$State.CREATE);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       this.q(KsModuleStateMachine$State.DESTROY);
       return;
    }
    public c i(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.C0();
    }
    public ArrayList j(){
       return this.n;
    }
    public List k(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.n);
       obj.add(new c("CURRENT_MODULE", this));
       obj.add(new c("KS_BUS", this.n().e()));
       obj.add(new c("KS_DATA_CENTER", this.n().c()));
       obj.add(new c("CURRENT_MODULE_CONTEXT", this.n()));
       if (this.n().j() != null) {
          obj.add(new c("PAGE_LIST", this.n().j()));
       }
       obj.add(new c("FRAGMENT", this.k));
       return obj;
    }
    public View l(){
       return this.j;
    }
    public b m(){
       return this.k;
    }
    public abstract h n();
    public final c o(){
       return this.p;
    }
    public boolean p(){
       boolean b = (this.b == KsModuleStateMachine$State.DESTROY)? true: false;
       return b;
    }
    public final void q(KsModuleStateMachine$State p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "17")) {
          return;
       }
       b tb = this.b;
       a uoa = new a(this);
       Object[] obj = PatchProxy.applyThreeRefs(tb, p0, uoa, null, KsModuleStateMachine.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          List list = KsModuleStateMachine.a.get(tb, p0);
          if (list == null) {
             b = false;
          }else {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                uoa.a(iterator.next());
             }
             b = true;
          }
       }
       if (!b) {
          obj = new Object[0];
          d.C().t("KsBaseModule", "不能从 "+this.b+" 跳到 "+p0+", class:"+this.getClass().getName(), obj);
       }
       return;
    }
    public void r(){
    }
    public void s(){
    }
    public ArrayList t(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public View u(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new View(p0.getContext());
    }
    public n0 v(){
       return null;
    }
    public abstract PresenterV2 w();
    public void x(){
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       b tl = this.l;
       if (tl != null) {
          tl.u1();
       }
       tl = this.l;
       if (tl != null) {
          tl.clear();
       }
       return;
    }
    public void y(){
    }
}
