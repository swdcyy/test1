package com.kwai.sdk.eve.internal.task.EveTask$luaVm$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zn7.a;
import vm7.a;
import java.lang.Object;
import ln7.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$Companion;
import ao7.a;
import tn7.b;
import ml5.a;

public final class EveTask$luaVm$2 extends Lambda implements a	// class@0015bc
{
    public final a $eveContext;
    public final a this$0;

    public void EveTask$luaVm$2(a p0,a p1){
       this.this$0 = p0;
       this.$eveContext = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final i invoke(){
       i obj = PatchProxy.apply(null, this, EveTask$luaVm$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context uContext = this.$eveContext.a();
       a.m(uContext);
       String str = (EveGlobalFeatureCalculator.Companion.isGlobalFeaturePipeline(this.this$0.n()))? "global": "featured";
       obj = new i(uContext, str);
       a uoa = this.this$0.h();
       if (uoa != null) {
          b uob = uoa.R3();
          if (uob != null) {
             uob = uob.version;
             if (uob != null) {
             label_0046 :
                obj.f("taskId", new a(this.this$0.n()));
                obj.f("version", new a(uob));
                return obj;
             }
          }
       }
       String str1 = "";
       goto label_0046 ;
    }
}
