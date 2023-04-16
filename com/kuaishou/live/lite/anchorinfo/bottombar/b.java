package com.kuaishou.live.lite.anchorinfo.bottombar.b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.sidebar.e;
import pg1.e;
import or5.d;
import xp5.i;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import xa3.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel;
import p83.h;
import java.lang.Class;
import ok.x;
import va1.g0;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import androidx.lifecycle.LiveData;
import pp.c;
import com.kuaishou.android.live.log.b;
import p83.a;
import z1.a;
import androidx.lifecycle.ViewModel;
import p83.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import p83.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import v83.x;
import com.kuaishou.live.lite.anchorinfo.bottombar.c;
import android.content.Context;
import com.kwai.framework.model.user.User;
import xp5.g;
import p83.c;
import p83.e;
import p83.d;
import p83.b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;

public class b extends ViewController	// class@001e4c
{
    public final e j;
    public final d k;
    public final i l;
    public final e m;
    public final LiveLiteBottomBarService n;
    public final a o;
    public final ViewModelProvider p;
    public c q;
    public boolean r;

    public void b(e p0,e p1,d p2,i p3,LiveLiteBottomBarService p4,a p5){
       super();
       this.m = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.n = p4;
       this.o = p5;
       this.p = new ViewModelProvider(this.getViewModelStore(), g0.a(LiveLiteAnchorAvatarBottomBarViewModel.class, new h(this)));
    }
    public static void V2(b p0,Boolean p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "4")) {
       }else {
          b.e0(LiveLiteLogTag.LITE_ANCHOR_AVATAR, "onSideBarShrinkStatusChanged", "isFold", p1, "isAnchorFollowed", Boolean.valueOf(p0.Z2()), "canShowFansGroupEntry", p0.Y2().getValue());
          if (p1.booleanValue() && p0.X2()) {
             p0.W2();
          }else if(!p1.booleanValue()){
             p0.a3();
          }
       }
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.m.e(new a(this));
       this.p.get(LiveLiteAnchorAvatarBottomBarViewModel.class).x0().observe(this, new g(this));
       this.Y2().observe(this, new f(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.m.c(new a(this));
       return;
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       x.b(this.l.a(), "LITE_BOTTOM");
       if (this.q == null) {
          c uoc = new c(this.D2(), this.k.I().mAvatars, new c(this), new e(this), new d(this), new b(this), this, this.p.get(LiveLiteAnchorAvatarBottomBarViewModel.class), this.Y2());
          this.q = v0;
       }
       this.n.a(this.q);
       return;
    }
    public final boolean X2(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!this.Z2() || this.r != null)? true: false;
       return b;
    }
    public final LiveData Y2(){
       b obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj != null) {
          return obj.ui();
       }
       b.Z(LiveLiteLogTag.LITE_FANS_GROUP, "LiveLiteAnchorAvatarBottomBarController canShowFansGroupEntry: mFansGroupService is null!");
       return new MutableLiveData(Boolean.FALSE);
    }
    public final boolean Z2(){
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.k.I().isFollowingOrFollowRequesting();
    }
    public final void a3(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          this.n.c(tq);
          this.q = null;
       }
       return;
    }
}
