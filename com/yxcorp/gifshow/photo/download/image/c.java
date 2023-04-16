package com.yxcorp.gifshow.photo.download.image.c;
import dxb.o;
import java.lang.Object;
import java.util.Arrays;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photo.download.utils.e;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Thread;
import android.os.Looper;
import o56.c;
import o56.a;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dxb.w;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.activity.GifshowActivity;
import exb.b;
import k2b.e0;
import com.yxcorp.gifshow.photo.download.task.a0;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import dxb.v;
import erd.g;
import crd.a;
import java.lang.Integer;
import com.yxcorp.gifshow.photo.download.image.b;
import io.reactivex.g;
import dxb.r;
import erd.a;
import dxb.q;
import dxb.s;
import dxb.t;
import java.lang.IllegalArgumentException;
import kxb.e;
import java.lang.Math;
import com.yxcorp.gifshow.photo.download.utils.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.image.c$a;

public class c	// class@000ed6
{
    public final o a;
    public final int[] b;
    public final boolean[] c;
    public final StatModel[] d;
    public final b[] e;
    public boolean f;
    public c$a g;
    public Activity h;
    public long i;

    public void c(o p0){
       super();
       this.f = false;
       this.i = 0;
       this.a = p0;
       int[] ointArray = new int[p0.h];
       this.b = ointArray;
       Arrays.fill(ointArray, -1);
       p0 = p0.h;
       boolean[] uobooleanArr = new boolean[p0];
       this.c = uobooleanArr;
       StatModel[] statModelArr = new StatModel[p0];
       this.d = statModelArr;
       b[] uobArray = new b[p0];
       this.e = uobArray;
    }
    public static File e(QPhoto p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(e.a(), p0.getPhotoId()+p1+System.currentTimeMillis()+".jpg");
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       if (Thread.currentThread() == Looper.getMainLooper().getThread() || !a.a().c()) {
          return;
       }
       throw new IllegalStateException("checkOnMainThread");
    }
    public final void b(){
       o m;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (this.h == null) {
          return;
       }
       int i = 0;
       if (this.a.b()) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             this.h(1);
             this.k(i, i);
             m = this.a.m;
             int i1 = 0;
             c ta = this.a;
             while (m < ta.h) {
                ta = this.b;
                if (ta[m] >= 0) {
                   if (ta[m] == 100) {
                      i1 = i1 + 1;
                   }
                }else {
                   this.e[m] = this.c(m, this.g(m));
                }
                m = m + 1;
             }
             if (i1 == ta.i) {
                this.h(7);
                this.k(i, 100);
             }else {
                this.c[i] = 1;
             }
          }
       }else {
          String str = "";
          if (this.a.c()) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
                this.a();
                StatModel mSource = this.g(1).mSource;
                if (TextUtils.x(mSource)) {
                   mSource = "downloadSingleLongPicFromDialog";
                }
                w ow = new w(this);
                this.k(1, i);
                File uFile = c.e(this.a.b, str);
                this.i(mSource, "PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", str, uFile);
                uoc = this.a;
                b uob = a0.g(uoc.b, uFile, (uoc.d.mNotNeedWaterMark ^ 0x01), this.g(1), ow, this.h);
                a uoa = new a();
                uoa.c(uob);
                uoa.c(t.timer(30, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new v(this, uob, ow)));
                this.e[1] = uoa;
             }
          }else if(PatchProxy.applyVoid(objArray, this, uoc, "8")){
             m = this.a.n;
             this.a();
             StatModel mSource1 = this.g(m).mSource;
             if (TextUtils.x(mSource1)) {
                mSource1 = "downloadSinglePicFromDialog";
             }
             this.i(mSource1, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON", this.f(m)+str, objArray);
             this.c[m] = 1;
             this.e[m] = this.c(m, this.g(m));
          }
       }
       return;
    }
    public final b c(int p0,StatModel p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a();
       if (p0 >= this.a.m) {
          this.j(p0, 0);
          return t.create(new b(this, p1, p0)).subscribeOn(d.c).observeOn(d.a).doOnDispose(new r(this, p0)).doOnComplete(new q(this, p0)).subscribe(new s(this, p0), new t(this, p0));
       }else {
          throw new IllegalArgumentException("downloadPic :"+p0);
       }
    }
    public String d(){
       int i = this.b[this.a.n];
       if (i == -2) {
          return "RETRY";
       }
       if (i == -1) {
          return "INITIAL";
       }
       if (i != 100) {
          return "DOWNLOADING";
       }
       return "DONE";
    }
    public final int f(int p0){
       return (p0 - this.a.m);
    }
    public final StatModel g(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoc = this.d;
       if (uoc[p0] == null) {
          uoc[p0] = new StatModel(this.a.c.mSource);
       }
       return this.d[p0];
    }
    public final void h(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "15")) {
          return;
       }
       uoc = this.a;
       e.l(uoc.b, null, 0, p0, false, null, uoc.g, null, uoc.c.mSource, uoc.i, this.h);
       return;
    }
    public final void i(String p0,String p1,String p2,File p3){
       c uoc = this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "16")) {
          return;
       }
       c a = uoc.a;
       e.o(a.b, p3, 0, 1, false, null, a.g, null, p0, p2, uoc.h, p1, false);
       return;
    }
    public final void j(int p0,int p1){
       int i5;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "12")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       this.a();
       this.k(p0, p1);
       int i = 0;
       int i1 = -1;
       int i2 = -2;
       int i3 = 100;
       if (this.c[i]) {
          if (p1 != i2) {
             if (p1 != i1) {
                long l = System.currentTimeMillis();
                if (p1 != i3 && (l - this.i) - 15 < 0) {
                   return;
                }else {
                   this.i = l;
                   o l1 = this.a.l;
                   int i4 = 0;
                   c ta = this.a;
                   while (l1 < ta.h) {
                      i4 = i4 + Math.max(this.b[l1], i);
                      l1 = l1 + 1;
                   }
                   i4 = i4 / ta.i;
                   if (i4 == i3) {
                      this.h(7);
                      this.c[i] = i;
                   }
                   this.k(i, i4);
                }
             }
          }else {
             i5 = 8;
             this.h(i5);
             if (!PatchProxy.applyVoid(null, this, uoc, "14")) {
                c.g(this.a.b, i5);
             }
          }
          this.c[i] = i;
          this.k(i, p1);
          i5 = 0;
          while (i5 < this.a.i) {
             if (!this.c[i5]) {
                object oobject = this.e[i5];
                if (oobject != null && !oobject.isDisposed()) {
                   oobject.dispose();
                }
             }
             i5 = i5 + 1;
          }
       }
       c tc = this.c;
       if (tc[p0] && p0 >= this.a.m) {
          if (p1 == i3) {
             tc[p0] = i;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "17")) {
                c.f(new QPhoto(this.a.a), 7, null, this.g(p0), this.h, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON");
             }
          }else if(p1 == i2 || p1 == i1){
             tc[p0] = i;
          }
       }
       return;
    }
    public void k(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "4")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       this.b[p0] = p1;
       if (p0 == this.a.n) {
          c tg = this.g;
          if (tg != null) {
             tg.a(p1);
          }
       }
       return;
    }
}
