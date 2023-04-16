package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import dac.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mrd.a;
import dac.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dac.b;
import com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import e7c.e;
import hac.m0;
import hac.l0;
import com.yxcorp.gifshow.relation.explore.presenter.m;
import y8c.t;
import kac.a;
import ok.x;
import android.view.View;
import java.lang.Integer;
import bld.b;
import zf6.j;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import dac.a;
import java.lang.Throwable;
import com.kwai.soc.arch.rubas.base.Rubas;
import ii5.b;
import qvb.i;
import com.yxcorp.gifshow.pymk.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.a;
import g7c.a;
import a7c.h;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import brd.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import java.util.List;
import na5.e;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import androidx.recyclerview.widget.RecyclerView;
import na5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dac.w;
import java.util.Map;
import f3b.o;
import androidx.fragment.app.Fragment;
import dac.d;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import wkd.b;
import qra.d;
import xwb.c;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import y8c.g;
import vt5.e;
import au5.b;
import yt5.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import dac.t;
import hac.u0;
import hac.t0;
import a7c.h$a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import f7c.a;
import dac.s;
import dac.o;
import com.yxcorp.gifshow.relation.explore.fragment.i;
import i7c.f;
import dac.r;
import f7c.d;
import a7c.b$a;
import com.kwai.social.startup.follow.model.SayHiConfigParam;
import x6c.j;
import com.yxcorp.gifshow.relation.explore.fragment.j;
import com.kwai.framework.model.user.User;
import dac.q;
import e7c.b;
import e7c.c;

public class ExploreFriendFragment extends RecyclerFragment implements e	// class@001801
{
    public b F;
    public c G;
    public int H;
    public String I;
    public int J;
    public h K;
    public boolean L;
    public boolean M;
    public final x N;
    public boolean O;
    public b P;
    public static final int Q;

