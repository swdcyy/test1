package com.kuaishou.gifshow.kuaishan.logic.a$b;
import gb7.c;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.Long;

public final class a$b implements c	// class@0019fa
{
    public final v a;

    public void a$b(v p0){
       this.a = p0;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       Object[] objArray = new Object[0];
       e.D().w("KS_Hodor", "downloadAeBuiltInRes onCompleted: path="+p1, objArray);
       KSDownloadHelperX.o.a().r(p1);
       this.a.onNext(Integer.valueOf(100));
       this.a.onComplete();
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a$b.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       e.D().e("KS_Hodor", "downloadAeBuiltInRes onFailed: ", p1);
       this.a.onError(new KSException(-13, p1.getMessage()));
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, a$b.class, "4")) {
          return;
       }
       a.p(p0, "id");
       long l = (long)100;
       p1 = (p1 * l) / p2;
       if (p1 - l < 0) {
          this.a.onNext(Integer.valueOf((int)p1));
       }
       return;
    }
}
