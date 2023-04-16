package com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$c;
import erd.g;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule;
import java.lang.Object;
import ujc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wkd.b;
import tjc.c;
import tra.b;
import q87.c;
import crd.a;

public final class BottomFeatureGuideInitModule$c implements g	// class@001699
{
    public final BottomFeatureGuideInitModule b;

    public void BottomFeatureGuideInitModule$c(BottomFeatureGuideInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomFeatureGuideInitModule$c.class, "1")) {
       }else {
          a.p(p0, "event");
          BottomFeatureGuideInitModule$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, BottomFeatureGuideInitModule.class, "3")) {
             if (p0.a == 4 && !b.a(-1608526086).S()) {
                Object[] objArray = new Object[0];
                b.C().s("BottomFeatureGuideInitModule", "SplashStateEvent£ºSplash finish Dialog can show", objArray);
                tb.o0();
             }else {
                tb.r.d();
             }
          }
       }
       return;
    }
}
