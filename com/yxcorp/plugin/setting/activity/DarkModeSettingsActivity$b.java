package com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity$b;
import wgc.o;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity;
import java.lang.Object;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import wgc.c;
import xgc.i;
import wgc.d;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import zf6.k;
import java.lang.System;
import android.content.SharedPreferences;
import zf6.k$a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import zf6.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import zf6.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.util.ListIterator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;

public final class DarkModeSettingsActivity$b implements o	// class@000803
{
    public final DarkModeSettingsActivity a;

    public void DarkModeSettingsActivity$b(DarkModeSettingsActivity p0){
       this.a = p0;
       super();
    }
    public final void a(e p0,SelectOption p1,View p2){
       SelectOption mName;
       Object[] this;
       String str2;
       DarkModeSettingsActivity uDarkModeSet = DarkModeSettingsActivity.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DarkModeSettingsActivity$b.class, "1")) {
          return;
       }
       if (a.g(this.a.A, p1.mName)) {
          return;
       }
       p1 = p1.mName;
       a.o(p1, "selectOption.mName");
       this.a.A = p1;
       Iterator iterator = this.a.z.iterator();
       int i = 0x7f0a0d62;
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof i) {
             e uoe = uoc.b();
             if (uoe != null) {
                uoe.i = false;
             }
             d uod = uoc.h();
             if (uod != null) {
                uod = uod.f;
                if (uod != null) {
                   View view = uod.findViewById(i);
                   if (view != null) {
                      view.setSelected(false);
                   }
                }
             }
          }
       }
       boolean b = true;
       p0.i = b;
       p2 = p2.findViewById(i);
       if (p2 != null) {
          p2.setSelected(b);
       }
       DarkModeSettingsActivity$b ta = this.a;
       p0 = p0.k;
       String str = "";
       if (p0 != null) {
          mName = p0.mName;
          if (mName != null) {
          label_007d :
             Objects.requireNonNull(ta);
             this = null;
             if (!PatchProxy.applyVoidOneRefs(mName, ta, uDarkModeSet, "5")) {
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "SETTINGS_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("button_name", mName);
                uElementPack1.params = oi3.e();
                u1.L(str, ta, b, uElementPack1, this);
             }
             DarkModeSettingsActivity$b ta1 = this.a;
             Objects.requireNonNull(ta1);
             String str1 = "4";
             if (!PatchProxy.applyVoid(this, ta1, uDarkModeSet, str1)) {
                k.i((k.d() ^ b));
                long l = System.currentTimeMillis();
                SharedPreferences sharedPrefer = k.b.a("DefaultPreferenceHelper");
                if (sharedPrefer != null) {
                   g.a(sharedPrefer.edit().putLong(k.b("lastSwitchTimestamp"), l));
                }
                o0 l1 = n.L;
                if (!l1 instanceof b) {
                   l1 = this;
                }
                if (l1 != null) {
                   l1.g(k.d());
                }
                boolean b1 = k.d();
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), this, uob, "2")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   str2 = String.valueOf(b1);
                   str1 = PatchProxy.applyTwoRefs("is_dark_on", str2, this, uob, str1);
                   if (str1 != PatchProxyResult.class) {
                   }else {
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("is_dark_on", str2);
                      str1 = jsonObject.toString();
                   }
                   uElementPack.params = str1;
                   uElementPack.action2 = "DARK_MODE";
                   str2.elementPackage = uElementPack;
                   u1.u(b, uElementPack, this);
                }
                d uod1 = d.a();
                if (uod1.a.get() && uod1.b.size() > 0) {
                   d b2 = uod1.b;
                   ListIterator listIterator = b2.listIterator(b2.size());
                   while (listIterator.hasPrevious()) {
                      Activity uActivity = listIterator.previous().get();
                      if (uActivity != null) {
                         this = uActivity;
                         break ;
                      }
                      listIterator.remove();
                   }
                }
                if (this != null) {
                   uod1.c = new WeakReference(this);
                   Intent intent = new Intent();
                   intent.setClassName(this, "com.yxcorp.gifshow.darkmode.DayNightSwitchTransitionActivity");
                   this.startActivity(intent);
                   this.overridePendingTransition(false, false);
                }
             }
             return;
          }
       }
       str2 = str;
       goto label_007d ;
    }
}
