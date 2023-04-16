package com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.d0;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import hkd.b;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import dnc.d2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.upload.d0$a;
import com.yxcorp.gifshow.upload.e0$b;
import com.yxcorp.gifshow.upload.e0$a;
import java.util.Set;
import f36.b;
import crd.b;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class e0 implements d0	// class@001e75
{
    public d2 a;
    public final Handler b;
    public final Set c;
    public final Map d;
    public final Map e;
    public final Executor f;

    public void e0(){
       super();
       this.b = new Handler(Looper.getMainLooper());
       this.c = new HashSet();
       this.d = new LinkedHashMap();
       this.e = new HashMap();
       this.f = Executors.newFixedThreadPool(3, new b("local-music"));
       this.a = new d2();
    }
    public boolean X(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       LocalMusicUploadInfo localMusicUp = this.d.get(p0);
       if (localMusicUp == null || localMusicUp.getStatus() != IUploadInfo$Status.FAILED) {
          return false;
       }
       this.a(localMusicUp);
       return true;
    }
    public final void a(LocalMusicUploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "3")) {
          return;
       }
       p0.mStatus = IUploadInfo$Status.PENDING;
       p0.mProgress = 0;
       e0$c uoc = new e0$c(this, p0);
       this.e.put(p0.getFileId(), uoc);
       this.c(p0);
       this.f.execute(uoc);
       return;
    }
    public void b(LocalMusicUploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "10")) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          this.d.put(p0.getFileId(), p0);
          p0 = p0.clone();
          Iterator iterator = new ArrayList(this.c).iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0.getProgress(), p0);
          }
       }else {
          this.b.post(new e0$b(this, p0.clone()));
       }
       return;
    }
    public LocalMusicUploadInfo b3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get(p0);
    }
    public void c(LocalMusicUploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "9")) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          if (p0.getStatus() != IUploadInfo$Status.COMPLETE && p0.getStatus() != IUploadInfo$Status.CANCELED) {
             this.d.put(p0.getFileId(), p0);
          }else {
             this.d.remove(p0.getFileId());
          }
          Iterator iterator = new ArrayList(this.c).iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0.getStatus(), p0);
          }
       }else {
          this.b.post(new e0$a(this, p0.clone()));
       }
       return;
    }
    public void c3(d0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "8")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public boolean cancel(String p0){
       LocalMusicUploadInfo obj = PatchProxy.applyOneRefs(p0, this, e0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d.remove(p0);
       if (obj != null && obj.getStatus() != IUploadInfo$Status.UPLOADING) {
          obj.mStatus = IUploadInfo$Status.CANCELED;
          this.c(obj);
          return true;
       }else {
          e0$c uoc = this.e.get(p0);
          if (uoc == null) {
             return false;
          }
          if (!PatchProxy.applyVoid(null, uoc, e0$c.class, "4")) {
             uoc.c = true;
             e0$c h = uoc.h;
             if (h != null) {
                h.cancel();
             }
             h = uoc.i;
             if (h != null) {
                h.dispose();
             }
             uoc.a();
          }
          return true;
       }
    }
    public String d3(LocalMusicUploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a(p0);
       return p0.getFileId();
    }
    public List e3(IUploadInfo$Status[] p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, this, e0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       if (p0 == null || !p0.length) {
          p0 = new IUploadInfo$Status[]{IUploadInfo$Status.PENDING,IUploadInfo$Status.UPLOADING,IUploadInfo$Status.COMPLETE};
       }
       Collections.addAll(obj, p0);
       LinkedList linkedList = new LinkedList();
       Iterator iterator = this.d.values().iterator();
       while (iterator.hasNext()) {
          LocalMusicUploadInfo localMusicUp = iterator.next();
          if (obj.contains(localMusicUp.getStatus())) {
             linkedList.add(localMusicUp);
          }
       }
       return linkedList;
    }
    public void f3(d0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "7")) {
          return;
       }
       this.c.add(p0);
       return;
    }
}
