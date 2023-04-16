package com.kuaishou.live.ad.social.l;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.social.l$a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import x61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import fq5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.bottombarapi.LiveAnchorBottomBarId;
import z61.b;
import zl0.b0;
import z61.l;
import java.lang.Boolean;
import lp3.c;
import lp3.i;
import zl0.c0;
import km9.a;
import tkd.b;
import tkd.d;
import os5.d;
import zl0.b1;
import brd.t;
import t45.d;
import brd.z;
import zl0.d0;
import zl0.f0;
import erd.g;
import crd.b;
import xx.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.live.tuna.model.LiveTunaBizItem;
import aq3.a0;
import bi3.a;
import u07.t$a;
import android.app.Activity;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import e17.i;
import com.kuaishou.live.ad.model.config.AdConversionStartConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nl9.i0$b;
import nl9.i0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import nl9.u;
import com.kwai.robust.PatchProxyResult;
import zl9.c;
import com.kuaishou.live.ad.social.k;
import zl0.e0;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import zl0.n1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.ad.social.n;
import java.util.Map;
import java.util.HashMap;

public class l extends PresenterV2 implements g	// class@000a18
{
    public b p;
    public i q;
    public a0 r;
    public a s;
    public l$b t;
    public String u;
    public boolean v;
    public final MutableLiveData w;
    public final LiveNormalBottomBarItem x;
    public final MutableLiveData y;
    public final LiveNormalBottomBarItem z;

    public void l(){
       super();
       this.t = new l$a(this);
       this.w = new MutableLiveData();
       this.x = new LiveNormalBottomBarItem();
       this.y = new MutableLiveData();
       this.z = new LiveNormalBottomBarItem();
    }
    public void E8(){
       c uoc = c.class;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "2")) {
          return;
       }
       this.u = this.p.z0().getString("liveCheckedConversionTasks", "");
       if (!PatchProxy.applyVoid(objArray, this, ol, "3")) {
          int i = TextUtils.x(this.u) ^ 0x01;
          if (this.q != null) {
             this.x.mFeatureId = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_CONVERSION_TASK.getFeatureType();
             l tx = this.x;
             tx.mClickCallback = new b0(this);
             tx.mTextRes = 0x7f103ffb;
             tx.mIconRes = 0x7f081389;
             tx.mSelectedIconRes = 0x7f081388;
             tx.mIsSelected = this.v;
             tx.mIsVisible = Boolean.valueOf(i);
             this.w.setValue(this.x);
             this.q.a(uoc).v1(this.w);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "4") && this.q != null) {
          this.z.mFeatureId = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_MORE_CONVERSION_TASK.getFeatureType();
          ol = this.z;
          ol.mClickCallback = new c0(this);
          ol.mTextRes = 0x7f103ffb;
          ol.mIconRes = 0x7f081389;
          ol.mSelectedIconRes = 0x7f081388;
          ol.mIsSelected = this.s.dg();
          this.y.setValue(this.z);
          this.q.a(uoc).v1(this.y);
       }
       if (!TextUtils.x(this.u)) {
          this.X7(d.a(-2004767397).L8().b(this.p.getLiveStreamId(), this.u).subscribeOn(d.b).subscribe(new d0(this), new f0(this)));
       }
       return;
    }
    public final void P8(boolean p0){
       t$a uoa;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "7")) {
          return;
       }
       this.R8();
       SharedPreferences$Editor uEditor = a.a.edit();
       boolean b = true;
       uEditor.putBoolean("hasConversionTaskRedDotShown", b);
       g.a(uEditor);
       LiveTunaBizItem liveTunaBizI = this.r.a();
       l tq = this.q;
       boolean b1 = false;
       if (tq == null || tq.a(a.class).hf(5)) {
          b = null;
       }
       String str = 0x7f10019b;
       if (this.p.z0().getBoolean("liveMerchantAvailable", b1)) {
          if (!PatchProxy.applyVoid(null, this, ol, "5")) {
             uoa = new t$a(this.getActivity());
             uoa.W0(R.string.arg_RES_7f10286b);
             uoa.y0(R.string.arg_RES_7f10286a);
             uoa.S0(str);
             f.e(uoa).Y(PopupInterface.a);
          }
       }else if(liveTunaBizI != null){
          if (!PatchProxy.applyVoid(null, this, ol, "6")) {
             uoa = new t$a(this.getActivity());
             uoa.W0(R.string.arg_RES_7f102d42);
             uoa.y0(R.string.arg_RES_7f102d41);
             uoa.S0(str);
             f.e(uoa).Y(PopupInterface.a);
          }
       }else if(b != null){
          i.a(R.style.arg_RES_7f110668, 0x7f1024f1);
       }else if(PatchProxy.applyVoid(null, this, ol, "9")){
          AdConversionStartConfig uAdConversio = d.a(-2004767397).WM(AdConversionStartConfig.class);
          if (uAdConversio != null && !TextUtils.x(uAdConversio.mUrl)) {
             BaseFragment uBaseFragmen = this.p.b();
             i0$b uob = i0.a();
             uob.b(uBaseFragmen.getActivity());
             uob.g(uBaseFragmen.getChildFragmentManager());
             uob.h(uAdConversio.mUrl);
             i0 oi0 = uob.a();
             u ou = d.a(-1694791652);
             k ok = PatchProxy.apply(null, this, ol, "10");
             if (ok != PatchProxyResult.class) {
             }else {
                ok = new k(this);
             }
             ou.lp(oi0, ok, null, new e0(this));
          }
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.p.a();
       n1 on1 = n1.class;
       if (!PatchProxy.isSupport(on1) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(p0), null, on1, "1")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uClickEvent.elementPackage = uElementPack;
          uElementPack.action2 = "PROMOTION_TASK";
          i3 oi3 = i3.f();
          String str1 = (p0)? "more": "bottom";
          oi3.d("source", str1);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uClickEvent.contentPackage = uContentPack;
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.a0(uClickEvent);
       }
       return;
    }
    public void R8(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new n());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.q8(a0.class);
       this.s = this.q8(a.class);
       this.q = this.t8("LIVE_SERVICE_MANAGER");
       return;
    }
}
