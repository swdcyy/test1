package com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$a;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$2;
import mxb.j0;
import mxb.i0;
import o4a.p;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import f4a.b0;
import m4a.c;
import p5a.e;
import de5.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.framework.player.core.b;
import android.app.Activity;
import tkd.b;
import tkd.d;
import h4a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.plc.mix.f$b;
import k2b.e0;
import com.yxcorp.gifshow.detail.plc.mix.f;
import java.lang.System;
import j4a.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import o4a.q;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import ekd.y0;
import o4a.r;
import java.lang.Runnable;
import com.kwai.framework.player.helper.b;
import o4a.o;
import com.kwai.framework.player.helper.b$b;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import f4a.z;
import o4a.b0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class PlcEntryLoggerImplPresenter extends PresenterV2 implements g	// class@001696
{
    public final b0 A;
    public final DefaultLifecycleObserver B;
    public PlcEntryStyleInfo C;
    public final j0 D;
    public final IMediaPlayer$OnInfoListener E;
    public final Runnable F;
    public boolean G;
    public long H;
    public long I;
    public b J;
    public y0 K;
    public QPhoto p;
    public a q;
    public BaseFragment r;
    public PhotoDetailLogger s;
    public t t;
    public z u;
    public long v;
    public long w;
    public boolean x;
    public a y;
    public f z;

    public void PlcEntryLoggerImplPresenter(){
       super();
       this.A = new PlcEntryLoggerImplPresenter$a(this);
       this.B = new PlcEntryLoggerImplPresenter$2(this);
       this.D = i0.a();
       this.E = new p(this);
       this.F = new PlcEntryLoggerImplPresenter$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcEntryLoggerImplPresenter.class, "2")) {
          return;
       }
       PlcEntryStyleInfo$PageType cOUPLE = PlcEntryStyleInfo$PageType.COUPLE;
       this.A.O(cOUPLE);
       PlcEntryLoggerImplPresenter ts = this.s;
       PlcEntryLoggerImplPresenter tq = this.q;
       if (tq != null) {
          objArray = tq.getPlayer();
       }
       f uof = f.d(this.getActivity(), this.p, new c(ts, objArray, cOUPLE), this.r, d.a(0x10c9d447), this.s);
       this.z = uof;
       uof.u(System.currentTimeMillis());
       this.y = d.a(0x10c9d447).M7(this.p, this.R8());
       this.q.getPlayer().addOnInfoListener(this.E);
       this.X7(this.t.subscribe(new q(this), Functions.e));
       this.I = this.p.getVideoDuration();
       this.K = new y0(1000, new r(this));
       b uob = new b(this.q.getPlayer(), new o(this));
       this.J = uob;
       if (uob.c()) {
          this.X8();
       }
       this.r.getLifecycle().addObserver(this.B);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter.class, "7")) {
          return;
       }
       this.w = 0;
       k1.m(this.F);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcEntryLoggerImplPresenter.class, "3")) {
          return;
       }
       this.y = objArray;
       this.r.getLifecycle().removeObserver(this.B);
       this.q.getPlayer().removeOnInfoListener(this.E);
       this.P8();
       PlcEntryLoggerImplPresenter tJ = this.J;
       if (tJ != null) {
          tJ.e();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter.class, "6")) {
          return;
       }
       this.Y8();
       this.K = null;
       return;
    }
    public int R8(){
       int i;
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, PlcEntryLoggerImplPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.S8();
       obj = (obj != null)? obj.mBizType: 0;
       return obj;
    }
    public PlcEntryStyleInfo S8(){
       PlcEntryLoggerImplPresenter obj = PatchProxy.apply(null, this, PlcEntryLoggerImplPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          PlcEntryStyleInfo plcEntryStyl = this.p.getPlcEntryStyleInfo();
       }
       return obj;
    }
    public boolean V8(){
       PlcEntryLoggerImplPresenter obj = PatchProxy.apply(null, this, PlcEntryLoggerImplPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.p(this.C)) {
          return false;
       }
       obj = this.u;
       if (obj == null) {
          return false;
       }
       return obj.b();
    }
    public boolean W8(){
       PlcEntryLoggerImplPresenter obj = PatchProxy.apply(null, this, PlcEntryLoggerImplPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.a() && this.x != null) {
          b = true;
       }
       return b;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter.class, "4")) {
          return;
       }
       PlcEntryLoggerImplPresenter tK = this.K;
       if (tK != null) {
          tK.a();
       }
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter.class, "5")) {
          return;
       }
       PlcEntryLoggerImplPresenter tK = this.K;
       if (tK != null) {
          tK.e();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcEntryLoggerImplPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PlcEntryLoggerImplPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PlcEntryLoggerImplPresenter.class, new b0());
       }else {
          obj.put(PlcEntryLoggerImplPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("DETAIL_LOGGER");
       this.t = this.r8("PAGE_SMOOTH_SWIPE_OBSERVABLE");
       return;
    }
}
