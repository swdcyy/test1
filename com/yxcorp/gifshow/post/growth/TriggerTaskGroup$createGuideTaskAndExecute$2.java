package com.yxcorp.gifshow.post.growth.TriggerTaskGroup$createGuideTaskAndExecute$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup;
import android.app.Activity;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import lnc.p3;
import q87.c;
import t46.m;
import z36.c;
import android.view.View;
import t46.h;
import java.util.Map;

public final class TriggerTaskGroup$createGuideTaskAndExecute$2 extends Lambda implements l	// class@000ffc
{
    public final Activity $activity;
    public final TriggerTaskGroup this$0;

    public void TriggerTaskGroup$createGuideTaskAndExecute$2(TriggerTaskGroup p0,Activity p1){
       this.this$0 = p0;
       this.$activity = p1;
       super(1);
    }
    public final t invoke(GrowthGuideItemConfig p0){
       t ot;
       p3 obj = PatchProxy.applyOneRefs(p0, this, TriggerTaskGroup$createGuideTaskAndExecute$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "info");
       int i = 0;
       obj = (!p0.getUiType().length())? 1: null;
       if (obj) {
          Object[] objArray = new Object[i];
          p3.D().A("PostGrowth", "TriggerTaskGroup createGuideTaskAndExecute native modify", objArray);
          ot = t.just(new m(this.$activity, p0, new c(p0.getGuideItemId(), null)));
          a.o(ot, "Observable.just\(\n       ¡­mId, null\)\)\n            \)");
       }else {
          ot = new h(this.$activity).a(p0, this.this$0.h);
       }
       return ot;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
