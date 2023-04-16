package com.kuaishou.live.external.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import oe6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import u07.t$a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import g33.t;
import u07.u;
import g33.u;
import g33.w;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class u implements SlipSwitchButton$b	// class@001bbf
{
    public final LiveSettingsActivity a;

    public void u(LiveSettingsActivity p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       u ta = this.a;
       Objects.requireNonNull(ta);
       LiveSettingsActivity liveSettings = LiveSettingsActivity.class;
       e.i0(p1);
       if (ta.y != null && (p1 && (!PatchProxy.isSupport(liveSettings) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), ta, liveSettings, "12")))) {
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action = 1735;
          int i = 1;
          int i1 = (p1)? 1: 2;
          uElementPack1.status = i1;
          u1.u(i, uElementPack1, new ClientContent$ContentPackage());
       }
       boolean b = false;
       ta.y = b;
       if (p1 && !i9.a(a.a().a())) {
          if (!PatchProxy.applyVoid(null, ta, liveSettings, "15")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x76b6;
             showEvent.elementPackage = uElementPack;
             u1.g0(showEvent);
          }
          AtomicBoolean uAtomicBoole = new AtomicBoolean(b);
          t$a uoa = new t$a(ActivityContext.g().e());
          uoa.W0(R.string.arg_RES_7f1021fe);
          uoa.y0(R.string.arg_RES_7f1021fd);
          uoa.S0(R.string.arg_RES_7f102d01);
          uoa.Q0(R.string.arg_RES_7f102852);
          uoa.u0(new t(ta, uAtomicBoole));
          uoa.t0(new u(ta, uAtomicBoole));
          uoa.M(new w(ta, uAtomicBoole));
          j.d(uoa);
       }
       return;
    }
}
