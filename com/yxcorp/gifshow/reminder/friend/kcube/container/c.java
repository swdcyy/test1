package com.yxcorp.gifshow.reminder.friend.kcube.container.c;
import zr6.e;
import crd.a;
import xq6.a;
import androidx.fragment.app.Fragment;
import wq6.h;
import wq6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import brd.t;
import lec.q;
import ndc.j;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import ndc.k;
import eda.l;
import ndc.i;
import yq6.e;
import qn5.a;
import com.yxcorp.gifshow.reminder.friend.kcube.container.a;
import yq6.a;
import xq6.b;
import ndc.f;
import ndc.g;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.reminder.friend.kcube.container.b;
import lnc.b9;
import mdc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import java.util.Collection;
import ekd.q;
import java.util.List;
import zq6.r;
import rn5.a;
import zq6.p;
import sn5.e;
import lec.u;
import wkd.b;
import sdc.b;
import k9c.e;
import java.util.Map;
import lec.f;
import com.google.gson.JsonObject;

public class c extends e	// class@001aaf
{
    public final a e;
    public final a f;

    public void c(){
       super();
       this.e = new a();
       this.f = new a();
    }
    public void f(Fragment p0){
    }
    public void g(Fragment p0){
    }
    public void h(h p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(l.a()){
          i = RedDotRepository.d(1);
       }else {
          i = b.b(-7);
       }
       if (i > 0) {
          this.p(i);
       }
       this.e.c(q.c().subscribe(new j(this), Functions.e));
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.e.c(f.g(n.class, mAIN).subscribe(new k(this)));
       this.e.c(f.g(l.class, mAIN).subscribe(new i(this)));
       this.f.a(p0.c0().a(a.a, new a(this)));
       this.f.a(p0.c0().a(a.b, new f(this)));
       this.f.a(p0.c0().a(a.c, new g(this)));
       this.e.c(t.just(Boolean.TRUE).delay(0x2710, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(b.b, Functions.d()));
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          b9.a(this.e);
          this.f.c();
       }
       return;
    }
    public final b o(){
       Object[] objArray1;
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.d() != null)? this.d().Q(): objArray;
       if (obj instanceof b) {
          objArray = obj;
       }
       return objArray;
    }
    public final void p(int p0){
       r or;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       int i = 1;
       FriendTabNotify$Common uCommon = (l.a())? RedDotRepository.c(i): b.c(-7, FriendTabNotify$Common.class);
       int i1 = (uCommon != null && !q.f(uCommon.mFeedItems))? uCommon.mFeedItems.size(): 0;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i1), this, uoc, "4")) {
          String str = null;
          int i2 = -599798995;
          if (p0 > 0) {
             p i3 = a.i;
             e uoe = this.c().d(i3);
             int i4 = (uoe != null && uoe.a != null)? 0: 1;
             String str1 = (u.b())? 2: 1;
             if (uoe == null || uoe.a != str1) {
                b.a(i2).a = e.b("FRIENDS");
             }
             if (u.b()) {
                or = this.d().e0();
                if (b.a(i2).c == null || b.a(i2).b == null) {
                   i = false;
                }
                or.a(i3, e.i(p0, f.i(p0, i1, i, str), f.j(i4)));
             }else {
                or = this.d().e0();
                if (b.a(i2).c == null || b.a(i2).b == null) {
                   i = false;
                }
                or.a(i3, e.c(f.h(p0, i1, i, str), f.j(i4)));
             }
          }else {
             p0.a = str;
             this.d().e0().a(a.i, e.d());
          }
       }
       return;
    }
}