    public void ExploreFriendFragment(){
       super();
       this.G = a.g();
       this.L = false;
       this.M = false;
       this.N = new p(this);
       this.O = false;
    }
    public PresenterV2 B2(){
       l0 ol0;
       b obj = PatchProxy.applyWithListener(null, this, ExploreFriendFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F.b;
       m0 om0 = (obj == null || obj.enableRedDotOptimizationWithCard != null)? 1: null;
       PresenterV2 presenterV2 = super.B2();
       presenterV2.U7(new e());
       om0 = (om0)? new m0(): new l0();
       presenterV2.U7(om0);
       presenterV2.U7(new m());
       PatchProxy.onMethodExit(ExploreFriendFragment.class, "12");
       return presenterV2;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.N, this.F);
    }
    public boolean Dh(){
       if (this.M == null) {
          return true;
       }
       return false;
    }
    public void Gh(View p0,int p1){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExploreFriendFragment.class, "18")) {
          return;
       }
       b uob = new b();
       uob.v(j.d(p0, R.color.arg_RES_7f060751));
       uob.g(KwaiRadiusStyles.FULL);
       uob.x(2.00f);
       uob.w(j.d(p0, p1));
       p0.setBackground(uob.a());
       return;
    }
    public void Hh(View p0,int p1){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExploreFriendFragment.class, "17")) {
          return;
       }
       View view = p0.findViewById(R.id.tag_sex_age);
       if (view != null) {
          view.setBackgroundResource(p1);
       }
       view = p0.findViewById(R.id.tag_age);
       if (view != null) {
          view.setBackgroundResource(p1);
       }
       view = p0.findViewById(R.id.tag_sex);
       if (view != null) {
          view.setBackgroundResource(p1);
       }
       view = p0.findViewById(R.id.tag_address);
       if (view != null) {
          view.setBackgroundResource(p1);
       }
       p0 = p0.findViewById(R.id.tag_school);
       if (p0 != null) {
          p0.setBackgroundResource(p1);
       }
       return;
    }
    public void Ih(boolean p0){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ExploreFriendFragment.class, "20")) {
          return;
       }
       RxBus.f.b(new a(p0));
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ExploreFriendFragment.class, "5")) {
          return;
       }
       super.M1(p0, p1);
       if (this.O == null) {
          this.O = true;
          Rubas.c("pymk_redhat_style1_page_error");
       }
       this.P.c(false);
       return;
    }
    public void O8(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "28")) {
          return;
       }
       this.Ih(false);
       return;
    }
    public void Td(boolean p0){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ExploreFriendFragment.class, "27")) {
          return;
       }
       this.Ih(p0);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ExploreFriendFragment.class, "2")) {
          return;
       }
       super.Z1(p0, p1);
       if (this.O == null) {
          Rubas.c("pymk_redhat_style1_page_start");
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ExploreFriendFragment.class, "21")) {
          return;
       }
       f uof = this.q();
       if (!TextUtils.x(this.I)) {
          if (uof.isEmpty()) {
             uof.s2(this.I);
          }else {
             uof.s2(objArray);
          }
       }
       super.a();
       if (this.H > null) {
          PymkLogSender.reportPymkRefresh(uof.l2(), uof.m2(), this.K.j());
       }
       this.H = this.H + 1;
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "10")) {
          return;
       }
       super.c0();
       this.G.onNext(Boolean.FALSE);
       ExploreFriendFragment tP = this.P;
       if (tP != null) {
          tP.b();
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ExploreFriendFragment.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0407, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ExploreFriendFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.F);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExploreFriendFragment.class, "7")) {
          return;
       }
       super.fh(p0, p1);
       new e(FpsSocialBizType.RELATION, "EXPLORE", this, this.h0()).a();
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0407;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ExploreFriendFragment.class, new w());
       }else {
          obj.put(ExploreFriendFragment.class, null);
       }
       return obj;
    }
    public String o(){
       b obj = PatchProxy.apply(null, this, ExploreFriendFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F.b;
       ExploreFriendParams page2 = (obj != null)? obj.page2: o.i(66);
       return page2;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendFragment.class, "1")) {
          return;
       }
       if (this.O == null) {
          Rubas.c("pymk_redhat_style1_page_enter");
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.I = this.getArguments().getString("userIds");
          this.J = this.getArguments().getInt("recoPortal", 0);
       }
       this.F = d.a(this);
       this.P = new b();
       if (this.K0()) {
          this.P.a(this.o());
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "25")) {
          return;
       }
       super.onDestroy();
       ExploreFriendFragment tF = this.F;
       if (tF != null) {
          tF.c.j();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "24")) {
          return;
       }
       super.onDestroyView();
       b.a(0x36dab11a).b(this);
       this.P.b();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "8")) {
          return;
       }
       super.onStart();
       ExploreFriendFragment tF = this.F;
       b b = tF.b;
       String str = (b == null || b.enableRedDotOptimizationWithCard != null)? 1: null;
       if (!str && !tF.e()) {
          this.F.a.f(this.o());
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ExploreFriendFragment.class, "11")) {
          return;
       }
       super.th();
       RecyclerView$s recycledView = this.h0().getRecycledViewPool();
       recycledView.k(14, 15);
       recycledView.k(13, 25);
       this.h0().setItemAnimator(objArray);
       this.h0().setHasFixedSize(true);
       if (this.h0() instanceof CustomRecyclerView) {
          this.h0().setFixScrollConflictDirection(true);
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "9")) {
          return;
       }
       super.u();
       ExploreFriendFragment tF = this.F;
       b b = tF.b;
       String str = (b == null || b.enableRedDotOptimizationWithCard != null)? 1: null;
       if (!str && !tF.e()) {
          this.F.a.f(this.o());
       }
       this.G.onNext(Boolean.TRUE);
       tF = this.P;
       if (tF != null) {
          tF.a(this.o());
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ExploreFriendFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ExploreFriendFragment.class, "4")) {
          return;
       }
       super.v2(p0, p1);
       if (!PatchProxy.applyVoid(null, this, ExploreFriendFragment.class, "3") && this.O == null) {
          this.O = true;
          Rubas.c("pymk_redhat_style1_page_end");
       }
       this.P.c(true);
       return;
    }
    public g vh(){
       b b;
       b$a uoa2;
       ExploreFriendParams portalReco;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, ExploreFriendFragment.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, ExploreFriendFragment.class, "15");
       if (obj != patchProxyRe) {
       }else {
          t ot = PatchProxy.apply(objArray, this, ExploreFriendFragment.class, "19");
          if (ot != patchProxyRe) {
          }else {
             b b2 = this.F.b;
             if (b2 != null) {
                portalReco = b2.portalReco;
                if (portalReco == null) {
                label_0036 :
                   portalReco = (b.c().mq().a(this.getActivity()))? 73: 9;
                }
             }else {
                goto label_0036 ;
             }
             ot = new t(this, portalReco, objArray);
          }
          b = this.F.b;
          String str = 1;
          boolean b1 = (b == null || b.enableRedDotOptimizationWithCard != null)? true: false;
          u0 ou0 = (b1)? u0.class: t0.class;
          h$a uoa = new h$a(objArray, ot, this.m()).k(R.layout.arg_RES_7f0d0404, objArray);
          s os = new s(this, false, null, new o(ot, b1), i.b);
          uoa.p(v13);
          uoa.m(new r(this, ot, b1));
          uoa.r(i.b);
          h$a uoa1 = uoa.e(13, ou0);
          if (PatchProxy.isSupport(ExploreFriendFragment.class)) {
             uoa2 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), this, ExploreFriendFragment.class, "16");
             if (uoa2 != patchProxyRe) {
             label_00e2 :
                uoa1.g(uoa2);
                q oq = PatchProxy.apply(objArray, this, ExploreFriendFragment.class, "29");
                if (oq != patchProxyRe) {
                }else {
                   oq = new q(this);
                }
                uoa1.f(oq);
                obj = uoa1.b();
             }
          }
          b$a uoa3 = new b$a().g(str);
          uoa3.f(b1);
          uoa3.b(j.b);
          uoa3.b = b.a(0x36dab11a).d(objArray);
          uoa3.e(j.a().btnType);
          uoa2 = uoa3;
          goto label_00e2 ;
       }
       this.K = obj;
       return new b(new c(), this.K, this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.s();
    }
}
