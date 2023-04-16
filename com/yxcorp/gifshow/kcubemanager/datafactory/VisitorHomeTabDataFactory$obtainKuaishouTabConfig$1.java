package com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vxa.h;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabModel;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1;
import com.kwai.component.kcube.model.model.TabConfig;

public final class VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1 extends Lambda implements l	// class@0019f6
{
    public final h this$0;

    public void VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1(h p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mTabConfig = this.this$0.d(new VisitorHomeTabDataFactory$obtainKuaishouTabConfig$1$1(this));
       return;
    }
}
