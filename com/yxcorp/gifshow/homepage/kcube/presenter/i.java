package com.yxcorp.gifshow.homepage.kcube.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.homepage.kcube.presenter.i$a;
import com.yxcorp.gifshow.homepage.kcube.presenter.i$c;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import yq6.e;
import qn5.a;
import yq6.a;
import xq6.b;
import dta.z0;
import com.yxcorp.utility.Log;
import brd.t;
import com.kwai.framework.init.e;
import t45.d;
import brd.z;
import dta.y0;
import java.lang.Runnable;
import erd.g;
import crd.b;
import lnc.b9;
import wq6.c;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import zq6.b;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import wq6.g;
import bo5.a;
import zq6.p;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import com.yxcorp.gifshow.model.FollowTabNotify;
import yn5.a;
import wa5.e;
import pr6.d;
import sn5.e;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import dta.w0;
import io.reactivex.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.h;
import erd.r;
import com.yxcorp.gifshow.homepage.kcube.presenter.g;
import erd.o;
import gha.j;
import com.yxcorp.gifshow.homepage.kcube.presenter.f;
import dta.x0;
import java.util.List;
import java.util.Iterator;
import co5.n;
import co5.m;
import co5.j;
import zq6.r;
import rn5.a;
import sn5.g;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.Set;
import dta.v0;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import xq6.a;
import gta.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.i$b;
import zq6.i;
import zq6.s;
import com.yxcorp.gifshow.homepage.kcube.l;

public class i extends PresenterV2	// class@00175f
{
    public b p;
    public l q;
    public final Map r;
    public final c s;
    public int t;
    public FollowTabNotify u;
    public b v;
    public final d w;

