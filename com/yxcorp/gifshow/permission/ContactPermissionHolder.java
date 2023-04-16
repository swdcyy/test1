package com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.d;
import java.lang.Object;
import mrd.a;
import com.yxcorp.gifshow.permission.ContactPermissionHolder$1;
import xwb.d$b;
import java.lang.Integer;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import wwb.f;
import java.lang.StringBuilder;
import k2b.l;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import wwb.o;
import brd.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import ny5.a;
import android.content.SharedPreferences;
import wwb.c;
import java.util.List;
import wwb.h;
import kzc.d;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import lnc.a1;
import java.lang.CharSequence;
import u07.t$a;
import com.yxcorp.gifshow.permission.b;
import w07.l;
import android.widget.ImageView$ScaleType;
import wwb.m;
import u07.u;
import wwb.n;
import u07.f;
import com.kwai.library.widget.popup.common.c$b;
import wwb.p;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import xwb.d$c;
import xwb.d$a;
import wwb.e;
import com.yxcorp.gifshow.permission.c;
import wwb.j;
import wwb.i;
import wwb.q;
import com.kwai.sdk.switchconfig.a;
import wwb.d;
import com.yxcorp.gifshow.permission.d;
import wwb.k;
import wwb.l;
import wwb.r;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.tbruyelle.rxpermissions2.g;
import wwb.a;
import erd.g;
import crd.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;

public class ContactPermissionHolder	// class@000ec4
{
    public int a;
    public LifecycleOwner b;
    public final c c;
    public final d d;
    public final LifecycleObserver e;
    public boolean f;

