package com.kuaishou.gifshow.kuaishan.logic.g1;
import com.kwai.video.clipkit.mv.ClipSparkConstructListener;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.String;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import brd.g;
import java.lang.Float;
import kotlin.Pair;
import x80.y1;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;

public class g1 implements ClipSparkConstructListener	// class@001a49
{
    public final List a;
    public final KSTemplateDetailInfo b;
    public final String c;
    public final v d;
    public final String e;

    public void g1(List p0,KSTemplateDetailInfo p1,String p2,v p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, g1.class, "3")) {
          return;
       }
       e.w("loadSdkProjectAsync: onCancel");
       if (!this.a.isEmpty()) {
          h1.o(this.b.mTemplateId, this.c, this.a.get(0));
       }
       return;
    }
    public void onFail(int p0,String p1){
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og1, "4")) {
          return;
       }
       e.v(new IllegalStateException(p1), "errorCode: "+p0+", errorMsg: "+p1);
       if (!this.a.isEmpty()) {
          h1.o(this.b.mTemplateId, this.c, this.a.get(0));
       }
       this.d.onError(new IllegalArgumentException("loadSdkProjectAsync: onFail with errorMsg: "+p1));
       return;
    }
    public void onProgress(float p0){
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, og1, "2")) {
          return;
       }
       if (p0 - 0x3f800000 >= 0) {
          p0 = 0x3f7d70a4;
       }
       this.d.onNext(new Pair(Integer.valueOf((int)(p0 * 100.00f)), null));
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "1")) {
          return;
       }
       e.w("loadSdkProjectAsync: onStart with id: "+p0);
       this.a.add(p0);
       k1.o(new y1(this.b, this.c, p0));
       return;
    }
    public void onSuccess(EditorSdk2MvCreationResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "5")) {
          return;
       }
       e.w("loadSdkProjectAsync: onSuccess");
       if (!this.a.isEmpty()) {
          h1.o(this.b.mTemplateId, this.c, this.a.get(0));
       }
       if (h1.n(p0, this.e, true) == null) {
          this.d.onError(new IllegalArgumentException("loadSdkProjectAsync: onSuccess but invalid editorSdk2MvCreationResult"));
          return;
       }else {
          this.d.onNext(new Pair(Integer.valueOf(100), p0));
          this.d.onComplete();
          return;
       }
    }
}
