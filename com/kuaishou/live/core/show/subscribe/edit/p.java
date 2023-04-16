package com.kuaishou.live.core.show.subscribe.edit.p;
import tk2.e;
import com.kuaishou.live.core.show.subscribe.edit.o;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.s;
import erd.g;
import brd.t;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.functions.Functions;
import crd.b;
import tk2.d;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeSwitchConfig;
import java.lang.reflect.Type;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import z1.a;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoContainerFragment;
import sk2.s;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kwai.library.widget.button.SlipSwitchButton;
import yk2.y;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import pk2.c;
import pk2.b;
import com.kwai.framework.model.user.QCurrentUser;
import cjd.e;
import erd.o;
import o31.l;
import crd.a;
import sk2.t;
import com.kuaishou.live.core.show.subscribe.edit.p$a;

public class p implements e	// class@001123
{
    public final SubscribeDialogParams a;
    public final LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail b;
    public final o c;

    public void p(o p0,SubscribeDialogParams p1,LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       o j = this.c.j;
       if (j != null) {
          j.dismissAllowingStateLoss();
       }
       return;
    }
    public void b(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "7")) {
          return;
       }
       this.c.f.setValue(p0);
       o j = this.c.j;
       if (j != null) {
          j.dismissAllowingStateLoss();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       s.v(this.c.f(), this.c.i());
       this.c.n(this.b);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "8")) {
          return;
       }
       this.c.l(objArray, this.a.b).delaySubscription(500, TimeUnit.MILLISECONDS).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void e(String p0){
       d.e(this, p0);
    }
    public void f(String p0,boolean p1){
       long l;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, op, "4")) {
          return;
       }
       Iterator iterator = this.c.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().m(p0);
       }
       op = this.c;
       p ta = this.a;
       Objects.requireNonNull(op);
       if (!PatchProxy.isSupport(o.class) || (!PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), ta, op, o.class, "9") && op.l != null)) {
          if (!TextUtils.x(ta.d) && TextUtils.n(p0, ta.d)) {
             op.f.setValue(null);
          }
          op.m((q.f(op.l.mSubscribeInfoList) ^ 0x01));
          if (p1) {
             t ot = op.l(null, ta.b);
             LiveSubscribeSwitchConfig obj = PatchProxy.apply(null, op, o.class, "10");
             if (obj != PatchProxyResult.class) {
                l = obj.longValue();
             }else {
                obj = a.t().u("SOURCE_LIVE").getValue("liveReservationConfig", LiveSubscribeSwitchConfig.class, null);
                l = (obj == null)? 0: obj.mRefreshAfterStopIntervalMs;
             }
             ot.delaySubscription(l, TimeUnit.MILLISECONDS).subscribe(Functions.d(), Functions.d());
          }else if(op.j != null && q.f(op.l.mSubscribeInfoList)){
             Iterator iterator1 = op.g.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().k();
             }
             LiveSubscribeEditFragment liveSubscrib = op.b(op.l, ta);
             op.j.Fh(liveSubscrib, liveSubscrib.ch());
          }
       }
    label_00f1 :
       return;
    }
    public void g(int p0){
       d.h(this, p0);
    }
    public void h(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "5")) {
          return;
       }
       this.c.k = LiveAnchorSubscribeChoosePhotoContainerFragment.Eh(p0.mSubscribeId, this.a.c, false, null);
       this.c.k.k0(new s(this));
       p tc = this.c;
       tc.k.show(tc.e(), "LiveSubscribeRelatePhotoFragment");
       return;
    }
    public void i(boolean p0,SlipSwitchButton p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, op, "9")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.f();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.c.i();
       if (!PatchProxy.isSupport(y.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), liveStreamPa, liveVoicePar, null, y.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_APPOINTMENT_SHOW_SWITCH";
          i3 oi3 = i3.f();
          String str = (p0 == true)? "OPEN": "CLOSE";
          oi3.d("switch_status", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          if (liveVoicePar != null) {
             uContentPack.liveVoicePartyPackage = liveVoicePar;
          }
          u1.u(true, uElementPack, uContentPack);
       }
       o h = this.c.h;
       Objects.requireNonNull(h);
       b.b().B0(QCurrentUser.me().getId(), p0).map(new e()).doOnSubscribe(new l(h)).subscribe(new t(this, p0, p0), new p$a(this, p1, p0));
       return;
    }
    public void j(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "6")) {
          return;
       }
       p tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, o.class, "11")) {
          o j = tc.j;
          if (j != null) {
             j.dismissAllowingStateLoss();
          }
          tc.f.setValue(p0);
       }
       return;
    }
    public void k(){
       d.g(this);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       p tc = this.c;
       if (tc.j != null) {
          o l = tc.l;
          if (l != null) {
             this.c.j.Fh(tc.b(l, this.a), true);
          }
       }
       return;
    }
    public void m(String p0){
       d.f(this, p0);
    }
}
