package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$4$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$4;
import java.util.ArrayList;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import zqa.b$d;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$4$2$a;
import java.lang.Runnable;
import ekd.k1;

public final class GrowthTestViewHolder$EditList$onBind$4$2 extends Lambda implements l	// class@001566
{
    public final ArrayList $keys;
    public final GrowthTestViewHolder$EditList$onBind$4 this$0;

    public void GrowthTestViewHolder$EditList$onBind$4$2(GrowthTestViewHolder$EditList$onBind$4 p0,ArrayList p1){
       this.this$0 = p0;
       this.$keys = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$EditList$onBind$4$2.class, "1")) {
          return;
       }
       a.p(p0, "selectedIndexList");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          int i1 = this.$keys.size();
          String str = "";
          if (i >= 0 && i1 > i) {
             String str1 = this.$keys.get(i);
             if (str1 != null) {
                str = str1;
             }
          }
          uArrayList.add(str);
       }
       this.this$0.c.d().invoke(uArrayList);
       k1.r(new GrowthTestViewHolder$EditList$onBind$4$2$a(this), 300);
       return;
    }
}
