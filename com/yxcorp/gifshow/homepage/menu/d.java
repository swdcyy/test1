package com.yxcorp.gifshow.homepage.menu.d;
import im8.g;
import ib5.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import nc5.t;
import java.lang.Object;
import ok.x;
import java.lang.Boolean;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.homepage.menu.d$a;
import com.yxcorp.gifshow.homepage.menu.d$b;
import qta.z;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import tra.b;
import q87.c;
import com.yxcorp.gifshow.homepage.menu.redesign.e;
import com.google.common.collect.Lists;
import java.lang.Number;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import uh5.e;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Float;
import ekd.r;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import fo5.b;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import qta.a0;
import erd.g;
import crd.b;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import qta.d0;
import java.util.Map;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.HomeActivity;
import za5.a;
import java.util.List;
import com.yxcorp.gifshow.homepage.menu.c;
import erd.o;
import wq6.l;
import wq6.g;
import wq6.e;
import wq6.h;
import fr6.d;
import android.os.MessageQueue;
import android.os.Looper;
import android.os.MessageQueue$IdleHandler;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import ur6.f;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;

public class d extends o implements g	// class@001775
{
    public final boolean q;
    public final List r;
    public boolean s;
    public final PublishSubject t;
    public Boolean u;
    public final SlidingPaneLayout$d v;
    public final d w;
    public final MessageQueue$IdleHandler x;

    public void d(GifshowActivity p0){
       super(p0);
       this.q = t.b.get().booleanValue();
       this.r = new ArrayList();
       this.t = PublishSubject.g();
       this.v = new d$a(this);
       this.w = new d$b(this);
       this.x = new z(this);
    }
    public int M(){
       return 2;
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public ClientContent$ContentPackage Q3(){
       return null;
    }
    public String a2(){
       return "";
    }
    public PresenterV2 b(){
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = c.a(this.o).l();
       if (this.i()) {
          Object[] objArray1 = new Object[0];
          b.C().w("HomeMenuHelper", "enableMenuRedesign presenter use HomeMenuRedesignPresenter", objArray1);
          PatchProxy.onMethodExit(d.class, "13");
          return new e(b);
       }else {
          PatchProxy.onMethodExit(d.class, "13");
          return objArray;
       }
    }
    public ArrayList c(){
       Object[] obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this};
       return Lists.e(obj);
    }
    public int d(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (!this.i()) {
          return i;
       }
       if (HomeExperimentManager.a()) {
          objArray = new Object[i];
          b.C().w("HomeMenuHelper", "enableMenuRedesign contentResId use nasa_home_sliding_menu_v5", objArray);
          return 0x7f0d104e;
       }else {
          objArray = new Object[i];
          b.C().w("HomeMenuHelper", "enableMenuRedesign contentResId use nasa_home_sliding_menu_v4", objArray);
          return 0x7f0d104c;
       }
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.f()) {
          return (int)((double)n.k(this.o) * 0x3fe851eb851eb852);
       }
       return (int)((float)n.k(this.o) * 0x3f380000);
    }
    public int f(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uod, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (e.f()) {
          return r.d((int)((p0 * 0.30f) * 0x437f0000), 0xff000000);
       }else {
          return r.d((int)((p0 * 0.10f) * 0x437f0000), 0xff000000);
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("HomeMenuHelper", "onMenuContentInflated current user id : "+QCurrentUser.me().getId(), objArray);
       b.a(0xad3151d).e(this.o);
       if (!this.t.c()) {
          this.t.onComplete();
          Object[] objArray1 = new Object[i];
          b.C().w("HomeMenuHelper", "menu inflate complete, mark init trigger of tab select complete", objArray1);
       }
       this.a(RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new a0(this)));
       q.p0(this.o).v0(this.v);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new d0());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 46;
    }
    public String getPageParams(){
       return "";
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enablePaneInitAfterLaunch", true);
    }
    public final boolean i(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.apply(null, this, uod, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.u == null) {
          obj = PatchProxy.apply(null, this, uod, "15");
          boolean b = false;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             Object obj1 = PatchProxy.apply(null, this, uod, "16");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                o to = this.o;
                i = (to instanceof HomeActivity)? a.o0(to).p0(): 0;
             }
             if (i != 5 && i) {
                b = b.a(0xad3151d).c();
             }
          }
          this.u = Boolean.valueOf(b);
       }
       return this.u.booleanValue();
    }
    public List j(){
       ArrayList obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!this.t.c()) {
          obj.add(this.t.map(c.b));
       }
       return obj;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       l ol = c.a(this.o).d();
       if (this.q == null) {
          this.m(ol.k().N());
       }
       ol.a(this.w);
       Object[] objArray = new Object[0];
       b.C().w("HomeMenuHelper", "onAttach current user id : "+QCurrentUser.me().getId(), objArray);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("HomeMenuHelper", "onDetach current user id : "+QCurrentUser.me().getId(), objArray);
       b.a(0xad3151d).h(this.o);
       q.p0(this.o).C0(this.v);
       c.a(this.o).d().m(this.w);
       Looper.myQueue().removeIdleHandler(this.x);
       this.u = null;
       return;
    }
    public void m(h p0){
       Object[] obj;
       boolean b1;
       Object[] objArray;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       l ol = c.a(this.o).d();
       TabIdentifier b = b.B;
       if (ol.q(p0.M2(), b)) {
          TabIdentifier tabIdentifie = p0.M2();
          if (PatchProxy.isSupport(l.class)) {
             obj = PatchProxy.applyThreeRefs(Integer.valueOf(0), tabIdentifie, b, ol, l.class, "8");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
             label_004b :
                a.p(tabIdentifie, "targetId");
                a.p(b, "containerId");
                int i = ol.p(tabIdentifie, b);
                if (!i) {
                   b1 = true;
                }else if(i == -1){
                   h oh = ol.a.d0().R(b);
                   if (oh != null && oh.a().h() > 0) {
                      h oh1 = ol.a.d0().R(oh.a().U(0).M2());
                      if (oh1 instanceof g) {
                         b1 = oh1.M(tabIdentifie);
                      }
                   }
                }
                b1 = false;
             }
          }else {
             goto label_004b ;
          }
          if (b1) {
             if (!PatchProxy.applyVoid(null, this, uod, "3") && !this.t.c()) {
                this.t.onNext(Boolean.TRUE);
                this.t.onComplete();
             }
             objArray = new Object[0];
             b.C().w("HomeMenuHelper", "change to top bar first tab:"+p0+", try init tab immediately", objArray);
          }else if(!b.f.equals(p0.M2()) && this.q == null){
             Looper.myQueue().removeIdleHandler(this.x);
             if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "4") && this.s == null) {
                this.s = true;
                if (!this.t.c()) {
                   Looper.myQueue().addIdleHandler(this.x);
                   obj = new Object[0];
                   b.C().w("HomeMenuHelper", "idle in tab:"+p0+", try init menu", obj);
                }
             }
             objArray = new Object[0];
             b.C().w("HomeMenuHelper", "change to not feature tab:"+p0+", try init menu when idle", objArray);
          }else {
             objArray = new Object[0];
             b.C().w("HomeMenuHelper", "change to feature tab or onlyInitClick = true: "+p0+", do not try init", objArray);
          }
       }else {
          goto label_00da ;
       }
       return;
    }
    public boolean n(){
       return this.q;
    }
    public String o(){
       return "MENU";
    }
}
