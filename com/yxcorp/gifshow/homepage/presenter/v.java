package com.yxcorp.gifshow.homepage.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.b;
import brd.t;
import t45.d;
import brd.z;
import yta.z1;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import android.view.View;
import com.yxcorp.utility.Log;
import org.greenrobot.eventbus.a;
import cda.i;
import ekd.m1;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.component.photo.reduce.h;
import cda.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;

public class v extends PresenterV2	// class@0017eb
{
    public View p;
    public BaseFeed q;
    public RecyclerFragment r;
    public View s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       u1.a(this);
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new z1(this), e.b));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       this.s = this.m8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "10")) {
          return;
       }
       Log.g("PhotoNegativeAnimPresenter", "postReduceEvent");
       this.u = false;
       this.w = true;
       a.d().k(new i(false, this.x));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3105);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.q = this.r8("feed");
       this.r = this.r8("FRAGMENT");
       return;
    }
    public void onDetailExitAnimCompleteEvent(b p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "7")) {
          return;
       }
       this.v = true;
       if (this.t != null) {
          if (!PatchProxy.applyVoid(null, this, ov, "9")) {
             Log.g("PhotoNegativeAnimPresenter", "doNegativeAnim");
             this.t = false;
             if (this.s != null) {
                new h(this.r).g(this.s, this.q);
             }
          }
          if (this.u != null) {
             this.P8();
             this.reset();
          }
       }else {
          this.reset();
       }
       return;
    }
    public void onEventMainThread(e p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "6")) {
          return;
       }
       e a = p0.a;
       Object obj = PatchProxy.applyOneRefs(a, this, ov, "8");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): (this.q.a(PhotoMeta.class).mPhotoId).equals(a);
       if (!b) {
          return;
       }else if(p0.b != null){
          this.u = true;
          if (this.v != null && this.w == null) {
             this.v = false;
             this.P8();
             this.reset();
          }
       }else if(p0.f != null){
          this.x = this.q.getId();
       }else {
          this.x = p0.a;
       }
       this.t = true;
       return;
    }
    public final void reset(){
       this.t = false;
       this.u = false;
       this.v = false;
       this.w = false;
    }
}
