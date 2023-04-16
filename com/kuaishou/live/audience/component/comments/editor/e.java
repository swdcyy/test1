package com.kuaishou.live.audience.component.comments.editor.e;
import z1.a;
import zx0.u;
import java.lang.Object;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zx0.w;
import java.util.Objects;
import ey0.b;
import ey0.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import ey0.c;
import java.lang.Boolean;
import com.kwai.framework.location.k;
import kzc.d;
import android.app.Activity;
import lnc.a1;
import u07.t$a;
import ey0.e;
import u07.u;
import ey0.f;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import ey0.d;
import ey0.g;

public final class e implements a	// class@000aab
{
    public final u a;

    public void e(u p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       k b;
       ClientEvent$ElementPackage obj;
       k a;
       ClientEvent$ShowEvent showEvent;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
       }else {
          p0 = this.a.z;
          if (p0 == null) {
             a.S("mLiveFloatEditorLocationController");
          }
          e ta = this.a;
          u i = ta.I;
          String str = "7";
          w ow = PatchProxy.apply(null, ta, u.class, str);
          if (ow != patchProxyRe) {
          }else {
             ow = new w(ta);
          }
          Objects.requireNonNull(p0);
          b uob = b.class;
          String str1 = "2";
          if (!PatchProxy.applyVoidTwoRefs(i, ow, p0, k.class, str1)) {
             b = p0.b;
             if (!PatchProxy.applyVoidOneRefs(b, null, uob, str1)) {
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                obj = new ClientEvent$ElementPackage();
                uClickEvent.elementPackage = obj;
                obj.action2 = "COMMENT_CARD_INPUT_LOCATION_BUTTON";
                ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                uClickEvent.contentPackage = uContentPack1;
                uContentPack1.liveStreamPackage = b;
                u1.a0(uClickEvent);
             }
             LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_LOCATION;
             b.Z(lIVE_AUDIENC, "onClickLocationButton");
             if (!TextUtils.isEmpty(i) && p0.e == null) {
                p0.e = true;
                p0.d = ow;
                c uoc = new c(p0, i);
                String str2 = "4";
                obj = PatchProxy.apply(null, p0, k.class, str2);
                boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): k.c("live_audience");
                if (b1) {
                   if (k.f()) {
                      p0.b(uoc);
                   }else {
                      a = p0.a;
                      if (!PatchProxy.applyVoidOneRefs(a, p0, k.class, "12")) {
                         b.Z(lIVE_AUDIENC, "requestOpenGps open guide dialog");
                         d uod = new d(a);
                         uod.X0(a1.p(R.string.arg_RES_7f1012b5));
                         uod.z0(a1.p(R.string.arg_RES_7f1012b3));
                         uod.x0(true);
                         uod.T0(a1.p(R.string.arg_RES_7f1012b4));
                         uod.R0(a1.p(R.string.arg_RES_7f1012b2));
                         uod.t0(new e(p0));
                         uod.u0(new f(p0, a));
                         uod.v(true);
                         uod.z(false);
                         f.e(uod).X();
                         p0 = p0.b;
                         if (!PatchProxy.applyVoidOneRefs(p0, null, uob, "6")) {
                            showEvent = new ClientEvent$ShowEvent();
                            uElementPack = new ClientEvent$ElementPackage();
                            showEvent.elementPackage = uElementPack;
                            uElementPack.action2 = "LIVE_COMMENT_LOCATION_AUTH_ANDROID";
                            uContentPack = new ClientContent$ContentPackage();
                            showEvent.contentPackage = uContentPack;
                            uContentPack.liveStreamPackage = p0;
                            u1.g0(showEvent);
                         }
                      }
                   }
                }else {
                   a = p0.a;
                   if (!PatchProxy.applyVoidTwoRefs(a, uoc, p0, k.class, str)) {
                      b.Z(lIVE_AUDIENC, "showLocationPermissionGuideDialog");
                      d uod1 = new d(a);
                      uod1.X0(a1.p(R.string.arg_RES_7f103ae6));
                      uod1.z0(a1.p(R.string.arg_RES_7f102c04));
                      uod1.x0(true);
                      uod1.T0(a1.p(R.string.arg_RES_7f1025d8));
                      uod1.R0(a1.p(R.string.arg_RES_7f1025d7));
                      uod1.t0(new d(p0));
                      uod1.u0(new g(p0, uoc));
                      uod1.v(true);
                      uod1.z(false);
                      f.e(uod1).X();
                      p0 = p0.b;
                      if (!PatchProxy.applyVoidOneRefs(p0, null, uob, str2)) {
                         showEvent = new ClientEvent$ShowEvent();
                         uElementPack = new ClientEvent$ElementPackage();
                         showEvent.elementPackage = uElementPack;
                         uElementPack.action2 = "LIVE_COMMENT_LOCATION_AUTH_CARD";
                         uContentPack = new ClientContent$ContentPackage();
                         showEvent.contentPackage = uContentPack;
                         uContentPack.liveStreamPackage = p0;
                         u1.g0(showEvent);
                      }
                   }
                }
             }
          }
       label_01b4 :
          PatchProxy.onMethodExit(e.class, "1");
       }
       return;
    }
}
