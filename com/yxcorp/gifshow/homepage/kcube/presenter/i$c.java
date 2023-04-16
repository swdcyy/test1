package com.yxcorp.gifshow.homepage.kcube.presenter.i$c;
import vn5.d;
import com.yxcorp.gifshow.homepage.kcube.presenter.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import crd.b;
import lnc.b9;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import k9c.e;
import java.lang.Integer;
import java.lang.Number;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import zq6.r;
import rn5.a;
import zq6.p;
import sn5.e;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import jn5.b;
import jn5.a$a;
import jn5.a;
import tkd.b;
import tkd.d;
import lv5.c;
import lha.b;
import lv5.b;
import sua.o;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import ao5.c;
import ao5.b;
import on5.b;
import xr6.c$a;
import xr6.c;
import com.kwai.kcube.TabIdentifier;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.model.FollowTabNotify;

public class i$c implements d	// class@00175e
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,boolean p2){
       i oi = i.class;
       if (PatchProxy.isSupport(i$c.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, i$c.class, "1")) {
          return;
       }
       b9.a(this.a.v);
       Object[] objArray = null;
       if (p0 && p2) {
          i$c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, oi, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "NAVIGATION_RED_POINT";
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("red_point_id", e.b("HOME"));
             jsonObject1.c0("name", "HOME");
             jsonObject1.a0("type", Integer.valueOf(true));
             e uoe1 = ta.q.c().e0().d(a.i);
             if (uoe1 != null) {
                uoe1 = uoe1.e;
                if (!PatchProxy.applyVoidTwoRefs(jsonObject1, uoe1, ta, oi, "14") && !q.h(uoe1)) {
                   Iterator iterator1 = uoe1.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry1 = iterator1.next();
                      if (!TextUtils.x(uEntry1.getKey()) && !TextUtils.x(uEntry1.getValue())) {
                         jsonObject1.c0(uEntry1.getKey(), uEntry1.getValue());
                      }
                   }
                }
             }
             uElementPack.params = jsonObject1.toString();
             u1.u(true, uElementPack, objArray);
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, oi, "13")) {
             JsonObject jsonObject = new JsonObject();
             e uoe = ta.q.c().e0().d(a.i);
             if (uoe != null) {
                uoe = uoe.e;
                if (uoe != null) {
                   Iterator iterator = uoe.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (!TextUtils.x(uEntry.getKey()) && !TextUtils.x(uEntry.getValue())) {
                         jsonObject.c0(uEntry.getKey(), uEntry.getValue());
                      }
                   }
                }
             }
             a$a uoa = new a$a();
             uoa.g(true);
             uoa.f(ta.V8(ta.t));
             uoa.b(jsonObject);
             uoa.d("BottomHome");
             b.a.b(uoa.a());
          }
       }
    label_0159 :
       b uob = d.a(-242212848).o5();
       d.a(-242212848).jH(objArray);
       if (p1 || (p2 && (!o.a() && this.a.getContext() instanceof FragmentActivity))) {
          b uob1 = c.a(this.a.getContext()).j().e();
          if (uob1 != null && (uob1.j() && uob1.l())) {
             uob1.m(false);
             if (this.a.q.c().V(b.e, c.a("ForceSwitchActivityTab").a())) {
                if (p0 && (this.c() && uob != null)) {
                   uob.d(true);
                   RxBus.f.b(uob);
                }
             label_01d5 :
                return;
             }
          }
       }
    label_01d6 :
       if (p0 && (p1 || (p2 && this.c()))) {
          FollowTabNotify uFollowTabNo = d.a(-242212848).YB();
          if (uFollowTabNo != null) {
             uFollowTabNo.mClickType = 2;
          }
          this.a.q.c().V(b.c, c.a("FollowRedPoint").a());
       }
    label_0208 :
       return;
    }
    public void b(boolean p0,boolean p1){
    }
    public final boolean c(){
       boolean b = (this.a.t == 3)? true: false;
       return b;
    }
}
