package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$onBindViewHolder$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import gna.a;
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
import gna.d;
import gna.d$b;
import msd.l;
import gna.b$b;

public final class GrowthCleanerAdapter$onBindViewHolder$3 extends Lambda implements p	// class@00134d
{
    public final a this$0;

    public void GrowthCleanerAdapter$onBindViewHolder$3(a p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(b p0,boolean p1){
       if (PatchProxy.isSupport(GrowthCleanerAdapter$onBindViewHolder$3.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, GrowthCleanerAdapter$onBindViewHolder$3.class, "1")) {
          return;
       }
       a.p(p0, "model");
       if (p0 instanceof b$a) {
          b$a uoa = p0;
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
       for (b$a uoa1 = p0.f(); uoa1 != null; uoa1 = uoa1.f()) {
          c.b(uoa1);
       }
       this.this$0.k0();
       a i = this.this$0.i;
       if (i != null) {
          b uob = (i != null)? i.e(): null;
          i.g(uob);
       }
       l ol = this.this$0.K0();
       if (ol != null) {
          ol.invoke(this.this$0.J0());
       }
       return;
    }
}
