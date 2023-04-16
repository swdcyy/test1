package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vxa.a;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabModel;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1;
import com.kwai.component.kcube.model.model.TabConfig;

public final class ChildHomeTabDataFactory$obtainTabConfig$1 extends Lambda implements l	// class@0019f0
{
    public final a this$0;

    public void ChildHomeTabDataFactory$obtainTabConfig$1(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$obtainTabConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mTabConfig = this.this$0.d(new ChildHomeTabDataFactory$obtainTabConfig$1$1(this));
       return;
    }
}
