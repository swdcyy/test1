package com.yxcorp.dynamicfeature.video.redpack.a$a;
import com.kwai.video.editorsdk2.TailEffectGenerator$EventListener;
import com.yxcorp.dynamicfeature.video.redpack.a;
import brd.v;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.io.File;
import java.lang.Object;
import com.kwai.video.editorsdk2.TailEffectGenerator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$c;
import mxc.a;
import brd.g;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import java.lang.Double;

public final class a$a implements TailEffectGenerator$EventListener	// class@0011d8
{
    public final a a;
    public final v b;
    public final Ref$BooleanRef c;
    public final File d;

    public void a$a(a p0,v p1,Ref$BooleanRef p2,File p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onCancelled(TailEffectGenerator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.b.g.onCancelled();
       this.b.onComplete();
       return;
    }
    public void onError(TailEffectGenerator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       p0.element = false;
       this.b.onError(new IllegalStateException("add red packet error"));
       return;
    }
    public void onFinished(TailEffectGenerator p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "3")) {
          return;
       }
       p0.element = false;
       this.b.onNext(this.d.getPath());
       this.b.onComplete();
       return;
    }
    public void onProgress(TailEffectGenerator p0,double p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, a$a.class, "2")) {
          return;
       }
       this.a.b.g.onProgress(p1);
       return;
    }
}
