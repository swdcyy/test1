package com.yxcorp.gifshow.growth.framework.GrowthListFragment$inflate$$inlined$apply$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$inflate$$inlined$apply$lambda$1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import java.lang.Number;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;

public final class GrowthListFragment$inflate$$inlined$apply$lambda$1$1 extends Lambda implements l	// class@001372
{
    public final List $subItemList;
    public final GrowthTestLayout$Companion$d $this_noTitle$inlined;
    public final GrowthListFragment$inflate$$inlined$apply$lambda$1 this$0;

    public void GrowthListFragment$inflate$$inlined$apply$lambda$1$1(List p0,GrowthListFragment$inflate$$inlined$apply$lambda$1 p1,GrowthTestLayout$Companion$d p2){
       this.$subItemList = p0;
       this.this$0 = p1;
       this.$this_noTitle$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthListFragment$inflate$$inlined$apply$lambda$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       Iterator iterator = this.$subItemList.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          String str = pair.component1();
          this.this$0.this$0.ih(p0, str, pair.component2().intValue());
       }
       PatchProxy.onMethodExit(GrowthListFragment$inflate$$inlined$apply$lambda$1$1.class, "1");
       return;
    }
}
