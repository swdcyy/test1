package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import gna.a;
import gna.d$b;
import java.lang.Object;
import gna.b;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import gna.b$a;
import gna.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import msd.l;
import gna.b$b;

public final class GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2 extends Lambda implements p	// class@00134a
{
    public final d$b $pinnedHeader;
    public final a this$0;

    public void GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2(a p0,d$b p1){
       this.this$0 = p0;
       this.$pinnedHeader = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(b p0,boolean p1){
       b$a uoa;
       if (PatchProxy.isSupport(GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2.class, "1")) {
          return;
       }
       a.p(p0, "model");
       if (p0 instanceof b$a) {
          uoa = p0;
          c.b(uoa);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = uoa.w().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj instanceof b$a) {
                uArrayList.add(obj);
             }
          }
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             c.b(iterator.next());
          }
       }
       for (uoa = p0.f(); uoa != null; uoa = uoa.f()) {
          c.b(uoa);
       }
       this.this$0.k0();
       this.$pinnedHeader.g(p0);
       l ol = this.this$0.K0();
       if (ol != null) {
          ol.invoke(this.this$0.J0());
       }
       return;
    }
}
