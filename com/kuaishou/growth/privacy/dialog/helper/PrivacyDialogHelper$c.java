package com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$c;
import u07.u;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf0.b;
import q87.c;
import h30.a;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import tk7.j;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kuaishou.growth.privacy.dialog.helper.p;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.deviceid.i;
import o56.a;
import i30.t;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import java.lang.Boolean;
import android.content.Context;
import com.kwai.framework.deviceid.h;
import java.util.HashMap;
import s30.e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import java.lang.System;
import v30.d;
import java.lang.Integer;
import java.lang.Long;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import fg6.a;
import com.google.gson.Gson;
import android.os.Handler;
import ekd.s1;
import com.kuaishou.growth.privacy.dialog.helper.i;
import com.kuaishou.growth.privacy.dialog.helper.q;
import java.lang.Thread;
import qc5.a;
import com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants$CrashType;
import p66.a;
import android.os.Looper;
import com.kwai.sdk.switchconfig.a;
import o96.u;
import sid.d0;
import ekd.k1;
import com.kuaishou.growth.privacy.dialog.helper.o;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import android.content.Intent;
import java.lang.StringBuilder;
import com.kuaishou.weapon.i.WeaponHI;
import u07.t$a;
import kzc.d;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import uf0.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class PrivacyDialogHelper$c implements u	// class@00070d
{
    public u b;
    public Activity c;

    public void PrivacyDialogHelper$c(Activity p0,u p1){
       super();
       this.c = p0;
       this.b = p1;
    }
    public void a(t p0,View p1){
       d obj;
       PrivacyDialogHelper$c uoc = PrivacyDialogHelper$c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("PrivacyDialogHelper", "onClick", objArray);
       PrivacyDialogHelper$c tc = this.c;
       a uoa = a.class;
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(tc, null, uoc, str)) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("privacyPolicyWatched", 1);
          g.a(uEditor);
          a.S(1);
          j.q(1);
          if (!PatchProxy.applyVoidOneRefs(tc, null, VisitorModeManager.class, "4")) {
             VisitorModeManager.f = i;
             VisitorModeManager.j("AUTHORIZED", i, 2, null);
             if (VisitorModeManager.f()) {
                if (tc != null) {
                   tc.finish();
                }
                VisitorModeManager.c();
             }
             VisitorModeManager.h.b();
          }
          c.a(p.b);
          a.b = i.e();
          String str2 = "7";
          if (!PatchProxy.applyVoid(null, null, uoa, str2)) {
             t.c().i();
          }
          PrivacyDialogHelper privacyDialo = PrivacyDialogHelper.class;
          if (PatchProxy.isSupport(privacyDialo) && (!PatchProxy.applyVoidTwoRefs(tc, Boolean.TRUE, null, privacyDialo, "21") && h.b(tc))) {
             HashMap hashMap = new HashMap();
             Context applicationC = tc.getApplicationContext();
             if (!PatchProxy.applyVoidOneRefs(applicationC, null, uoa, "14")) {
                e uoe = e.c(applicationC);
                Objects.requireNonNull(uoe);
                if (!PatchProxy.applyVoid(null, uoe, e.class, str2) && uoe.f.compareAndSet(i, 1)) {
                   e k = uoe.k;
                   if (k != null) {
                      k.countDown();
                   }
                   d.j = System.currentTimeMillis();
                   uoe.l.set(1);
                   t.c().i();
                }
             }
             hashMap.put("agreePrivacy_didTag", Integer.valueOf(a.c));
             hashMap.put("agreePrivacy_did", a.a);
             hashMap.put("agreePrivacy_odid", a.b);
             hashMap.put("event_timestamp", Long.valueOf(System.currentTimeMillis()));
             b.a(0x4b316083).logCustomEvent("yunfama_agreePrivacy", a.a.q(hashMap));
             s1.c().postDelayed(i.b, 5000);
          }
          new q("dfp_env_t").start();
          b.a(-515139006).d(tc);
          if (!a.a(CrashProtectorConstants$CrashType.TENCENT_MAP)) {
             Looper looper = s1.c().getLooper();
             long l = a.t().b("localLocationMinIntervalInSec", 0);
             u ou = u.class;
             if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidTwoRefs(looper, Long.valueOf(l), null, ou, str)) {
                k1.q(new d0(looper));
                u.r();
             }
          }
          b.a(0x4b316083).U0(1);
          c.a(o.b);
          PrivacyDialogHelper.k("AGREE");
          RxBus.f.b(new p());
          Intent intent = new Intent();
          intent.setAction("com.android.action.AGREE_PRIVACY_PERMISSION");
          tc.sendBroadcast(intent, tc.getPackageName()+".permission.AGREE_PRIVACY_PERMISSION");
          WeaponHI.setPS(1);
       }
       d uod = p0.b0();
       String str1 = a1.p(R.string.arg_RES_7f10002f);
       if (p1 instanceof TextView) {
          str1 = p1.getText().toString();
       }
       int i1 = uod.d();
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(i1 != 55){
             if (i1 == 56) {
                i = 1;
             }else {
                throw new IllegalArgumentException("invalid config id ");
             }
          }
       }else {
          goto label_01f1 ;
       }
       obj = d.class;
       if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), str1, null, obj, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERMISSION_ALLOW";
          i3 oi3 = d.d(i);
          oi3.d("button_text", str1);
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, null);
       }
       uoc = this.b;
       if (uoc != null) {
          uoc.a(p0, p1);
       }
       return;
    }
}
