package com.yxcorp.gifshow.fragment.user.g;
import g9c.a;
import java.util.HashSet;
import crd.a;
import m8c.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.record.album.model.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Set;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.List;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Iterable;
import brd.t;
import ika.g;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.fragment.user.c;
import crd.b;
import lnc.b9;
import brd.a0;
import t45.d;
import brd.z;
import ika.d;
import com.yxcorp.gifshow.fragment.user.e;
import ika.b;
import erd.r;
import com.yxcorp.gifshow.fragment.user.f;
import ika.f;
import ika.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import laa.m0;
import io.reactivex.android.schedulers.a;
import m8c.i;
import m8c.g;
import erd.a;
import com.yxcorp.gifshow.fragment.user.d;
import ika.e;

public abstract class g extends a	// class@001285
{
    public final int g;
    public boolean h;
    public int i;
    public boolean j;
    public Set k;
    public Set l;
    public a m;
    public b n;

    public void g(int p0){
       super();
       this.h = false;
       this.j = true;
       this.k = new HashSet();
       this.l = new HashSet();
       this.i = -1;
       this.g = p0;
       this.m = new a();
    }
    public static boolean X0(g p0,e p1){
       boolean b;
       Objects.requireNonNull(p0);
       Object[] obj = PatchProxy.applyOneRefs(p1, p0, g.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          int i = 0;
          if (p1 instanceof d && LocalAlbumUtils.H(p1.k().D0())) {
             obj = new Object[i];
             a.D().w("LocalAlbumAdapter", "filer\(\) save to local switch close. Total number: "+p0.i+" filtered: false", obj);
             b = false;
          }else {
             Object[] objArray = new Object[i];
             a.D().w("LocalAlbumAdapter", "filter\(\) save to local switch on. Total number: "+p0.i+" filtered: "+(p0.l.contains(p1.getIdentifier()) ^ 0x01), objArray);
             b = p0.l.contains(p1.getIdentifier()) ^ 0x01;
          }
       }
       return b;
    }
    public void Y0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       PostUtils.D("LocalAlbumAdapter", "onLoadFailed", p0);
       return;
    }
    public void Z0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("LocalAlbumAdapter", "onLoadFinished, loaded "+this.Q0().size()+", total "+this.i+", has more "+this.j, objArray);
       this.i = Math.max(this.i, this.Q0().size());
       this.n = null;
       this.k.clear();
       this.m.c(t.fromIterable(new ArrayList(this.k)).flatMap(new g(this)).subscribe(Functions.d(), c.b));
       return;
    }
    public void a1(boolean p0){
    }
    public final void b1(boolean p0){
       z a;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       this.a1(p0);
       int i = 0;
       this.i = i;
       this.l.clear();
       this.k.clear();
       b9.a(this.n);
       g tg = (this.Q0().isEmpty() || p0)? this.g: this.Q0().size() + this.g;
       Object[] objArray = new Object[i];
       a.D().w("LocalAlbumAdapter", "Reload, need "+tg, objArray);
       a = d.a;
       t ot = LocalAlbumUtils.x().d0().observeOn(a).doOnNext(new d(this)).flatMap(e.b).observeOn(a);
       this.n = ot.filter(new b(this)).take((long)tg).toList().C(f.b).R(new f(this, tg), new c(this));
       return;
    }
    public long d0(int p0){
       return (long)p0;
    }
    public final t d1(String p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "LocalAlbumAdapter";
       int i = 0;
       if (this.n != null) {
          Object[] objArray = new Object[i];
          a.D().w(str, "Loading local album projects, add to pending list: "+p0, objArray);
          this.k.add(p0);
          return t.just(Boolean.FALSE);
       }else {
          int i1 = 0;
          while (true) {
             if (i1 < this.Q0().size()) {
                e uoe = this.N0(i1);
                if (uoe instanceof d && p0.equals(uoe.k().D0())) {
                   ot = PatchProxy.apply(null, uoe, d.class, "18");
                   if (ot != patchProxyRe) {
                      break ;
                   }else {
                      ot = uoe.b.D0();
                      Object[] objArray1 = new Object[i];
                      a.D().w("LocalAlbumWorkspaceProject", "Start reloading workspace "+ot, objArray1);
                      uoe.c = true;
                      ot = DraftFileManager.E().X(uoe.b.f0()).observeOn(a.c()).map(new i(uoe, ot)).doFinally(new g(uoe, ot));
                      break ;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                obj = new Object[i];
                a.D().s(str, "Workspace "+p0+" not found in local album projects.", obj);
                return t.just(Boolean.FALSE);
             }
          }
          return ot.map(d.b);
       }
    }
    public void n(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       int i = 0;
       String str = "LocalAlbumAdapter";
       if (this.n != null) {
          objArray = new Object[i];
          a.D().A(str, "Already loading, do not load more.", objArray);
          return;
       }else if(this.j == null){
          objArray = new Object[i];
          a.D().A(str, "Has no more, do not load more.", objArray);
          return;
       }else if(this.Q0().isEmpty()){
          objArray = new Object[i];
          a.D().A(str, "Empty data, do not load more.", objArray);
          return;
       }else {
          long l = this.Q0().get((this.Q0().size() - 1)).e();
          objArray = new Object[i];
          a.D().w(str, "Load more before "+l+", loaded count "+this.Q0().size(), objArray);
          this.n = LocalAlbumUtils.w(l).observeOn(d.a).filter(new b(this)).take((long)this.g).toList().R(new e(this), new c(this));
          return;
       }
    }
}
