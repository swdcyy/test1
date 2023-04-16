package com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$b;
import o4a.b;
import o4a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.i;
import f4a.i0;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$1;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f4a.n;
import tkd.b;
import tkd.d;
import nl9.m;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.detail.plc.helper.i;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import f4a.o;
import f4a.l;
import f4a.m;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import com.yxcorp.gifshow.detail.plc.helper.j;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.c;
import brd.t;
import t45.d;
import brd.z;
import f4a.a;
import com.yxcorp.gifshow.detail.plc.helper.a;
import erd.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import f4a.g;
import java.lang.Integer;
import z1.a;
import f4a.k;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Map;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import java.util.HashMap;
import f4a.f0;
import agc.a;
import f4a.d0;

public class ApkDownloadHelper	// class@00166b
{
    public b a;
    public a b;
    public ApkDownloadHelper$b c;
    public PlcEntryDataAdapter d;
    public Activity e;
    public b0 f;
    public final Fragment g;
    public int h;
    public k i;
    public i j;
    public QPhoto k;
    public i0 l;
    public b m;
    public final LifecycleObserver n;

    public void ApkDownloadHelper(Activity p0,Fragment p1,PlcEntryDataAdapter p2,b0 p3,ApkDownloadHelper$b p4,b p5,a p6,QPhoto p7,i p8,i0 p9){
       AdDataWrapper this;
       ApkDownloadHelper uApkDownload = this;
       Activity uActivity = p0;
       PlcEntryDataAdapter plcEntryData = p2;
       b0 uob0 = p3;
       super();
       ApkDownloadHelper$1 u1 = new ApkDownloadHelper$1(this);
       uApkDownload.n = u1;
       uApkDownload.a = p5;
       uApkDownload.b = p6;
       uApkDownload.c = p4;
       uApkDownload.d = plcEntryData;
       uApkDownload.e = uActivity;
       uApkDownload.g = p1;
       uApkDownload.f = uob0;
       uApkDownload.j = p8;
       uApkDownload.k = p7;
       uApkDownload.l = p9;
       ApkDownloadHelper$c uoc = new ApkDownloadHelper$c(this);
       if (PatchProxy.applyVoidFourRefs(p0, p2, uoc, p3, this, ApkDownloadHelper.class, "4")) {
       }else if(uApkDownload.j instanceof n){
          this = d.a(-2125799450).iJ(uApkDownload.k.mEntity, 0);
          ApkDownloadHelper uApkDownload1 = uApkDownload.j;
          String str = (p2.getBizType() == 10)? "108": "106";
          i oi = new i(p0, uoc, uApkDownload1, this, p3, str);
          uApkDownload.i = v14;
       }else if(m.h(p2)){
          uApkDownload.i = new a(uActivity, plcEntryData, uoc, uob0);
       }else {
          uApkDownload.i = new j(uActivity, plcEntryData, uoc, uob0);
       }
       if (!PatchProxy.applyVoid(null, this, ApkDownloadHelper.class, "10")) {
          b9.a(uApkDownload.m);
          uApkDownload.m = RxBus.f.f(c.class).observeOn(d.a).subscribe(new a(this), a.b);
       }
       p1.getLifecycle().addObserver(u1);
       return;
    }
    public final void a(g p0,int p1){
       ApkDownloadHelper uApkDownload = ApkDownloadHelper.class;
       if (PatchProxy.isSupport(uApkDownload) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uApkDownload, "8")) {
          return;
       }
       p0 = p0.b;
       if (p0 != null) {
          p0.accept(Integer.valueOf(p1));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ApkDownloadHelper.class, "9")) {
          return;
       }
       try{
          this.h();
          this.g.getLifecycle().removeObserver(this.n);
          this.i.g();
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("calls clean after unregister broadcast receiver", e0));
       }
       return;
    }
    public void c(String p0,String p1){
       PlcEntryStyleInfo$DownloadInfo mDownloadIco;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApkDownloadHelper.class, "12")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.g(0);
       Map downloadInfo = this.d.getDownloadInfoMap();
       if (downloadInfo != null) {
          PlcEntryStyleInfo$DownloadInfo uDownloadInf = downloadInfo.get(p0);
          if (uDownloadInf != null && !TextUtils.x(uDownloadInf.mDownloadIcon)) {
             mDownloadIco = uDownloadInf.mDownloadIcon;
          }
       }
       if (!TextUtils.x(mDownloadIco)) {
          this.g(0);
          this.b.a(mDownloadIco);
       }else {
          this.g(8);
       }
       return;
    }
    public int d(g p0){
       int i1;
       String obj = PatchProxy.applyOneRefs(p0, this, ApkDownloadHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d.getDownloadUrl();
       if (this.j.f(this.e, this.d.getPackageName())) {
          this.i.f(this.e, this.d.getPackageName(), p0.b);
          this.h = 4;
          return 11;
       }else if(this.j.c(this.d.getDownloadUrl())){
          this.i.j(this.d.getFileName(), p0.b);
          this.h = 5;
          this.f.B();
          this.a(p0, 6);
       }else {
          int i = 8;
          if (this.j.d(obj) || this.h == 2) {
             if (!this.i.d(p0.b)) {
                this.i.i(p0.b);
             }
             i1 = this.i.c();
             if (!this.i.h()) {
                this.g(i);
                obj = d0.a;
                Object[] objArray = new Object[1];
                if (i1 == 100) {
                   i1 = 0;
                }
                objArray[0] = Integer.valueOf(i1);
                this.f(String.format(obj, objArray));
             }
             this.e("2", this.d.getTitle());
             this.h = 1;
          }else if(!this.j.g(obj) && (this.j.a(obj) || this.h == 1)){
             this.a(p0, 0);
             this.i.a();
             i1 = this.i.c();
             if (!this.i.h()) {
                obj = d0.b;
                Object[] objArray1 = new Object[1];
                if (i1 == 100) {
                   i1 = 0;
                }
                objArray1[0] = Integer.valueOf(i1);
                this.f(String.format(obj, objArray1));
                this.c("3", this.d.getActionIconUrl());
             }
             this.e("3", this.d.getTitle());
             this.h = 2;
          }else if(this.d.getBizType() == 29 && p0.c == null){
             HashMap hashMap = new HashMap();
             ApkDownloadHelper tl = this.l;
             if (tl != null) {
                tl.a(this.d.getActionSubUrl(), hashMap);
             }
             f0.b(this.d.getActionSubUrl(), hashMap);
             a.a(this.e, this.d.getActionSubUrl(), hashMap);
             return 0;
          }else {
             this.i.i(p0.b);
             if (!this.i.h()) {
                this.g(i);
                Object[] objArray2 = new Object[]{Integer.valueOf(0)};
                this.f(String.format(d0.a, objArray2));
             }
             this.e("2", this.d.getTitle());
             this.h = 1;
          }
       }
       return 4;
    }
    public void e(String p0,String p1){
       PlcEntryStyleInfo$DownloadInfo mDownloadTit;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApkDownloadHelper.class, "13")) {
          return;
       }
       ApkDownloadHelper td = this.d;
       if (td != null && td.getDownloadInfoMap() != null) {
          PlcEntryStyleInfo$DownloadInfo uDownloadInf = this.d.getDownloadInfoMap().get(p0);
          if (uDownloadInf != null) {
             mDownloadTit = uDownloadInf.mDownloadTitle;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(mDownloadTit, this, ApkDownloadHelper.class, "2") && (this.c != null && !TextUtils.x(mDownloadTit))) {
          this.c.c(mDownloadTit);
       }
    label_003d :
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApkDownloadHelper.class, "3")) {
          return;
       }
       if (this.a != null && !TextUtils.x(p0)) {
          this.a.a(p0);
       }
       return;
    }
    public void g(int p0){
       ApkDownloadHelper uApkDownload = ApkDownloadHelper.class;
       if (PatchProxy.isSupport(uApkDownload) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uApkDownload, "14")) {
          return;
       }
       uApkDownload = this.b;
       if (uApkDownload == null) {
          return;
       }
       if (uApkDownload.getVisibility() != p0) {
          this.b.setVisibility(p0);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, ApkDownloadHelper.class, "11")) {
          return;
       }
       b9.a(this.m);
       return;
    }
    public void i(){
       int i;
       int i1;
       String b;
       Object[] objArray1;
       ApkDownloadHelper uApkDownload = ApkDownloadHelper.class;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, uApkDownload, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uApkDownload, "6")) {
          uApkDownload = this.i;
          if (uApkDownload instanceof i) {
             uApkDownload.e();
          }
       }
       if (this.j.f(this.e, this.d.getPackageName())) {
          this.f(d0.d);
          this.c(str, this.d.getActionIconUrl());
          this.e(str, this.d.getTitle());
       }else if(this.j.c(this.d.getDownloadUrl())){
          this.f(d0.c);
          this.c("4", this.d.getActionIconUrl());
          this.e("4", this.d.getTitle());
       }else {
          i = 1;
          if (this.j.d(this.d.getDownloadUrl())) {
             i1 = this.i.c();
             b = d0.b;
             objArray1 = new Object[i];
             if (i1 == 100) {
                i1 = 0;
             }
             objArray1[0] = Integer.valueOf(i1);
             this.f(String.format(b, objArray1));
             this.c("3", this.d.getActionIconUrl());
             this.e("3", this.d.getTitle());
          }else if(this.j.g(this.d.getDownloadUrl())){
             if (!this.i.h() && !this.i.d(objArray)) {
                this.i.i(objArray);
             }
             i1 = this.i.c();
             b = d0.a;
             objArray1 = new Object[i];
             if (i1 == 100) {
                i1 = 0;
             }
             objArray1[0] = Integer.valueOf(i1);
             this.f(String.format(b, objArray1));
             this.g(8);
             this.e("2", this.d.getTitle());
          }else if(this.j.a(this.d.getDownloadUrl())){
             Object[] objArray2 = new Object[]{d0.e,"..."};
             this.f(String.format("%s%s", objArray2));
             this.g(8);
             this.e("2", this.d.getTitle());
          }else {
             this.c("1", this.d.getActionIconUrl());
             this.e("1", this.d.getTitle());
          }
       }
       return;
    }
}
