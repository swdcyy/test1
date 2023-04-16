package com.yxcorp.gifshow.homepage.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gsa.j0;
import ko5.b;
import brd.t;
import wq6.f;
import com.yxcorp.gifshow.homepage.presenter.i$a;
import com.kwai.kcube.TabIdentifier;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import on5.b;
import java.lang.Object;
import yta.i0;
import com.yxcorp.gifshow.homepage.presenter.HomeLogoutSwitchAndRefreshPresenter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import yta.m0;
import erd.g;
import crd.b;
import jsa.m;
import t45.d;
import brd.z;
import yta.j0;
import eda.l;
import yta.k0;
import androidx.viewpager.widget.ViewPager$i;
import yta.l0;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import wq6.g;
import java.util.Iterator;
import wq6.h;
import on5.n;
import com.kwai.framework.model.channel.HotChannel;
import lnc.g0;
import java.lang.StringBuilder;
import com.kwai.component.homepage_interface.log.HomeCommonLogInfo;
import jo5.a;
import java.lang.Runnable;
import ekd.k1;
import fb5.a;
import ok.k;
import uv8.r0;
import java.lang.Boolean;
import tra.b;
import q87.c;
import yta.n0;
import po5.c;
import pr6.b;
import pr6.d;
import android.view.View;
import im8.f;

public abstract class i extends PresenterV2	// class@0017cc
{
    public final f p;
    public f q;
    public d r;
    public Runnable s;
    public boolean t;
    public t u;
    public HomeCommonLogInfo v;
    public final j0 w;
    public b x;
    public final ViewPager$i y;

    public void i(j0 p0,b p1,t p2,f p3){
       super();
       this.y = new i$a(this);
       this.p = p3;
       this.w = p0;
       this.x = p1;
       this.u = p2;
       if (p1.b()) {
          TabIdentifier tabIdentifie = HomeExperimentManager.c();
          if (b.b.equals(tabIdentifie) || b.c.equals(tabIdentifie)) {
             this.U7(new i0(this.x));
          }
       }
       this.U7(new HomeLogoutSwitchAndRefreshPresenter(this.x));
       return;
    }
    public void E8(){
       String str;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(h.class, mAIN).subscribe(new m0(this)));
       this.X7(f.f(m.class).observeOn(d.a).subscribe(new j0(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new k0(this)));
       this.w.i(this.y);
       this.X7(this.u.subscribe(new l0(this), Functions.e));
       this.P8();
       if (!PatchProxy.applyVoid(objArray, this, oi, "4") && this.v != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.p.getChildren().iterator();
          while (iterator.hasNext()) {
             h oh = iterator.next();
             if (b.f.equals(oh.M2())) {
                str = "feature";
             }else if(b.c.equals(oh.M2())){
                str = "follow";
             }else if(b.d.equals(oh.M2())){
                str = "local";
             }else if(b.b.equals(oh.M2())){
                str = "hot";
             }else if(b.h.equals(oh.M2())){
                str = "friends";
             }else if(("ato_operate").equals(oh.M2().getType())){
                str = "operate";
             }else if(n.b(oh.M2())){
                HotChannel hotChannel = oh.q("KEY_TAB_HOT_CHANNEL");
                if (hotChannel != null) {
                   str = g0.a(hotChannel);
                }
             }
             str = "unknownid = "+oh.M2().getId();
             uArrayList.add(str);
          }
          i tv = this.v;
          tv.mTopTabs = uArrayList;
          tv.mCurrentTopTab = this.x.c(this.w.a()).a();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.w.g(this.y);
       i ts = this.s;
       if (ts != null) {
          k1.m(ts);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       if (this.v == null) {
          this.v = a.b().a();
       }
       return;
    }
    public abstract TabIdentifier R8();
    public void S8(TabIdentifier p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "11")) {
          return;
       }
       if (this.t != null && k.a(this.x.f(), p0)) {
          return;
       }
       this.t = true;
       this.x.e(p0);
       r0.d(p0);
       return;
    }
    public abstract void V8(TabIdentifier p0,boolean p1,String p2);
    public final void W8(TabIdentifier p0,boolean p1,String p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, i.class, "12")) {
          return;
       }
       this.X8(p0, p1, false, p2);
       return;
    }
    public final void X8(TabIdentifier p0,boolean p1,boolean p2,String p3){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, i.class, "13")) {
          return;
       }
       if (p0 == null) {
          p0 = this.R8();
       }
       Object[] objArray = new Object[0];
       b.C().w("homecore", "switchTabFinally:"+p0, objArray);
       this.S8(p0);
       this.V8(p0, p1, p3);
       if (!PatchProxy.applyVoid(null, this, oi, "14")) {
          i ts = this.s;
          if (ts != null) {
             k1.m(ts);
          }
          n0 on0 = new n0(this);
          this.s = on0;
          k1.r(on0, 100);
       }
       if (p2) {
          this.r.d(c.A);
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, i.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.r = this.q8(d.class);
       this.q = this.w8("ACTION_BAR_CONTROLLER_PROVIDER");
       return;
    }
}
