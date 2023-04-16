package com.kwai.component.upgrade.f$b;
import zjd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.kwai.component.upgrade.UpgradeLog$UpgradeClickInfo;
import com.kwai.component.upgrade.f;
import bkd.b;
import k2b.u1;
import java.lang.System;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import java.lang.CharSequence;
import e17.i;
import ai5.b;
import ai5.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.component.upgrade.UpgradeLog$UpgradeBaseInfo;
import java.lang.Integer;
import q07.a;
import com.kwai.component.upgrade.UpgradeLog$UpgradeDialogNotShowInfo;
import com.kwai.component.upgrade.UpgradeLog$UpgradeApkNotInstall;
import com.kwai.component.upgrade.g;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import java.lang.Throwable;
import com.kwai.component.upgrade.UpgradeLog$UpgradeDownloadProcess;

public class f$b implements g	// class@000c02
{
    public b a;
    public final boolean b;
    public long c;
    public static boolean d;

    public void f$b(boolean p0){
       super();
       this.c = -1;
       this.b = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "5")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       u1.Q("ks://upgrade_dialog_click", new Gson().q(new UpgradeLog$UpgradeClickInfo(this.a, f.g, "ok")));
       this.c = System.currentTimeMillis();
       if (this.a.b == null) {
          i.d(R.style.arg_RES_7f11066a, a.b().getResources().getString(R.string.arg_RES_7f104f93));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "3")) {
          return;
       }
       f$b ta = this.a;
       if (ta == null) {
          return;
       }
       if (!ta.m - false) {
          b.b(ta.l);
          c uoc = new c();
          uoc.a = this.a.l;
          RxBus.f.b(uoc);
       }
       u1.Q("ks://upgrade_silent_download", new Gson().q(new UpgradeLog$UpgradeBaseInfo(this.a, f.g)));
       return;
    }
    public void c(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       a h = f.h;
       if (h != null) {
          h.a();
          f.h = null;
       }
       String str = "ks://upgrade_dialog_click";
       if (p0 == 5 && this.a != null) {
          u1.Q(str, new Gson().q(new UpgradeLog$UpgradeClickInfo(this.a, f.g, "cancel")));
       }
       if (p0 == 12 && this.a != null) {
          u1.Q(str, new Gson().q(new UpgradeLog$UpgradeClickInfo(this.a, f.g, "ok")));
       }
       int i = 4;
       str = "ks://upgrade_dialog_not_show";
       if (p0 == i && this.a != null) {
          u1.Q(str, new Gson().q(new UpgradeLog$UpgradeDialogNotShowInfo(this.a, f.g, "intervalTooShort")));
       }
       if (p0 == 13 && this.a != null) {
          u1.Q(str, new Gson().q(new UpgradeLog$UpgradeDialogNotShowInfo(this.a, f.g, "appInstallTime")));
       }
       if (p0 == 14 && this.a != null) {
          u1.Q(str, new Gson().q(new UpgradeLog$UpgradeDialogNotShowInfo(this.a, f.g, "olderNewVersionCode")));
       }
       if (p0 != 15 && (p0 != 16 && (p0 == 17 || (p0 == 18 && this.a != null)))) {
          u1.Q("ks://upgrade_dialog_apk_not_install", new Gson().q(new UpgradeLog$UpgradeApkNotInstall(this.a, f.g, p0)));
       }
       if (p0 != 3 && (p0 == i || (p0 == 19 && this.b != null))) {
          if (f$b.d) {
             f$b.d = false;
             return;
          }else {
             k1.r(g.b, 3000);
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "10")) {
          return;
       }
       f$b.d = true;
       f$b ta = this.a;
       if (ta != null) {
          b.e(ta.l);
          b.a(a.q);
       }
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, UpgradeInstallHintHelper.class, "3")) {
          b.d(true);
          b.c(0);
       }
       this.l(0, "");
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "4")) {
          return;
       }
       f$b ta = this.a;
       if (ta == null) {
          return;
       }
       if (!ta.m - false) {
          b.b(ta.l);
          c uoc = new c();
          uoc.a = this.a.l;
          RxBus.f.b(uoc);
       }
       u1.Q("ks://upgrade_dialog_show", new Gson().q(new UpgradeLog$UpgradeBaseInfo(this.a, f.g)));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "7")) {
          return;
       }
       this.l(2, "");
       return;
    }
    public void h(){
       PatchProxy.applyVoid(null, this, f$b.class, "1");
    }
    public void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "8")) {
          return;
       }
       String message = (p0 != null)? p0.getMessage(): "";
       this.l(1, message);
       return;
    }
    public void j(int p0){
    }
    public void k(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       if (p0.a == null) {
          b.b(a.q);
       }
       this.a = p0;
       return;
    }
    public final void l(int p0,String p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "9")) {
          return;
       }
       long l = (this.c - -1)? System.currentTimeMillis() - this.c: -1;
       this.c = -1;
       UpgradeLog$UpgradeDownloadProcess upgradeDownl = new UpgradeLog$UpgradeDownloadProcess(this.a, f.g, l, p0, p1);
       u1.Q("ks://upgrade_dialog_download", new Gson().q(v1));
       return;
    }
}
