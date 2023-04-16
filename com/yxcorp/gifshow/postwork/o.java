package com.yxcorp.gifshow.postwork.o;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import f0c.q;
import com.yxcorp.gifshow.postwork.k;
import erd.g;
import crd.b;
import java.lang.String;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import j80.c;
import java.util.Objects;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import android.os.Handler;
import com.kwai.framework.model.user.QCurrentUser;
import f0c.p;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.UploadInfo;
import qkd.c;
import android.os.HandlerThread;
import android.os.Looper;
import qkd.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import haa.f;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import f0c.o;
import t45.c;
import w46.b;
import android.util.Base64;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class o	// class@0010d2
{
    public Handler a;
    public b b;

    public void o(){
       super();
       RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new q(this), k.b);
    }
    public static File c(String p0){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       File obj = PatchProxy.applyOneRefs(p0, null, oo, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInfoCacheHelper", "getCacheDirByUid\(\) called with: uid = ["+p0+"]", objArray);
       if (TextUtils.isEmpty(p0)) {
          objArray1 = new Object[0];
          a.D().A("PostWorkInfoCacheHelper", "uid is empty "+p0, objArray1);
          return null;
       }else {
          File uFile = PatchProxy.apply(null, null, oo, "3");
          if (uFile != patchProxyRe) {
          }else {
             uFile = b.a(-1504323719).h(".upload_work_cache");
          }
          obj = new File(uFile, p0);
          if (!obj.exists()) {
             objArray1 = new Object[0];
             a.D().w("PostWorkInfoCacheHelper", "not exist create "+obj, objArray1);
             if (!obj.mkdirs()) {
                objArray1 = new Object[0];
                a.D().A("PostWorkInfoCacheHelper", "create dir failed "+obj, objArray1);
                return null;
             }
          }
          return obj;
       }
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File parentFile = new File(p0).getParentFile();
       Objects.requireNonNull(parentFile);
       return parentFile.getName();
    }
    public void a(PostWorkInfo p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "5")) {
          return;
       }
       int i = 0;
       String str = "PostWorkInfoCacheHelper";
       if (p0.isDisableFileCache() || !p0.isPublished()) {
          objArray = new Object[i];
          a.D().w(str, "addWorkToCache isDisableFileCache: "+p0.isDisableFileCache()+", isPublished: "+p0.isPublished(), objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "addWorkToCache "+p0.getId(), objArray1);
          this.d().removeCallbacksAndMessages(null);
          objArray = new Object[i];
          a.D().w(str, "addWorkToCache real write info", objArray);
          if (!QCurrentUser.me().isLogined()) {
             return;
          }
          this.d().post(new p(this, p0, QCurrentUser.me().getId(), p0.mCacheId));
          return;
       }
    }
    public synchronized final void b(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostWorkInfoCacheHelper", "deleteWorksFromCache postWorkInfo="+p0.getId(), objArray);
       String id = QCurrentUser.me().getId();
       if (!QCurrentUser.me().isLogined()) {
          PostWorkInfo mUploadInfo = p0.mUploadInfo;
          if (mUploadInfo != null) {
             id = mUploadInfo.getUserId();
          }
       }
       File uFile = o.c(id);
       if (uFile == null) {
          return;
       }else {
          File uFile1 = new File(uFile, p0.mCacheId);
          Object[] objArray1 = new Object[i];
          a.D().w("PostWorkInfoCacheHelper", "deleteWorksFromCache postWorkInfo="+p0.getId()+" "+uFile1, objArray1);
          c.f(uFile1.getPath());
          return;
       }
    }
    public final Handler d(){
       o oo = o.class;
       HandlerThread obj = PatchProxy.apply(null, this, oo, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          _monitor_enter(oo);
          if (this.a == null) {
             obj = new HandlerThread("PostWorkInfoCacheHelper");
             obj.start();
             this.a = new Handler(obj.getLooper());
          }
          _monitor_exit(oo);
       }
       return this.a;
    }
    public final File f(File p0){
       String obj = PatchProxy.applyOneRefs(p0, this, o.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.getName();
       if (b.S(p0)) {
          return p0;
       }
       p0 = new File(DraftFileManager.E().M(), obj);
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInfoCacheHelper", "valid file: "+p0.getAbsoluteFile(), objArray);
       return p0;
    }
    public final void g(UploadInfo p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "9")) {
          return;
       }
       p0.mCoverFile = this.f(p0.mCoverFile);
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("PostWorkInfoCacheHelper", "refreshStoryUploadInfo setCoverFile: "+p0.mCoverFile, objArray);
       if (!TextUtils.isEmpty(p0.getFilePath())) {
          p0.mFilePath = this.f(new File(p0.getFilePath())).getAbsolutePath();
       }
       AtlasInfo atlasInfo = p0.getAtlasInfo();
       if (atlasInfo == null) {
          return;
       }else if(!TextUtils.isEmpty(atlasInfo.getCoverFilePath())){
          atlasInfo.setCoverFilePath(this.f(new File(atlasInfo.getCoverFilePath())).getAbsolutePath());
       }
       if (!q.f(atlasInfo.mDonePictures)) {
          uArrayList = new ArrayList();
          for (int i1 = 0; i1 < atlasInfo.mPictureFiles.size(); i1 = i1 + 1) {
             uArrayList.add(this.f(new File(atlasInfo.mPictureFiles.get(i1))).getAbsolutePath());
          }
          atlasInfo.mPictureFiles = uArrayList;
       }
       if (!q.f(atlasInfo.mDonePictures)) {
          uArrayList = new ArrayList();
          for (; i < atlasInfo.mDonePictures.size(); i = i + 1) {
             uArrayList.add(this.f(new File(atlasInfo.mDonePictures.get(i))).getAbsolutePath());
          }
          atlasInfo.mDonePictures = uArrayList;
       }
       return;
    }
    public void h(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInfoCacheHelper", "removeWorkFromCache "+p0.getId(), objArray);
       c.a(new o(this, p0));
       return;
    }
    public synchronized final void i(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkInfoCacheHelper", "writeWorksToCache uid: "+p0+" cacheId="+p1, objArray);
       File uFile = o.c(p0);
       if (uFile == null) {
          return;
       }
       if (TextUtils.isEmpty(p2)) {
          Object[] objArray1 = new Object[0];
          a.D().t("PostWorkInfoCacheHelper", "writeWorksToCache jsonWorkInfo is empty "+p2, objArray1);
          return;
       }else {
          File uFile1 = new File(uFile, p1);
          if (!PostUtils.I(uFile1, Base64.encodeToString(p2.getBytes(), 0))) {
             PostUtils.D("PostWorkInfoCacheHelper", "writeWorksToCache\(\) failed "+uFile1, new IllegalStateException(uFile1.toString()));
          }
          return;
       }
    }
}