    public void i(){
       super();
       this.r = new HashMap();
       this.s = new i$a(this);
       this.t = 0;
       this.w = new i$c(this);
    }
    public static boolean P8(Bitmap p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && !p0.isRecycled()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.p = this.q.c().c0().a(a.b, this.w);
       Log.g("KCubeHomeTabHostNotifyPresenter", "enableTabViewWatchDelay, watch after launch finish");
       this.X7(e.b().observeOn(d.a).subscribe(new y0(new z0(this))));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       b9.a(this.v);
       this.q.c().w(this.s);
       this.p.release();
       return;
    }
    public final Map R8(int p0,String p1){
       String obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             obj = (p0 != 3)? "": "FOLLOW";
          }else {
             obj = "LOCAL";
          }
       }else {
          obj = "OTHER";
       }
       return ImmutableMap.of("home_source", obj, "home_region_source", this.V8(p0), "red_point_info", TextUtils.I(p1));
    }
    public void S8(){
       boolean b;
       TabIdentifier tabIdentifie;
       n on;
       m om;
       j oj;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "5")) {
          return;
       }
       b uob = this.q.a();
       h oh = this.q.c().G(b.c);
       b = false;
       if (oh != null && uob.e(oh, a.r) == TopTabViewType.NORMAL_WITH_AVATAR) {
          FollowTabNotify uFollowTabNo = uob.e(oh, a.L);
          if (uFollowTabNo != null && uFollowTabNo != a.a) {
             if (!PatchProxy.applyVoidOneRefs(uFollowTabNo, this, oi, "7") && uFollowTabNo != this.u) {
                this.u = uFollowTabNo;
                boolean b1 = e.b();
                boolean b2 = (uFollowTabNo.isSingleAvatarDynamic() || uFollowTabNo.isMultiAvatarDynamic())? true: false;
                Map map = this.R8(3, uFollowTabNo.toString());
                if (!this.q.e().K0()) {
                   this.t = 3;
                   this.X8(e.d());
                   if (!b1) {
                      this.X8(e.b(map));
                   }else {
                      FollowTabNotify obj = PatchProxy.applyOneRefs(uFollowTabNo, this, oi, "8");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         obj = uFollowTabNo.mUserInfo;
                         if (obj != null && !TextUtils.x(obj.mHeadUrl)) {
                            b = true;
                         }
                      }
                      if (b) {
                         this.X8(e.a(objArray, b2, map));
                         this.v = t.create(new w0(this, uFollowTabNo)).observeOn(d.c).filter(h.b).map(g.b).filter(h.b).map(j.b).filter(h.b).map(f.b).observeOn(d.a).subscribe(new x0(this, b2, map));
                      }else {
                         FollowTabNotify obj1 = PatchProxy.applyOneRefs(uFollowTabNo, this, oi, "9");
                         boolean b3 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): uFollowTabNo.isValidMultiUser();
                         if (b3) {
                            obj1 = uFollowTabNo.mMultiIconStyle;
                            if (obj1 == 2) {
                               this.X8(e.g(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }else if(obj1 == null || obj1 == 1){
                               this.X8(e.j(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }else if(obj1 == 3){
                               this.X8(e.h(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }
                         }else {
                            this.X8(e.b(map));
                         }
                      }
                   }
                }
             }
          label_0141 :
             return;
          }
       }
       Iterator iterator = this.q.c().getChildren().iterator();
       Object[] objArray1 = objArray;
       Object[] objArray2 = objArray1;
       Object[] objArray3 = objArray2;
       while (iterator.hasNext()) {
          h oh1 = iterator.next();
          if (b.c.equals(oh1.M2())) {
             tabIdentifie = 3;
          }else if(b.d.equals(oh1.M2())){
             continue ;
          }else {
             tabIdentifie = 1;
          }
          if (tabIdentifie <= b) {
             continue ;
          }else {
             on = uob.e(oh1, a.y);
             om = uob.e(oh1, a.z);
             oj = uob.e(oh1, a.A);
             if (on == null || (on.a == null && (om == null || (om.a == null && (oj == null || oj.a == null))))) {
                continue ;
             }
          }
          objArray3 = oj;
          b = tabIdentifie;
          objArray1 = on;
          objArray2 = om;
       }
       if (objArray1 != null && !TextUtils.x(objArray1.b)) {
          objArray = objArray1.b;
       }else if(objArray2 != null && !TextUtils.x(objArray2.d)){
          objArray = objArray2.d;
       }else if(objArray3 != null && !TextUtils.x(objArray3.c)){
          objArray = objArray3.c;
       }
       r or = this.q.c().e0();
       if (b != null && !this.q.e().K0()) {
          this.t = b;
          or.a(a.i, e.b(this.R8(b, objArray)));
       }else {
          or.a(a.i, e.d());
          or.a(a.k, g.a());
       }
       return;
    }
    public final String V8(int p0){
       if (p0 == 2) {
          return "TopNearby";
       }
       if (p0 != 3) {
          return "";
       }
       return "TopFollow";
    }
    public void W8(){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "4")) {
          return;
       }
       f uof = this.q.c();
       Object[] objArray = new Object[0];
       b.C().w("KCubeHomeTabHostNotifyPresenter", "initTabViewControll of tabList:"+uof.getChildren(), objArray);
       ArrayList uArrayList = Lists.c(y.h(this.r.keySet(), new v0(uof)));
       Object[] objArray1 = new Object[0];
       b.C().w("KCubeHomeTabHostNotifyPresenter", "initTabViewControll release watcher of unuseTabs:"+uArrayList, objArray1);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          a uoa = this.r.remove(iterator.next());
          if (!PatchProxy.applyVoidOneRefs(uoa, this, oi, "15") && (uoa != null && !uoa.b())) {
             uoa.c();
          }
       }
       b uob = this.q.a();
       i = 0;
       while (i < uof.h()) {
          h oh = uof.U(i);
          if (!b.d.equals(oh.M2())) {
             a uoa1 = this.r.get(oh);
             if (uoa1 != null && !uoa1.b()) {
                objArray1 = new Object[0];
                b.C().w("KCubeHomeTabHostNotifyPresenter", "initTabViewControll reuse watcher of tab:"+oh, objArray1);
             }else {
                uoa1 = new a();
                this.r.put(oh, uoa1);
                Object[] objArray2 = new Object[0];
                b.C().w("KCubeHomeTabHostNotifyPresenter", "initTabViewControll create watcher of tab:"+oh, objArray2);
                ArrayList uArrayList1 = new ArrayList();
                uArrayList1.add(a.y);
                uArrayList1.add(a.z);
                uArrayList1.add(a.A);
                if (a.a(this.q.c(), oh) == TopTabViewType.NORMAL_WITH_AVATAR) {
                   uArrayList1.add(a.G);
                   uArrayList1.add(a.I);
                   uArrayList1.add(a.J);
                   uArrayList1.add(a.K);
                   uArrayList1.add(a.L);
                }
                uoa1.a(uob.c(oh, uArrayList1, new i$b(this)));
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void X8(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       this.q.c().e0().a(a.i, p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.q8(l.class);
       return;
    }
}
