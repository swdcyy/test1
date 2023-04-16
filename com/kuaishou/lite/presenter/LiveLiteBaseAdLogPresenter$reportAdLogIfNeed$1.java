package com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import z1.a;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1 implements AdDataWrapper$AdLogParamAppender	// class@00093e
{
    public final a $logConsumer;

    public void LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1(a p0){
       this.$logConsumer = p0;
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1.class, "1")) {
          return;
       }
       a.p(p0, "clientAdLog");
       c f = p0.F;
       f.J3 = 1;
       f.p0 = 2;
       LiveLiteBaseAdLogPresenter$reportAdLogIfNeed$1 t$logConsume = this.$logConsumer;
       if (t$logConsume != null) {
          t$logConsume.accept(p0);
       }
       return;
    }
}
