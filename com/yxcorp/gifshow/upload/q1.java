package com.yxcorp.gifshow.upload.q1;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import qq.a;
import java.lang.StringBuilder;
import java.util.Set;
import q87.c;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.postwork.e;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import f0c.m;
import java.util.Iterator;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;

public final class q1 implements Runnable	// class@001e9b
{
    public final r1 b;
    public final UploadInfo c;

    public void q1(r1 p0,UploadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       float progress;
       q1 tb = this.b;
       q1 tc = this.c;
       tb.c.put(tc.getId(), tc);
       ArrayList uArrayList = new ArrayList(tb.b);
       Object[] objArray = new Object[0];
       a.D().w("UploadManager", "onProgressChanged: listener size: "+tb.b.size(), objArray);
       PostLogger postLogger = new PostLogger().c("UploadManager").e("UploadManager");
       postLogger.k(tc.mSessionId);
       postLogger.h(PostSubTaskEvent.UPLOAD_EVENT).i(tc.getId()).j(PostLogger$Status.PROCESSING).g("onProgressChanged: progress: "+tc.getProgress()).d();
       e uoe = e.a();
       Objects.requireNonNull(uoe);
       e uoe1 = e.class;
       if (PatchProxy.applyVoidOneRefs(tc, uoe, uoe1, "4")) {
       }else {
          String str = e.c(tc);
          progress = tc.getProgress();
          if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidTwoRefs(str, Float.valueOf(progress), uoe, uoe1, "16")) {
             uoe.g(new m(uoe, str, progress));
          }
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          PostWorkInfo postWorkInfo = tb.h().c4(tc.getId());
          if (postWorkInfo == null || postWorkInfo.getUploadInfo() == null) {
             break ;
          }else {
             UploadInfo uploadInfo = postWorkInfo.getUploadInfo();
             if (uploadInfo.getStatus() == IUploadInfo$Status.FAILED || uploadInfo.getStatus() == IUploadInfo$Status.CANCELED) {
                break ;
             }
          }
          Object[] objArray1 = new Object[0];
          a.D().w("UploadManager", "onProgressChanged: progress: "+tc.getProgress()+", id: "+tc.getId(), objArray1);
          uoa.a(tc.getProgress(), tc);
       }
    label_011a :
       return;
    }
}
