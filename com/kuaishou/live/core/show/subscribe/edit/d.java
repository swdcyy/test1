package com.kuaishou.live.core.show.subscribe.edit.d;
import erd.g;
import com.kuaishou.live.core.show.subscribe.edit.o;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import wk2.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.edit.b;
import sk2.n;
import vk2.b;
import d61.g;
import u07.t$a;
import u07.f;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.subscribe.edit.e;
import brd.t;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.Iterator;
import java.util.List;
import tk2.e;

public final class d implements g	// class@0010f9
{
    public final o b;
    public final SubscribeDialogParams c;

    public void d(o p0,SubscribeDialogParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "16")) {
       }else if(p0 == null || p0.mEnableWriteCalendar == null){
          ClientContent$LiveStreamPackage liveStreamPa = tb.f();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, s.class, "27")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CALENDAR_NOTICE_POPUP";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (liveStreamPa != null) {
                uContentPack.liveStreamPackage = liveStreamPa;
             }
             u1.u0(9, uElementPack, uContentPack);
          }
          Activity uActivity = tb.c();
          b uob = new b(tb, p0);
          n on = new n(tb);
          if (!PatchProxy.applyVoidThreeRefs(uActivity, uob, on, null, b.class, "9") && !g.h(uActivity)) {
             t$a uoa = f.d(new t$a(uActivity));
             uoa.B0(R.drawable.arg_RES_7f0805d2);
             uoa.V0(true);
             uoa.W0(R.string.arg_RES_7f102cb5);
             uoa.y0(R.string.arg_RES_7f102cb4);
             uoa.S0(R.string.arg_RES_7f102cb3);
             uoa.u0(uob);
             uoa.s0(on);
             uoa.v(true);
             uoa.Y(PopupInterface.a);
          }
       }
       if (tc.f != null) {
          o j = tb.j;
          if (j != null) {
             j.dismissAllowingStateLoss();
          }
       }else {
          tb.l(e.b, tc.b).delaySubscription(100, TimeUnit.MILLISECONDS).subscribe(Functions.d(), Functions.d());
       }
       tb.m(true);
       Iterator iterator = tb.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0.mSubscribeId);
       }
       return;
    }
}
