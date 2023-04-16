package nx0.x;
import yh3.a;
import nx0.x$a;
import nsd.u;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import nx0.x$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import nx0.x$e;
import nx0.x$d;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import nx0.x$c;
import nx0.x$c$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import nx0.i;
import java.lang.Integer;
import kx0.a;
import nx0.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import nx0.x$c$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveDiversionReportParam;
import fg6.a;
import java.util.Map;
import com.google.gson.Gson;
import tkd.b;
import tkd.d;
import os5.l;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import nx0.x$c$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class x extends a	// class@003408
{
    public i a;
    public final LiveEvent b;
    public final LiveEvent c;
    public final LiveEvent d;
    public final x$e e;
    public final Observer f;
    public final a g;
    public final x$b h;
    public static final x$a i;

    static {
       x.i = new x$a(null);
    }
    public void x(a p0,x$b p1){
       a.p(p0, "model");
       a.p(p1, "delegate");
       super();
       this.g = p0;
       this.h = p1;
       c uoc = new c();
       this.p0(uoc);
       this.b = uoc;
       uoc = new c();
       this.p0(uoc);
       this.c = uoc;
       uoc = new c();
       this.p0(uoc);
       this.d = uoc;
       x$e uoe = new x$e(this);
       this.e = uoe;
       x$d uod = new x$d(this);
       this.f = uod;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(uoe, p0, a.class, "10")) {
       }else {
          a.p(uoe, "overRoomMessageListener");
          p0.b.add(uoe);
       }
       LiveData liveData = Transformations.distinctUntilChanged(p0.c());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observeForever(uod);
       p0.e();
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       super.onCleared();
       this.g.c().removeObserver(this.f);
       x tg = this.g;
       x te = this.e;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(te, tg, a.class, "11")) {
          a.p(te, "overRoomMessageListener");
          tg.b.remove(te);
       }
       return;
    }
    public final LiveEvent u0(){
       return this.b;
    }
    public final LiveEvent v0(){
       return this.c;
    }
    public void w0(x$c p0){
       x tg;
       x$c$b a;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ox, "2")) {
          return;
       }
       a.p(p0, "intent");
       String str = "currentAnchorId";
       String str1 = "overRoomMessage";
       int i = 1;
       String str2 = "LiveAudienceOverRoomV2ViewModel";
       if (p0 instanceof x$c$a) {
          String str3 = "3";
          if (!PatchProxy.applyVoid(null, this, ox, str3)) {
             b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag(str2), "onCloseClick");
             this.s0(this.d).q(l1.a);
             ox = this.a;
             if (ox != null) {
                tg = this.g;
                Objects.requireNonNull(tg);
                if (!PatchProxy.applyVoidOneRefs(ox, tg, a.class, str3)) {
                   a k = tg.k;
                   Integer integer = Integer.valueOf(ox.d());
                   Objects.requireNonNull(k);
                   if (!PatchProxy.applyVoidOneRefs(integer, k, a.class, "1") && k.a(integer)) {
                      k.a = i;
                   }
                }
                str3 = this.h.a();
                if (!PatchProxy.applyVoidTwoRefs(ox, str3, null, h.class, "6")) {
                   a.p(ox, str1);
                   a.p(str3, str);
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CLICK_ARROW_WINDOW_CLOSE";
                   uElementPack.params = h.a(ox, null, null);
                   u1.B(new ClickMetaData().setType(i).setElementPackage(uElementPack).setContentPackage(h.b(ox, str3)));
                }
             }
          }
       }else if(p0 instanceof x$c$b){
          a = p0.a;
          if (!PatchProxy.applyVoidOneRefs(a, this, ox, "4")) {
             LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
             lIVE_OVER_RO.appendTag(str2);
             b.P(lIVE_OVER_RO, "onContentClick");
             tg = this.a;
             if (tg != null) {
                String str4 = this.h.a();
                if (!PatchProxy.applyVoidThreeRefs(tg, str4, a, null, h.class, "2")) {
                   a.p(tg, str1);
                   a.p(str4, str);
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action = 853;
                   uElementPack1.params = h.a(tg, a, null);
                   u1.B(new ClickMetaData().setType(i).setElementPackage(uElementPack1).setContentPackage(h.b(tg, str4)));
                }
                if (this.x0(tg)) {
                   this.g.g(tg, 2);
                }
                if (!TextUtils.x(tg.e())) {
                   lIVE_OVER_RO.appendTag(str2);
                   b.S(lIVE_OVER_RO, "jumpForScheme", "schemeUrl", tg.e());
                   String str5 = tg.e();
                   a.m(str5);
                   a.b(b.j(this.h.getActivity(), str5), null);
                }else {
                   LiveAudienceParam$a uoa = new LiveAudienceParam$a();
                   uoa.i(tg.f());
                   uoa.n(tg.g);
                   uoa.g(tg.h);
                   uoa.h(tg.i);
                   if (this.x0(tg)) {
                      uoa.y = new LiveDiversionReportParam(tg.f(), a.a.q(tg.a()));
                   }
                   b.P(lIVE_OVER_RO.appendTag(str2), "jumpForNative");
                   d.a(-1492894991).m1(this.h.getActivity(), uoa.a());
                }
             }
          }
       }else if(!p0 instanceof x$c$c || PatchProxy.applyVoid(null, this, ox, "5")){
          b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag(str2), "onDismiss");
          this.a = null;
          this.g.e();
       }
       return;
    }
    public final boolean x0(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.d() == 6)? true: false;
       return b;
    }
}
