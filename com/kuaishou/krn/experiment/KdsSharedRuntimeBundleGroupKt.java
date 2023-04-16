package com.kuaishou.krn.experiment.KdsSharedRuntimeBundleGroupKt;
import com.kuaishou.krn.experiment.KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.util.Iterator;
import java.lang.Iterable;
import qj0.c;
import kotlin.jvm.internal.a;

public final class KdsSharedRuntimeBundleGroupKt	// class@0008ba
{
    public static final p a;

    static {
       KdsSharedRuntimeBundleGroupKt.a = s.c(KdsSharedRuntimeBundleGroupKt$enableRuntimeSharedForAll$2.INSTANCE);
    }
    public static final List a(){
       Object obj = PatchProxy.apply(null, null, KdsSharedRuntimeBundleGroupKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KdsSharedRuntimeBundleGroupKt.a.getValue();
    }
    public static final boolean b(){
       Iterator obj = PatchProxy.apply(null, null, KdsSharedRuntimeBundleGroupKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ExpConfigKt.p().iterator();
       while (true) {
          if (obj.hasNext()) {
             Iterator iterator = obj.next().bundleList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(iterator.next(), "WhateverEnableAll")) {
                      return true;
                   }
                }else {
                   continue ;
                }
             }
             return false;
          }else {
             goto label_0044 ;
          }
       }
    }
}
