package com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$a;
import z3b.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z3b.e;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import faa.a;
import q87.c;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.StringBuilder;

public final class EffectMagicDataProvider$a implements f	// class@000f4c
{
    public final Ref$ObjectRef a;
    public final v b;

    public void EffectMagicDataProvider$a(Ref$ObjectRef p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectMagicDataProvider$a.class, "1")) {
          return;
       }
       a.p(p0, "magicFace");
       e.b(this, p0);
       if (a.g(p0.mId, this.a.element.mId)) {
          Object[] objArray = new Object[0];
          a.D().s("EffectMagicDataProvider", "loadDataItem download complete", objArray);
          this.b.onNext(Integer.valueOf(100));
          this.b.onComplete();
       }
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectMagicDataProvider$a.class, "2")) {
          return;
       }
       a.p(p0, "magicFace");
       e.c(this, p0, p1);
       if (a.g(p0.mId, this.a.element.mId)) {
          this.b.onError(new IllegalStateException("download task failed"));
       }
       int i = (PostExperimentUtils.p())? 0x7f100b8e: 0x7f100b8d;
       i.d(R.style.arg_RES_7f110668, a1.p(i));
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       if (PatchProxy.isSupport(EffectMagicDataProvider$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EffectMagicDataProvider$a.class, "3")) {
          return;
       }
       a.p(p0, "magicFace");
       e.d(this, p0, p1, p2);
       if (a.g(p0.mId, this.a.element.mId)) {
          Object[] objArray = new Object[0];
          a.D().s("EffectMagicDataProvider", "progress : "+p1, objArray);
          this.b.onNext(Integer.valueOf(p1));
       }
       return;
    }
}
