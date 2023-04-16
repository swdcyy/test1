package com.kuaishou.krn.experiment.KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qj0.c;
import trd.t;

public final class KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2 extends Lambda implements a	// class@0008b9
{
    public static final KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2 INSTANCE;

    static {
       KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2.INSTANCE = new KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2();
    }
    public void KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k(new c(t.k("WhateverEnableAll")));
    }
}
