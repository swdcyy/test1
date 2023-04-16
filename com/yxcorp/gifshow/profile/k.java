package com.yxcorp.gifshow.profile.k;
import gx5.e;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import gx5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import gx5.c;
import com.kwai.robust.PatchProxyResult;
import w5c.c;
import java.lang.Runnable;
import wkd.b;
import o3c.l;
import brd.t;
import s1c.f1;
import sfc.a;
import erd.g;
import crd.b;
import android.os.Bundle;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.tabs.panel.h;
import t5c.d;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelViewListFragment;
import java.util.Map;
import gx5.e$a;
import s1c.g1;
import s1c.e1;
import com.kwai.framework.model.user.UserStatus;
import java.util.HashMap;
import java.lang.Long;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v5c.h;
import wh5.c;
import u07.t$a;
import android.app.Activity;
import s1c.c1;
import u07.u;
import s1c.d1;
import s1c.b1;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import w5c.j;
import com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity;
import com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity$a;
import java.lang.Boolean;
import m5c.a;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelLikeListFragment;
import java.lang.Number;
import z5c.k0;
import t5c.c;

public class k implements e	// class@00135d
{

    public void k(){
       super();
    }
    public final void A40(GifshowActivity p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "15")) {
          return;
       }
       d.a(0x763547f8).A40(p0, p1);
       return;
    }
    public String DR(){
       Object obj = PatchProxy.apply(null, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c();
    }
    public void FK(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       b.a(0x37313f08).H(p0).subscribe(new f1(p1), new a());
       return;
    }
    public h G5(Bundle p0,String p1,Integer p2,QPhoto p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = new d(StatusPanelViewListFragment.class, p0, p1, p2.intValue(), p3);
       return obj;
    }
    public void GX(Map p0,Runnable p1,e$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "3")) {
          return;
       }
       b.a(0x37313f08).A(p0).subscribe(new g1(p1), new e1(p2));
       return;
    }
    public QPhoto Qm(){
       Object obj = PatchProxy.apply(null, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.d();
    }
    public void V30(UserStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "14")) {
          return;
       }
       if (this.n(p0)) {
          QPhoto qPhoto = this.Qm();
          if (qPhoto != null) {
             HashMap hashMap = new HashMap();
             hashMap.put("ztPhotoId", qPhoto.getPhotoId());
             hashMap.put("moodId", "");
             this.GX(hashMap, null, null);
             return;
          }else {
             HashMap hashMap1 = new HashMap();
             hashMap1.put("ztPhotoId", Long.valueOf(p0.mZtPhotoId));
             hashMap1.put("moodId", p0.mId);
             this.GX(hashMap1, null, null);
          }
       }
       return;
    }
    public PresenterV2 W8(){
       Object obj = PatchProxy.applyWithListener(null, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(k.class, "6");
       return new h();
    }
    public void XP(GifshowActivity p0,UserStatus p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "10")) {
          return;
       }
       if (this.n(p1) && !c.b()) {
          t$a uoa = new t$a(p0);
          uoa.W0(R.string.arg_RES_7f103ead);
          uoa.S0(R.string.arg_RES_7f102a8e);
          uoa.Q0(R.string.arg_RES_7f103eae);
          uoa.u0(new c1(p2));
          uoa.t0(new d1(this, p1, p0, p2));
          uoa.J(new b1(p2));
          j.d(uoa);
       }else {
          this.A40(p0, p2);
       }
       return;
    }
    public void ZH(UserStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       new j(p0).d();
       return;
    }
    public void f5(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, ProfileStatusSelectActivity.class, "5")) {
          ProfileStatusSelectActivity.z.a(p0, p1);
       }
       return;
    }
    public Class iq(){
       return StatusPanelViewListFragment.class;
    }
    public boolean isAvailable(){
       return true;
    }
    public final boolean n(UserStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null || this.Qm() != null)? true: false;
       return b;
    }
    public Object o8(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(p0);
    }
    public Class pF(){
       return StatusPanelLikeListFragment.class;
    }
    public void ty(UserStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       new j(p0).a();
       return;
    }
    public long xn(){
       Object obj = PatchProxy.apply(null, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return k0.m();
    }
    public h xu(Bundle p0,String p1,Integer p2,QPhoto p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = new c(StatusPanelLikeListFragment.class, p0, p1, p2.intValue(), p3);
       return obj;
    }
}
