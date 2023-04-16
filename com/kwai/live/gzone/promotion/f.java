package com.kwai.live.gzone.promotion.f;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.promotion.f$b;
import s67.b0;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s67.a0;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.promotion.f$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import s67.c0;
import erd.g;
import crd.b;
import brd.t;
import oq5.c;
import oq5.a;
import java.util.Queue;
import com.kwai.library.widget.popup.common.c;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t57.a;
import t67.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.Fragment;
import x61.c;
import lp3.c;
import lp3.i;
import tkd.b;
import tkd.d;
import os5.h;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.framework.model.user.UserInfo;
import android.view.View;
import ekd.m1;
import s67.j0;
import java.util.Map;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import c77.p;
import x67.j;

public class f extends PresenterV2 implements g	// class@000dc2
{
    public a A;
    public boolean B;
    public a C;
    public PublishSubject D;
    public h E;
    public c F;
    public b G;
    public LiveSlidePlayService H;
    public boolean I;
    public b J;
    public i K;
    public p L;
    public a M;
    public j N;
    public a p;
    public List q;
    public List r;
    public a s;
    public c t;
    public boolean u;
    public int v;
    public a w;
    public b x;
    public View y;
    public Queue z;

    public void f(){
       super();
       this.p = new f$b(this);
       this.t = new b0(this);
       this.u = true;
       this.v = 0;
       this.z = new LinkedList();
       this.B = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.v = 0;
       a0 uoa0 = new a0(this);
       this.E = uoa0;
       this.G.Km(uoa0);
       if (this.I != null) {
          f$a uoa = new f$a(this);
          this.F = uoa;
          this.H.P4(uoa);
       }
       this.X7(this.D.subscribe(new c0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.s.Q0(this.t);
       this.G.le(this.E);
       this.P8();
       this.z.clear();
       this.q = null;
       this.B = false;
       this.u = true;
       return;
    }
    public void P8(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uof, "20")) {
          uof = this.A;
          if (uof != null && uof.K()) {
             this.A.o();
             this.A = null;
          }
       }
       this.R8();
       b9.a(this.w);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "19")) {
          return;
       }
       f tx = this.x;
       if (tx != null) {
          tx.o();
          this.x = null;
       }
       return;
    }
    public final boolean S8(){
       f obj = PatchProxy.apply(null, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj != null && obj.b()) {
          return true;
       }
       return false;
    }
    public String V8(){
       f obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          return "";
       }
       return TextUtils.I(obj.a());
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.J.b().isResumed() && this.K.a(c.class).E1(4002))? true: false;
       return b;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "21")) {
          return;
       }
       d.a(0x2cb5d4a8).I20(p0, f.o(this.J.I()).mProfile, this.K);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a1e3e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new j0());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.D = this.r8("PROMOTION_GAME_LIST_UPDATE_SUBJECT");
       this.G = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.I = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.H = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       this.J = this.r8("LIVE_BASIC_CONTEXT");
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       this.L = this.s8(p.class);
       this.M = this.s8(a.class);
       this.N = this.s8(j.class);
       return;
    }
}
