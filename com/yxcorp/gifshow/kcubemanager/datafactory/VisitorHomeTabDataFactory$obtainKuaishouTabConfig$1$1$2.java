package com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2 extends Lambda implements l	// class@0019f2
{
    public final boolean $isFeatureMode;

    public void VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2(boolean p0){
       this.$isFeatureMode = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       if (this.$isFeatureMode != null) {
          p0.mId = "feature";
          p0.mType = "ato_feature";
          p0.mTabName = "精选";
          p0.mTabNameEn = "Nearby";
          p0.mTabNameTc = "精選";
       }else {
          p0.mId = "fakeTab_nearby";
          p0.mType = "ato_fakeTab";
          p0.mTabName = "同城";
          p0.mTabNameEn = "Nearby";
          p0.mTabNameTc = "同城";
       }
       return;
    }
}
