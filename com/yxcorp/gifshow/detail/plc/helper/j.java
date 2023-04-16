package com.yxcorp.gifshow.detail.plc.helper.j;
import f4a.k;
import android.app.Activity;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import f4a.b0;
import java.lang.Object;
import java.lang.String;
import f4a.m;
import com.yxcorp.gifshow.detail.plc.helper.c;
import com.yxcorp.gifshow.detail.plc.helper.j$a;
import com.yxcorp.download.b;
import f4a.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask;
import f4a.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.google.common.base.Optional;
import f4a.t;
import ok.h;
import java.lang.Integer;
import z1.a;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.Intent;
import tkd.b;
import tkd.d;
import nl9.d;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import f4a.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public class j implements k	// class@00167e
{
    public c a;
    public PlcEntryDataAdapter b;
    public ApkDownloadHelper$a c;

    public void j(Activity p0,PlcEntryDataAdapter p1,ApkDownloadHelper$a p2,b0 p3){
       super();
       m.g(p1.getDownloadUrl(), p1.getFileName());
       this.c = p2;
       this.a = new c(p1, p0, new j$a(this, p3));
       this.b = p1;
       p3.e(true);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "3")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "6")) {
          DownloadTask uDownloadTas = DownloadManager.n().l(ta.a);
          if (uDownloadTas != null) {
             DownloadManager.n().z(uDownloadTas.getId());
          }
       }
       return;
    }
    public int b(long p0,long p1,int p2){
       return j.a(this, p0, p1, p2);
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(m.e(this.b.getDownloadUrl())).transform(new t(this)).or(Integer.valueOf(0)).intValue();
    }
    public boolean d(a p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.apply(null, ta, c.class, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          DownloadTask uDownloadTas = DownloadManager.n().l(ta.a);
          if (uDownloadTas != null) {
             DownloadManager.n().D(uDownloadTas.getId());
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
    public void e(){
       j.d(this);
    }
    public void f(Activity p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "5")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, c.class, "10")) {
          p0.startActivity(p0.getPackageManager().getLaunchIntentForPackage(p1));
       }
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "7")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "11")) {
          ta.a(ta.a);
          d.a(0x4bd38ddd).LA();
       }
       return;
    }
    public boolean h(){
       return j.b(this);
    }
    public void i(a p0){
       c c;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, str)) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(null, ta, uoc, "1")) {
          PhotoApkDownloadTaskInfo photoApkDown = new PhotoApkDownloadTaskInfo(ta.b.getPhoto(), ta.b.getPlcEntryStyleInfo());
          photoApkDown.mAppIcon = ta.b.getAppIconUrl();
          photoApkDown.mAppName = ta.b.getAppName();
          photoApkDown.mPkgName = ta.b.getPackageName();
          c = ta.c;
          if (!PatchProxy.applyVoidTwoRefs(c, photoApkDown, ta, uoc, str)) {
             str = "android.permission.WRITE_EXTERNAL_STORAGE";
             if (PermissionUtils.a(c, str)) {
                ta.d(c, photoApkDown);
             }else {
                a.g(c, str).subscribe(new d(ta, c, photoApkDown), Functions.e);
             }
          }
       }
       if (p0 != null) {
          p0.accept(Integer.valueOf(12));
       }
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "6")) {
          return;
       }
       this.a.b(p0);
       return;
    }
}
