package g82.v$b;
import kg1.e;
import g82.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mg1.a;
import l82.a;
import o02.e;
import t02.a0;
import p91.m;
import brd.t;
import g82.b0;
import g82.a0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.System;
import kg1.f$b;
import java.util.List;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveFansGroupTagInfo;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import kg1.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;
import androidx.lifecycle.LiveData;
import io.reactivex.subjects.PublishSubject;
import g82.a;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import z12.x;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fg6.a;
import com.google.gson.Gson;
import i12.a;
import o02.g;
import f82.c;
import java.lang.Number;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import java.lang.StringBuilder;
import va1.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import qj1.h;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import cjd.e;
import g82.d;
import g82.j0;
import g82.z;
import kg1.f$a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.reflect.Type;
import wg3.a;
import g82.w;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import g82.x;
import u07.t$a;
import android.app.Activity;
import lnc.a1;
import g82.y;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.google.gson.JsonElement;
import android.os.SystemClock;
import g82.v$b$a;
import ok.h;
import lnc.b9;

public class v$b implements e	// class@002abb
{
    public final v b;

    public void v$b(v p0){
       this.b = p0;
       super();
    }
    public void A1(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "1")) {
          return;
       }
       this.b.x9("", null);
       return;
    }
    public void Bh(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "9")) {
          return;
       }
       this.b.L = e.g().a(this.b.p.Z2.getLiveStreamId(), this.b.p.Z2.h("")).subscribe(new b0(this), new a0(this));
       v$b tb = this.b;
       tb.X7(tb.L);
       this.b.M = System.currentTimeMillis();
       return;
    }
    public boolean Gl(){
       return this.b.r;
    }
    public void Mb(f$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "13")) {
          return;
       }
       this.b.X.add(p0);
       return;
    }
    public void Mc(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "15")) {
          return;
       }
       v$b tb = this.b;
       if (tb.W != null) {
          tb.t9();
       }
       return;
    }
    public LiveFansGroupIntimacyInfo Qi(){
       Object obj = PatchProxy.apply(null, this, v$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.X8();
    }
    public t Rm(){
       Object obj = PatchProxy.apply(null, this, v$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d1.hide();
    }
    public void S6(LiveFansGroupTagInfo p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "17")) {
          return;
       }
       v$b tb = this.b;
       Objects.requireNonNull(tb);
       v ov = v.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tb, ov, "18")) {
          ClientContent$LiveStreamPackage obj = PatchProxy.applyOneRefs(p0, tb, ov, "21");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 != null && !TextUtils.x(p0.mFansGroupTagContent)){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             tb.I.setVisibility(8);
          }else {
             tb.P = p0.mTagName;
             tb.I.setVisibility(i);
             tb.I.setText(p0.mFansGroupTagContent);
             obj = tb.p.Z2.a();
             LivePlayFragment livePlayFrag = tb.p.R().t0();
             p0 = p0.mTagName;
             if (!PatchProxy.applyVoidThreeRefs(obj, livePlayFrag, p0, null, i.class, "17")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FANS_GROUP_ICON_POINT";
                i3 oi3 = i3.f();
                oi3.d("name", p0);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = obj;
                u1.B0(new ShowMetaData().setLogPage(livePlayFrag).setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
             }
          }
       }
       return;
    }
    public void Tf(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$b.class, "3")) {
          return;
       }
       this.b.x9(p0, p1);
       return;
    }
    public LiveSuperFansGroupInfo Ua(){
       return this.b.W0;
    }
    public LiveData W2(){
       return this.b.T;
    }
    public PublishSubject Xf(){
       return this.b.A.f;
    }
    public void Zk(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "2")) {
          return;
       }
       this.b.x9(p0, null);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public t io(){
       Object obj = PatchProxy.apply(null, this, v$b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.e1.hide();
    }
    public LiveFansGroupAutoActivePromptDialogInfo je(){
       return this.b.Y;
    }
    public t kj(boolean p0,LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig p1,int p2){
       v$b obj;
       t ot;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(v$b.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), this, v$b.class, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(v.class)) {
          ot = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), obj, v.class, "45");
          if (ot != patchProxyRe) {
          label_0125 :
             return ot.doOnNext(new z(this));
          }
       }
       String liveStreamId = obj.p.Z2.getLiveStreamId();
       int i = (p1 == null)? 0: p1.mGiftId;
       HashMap hashMap = new HashMap();
       x.b(hashMap, obj.p);
       hashMap.put("commonStid", b.a(0x4b316083).i(obj.p.R().t0().o(), null));
       hashMap.put("interStid", obj.W8());
       String str = a.a.q(hashMap);
       String str1 = a.a(obj.p);
       ot = (p0)? e.j().a(liveStreamId, i, str, str1): e.j().b(liveStreamId, str, str1);
       a c = obj.A.c;
       Object obj1 = PatchProxy.applyOneRefs(c, null, c.class, "18");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          str = null;
          if (c == null) {
             l = str;
          }else {
             long l1 = x.B(c.mDelayJoinMaxDurationMs);
             if (l1 - str > 0) {
                l0.n("入团打散时间:"+l1+"毫秒");
                b.c0(LiveLogTag.FANS_GROUP, "delay join", "timeMs", Long.valueOf(l1));
             }
             l = l1;
          }
       }
       ot = ot.retryWhen(new h()).delaySubscription(l, TimeUnit.MILLISECONDS).observeOn(d.a).map(new e()).doOnNext(new d(obj)).doOnError(new j0(obj, p0, p1, p2));
       goto label_0125 ;
    }
    public LiveData md(){
       return this.b.S;
    }
    public void nf(LiveFansGroupIntimacyInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "7")) {
          return;
       }
       this.b.e9(p0);
       return;
    }
    public void pf(String p0,f$a p1,boolean p2,boolean p3){
       Object this;
       String str;
       v$b uob = this;
       if (PatchProxy.isSupport(v$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, v$b.class, "10")) {
          return;
       }
       LiveConfigStartupResponse$LiveFansGroupConfig liveFansGrou = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
       this = k0.a(liveFansGrou, w.a).orNull();
       int i = k0.a(liveFansGrou, x.a).or(Integer.valueOf(1)).intValue();
       boolean b = c.k(uob.b.A.c, this);
       if (p2) {
          t$a uoa = new t$a(uob.b.getActivity());
          if (b) {
             str = a1.p(R.string.arg_RES_7f102146);
          }else {
             LiveConfigStartupResponse$LiveFansGroupConfig liveFansGrou1 = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
             Objects.requireNonNull(liveFansGrou1);
             str = a1.q(R.string.arg_RES_7f1021a2, liveFansGrou1.mJoinCoinCount);
          }
          uoa.z0(str);
          uoa.S0(R.string.arg_RES_7f1007e2);
          uoa.Q0(R.string.cancel);
          y oy = new y(this, p0, p1, this, b, p3, i);
          uoa.u0(v11);
          uoa.z(1);
          uoa.v(1);
          f.e(uoa).Y(PopupInterface.a);
       }else {
          this.r(p0, p1, this, b, p3, i);
       }
       return;
    }
    public final void r(String p0,f$a p1,LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig p2,boolean p3,boolean p4,int p5){
       Object obj = this;
       v$b uob = v$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, uob, "11")) {
             return;
          }
       }
       i.b(obj.b.p.R().t0(), obj.b.p.Z2.a(), 1, 0, p0, obj.b.p.Z2.d(), e.r(obj.b.getActivity()), null, obj.b.p.c0());
       v$b b = obj.b;
       v$b$a uob$a = new v$b$a(this, p3, p2, p5, p4, p0, p1, SystemClock.elapsedRealtime());
       b.z = b9.c(b.z, v13);
       return;
    }
    public boolean r8(){
       v w0 = this.b.W0;
       if (w0 == null) {
          return false;
       }
       return w0.mStatus;
    }
    public void rn(f$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "14")) {
          return;
       }
       this.b.X.remove(p0);
       return;
    }
    public LiveData sn(){
       return this.b.R;
    }
    public int u3(){
       return this.b.N;
    }
    public t v6(){
       Object obj = PatchProxy.apply(null, this, v$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.c1.hide();
    }
    public int w8(){
       Object obj = PatchProxy.apply(null, this, v$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.X8().mLevel;
    }
    public boolean zn(){
       return this.b.V0;
    }
}
