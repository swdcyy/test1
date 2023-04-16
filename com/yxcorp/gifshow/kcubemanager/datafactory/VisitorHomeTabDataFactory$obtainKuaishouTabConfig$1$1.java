package com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1;
import vxa.h;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$4;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1 extends Lambda implements l	// class@0019f5
{
    public final VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1 this$0;

    public void VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1(VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "bottomNav";
       p0.mType = "con_bottomNav";
       p0.mTabName = "µ×µ¼";
       p0.mTabNameEn = "BottomNavigation";
       p0.mTabNameTc = "µ×Œ§";
       boolean b = f.a("isFeaturedMode");
       String str = (b)? "feature": "topHome";
       p0.mDefaultSelectSubTab = str;
       TabConfig[] tabConfigArr = new TabConfig[]{this.this$0.this$0.d(new VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$1(b)),this.this$0.this$0.d(new VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$2(b)),this.this$0.this$0.d(VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$3.INSTANCE),this.this$0.this$0.d(VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1$4.INSTANCE)};
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
