package com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$c;
import gb7.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Throwable;
import java.lang.Long;

public final class KSDownloadHelperX$c implements c	// class@0019f1
{
    public final KSDownloadHelperX a;

    public void KSDownloadHelperX$c(KSDownloadHelperX p0){
       this.a = p0;
       super();
    }
    public void onCancel(String p0,String p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX$c.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       List list = this.a.m(p0);
       if (list != null) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().onCancel();
          }
       }
       iterator = this.a.g.get(p0);
       if (iterator != null) {
          this.a.h.remove(iterator);
          this.a.g.remove(p0);
       }
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSDownloadHelperX$c.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       List list = this.a.m(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSuccess(p1);
          }
       }
       p1 = this.a.g.get(p0);
       if (p1 != null) {
          this.a.h.remove(p1);
          this.a.g.remove(p0);
       }
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KSDownloadHelperX$c.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       List list = this.a.m(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().onFail(-1, p1.getMessage());
          }
       }
       String str = this.a.g.get(p0);
       if (str != null) {
          this.a.h.remove(str);
          this.a.g.remove(p0);
       }
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(KSDownloadHelperX$c.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, KSDownloadHelperX$c.class, "4")) {
          return;
       }
       a.p(p0, "id");
       if (p2 <= 0) {
          return;
       }
       float f = (float)p1 / (float)p2;
       List list = this.a.m(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().onProgress(f);
          }
       }
       return;
    }
}
