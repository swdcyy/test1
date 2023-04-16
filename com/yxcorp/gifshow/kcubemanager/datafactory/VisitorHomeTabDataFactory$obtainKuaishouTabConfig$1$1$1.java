package com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1 extends Lambda implements l	// class@0019f1
{
    public final boolean $isFeatureMode;

    public void VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1(boolean p0){
       this.$isFeatureMode = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       if (this.$isFeatureMode != null) {
          p0.mId = "fakeTab_topHome";
          p0.mType = "ato_fakeTab";
       }else {
          p0.mId = "feature";
          p0.mType = "ato_feature";
       }
       p0.mTabName = "Ê×Ò³";
       p0.mTabNameEn = "Home";
       p0.mTabNameTc = "Ê×í“";
       return;
    }
}
