package com.yxcorp.gifshow.photo.download.task.l$a;
import gb7.c;
import brd.v;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;
import java.lang.CharSequence;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.Long;

public final class l$a implements c	// class@000f06
{
    public final v a;
    public final File b;
    public final File c;

    public void l$a(v p0,File p1,File p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$a.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       this.a.onError(new IllegalStateException("下载模板被取消"));
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$a.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       b.q0(this.b, "");
       this.a.onNext(this.c);
       this.a.onComplete();
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, l$a.class, "4")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       this.a.onError(new IllegalStateException("下载模板失败 "+p1));
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, l$a.class, "2")) {
          return;
       }
       a.p(p0, "id");
       return;
    }
}
