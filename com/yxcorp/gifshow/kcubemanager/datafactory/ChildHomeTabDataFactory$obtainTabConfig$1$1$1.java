package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1;
import java.util.Objects;
import vxa.a;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createHomeSubConfigs$1;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createHomeSubConfigs$2;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ChildHomeTabDataFactory$obtainTabConfig$1$1$1 extends Lambda implements l	// class@0019ec
{
    public final ChildHomeTabDataFactory$obtainTabConfig$1$1 this$0;

    public void ChildHomeTabDataFactory$obtainTabConfig$1$1$1(ChildHomeTabDataFactory$obtainTabConfig$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$obtainTabConfig$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "topHome";
       p0.mType = "con_topHome";
       p0.mTabName = "Ê×Ò³";
       p0.mTabNameEn = "Home";
       p0.mTabNameTc = "Ê×í“";
       ChildHomeTabDataFactory$obtainTabConfig$1 this$0 = this.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       ArrayList uArrayList = PatchProxy.apply(null, this$0, a.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          TabConfig[] tabConfigArr = new TabConfig[]{this$0.d(ChildHomeTabDataFactory$createHomeSubConfigs$1.INSTANCE),this$0.d(ChildHomeTabDataFactory$createHomeSubConfigs$2.INSTANCE)};
          uArrayList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       }
       p0.mSubTabList = uArrayList;
       return;
    }
}
