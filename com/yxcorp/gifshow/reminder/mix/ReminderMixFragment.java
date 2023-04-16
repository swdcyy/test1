package com.yxcorp.gifshow.reminder.mix.ReminderMixFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import com.kwai.library.widget.refresh.RefreshLayout;
import e9c.h;
import hka.k;
import hka.l;
import e9c.f;
import y8c.q;
import e9c.a;
import hfc.b;
import com.yxcorp.gifshow.reminder.mix.b;
import occ.a;
import y8c.t;
import nfc.f;
import ucc.a;
import kfc.a;
import java.util.List;
import java.util.Collection;
import android.view.View;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import rx5.c;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import java.util.Map;
import java.util.Objects;
import wkd.b;
import lnc.u5;
import com.kwai.component.fpsrecorder.PageFpsRecorder;
import na5.d$a;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import na5.a;
import na5.d;
import com.yxcorp.gifshow.page.cost.list.g;
import tec.t;
import ok.x;
import androidx.recyclerview.widget.RecyclerView$l;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$s;
import y8c.g;
import lcc.c;
import kcc.j;
import kcc.k;
import lcc.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.reminder.mix.ReminderMixFragment$1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import qvb.i;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$a;
import dd5.m;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import com.yxcorp.gifshow.reminder.data.f;

public class ReminderMixFragment extends RecyclerFragment	// class@001aeb
{
    public b F;
    public g G;
    public static final int H;

    public void ReminderMixFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ReminderMixFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       if (this.Ac() != null) {
          obj.U7(new h(this.rh(), this.S1(), this.S0()));
       }
       obj.U7(new f(this));
       obj.U7(new a());
       obj.U7(new b());
       PatchProxy.onMethodExit(ReminderMixFragment.class, "12");
       return this.Gh().a().c(this.Gh(), obj);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh().a().h(this.Gh(), new f(this, this.Gh().b(), 0x7f103979));
    }
    public boolean Dh(){
       return false;
    }
    public boolean Eh(){
       return true;
    }
    public b Gh(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new b(this);
       }
       return this.F;
    }
    public void Hh(){
       if (PatchProxy.applyVoid(null, this, ReminderMixFragment.class, "15")) {
          return;
       }
       this.Gh().c.a();
       return;
    }
    public int M(){
       return 1;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, ReminderMixFragment.class, "14")) {
          return;
       }
       this.Gh().a().g();
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public int f(){
       return 17;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.addAll(this.Gh().a().d());
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderMixFragment.class, "6")) {
          return;
       }
       super.fh(p0, p1);
       View[] viewArray = new View[]{this.h0()};
       d.a(0x77cfa10c).Qa(this, viewArray);
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Gh().a().e();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderMixFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ReminderMixFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, ReminderMixFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Gh();
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, b.class, "5");
       if (str != patchProxyRe) {
       }else {
          str = b.a(-1071465158).g(obj.d, "");
       }
       return str;
    }
    public String getUrl(){
       return "ks://reminder";
    }
    public boolean lh(){
       return true;
    }
    public boolean mh(){
       return true;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh().a().f();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderMixFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, ReminderMixFragment.class, "5")) {
          d$a uoa = new d$a(FpsSocialBizType.INTERACT, "SOCIAL_NOTIFY_PAGE");
          uoa.c(false);
          new PageFpsRecorder(this, uoa.a()).a();
       }
       this.G = new g(this, new t(this));
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReminderMixFragment.class, "7")) {
          return;
       }
       super.th();
       RecyclerView recyclerView = this.h0();
       recyclerView.setHasFixedSize(true);
       recyclerView.setItemAnimator(objArray);
       this.ia().n1(true);
       this.ia().G0(true);
       recyclerView.getRecycledViewPool().k(true, 5);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.Gh().p, this.Gh().d(), this.Gh().e(), this.Gh().a().d());
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, ReminderMixFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReminderMixFragment$1(this, this.getContext());
    }
    public i yh(){
       String str = "10";
       ListReqLifecycle$a obj = PatchProxy.apply(null, this, ReminderMixFragment.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ListReqLifecycle$a();
       ReminderMixFragment tG = this.G;
       String str1 = "pageMode";
       String str2 = String.valueOf(this.Gh().a().a);
       Objects.requireNonNull(tG);
       if (!PatchProxy.applyVoidTwoRefs(str1, str2, tG, g.class, str)) {
          tG.b.a(str1, str2);
       }
       this.G.c(obj);
       return new f(this.Gh().d(), this.Gh().e(), this.Gh().b(), obj);
    }
}
