package com.yxcorp.gifshow.util.MultiplePhotosWorkManager;
import com.yxcorp.gifshow.util.z$f;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import gq.a;
import q87.c;
import o56.c;
import o56.a;
import xf6.l;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import java.lang.Long;
import java.util.Map;
import java.lang.StringBuilder;
import crd.b;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo$Status;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import com.yxcorp.gifshow.util.y;
import com.kwai.video.clipkit.log.ClipEditImageImportLog;
import java.lang.System;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.c0;
import java.util.List;
import java.util.concurrent.Callable;
import brd.t;
import lnc.d5;
import erd.o;
import so6.y;
import com.yxcorp.gifshow.util.a0;
import erd.b;
import brd.a0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import io.reactivex.android.schedulers.a;
import lnc.c5;
import com.yxcorp.gifshow.util.b0;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.File;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b;
import com.yxcorp.gifshow.media.util.c;
import qkd.b;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class MultiplePhotosWorkManager implements z$f	// class@001f07
{
    public Context a;
    public Map b;
    public Map c;
    public final z d;
    public String e;

    public void MultiplePhotosWorkManager(Context p0){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = b.b(c.e("MultiplePhotosWorkManager", 4));
       this.e = "";
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "doInBackground MultiplePhotosWorkManager", objArray);
       this.a = p0;
    }
    public static boolean e(){
       boolean b = false;
       if (a.a().c() && l.c("KEY_ENABLE_KEY_MEMORY_TEST", b)) {
          b = true;
       }
       return b;
    }
    public static MultiplePhotosWorkManager f(){
       return MultiplePhotosWorkManager$a.a;
    }
    public static void j(Bitmap p0){
       if (MultiplePhotosWorkManager.e()) {
          return;
       }
       BitmapUtil.J(p0);
       return;
    }
    public MultiplePhotosWorkManager$CropWorkInfo a(long p0){
       MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = this.c.get(Long.valueOf(p0));
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "getWorkInfo workId:"+p0+",cropWorkInfo:"+uCropWorkInf, objArray);
       return uCropWorkInf;
    }
    public boolean b(long p0){
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "MultiplePhotosWorkManager";
       a.D().w(str, "doInBackground workId:"+p0, objArray);
       if (this.b.containsKey(Long.valueOf(p0))) {
          b uob = this.b.get(Long.valueOf(p0));
          if (uob != null && !uob.isDisposed()) {
             objArray = new Object[i];
             a.D().w(str, "doInBackground can cancel", objArray);
             uob.dispose();
             MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = this.c.get(Long.valueOf(p0));
             if (uCropWorkInf != null) {
                MultiplePhotosWorkManager$CropWorkInfo$Status cANCELED = MultiplePhotosWorkManager$CropWorkInfo$Status.CANCELED;
                uCropWorkInf.c(cANCELED);
                Object[] objArray1 = new Object[i];
                a.D().w(str, "notifyPhotoCropTaskCanceled", objArray1);
                uCropWorkInf.c(cANCELED);
                RxBus.f.b(new MultiplePhotosWorkManager$CropPhotoWorkEvent(uCropWorkInf, MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled, null));
             }
             this.b.remove(Long.valueOf(p0));
             this.c.remove(Long.valueOf(p0));
             return true;
          }
       }
       this.b.remove(Long.valueOf(p0));
       this.c.remove(Long.valueOf(p0));
       return i;
    }
    public long c(MultiplePhotosWorkManager$CropWorkInfo p0,MultiplePhotosProject p1,y p2){
       MultiplePhotosWorkManager multiplePhot = this;
       MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = p0;
       multiplePhot.c.put(Long.valueOf(uCropWorkInf.a), uCropWorkInf);
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "doInBackground workInfo:"+uCropWorkInf+",listener:"+p2+"crop work size:"+multiplePhot.c.size(), objArray);
       ClipEditImageImportLog uClipEditIma = new ClipEditImageImportLog();
       Object[] objArray1 = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "generatePhotoCropTasksFromWorkInfo cropWorkInfo:"+uCropWorkInf, objArray1);
       ArrayList uArrayList = new ArrayList();
       c0 uoc0 = new c0(this, uClipEditIma, p0, p1, uArrayList);
       c5 uoc5 = new c5(this, p0, p2, uClipEditIma, System.currentTimeMillis());
       multiplePhot.b.put(Long.valueOf(uCropWorkInf.a), t.fromCallable(v15).subscribeOn(multiplePhot.d).flatMap(new d5(uArrayList)).collect(y.b, a0.b).p(h.b).G(a.c()).R(v15, b0.b));
       return uCropWorkInf.a;
    }
    public final Bitmap d(String p0,Size p1){
       Size b = p1.b;
       p1 = p1.c;
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "decodeTryBest\(\) called with: imagePath = ["+p0+"], max w = "+b+" h="+p1, objArray);
       Bitmap uBitmap = BitmapUtil.w(p0, b, p1, 0, true);
       while (uBitmap == null) {
          a uoa = 1080;
          if (b >= uoa && p1 >= uoa) {
             b = b / 2;
             int i = p1 / 2;
             uBitmap = BitmapUtil.w(p0, b, i, 0, true);
             Object[] objArray1 = new Object[0];
             a.D().w("MultiplePhotosWorkManager", "decodeTryBest\(\) try w = "+b+" h="+i+" bitmap="+uBitmap, objArray1);
          }else {
             break ;
          }
       }
       return uBitmap;
    }
    public final File g(File p0){
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "getNanoTimeFile path:"+p0, objArray);
       long l = (System.currentTimeMillis() * 0xf4240) + (System.nanoTime() % 0xf4240);
       File uFile = new File(p0, l+".jpg");
       if (uFile.exists()) {
          int i = 1;
          while (i < 100) {
             long l1 = (long)i + l;
             uFile = new File(p0, l1+".jpg");
             if (uFile.exists()) {
                i = i + 1;
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "getNanoTimeFile file:"+uFile, objArray1);
       return uFile;
    }
    public final void h(MultiplePhotosWorkManager$CropWorkInfo p0,Workspace$Type p1,String p2){
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosWorkManager", "notifyPhotoCropTaskChanged cropWorkInfo:"+p0, objArray);
       if (p0 == null) {
          return;
       }
       PostUtils.a(p2, "MultiplePhotosWorkManager");
       MultiplePhotosWorkManager$CropPhotoWorkEvent uCropPhotoWo = new MultiplePhotosWorkManager$CropPhotoWorkEvent(p0, MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Changed, p2);
       uCropPhotoWo.e(p1);
       RxBus.f.b(uCropPhotoWo);
       return;
    }
    public final void i(MultiplePhotosWorkManager$CropWorkInfo p0,Workspace$Type p1,String p2,String p3,Size p4){
       Object[] objArray = new Object[0];
       String str = "MultiplePhotosWorkManager";
       a.D().w(str, "notifyPhotoCropTaskChanged cropWorkInfo:"+p0, objArray);
       if (p0 == null) {
          return;
       }
       PostUtils.a(p2, str);
       MultiplePhotosWorkManager$CropPhotoWorkEvent uCropPhotoWo = new MultiplePhotosWorkManager$CropPhotoWorkEvent(p0, MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Changed, p2, p3, p4);
       v7.e(p1);
       RxBus.f.b(v7);
       return;
    }
    public final void k(MultiplePhotosWorkManager$CropWorkInfo p0,MultiplePhotosWorkManager$b p1,File p2,Bitmap p3){
       MultiplePhotosWorkManager multiplePhot = this;
       MultiplePhotosWorkManager$b uob = p1;
       Object obj = p2;
       int i = 0;
       while (i < 3) {
          File uFile = multiplePhot.g(p2.getParentFile());
          Object[] objArray = new Object[0];
          a.D().w("MultiplePhotosWorkManager", "cropPhoto targetFile:"+obj+",tempFile:"+uFile, objArray);
          c.e(null, p3, p3.getWidth(), p3.getHeight(), uob.f, uFile.getAbsolutePath(), true, true);
          if (!b.k0(uFile, obj)) {
             b.q(uFile);
             String str = "saveBitmapToFileFail rename";
             PostUtils.D("MultiplePhotosWorkManager", str, new IllegalStateException(str));
             i = i + 1;
          }else {
             b.q(uFile);
             break ;
          }
       }
       multiplePhot.h(p0, uob.a, p2.getAbsolutePath());
       return;
    }
}
