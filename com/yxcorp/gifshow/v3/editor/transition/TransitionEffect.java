package com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.io.Serializable;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import nsd.u;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.AssetTransition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.lang.StringBuilder;
import lnc.a1;

public final class TransitionEffect implements Serializable	// class@001515
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final double f;
    public final double g;
    public final double h;
    public final int mSdkId;
    public static final TransitionEffect$a Companion;
    public static final TransitionEffect DEFAULT_EFFECT;
    public static final ImmutableMap TRANSITION_MAP;

    static {
       TransitionEffect.Companion = new TransitionEffect$a(null);
       TransitionEffect transitionEf = new TransitionEffect(0, 1, 0x7f1039a6, 0x7f080897, 0x7f081c66, 0, 0, 0);
       TransitionEffect.DEFAULT_EFFECT = v0;
       double d = (double)0x3efae148;
       double d1 = d;
       double d2 = d;
       double d3 = d;
       transitionEf = new TransitionEffect(3, 2, 0x7f100caf, 0x7f081c6a, 0x7f08089b, d1, d2, 0);
       double d4 = d3;
       TransitionEffect transitionEf1 = new TransitionEffect(1, 3, 0x7f100cad, 0x7f081c61, 0x7f080898, 0, d4, 0x3fc999999999999a);
       ImmutableMap$b uob = ImmutableMap.builder().c(Integer.valueOf(v0.mSdkId), v0).c(Integer.valueOf(3), v14).c(Integer.valueOf(1), transitionEf);
       transitionEf1 = new TransitionEffect(2, 4, 0x7f100cae, 0x7f081c98, 0x7f08089f, 0, d4, 0x3fc999999999999a);
       uob = uob.c(Integer.valueOf(2), transitionEf);
       double d5 = d3;
       transitionEf1 = new TransitionEffect(4, 5, 0x7f100cac, 0x7f081c62, 0x7f080899, d5, d4, 0);
       uob = uob.c(Integer.valueOf(4), transitionEf);
       transitionEf1 = new TransitionEffect(5, 6, 0x7f100cb1, 0x7f081c75, 0x7f08089c, d5, d4, 0);
       uob = uob.c(Integer.valueOf(5), transitionEf);
       transitionEf1 = new TransitionEffect(6, 7, 0x7f100cb2, 0x7f081c93, 0x7f08089d, d5, d4, 0);
       uob = uob.c(Integer.valueOf(6), transitionEf);
       transitionEf1 = new TransitionEffect(12, 8, 0x7f100cb3, 0x7f081c9a, 0x7f0808a0, d5, d4, 0);
       uob = uob.c(Integer.valueOf(12), transitionEf);
       transitionEf1 = new TransitionEffect(10, 9, 0x7f100cb0, 0x7f081c94, 0x7f08089e, 0, d4, 0x3fd3333333333333);
       ImmutableMap immutableMap = uob.c(Integer.valueOf(10), transitionEf).a();
       a.o(immutableMap, "ImmutableMap.builder<Int¡­\), 0.3\)\)\n        .build\(\)");
       TransitionEffect.TRANSITION_MAP = immutableMap;
    }
    public void TransitionEffect(int p0,int p1,int p2,int p3,int p4,double p5,double p6,double p7){
       super();
       this.mSdkId = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final double getMAnimationTime(){
       return this.g;
    }
    public final double getMCostTime(){
       return this.f;
    }
    public final int getMIconRes(){
       return this.d;
    }
    public final int getMIndicatorRes(){
       return this.e;
    }
    public final int getMLogId(){
       return this.b;
    }
    public final int getMNameRes(){
       return this.c;
    }
    public final int getMSdkId(){
       return this.mSdkId;
    }
    public final double getMSnapToEdgeOffsetTime(){
       return this.h;
    }
    public final AssetTransition toAssetTransition(){
       AssetTransition obj = PatchProxy.apply(null, this, TransitionEffect.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DraftUtils.h(this.mSdkId, this.g);
       a.o(obj, "DraftUtils.createAssetTr¡­n\(mSdkId, mAnimationTime\)");
       return obj;
    }
    public final Minecraft$TransitionParam toEditorTransitionParam(){
       Minecraft$TransitionParam obj = PatchProxy.apply(null, this, TransitionEffect.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$TransitionParam();
       obj.setType(this.mSdkId);
       obj.setDuration(this.g);
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TransitionEffect.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mSdkId)+" "+a1.p(this.c);
    }
}
