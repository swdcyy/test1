package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1$1;
import vxa.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1$2;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1$3;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ChildHomeTabDataFactory$obtainTabConfig$1$1 extends Lambda implements l	// class@0019ef
{
    public final ChildHomeTabDataFactory$obtainTabConfig$1 this$0;

    public void ChildHomeTabDataFactory$obtainTabConfig$1$1(ChildHomeTabDataFactory$obtainTabConfig$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$obtainTabConfig$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "bottomNav";
       p0.mType = "con_bottomNav";
       p0.mTabName = "µ×µ¼";
       p0.mTabNameEn = "BottomNavigation";
       p0.mTabNameTc = "µ×Œ§";
       p0.mDefaultSelectSubTab = "topHome";
       TabConfig[] tabConfigArr = new TabConfig[]{this.this$0.this$0.d(new ChildHomeTabDataFactory$obtainTabConfig$1$1$1(this)),this.this$0.this$0.d(new ChildHomeTabDataFactory$obtainTabConfig$1$1$2(this)),this.this$0.this$0.d(ChildHomeTabDataFactory$obtainTabConfig$1$1$3.INSTANCE)};
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