    public void ContactPermissionHolder(d p0){
       super();
       a uoa = a.g();
       this.c = uoa;
       this.e = new ContactPermissionHolder$1(this);
       this.f = true;
       if (p0 != null) {
       }else {
          d$b uob = new d$b();
       }
       this.d = p0;
       if (ContactPermissionHolder.f()) {
          this.a(true);
       }else {
          this.a(0);
       }
       uoa.onNext(Integer.valueOf(this.a));
       return;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, ContactPermissionHolder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = PermissionUtils.a(a.a().a(), "android.permission.READ_CONTACTS");
       boolean b1 = f.b();
       l.b("permissionGranted\(\) , hasPermission is "+b+" , allowReadContact is "+b1);
       b = (b && b1)? true: false;
       return b;
    }
    public void a(int p0){
       ContactPermissionHolder uContactPerm = ContactPermissionHolder.class;
       if (PatchProxy.isSupport(uContactPerm) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uContactPerm, "14")) {
          return;
       }
       if (p0 != this.a) {
          l.b("changeState, target is  "+p0+" , old is "+this.a);
          this.a = p0;
          this.c.onNext(Integer.valueOf(p0));
       }
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, ContactPermissionHolder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.k();
       return this.a;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, ContactPermissionHolder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b() != b) {
          b = false;
       }
       return b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, ContactPermissionHolder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b() != b || !o.c(QCurrentUser.me().getId())) {
          b = false;
       }
       return b;
    }
    public t e(){
       return this.c;
    }
    public void g(GifshowActivity p0,int p1,Runnable p2){
       c uoc;
       boolean b;
       List list;
       String id;
       d uod;
       String str1;
       c uoc1;
       d uod1;
       n on1;
       t$a uoa;
       d uod3;
       String str2;
       t$a uoa1;
       CharSequence text;
       ContactPermissionHolder uContactPerm = this;
       Context uContext = p0;
       int i = p1;
       Runnable runnable = p2;
       ContactPermissionHolder uContactPerm1 = ContactPermissionHolder.class;
       if (PatchProxy.isSupport(uContactPerm1) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ContactPermissionHolder.class, "4")) {
          return;
       }
       boolean i1 = -1;
       if (!PatchProxy.isSupport(uContactPerm1) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(i1), this, ContactPermissionHolder.class, "5")) {
          i1 = a.a.getBoolean("IsFirstTimeRequest", true);
          String str = "android.permission.READ_CONTACTS";
          n on = 0x7f103a88;
          int i2 = 0x7f1039d4;
          int i3 = 0x7f1001c0;
          int i4 = 0x7f100801;
          if (PermissionUtils.a(uContext, str)) {
             l.b("has contact permission , and try show dialog");
             super(uContactPerm, runnable);
             if (PatchProxy.isSupport2(o.class, "4")) {
                uoc = this;
                if (!PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), this, null, o.class, "4")) {
                }
             }else {
                uoc = this;
                boolean b1 = false;
             }
          }else {
             boolean b2 = PermissionUtils.l(uContext, str);
             if (b2 || i1) {
                l.b("don\'t have contact permission , and try show dialog , oldShouldShowRationale is "+b2+" , isFirstTimeRequest is "+i1);
                if (a.t().d("contactAuthOptimize", false)) {
                   uContactPerm.i(uContext, runnable, i1);
                }else {
                   d uod2 = new d(uContactPerm, uContext, runnable, i1);
                   if (!PatchProxy.isSupport2(o.class, "6") || !PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), uod2, null, o.class, "6")) {
                      uod2.onShow();
                      i1 = o.a();
                      uod3 = new d(ActivityContext.g().e());
                      uod3.b1(KwaiDialogOption.d);
                      if (!i1) {
                         i4 = 0x7f101c40;
                      }
                      uod3.X0(a1.p(i4));
                      if (i1) {
                         i3 = 0x7f1001b0;
                      }
                      uod3.z0(a1.p(i3));
                      uod3.a0(d.a);
                      uod3.V0(false);
                      str2 = (i1)? a1.p(R.string.arg_RES_7f104a81): uContext.getText(on);
                      uod3.T0(str2);
                      uod3.R0(uContext.getText(i2));
                      uod3.F0(ImageView$ScaleType.CENTER_INSIDE);
                      uod3.t0(new k(i1, i, uod2));
                      uod3.u0(new l(i1, i, uod2));
                      uoa1 = f.f(uod3);
                      uoa1.z(false);
                      uoa1.A(false);
                      if (!i1) {
                         uoa1.B0(R.drawable.arg_RES_7f0805df);
                      }
                      uoa1.Y(new r(i1, i));
                      PatchProxy.onMethodExit(o.class, "6");
                   }
                }
             }else {
                d$c uoc2 = uContactPerm.d.b();
                d$a uoa2 = uContactPerm.d.a();
                l.b("has rejected , enableGuideSetting is "+uContactPerm.f);
                if (uContactPerm.f != null) {
                   e uoe = new e(uContactPerm, uoa2, runnable);
                   if (!PatchProxy.isSupport2(o.class, "5") || !PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), uoe, null, o.class, "5")) {
                      uoe.onShow();
                      i1 = o.a();
                      uod3 = new d(ActivityContext.g().e());
                      uod3.b1(KwaiDialogOption.d);
                      if (!i1) {
                         i4 = 0x7f101c40;
                      }
                      uod3.X0(a1.p(i4));
                      if (i1) {
                         i3 = 0x7f100d56;
                      }
                      uod3.z0(a1.p(i3));
                      uod3.a0(c.a);
                      uod3.V0(false);
                      str2 = (i1)? a1.p(R.string.arg_RES_7f104a81): uContext.getText(R.string.arg_RES_7f104232);
                      uod3.T0(str2);
                      uod3.R0(uContext.getText(i2));
                      uod3.F0(ImageView$ScaleType.CENTER_INSIDE);
                      uod3.t0(new j(i1, i, uoe));
                      uod3.u0(new i(i1, i, uContext, uoe));
                      uoa1 = f.f(uod3);
                      uoa1.z(false);
                      uoa1.A(false);
                      if (!i1) {
                         uoa1.B0(R.drawable.arg_RES_7f0805df);
                      }
                      uoa1.Y(new q(i1, i));
                      PatchProxy.onMethodExit(o.class, "5");
                   }
                }else {
                   uContactPerm.a(2);
                   uoc2.b();
                   uoc2.a();
                   p2.run();
                }
             }
          }
       }
       return;
    }
    public void h(GifshowActivity p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContactPermissionHolder.class, "3")) {
          return;
       }
       this.g(p0, -1, p1);
       return;
    }
    public void i(GifshowActivity p0,Runnable p1,boolean p2){
       if (PatchProxy.isSupport(ContactPermissionHolder.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, ContactPermissionHolder.class, "6")) {
          return;
       }
       if (p0.getSupportFragmentManager() != null && p0.getSupportFragmentManager().isDestroyed()) {
          p1.run();
          return;
       }else {
          PermissionUtils.h(new g(p0), p0, "android.permission.READ_CONTACTS", false).subscribe(new a(this, p1));
          if (p2) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("IsFirstTimeRequest", false);
             g.a(uEditor);
          }
          return;
       }
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, ContactPermissionHolder.class, "1")) {
          return;
       }
       ContactPermissionHolder tb = this.b;
       if (tb != null) {
          tb.getLifecycle().removeObserver(this.e);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, ContactPermissionHolder.class, "12")) {
          return;
       }
       if (!ContactPermissionHolder.f()) {
          if (this.a != 2) {
             this.a(0);
          }
       }else {
          this.a(1);
       }
       return;
    }
    public void l(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactPermissionHolder.class, "2")) {
          return;
       }
       this.b = p0;
       p0.getLifecycle().addObserver(this.e);
       return;
    }
}
