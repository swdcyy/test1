package com.kwai.tokenshare.c;
import m4d.d;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import rx4.i;
import sx4.f;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wh5.c;
import e17.i;
import ayb.d;
import com.kwai.tokenshare.c$a;
import com.kwai.tokenshare.a$a;
import com.kwai.tokenshare.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kuaishou.weapon.i.WeaponHI;
import com.yxcorp.gifshow.util.rx.RxBus;
import ekd.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import o56.c;
import android.content.Intent;
import bu7.k;
import bu7.j0;
import bu7.y;
import java.util.concurrent.Callable;
import java.lang.Throwable;
import lc5.b;
import com.kwai.tokenshare.b;
import com.kwai.tokenshare.b$b;
import java.util.Objects;
import bu7.l;
import q87.c;
import java.lang.System;
import android.content.ClipboardManager;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.util.concurrent.TimeUnit;
import brd.t;
import bu7.e;
import erd.r;
import t45.d;
import brd.z;
import bu7.d;
import bu7.c;
import erd.g;
import crd.b;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import fo7.b;
import android.view.Window;
import android.view.View;
import bu7.x;
import java.lang.Runnable;
import n4d.c;
import qe6.b;
import oe6.b;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.a;

public class c implements d	// class@00191d
{
    public final KwaiTokenInitModule a;

    public void c(KwaiTokenInitModule p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       boolean b = (d.a(0x256720e1).S(p0) && d.a(0x256720e1).k4())? true: false;
       return b;
    }
    public boolean b(int p0,String p1,BaseDialogInfo p2){
       String obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "KwaiTokenInitModule";
       Log.g(obj, "showDialogByApp Õ¹Ê¾µ¯´°type:"+p0+" tokenSource:"+p1);
       Log.g(obj, "showDialogByApp step1");
       if (c.b()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          return false;
       }else {
          Log.g(obj, "showDialogByApp step2");
          if (d.a(-1479517326).NL(p0, p2, KwaiTokenInitModule.D)) {
             return true;
          }else {
             Log.g(obj, "showDialogByApp step3");
             if (!this.a.o0()) {
                Log.g(obj, "showDialogByApp step4");
                this.a.z.a(new c$a(this, p2, this));
             }else {
                Log.g(obj, "showDialogByApp step5");
                this.a.r0(p2, this, ActivityContext.g().e());
             }
             return true;
          }
       }
    }
    public Activity c(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActivityContext.g().e();
    }
    public boolean d(){
       boolean b;
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       if (KwaiTokenInitModule.L) {
          b = this.a.q0();
       }
       if (!b) {
          KwaiTokenInitModule.I = true;
       }
       return b;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       Log.g("KwaiTokenInitModule", "callbackClipboardContent: "+p0.length());
       WeaponHI.cp(a.b().getApplicationContext());
       RxBus.f.c(new o(p0));
       return;
    }
    public boolean f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0)) {
          Intent intent = b.a(0x66dce92a).c(a.a().f(), x0.f(p0), true, false);
          if (intent != null) {
             a.a().f().startActivity(intent);
             return true;
          }
       }
       return false;
    }
    public String g(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 3 && ("downloadVideo").equals(p1)) {
          return j0.g(a.b()).a(new y(this));
       }else {
          return null;
       }
    }
    public void h(int p0,int p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "9")) {
          return;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = "KwaiTokenInitModule";
       String str = null;
       String[] stringArray = new String[]{"kwai_token"};
       b.h(b.b(str, "token-share type="+p0+" errorCode="+p1+" errorMsg="+p2, str, objArray), stringArray);
       d.a(-1479517326).O50(p0, p1, KwaiTokenInitModule.D);
       if (p0 == i && p1 == 0x2713) {
          c ta = this.a;
          if (ta.r == null) {
             ta.r = new b(ta);
          }
          KwaiTokenInitModule r = this.a.r;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoid(str, r, b.class, "1")) {
             Object[] objArray1 = new Object[0];
             l.C().w("ClipboardMonitor", "start", objArray1);
             if (r.b == null && r.a != null) {
                r.b = i;
                r.c = System.currentTimeMillis();
                ClipboardInterceptor.addPrimaryClipChangedListener(r.a, r.e);
             }
             t.timer(2000, TimeUnit.MILLISECONDS).filter(new e(r)).observeOn(d.a).subscribe(new d(r), new c(r));
          }
       }
    label_00cf :
       return;
    }
    public String i(File p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!KwaiTokenInitModule.C) {
          this.a.q0();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(p0, obj, KwaiTokenInitModule.class, "17");
       if (str != patchProxyRe) {
       }else {
          str = null;
          Bitmap uBitmap = BitmapUtil.q(p0);
          if (uBitmap != null) {
             int height = uBitmap.getHeight();
             if (uBitmap.getWidth() < 50 || height < 50) {
                uBitmap.recycle();
             }else {
                uBitmap.recycle();
                str = b.a(uBitmap);
             }
          }
       }
       return str;
    }
    public boolean j(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 1) {
          c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, KwaiTokenInitModule.class, "22")) {
             Activity uActivity = ActivityContext.g().e();
             if (uActivity != null) {
                uActivity.getWindow().getDecorView().post(new x(ta, uActivity));
             }
          }
          if (this.a.l0()) {
             c.b("clipboard privacy permission is not agreed in menu setting");
             return false;
          }else if(!b.a()){
             KwaiTokenInitModule.K = true;
             Object[] objArray = new Object[]{"KwaiTokenInitModule"};
             String[] stringArray = new String[]{"kwai_token"};
             b.h(b.b(null, "clipboard task interrupted by agree privacy", null, objArray), stringArray);
             return false;
          }else {
             return (b.a.getBoolean("tokenShareClipboardDetectDisabled", false) ^ 1);
          }
       }else if(p0 == 2){
          return a.t().d("enableReadAlbumQRCode", false);
       }else if(p0 == 3){
          if (("downloadVideo").equals(p1)) {
             return j0.g(a.b()).b();
          }else {
             return 1;
          }
       }else {
          return false;
       }
    }
}
