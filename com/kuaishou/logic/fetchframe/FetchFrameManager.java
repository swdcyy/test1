package com.kuaishou.logic.fetchframe.FetchFrameManager;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import w46.b;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import com.yxcorp.gifshow.util.v;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Number;
import java.lang.Math;
import qr3.i;
import java.util.List;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import java.util.Iterator;
import brd.v;
import java.util.concurrent.TimeoutException;
import java.lang.Throwable;
import brd.g;
import mca.a;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import pr3.a;
import qr3.b;
import java.lang.Runnable;
import pr3.a$a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.logic.fetchframe.a;
import erd.o;
import com.kuaishou.logic.fetchframe.c;
import erd.g;
import com.kuaishou.logic.fetchframe.d;
import qr3.f;
import brd.w;
import qr3.d;
import erd.a;
import qr3.g;
import qr3.e;
import qr3.c;
import io.reactivex.g;
import qr3.h;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import android.content.Context;
import lnc.a1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Objects;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;

public final class FetchFrameManager	// class@0014bf
{
    public final List a;
    public boolean b;
    public ThumbnailGenerator c;
    public String d;
    public EditorSdk2V2$VideoEditorProject e;
    public b f;
    public static final FetchFrameManager g;

    static {
       FetchFrameManager.g = new FetchFrameManager();
    }
    public void FetchFrameManager(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = false;
       this.d = "";
    }
    public static Bitmap c(String p0,int p1,int p2){
       File obj;
       Object[] objArray;
       Size size;
       Size c;
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, FetchFrameManager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.isEmpty(p0) && (p1 > 0 && p2 > 0)) {
          obj = new File(p0);
          if (!obj.isFile()) {
             objArray = new Object[0];
             a.D().w("FetchFrameManager", "decodeImageWithNormalizeSize cant fine file:"+p0, objArray);
             return null;
          }else {
             b0 uob0 = BitmapUtil.E(obj.getAbsolutePath());
             if (uob0.a != null && uob0.b != null) {
                size = FetchFrameManager.k(uob0.a, uob0.b, FetchFrameManager.j(p1, p2));
                c = size.c;
                size = size.b;
                Object[] objArray1 = new Object[0];
                a.D().w("FetchFrameManager", "decodeImageWithNormalizeSize getDimension "+uob0+"file="+p0, objArray1);
             }
             Bitmap uBitmap = BitmapUtil.r(obj, size, c, true);
             if (uBitmap == null) {
                objArray = new Object[0];
                a.D().t("FetchFrameManager", "decodeImageWithNormalizeSize: load file failed "+obj, objArray);
                return null;
             }else {
                return uBitmap;
             }
          }
       }else {
          throw new IllegalArgumentException("decodeImageWithNormalizeSize imagePath="+p0+" width="+p1+" height="+p2);
       }
    }
    public static String e(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, FetchFrameManager.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return FetchFrameManager.f(p0, FetchFrameManager.j(p1, p2), (long)FetchFrameManager.l(p3));
    }
    public static String f(String p0,int p1,long p2){
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), null, FetchFrameManager.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{v.f(p0+new File(p0).lastModified()),Integer.valueOf(p1),Long.valueOf(p2)};
       return new File(PostUtils.p("fetch_frame"), TextUtils.join("_", objArray)+".jpg").getAbsolutePath();
    }
    public static FetchFrameManager i(){
       return FetchFrameManager.g;
    }
    public static int j(int p0,int p1){
       FetchFrameManager uFetchFrameM = FetchFrameManager.class;
       if (PatchProxy.isSupport(uFetchFrameM)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uFetchFrameM, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 > 0 && p1 > 0) {
          int i = 320;
          if (Math.min(p0, p1) > 480) {
             i = 640;
          }
          return i;
       }else {
          throw new IllegalArgumentException("w="+p0+" h="+p1);
       }
    }
    public static Size k(int p0,int p1,int p2){
       Size obj;
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, FetchFrameManager.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Size(p0, p1);
       int i = (p2 > 320)? 2048: 1080;
       if (p0 > p1) {
          obj.c = p2;
          obj.b = Math.min(((p2 * p0) / p1), i);
       }else {
          obj.b = p2;
          obj.c = Math.min(((p2 * p1) / p0), i);
       }
       Object[] objArray = new Object[0];
       a.D().w("FetchFrameManager", "getNormalizeSize: maxLongSide: "+i+" size: "+obj, objArray);
       return obj;
    }
    public static int l(int p0){
       return (((p0 + 500) / 1000) * 1000);
    }
    public void a(i p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, FetchFrameManager.class, "10")) {
          return;
       }
       int i = 0;
       if (this.a.isEmpty()) {
          this.a.add(p0);
       }else {
          int i1 = this.a.size();
          int i2 = 0;
          while (i2 < i1) {
             i oi = this.a.get(i2);
             Object obj = PatchProxy.applyOneRefs(oi, p0, i.class, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if((p0.e).equals(oi.e) && p0.c() < oi.c()){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                Object[] objArray1 = new Object[i];
                a.D().w("FetchFrameManager", "addRequest: insert at "+i2, objArray1);
                this.a.add(i2, p0);
                break ;
             }
             i2 = i2 + 1;
          }
          if (i1 == this.a.size()) {
             Object[] objArray2 = new Object[i];
             a.D().w("FetchFrameManager", "addRequest: append", objArray2);
             this.a.add(p0);
          }
       }
       Object[] objArray = new Object[i];
       a.D().y("FetchFrameManager", "addRequest: mRequests"+this.a, objArray);
       this.d();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FetchFrameManager.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FetchFrameManager", "clear\(\) called", objArray);
       b9.a(this.f);
       this.f = null;
       this.b = i;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          i oi = iterator.next();
          if (oi != null && !oi.d.isDisposed()) {
             oi.d.onError(new TimeoutException("FetchFrameRequest is abort!"));
          }
       }
       this.a.clear();
       this.e = null;
       if (a.y()) {
          EditorSdk2Utils.releaseCurrentEditSession();
       }
       return;
    }
    public final void d(){
       Object[] objArray1;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FetchFrameManager uFetchFrameM = FetchFrameManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFetchFrameM, "11")) {
          return;
       }
       FetchFrameManager tf = this.f;
       String str = "FetchFrameManager";
       int i = 0;
       if (tf != null && !tf.isDisposed()) {
          objArray1 = new Object[i];
          a.D().w(str, "fetchNextRequest: is fetching", objArray1);
          return;
       }else if(this.a.isEmpty()){
          Object[] objArray2 = new Object[i];
          a.D().w(str, "fetchNextRequest: no request", objArray2);
          if (!PatchProxy.applyVoid(objArray, this, uFetchFrameM, "18")) {
             a.a.execute(new b(this));
          }
          return;
       }else if(this.b != null){
          objArray1 = new Object[i];
          a.D().w(str, "fetchNextRequest: mPaused is true", objArray1);
          return;
       }else {
          i oi = this.a.remove(i);
          if (oi == null) {
             objArray1 = new Object[i];
             a.D().t(str, "fetchNextRequest: cant find next request", objArray1);
             return;
          }else {
             Object[] objArray3 = new Object[i];
             a.D().w(str, "fetchNextRequest: start to fetch "+oi, objArray3);
             if (oi.g()) {
                ot = PatchProxy.applyOneRefs(oi, this, uFetchFrameM, "12");
                if (ot != patchProxyRe) {
                }else {
                   ot = t.just(oi).observeOn(d.c).flatMap(a.b);
                }
             }else {
                ot = t.empty();
             }
             t ot1 = PatchProxy.applyOneRefs(oi, this, uFetchFrameM, "14");
             if (ot1 != patchProxyRe) {
             }else {
                ot1 = t.just(oi).observeOn(a.b).doOnNext(c.b).flatMap(new d(this)).observeOn(d.c).doOnNext(new f(oi));
             }
             this.f = ot.switchIfEmpty(ot1).observeOn(d.a).doFinally(new d(this)).subscribe(new g(oi), new e(oi));
             return;
          }
       }
    }
    public t g(String p0,int p1,int p2,int p3){
       Object obj;
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FetchFrameManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = new c(this, p0, p1, p2, p3);
       return t.create(obj).subscribeOn(d.a);
    }
    public t h(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FetchFrameManager.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FetchFrameManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g(p0, p1, p2, p3).map(new h(p0, p1, p2, p3));
    }
    public final ThumbnailGenerator m(i p0){
       ThumbnailGenerator obj = PatchProxy.applyOneRefs(p0, this, FetchFrameManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!(this.d).equals(p0.e)) {
          this.p();
       }
       if (this.c == null) {
          obj = new ThumbnailGenerator(a1.c());
          this.c = obj;
          obj.setProject(this.n(p0));
       }
       this.d = p0.e;
       FetchFrameManager tc = this.c;
       Objects.requireNonNull(tc);
       return tc;
    }
    public final EditorSdk2V2$VideoEditorProject n(i p0){
       i obj = PatchProxy.applyOneRefs(p0, this, FetchFrameManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.e;
       if (p0.h() && p0.d() != null) {
          this.e = p0.d();
       }
       FetchFrameManager te = this.e;
       int i = 0;
       if (te == null || !(te.trackAssets(i).assetPath()).equals(obj)) {
          Object[] objArray = new Object[i];
          a.D().w("FetchFrameManager", "getVideoEditorProject: create new project "+obj, objArray);
          this.e = EditorSdk2UtilsV2.createProjectWithFile(obj);
       }
       return this.e;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, FetchFrameManager.class, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FetchFrameManager", "pauseAllTasks: ", objArray);
       this.b = true;
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, FetchFrameManager.class, "19")) {
          return;
       }
       if (this.c != null) {
          Object[] objArray = new Object[0];
          a.D().w("FetchFrameManager", "releaseThumbnailGenerator: mThumbnailGeneratorKey="+this.d, objArray);
          this.c.release();
          this.c = null;
          this.d = "";
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, FetchFrameManager.class, "4")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FetchFrameManager", "resumeAllTasks: ", objArray);
       this.b = false;
       this.d();
       return;
    }
}
