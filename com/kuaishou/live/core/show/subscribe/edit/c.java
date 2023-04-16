package com.kuaishou.live.core.show.subscribe.edit.c;
import erd.g;
import com.kuaishou.live.core.show.subscribe.edit.o;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import sk2.q;
import sk2.r;
import com.kuaishou.live.core.show.subscribe.edit.p;
import ok.x;
import tk2.e;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import sk2.k;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import java.lang.Integer;
import d61.l0;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDescription;
import wk2.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import vk2.b;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$AutoFillInfo;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeAutoFillHintDialog;
import sk2.m;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeAutoFillHintDialog$a;
import wk2.a;
import lnc.i3;

public final class c implements g	// class@0010f8
{
    public final o b;
    public final SubscribeDialogParams c;

    public void c(o p0,SubscribeDialogParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a obj;
       int b1;
       ClientEvent$ElementPackage uElementPack;
       l0 n;
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       p0 = p0.mEntrySubscribeDetail;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(tc, p0, tb, o.class, "3")) {
       }else {
          o j = tb.j;
          if (j != null) {
             j.vh();
          }
          tb.l = p0;
          tb.m((q.f(p0.mSubscribeInfoList) ^ 1));
          o l = tb.l;
          p0 = PatchProxy.applyTwoRefs(tc, l, tb, o.class, "8");
          if (p0 != patchProxyRe) {
          }else {
             LiveSubscribeDetailFragment liveSubscrib = new LiveSubscribeDetailFragment(tc, new q(tb), new r(tb), l, new p(tb, tc, l));
          }
          LiveAnchorSubscribeContainerFragment liveAnchorSu = new LiveAnchorSubscribeContainerFragment(p0, tc);
          tb.j = liveAnchorSu;
          liveAnchorSu.E = tc.g;
          liveAnchorSu.k0(new k(tb));
          tb.j.Cb(tb.e(), "LiveAnchorSubscribeContainerFragment");
          if (tc.f != null || q.f(tb.l.mSubscribeInfoList)) {
             boolean b = false;
             tb.j.Fh(tb.b(tb.l, tc), b);
             p0 = tb.l;
             obj = PatchProxy.applyOneRefs(p0, tb, o.class, "7");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail mSubscribeDe = p0.mSubscribeDescription;
                n = o.m;
                Integer integer = n.b(Integer.valueOf(b));
                if (mSubscribeDe != null && integer.intValue() < mSubscribeDe.mPopTimes) {
                   if (!PatchProxy.applyVoid(null, null, s.class, "39")) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_PREVIEW_DESCRIBE_POPUP";
                      u1.u0(9, uElementPack, new ClientContent$ContentPackage());
                   }
                   n.i(Integer.valueOf((integer.intValue() + 1)));
                   b.d(tb.c(), p0);
                   b = true;
                }
                b1 = b;
             }
             if (!b1) {
                b1 = tb.l;
                if (!PatchProxy.applyVoidOneRefs(b1, tb, o.class, "4")) {
                   b1 = tb.d(b1);
                   if (b1 != null && tb.j().booleanValue()) {
                      n = o.n;
                      Objects.requireNonNull(n);
                      new LiveSubscribeAutoFillHintDialog(b1.mPopUpTitle, b1.mPopUpContent, 1, new m(n)).show(tb.e(), "LiveSubscribeAutoFillDialog");
                   }
                }
             }
          }
       label_0121 :
          b1 = q.f(tb.l.mSubscribeInfoList) ^ 1;
          SubscribeDialogParams b2 = tc.b;
          obj = a.class;
          if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), Integer.valueOf(b2), null, obj, "1")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_APPOINTMENT_PANEL_CARD";
             i3 oi3 = i3.f();
             b1 = (b1)? "PUBLISHED": "UNPUBLISHED";
             oi3.d("status", b1);
             if (b2 == 1) {
                oi3.d("source", "LIVE_PREVIEW_ENTRANCE");
             }
             uElementPack.params = oi3.e();
             u1.u0(9, uElementPack, null);
          }
       }
       return;
    }
}
