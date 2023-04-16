package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment;
import i63.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y8c.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import i63.b;
import y43.a;
import fq5.b;
import crd.b;
import lnc.b9;
import tkd.b;
import tkd.d;
import rma.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import qvb.a;
import d77.h;
import android.app.Activity;
import brd.t;
import com.kwai.live.gzone.tab.accompanyplay.a;
import com.kwai.live.gzone.tab.accompanyplay.b;
import erd.g;
import g9c.d;
import android.view.View;
import android.content.Context;
import i2b.a;
import java.util.Objects;
import java.util.List;
import qvb.n0;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherResponse;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$b;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.live.gzone.tab.page.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import d77.c;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import l0d.d;
import xb.t$b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import d77.d;
import io.reactivex.internal.functions.Functions;
import d77.b;
import com.kwai.live.gzone.tab.accompanyplay.c;
import os5.h;
import im8.c;
import com.kwai.framework.model.user.QCurrentUser;
import g37.g;
import d77.a;
import java.util.Set;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import y8c.g;
import lnc.a1;
import d77.g;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import qvb.i;

public class LiveGzoneAccompanyPlayTogetherFragment extends RecyclerFragment implements c	// class@000dfe
{
    public c F;
    public View G;
    public b H;
    public a I;
    public h J;
    public View K;
    public View L;
    public KwaiImageView M;
    public a N;
    public b O;
    public b P;
    public static final int Q;

    public void LiveGzoneAccompanyPlayTogetherFragment(){
       super();
    }
    public static void Ih(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveGzoneAccompanyPlayTogetherFragment.class, "22")) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setVisibility(8);
       }else {
          p0.setVisibility(0);
          p0.setText(p1);
       }
       return;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneAccompanyPlayTogetherFragment$a(this, this);
    }
    public ClientContent$LiveStreamPackage Gh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H.l.m.a();
    }
    public void Hh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment.class, "21")) {
          return;
       }
       b9.a(this.P);
       c uoc = d.a(-1782425284);
       FragmentActivity activity = this.getActivity();
       String str = (this.J.isEmpty())? null: this.J.h2();
       this.P = uoc.K2(activity, str, p0).subscribe(a.b, b.b);
       return;
    }
    public final void Jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAccompanyPlayTogetherFragment.class, "19")) {
          return;
       }
       if (this.G == null || !this.ia().U0(this.G)) {
          this.G = a.a(this.getContext(), 0x7f0d0b68);
          this.ia().P0(this.G);
       }
       LiveGzoneAccompanyPlayTogetherFragment tJ = this.J;
       Objects.requireNonNull(tJ);
       Object obj = PatchProxy.apply(objArray, tJ, h.class, "5");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          LiveGzoneAccompanyPlayTogetherResponse liveGzoneAcc = tJ.L0();
          if (liveGzoneAcc != null) {
             objArray = liveGzoneAcc.mGamePanelBackground;
          }
       }
       if (objArray != null) {
          this.M.P(objArray);
       }
       this.K.setOnClickListener(new LiveGzoneAccompanyPlayTogetherFragment$b(this));
       return;
    }
    public boolean S1(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.kb();
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveGzoneAccompanyPlayTogetherFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveGzoneAccompanyPlayTogetherFragment.class, "4")) {
          return;
       }
       super.Z1(p0, p1);
       this.sh().d(p0);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0b67;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneAccompanyPlayTogetherFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.kb();
    }
    public boolean kb(){
       LiveGzoneAccompanyPlayTogetherFragment obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.H;
       boolean b = (obj != null && obj.K0())? true: false;
       return b;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.F.destroy();
       b9.a(this.O);
       b9.a(this.P);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAccompanyPlayTogetherFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.O = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new c(this));
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment.class, "2")) {
          this.K = m1.f(p0, 0x7f0a1dbc);
          this.L = m1.f(p0, 0x7f0a1dbb);
          KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_gzone_background);
          this.M = kwaiImageVie;
          kwaiImageVie.getHierarchy().u(new d());
       }
       this.Jh();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveGzoneAccompanyPlayTogetherFragment.class, "7")) {
          this.H.Z0().compose(c.c(this.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new d(this), Functions.e);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveGzoneAccompanyPlayTogetherFragment.class, "8")) {
          this.H.Z0().compose(c.c(this.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new b(this), Functions.e);
       }
       c uoc = new c();
       this.F = uoc;
       if (this.I.s != null) {
          uoc.U7(d.a(0x2cb5d4a8).h40());
       }
       this.F.f(p0);
       Object[] objArray1 = new Object[]{new c("LIVE_GZONE_PARENT_TAB_PAGE", this.H),this.I,new c("LIVE_GZONE_PARENT_FRAGMENT", this)};
       this.F.i(objArray1);
       return;
    }
    public int qh(){
       return 0x7f0a1f81;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "17")) {
          return;
       }
       super.u();
       if (!TextUtils.n(QCurrentUser.ME.getId(), this.I.m.d())) {
          a y = this.I.Y;
          if (y != null) {
             y.a();
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveGzoneAccompanyPlayTogetherFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveGzoneAccompanyPlayTogetherFragment.class, "16")) {
          return;
       }
       super.v2(p0, p1);
       Object[] objArray = null;
       if (p0) {
          LiveGzoneAccompanyPlayTogetherFragment tN = this.N;
          if (tN != null) {
             Objects.requireNonNull(tN);
             if (!PatchProxy.applyVoid(objArray, tN, a.class, "4")) {
                tN.j.clear();
             }
          }
       }
       this.sh().x();
       this.L.setVisibility(0);
       String str = this.J.i2();
       String str1 = this.J.h2();
       boolean b = this.J.isEmpty();
       ClientContent$LiveStreamPackage liveStreamPa = this.Gh();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), str, str1, liveStreamPa, null, a.class, "41")) {
          liveStreamPa.gameId = str1;
          liveStreamPa.gameName = str;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ACCOMPANG_PLAT_TOGETHER_TAB";
          i3 oi3 = i3.f();
          int i = (b)? 1: 2;
          oi3.c("tab_status", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(2, uElementPack, uContentPack);
       }
       if (str1 != null) {
          this.g7().n1("LIVE_GAME_ID", str1);
          this.g7().n1("LIVE_GAME_NAME", str);
       }
       if (this.J.isEmpty() || str == null) {
          if (this.G != null) {
             this.ia().m1(this.G);
             this.G = objArray;
          }
       }else if(p0){
          objArray = new Object[]{str};
          String str2 = String.format(a1.p(R.string.arg_RES_7f1023ba), objArray);
          if (!PatchProxy.applyVoidOneRefs(str2, this, LiveGzoneAccompanyPlayTogetherFragment.class, "20")) {
             if (this.G == null) {
                this.Jh();
             }
             this.G.findViewById(R.id.live_gzone_header_title).setText(str2);
             this.G.setOnClickListener(new g(this));
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneAccompanyPlayTogetherFragment$d(this, this.I);
    }
    public boolean x0(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.kb();
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getContext(), 1, false);
    }
    public i yh(){
       h obj = PatchProxy.apply(null, this, LiveGzoneAccompanyPlayTogetherFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(this.I);
       this.J = obj;
       return obj;
    }
    public void zf(b p0){
       this.H = p0;
       this.I = p0.l;
    }
}
