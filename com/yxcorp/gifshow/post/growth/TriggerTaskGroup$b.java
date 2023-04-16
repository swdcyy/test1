package com.yxcorp.gifshow.post.growth.TriggerTaskGroup$b;
import s36.b;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup;
import java.lang.Object;
import s36.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s36.b$a;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import lnc.p3;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import q87.c;
import java.util.List;
import java.lang.Integer;

public final class TriggerTaskGroup$b implements b	// class@000ffa
{
    public final TriggerTaskGroup a;

    public void TriggerTaskGroup$b(TriggerTaskGroup p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, TriggerTaskGroup$b.class, str)) {
          return;
       }
       a.p(p0, "guideItem");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, b$a.class, str)) {
          a.p(p0, "guideItem");
       }
       return;
    }
    public void b(c p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, TriggerTaskGroup$b.class, str)) {
          return;
       }
       String str1 = "guideItem";
       a.p(p0, str1);
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, b$a.class, str)) {
          a.p(p0, str1);
       }
       GrowthGuideItemConfig growthGuideI = p0.c();
       if (growthGuideI != null) {
          if (this.a.a(growthGuideI)) {
             p0.show();
          }else {
             Object[] objArray = new Object[0];
             p3.D().w("PostGrowth", "TriggerTaskGroup condition not fit, item: "+growthGuideI.getOriginInfo(), objArray);
             p0.b("check condition error");
          }
       }
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TriggerTaskGroup$b.class, "1")) {
          return;
       }
       String str = "guideItem";
       a.p(p0, str);
       Integer integer = null;
       if (!PatchProxy.applyVoidTwoRefs(this, p0, integer, b$a.class, "3")) {
          a.p(p0, str);
       }
       this.a.a.remove(p0);
       TriggerTaskGroup$b ta = this.a;
       GrowthGuideItemConfig growthGuideI = p0.c();
       if (growthGuideI != null) {
          integer = Integer.valueOf(growthGuideI.getItemTaskType());
       }
       ta.d(integer);
       return;
    }
    public void d(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TriggerTaskGroup$b.class, "3")) {
          return;
       }
       a.p(p0, "guideItem");
       b$a.a(this, p0);
       this.a.a.remove(p0);
       TriggerTaskGroup$b ta = this.a;
       GrowthGuideItemConfig growthGuideI = p0.c();
       Integer integer = (growthGuideI != null)? Integer.valueOf(growthGuideI.getItemTaskType()): null;
       ta.d(integer);
       return;
    }
}
