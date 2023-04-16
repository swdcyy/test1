package lod.e;
import gb7.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import nuc.a;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import brd.g;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.Long;
import java.util.HashMap;
import java.lang.System;
import java.util.Map;

public final class e implements c	// class@001c7f
{
    public final Sk2cResourceDownloader a;
    public final a b;
    public final v c;

    public void e(Sk2cResourceDownloader p0,a p1,v p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       Object[] objArray = new Object[0];
       a.D().w("Sk2cResourceDownloader", this.b.r()+" onCancel", objArray);
       e tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       this.a.c(2, p0);
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       Object[] objArray = new Object[0];
       a.D().w("Sk2cResourceDownloader", this.b.r()+" onCompleted", objArray);
       e tc = this.c;
       if (tc != null) {
          tc.onNext(Integer.valueOf(200));
       }
       tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       this.a.c(1, p0);
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       Object[] objArray = new Object[0];
       a.D().w("Sk2cResourceDownloader", this.b.r()+" onFailed", objArray);
       e tc = this.c;
       if (tc != null) {
          tc.onNext(Integer.valueOf(-2));
       }
       tc = this.c;
       if (tc != null) {
          tc.onComplete();
       }
       this.a.c(3, p0);
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e.class, "4")) {
          return;
       }
       a.p(p0, "id");
       if (!this.a.a().containsKey(p0)) {
          this.a.a().put(p0, Long.valueOf(System.currentTimeMillis()));
       }
       if (!p2 - null) {
          return;
       }else {
          int i = (int)((p1 * (long)100) / p2);
          Object[] objArray = new Object[0];
          a.D().s("Sk2cResourceDownloader", this.b.r()+" onProgress: "+i, objArray);
          e tc = this.c;
          if (tc != null) {
             tc.onNext(Integer.valueOf(i));
          }
          return;
       }
    }
}
