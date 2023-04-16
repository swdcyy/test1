package com.kwai.statechart.CollapsedSubStateVisitor$realSubChartFilter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.statechart.CollapsedSubStateVisitor;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;

public final class CollapsedSubStateVisitor$realSubChartFilter$1 extends Lambda implements l	// class@0018e2
{
    public final l $collapseSubChartFilter;
    public final CollapsedSubStateVisitor this$0;

    public void CollapsedSubStateVisitor$realSubChartFilter$1(CollapsedSubStateVisitor p0,l p1){
       this.this$0 = p0;
       this.$collapseSubChartFilter = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(String p0){
       CollapsedSubStateVisitor obj = PatchProxy.applyOneRefs(p0, this, CollapsedSubStateVisitor$realSubChartFilter$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       obj = this.this$0.c;
       String str = (obj == null)? null: obj.b();
       boolean b = (!a.g(str, p0) && this.$collapseSubChartFilter.invoke(p0).booleanValue())? true: false;
       return b;
    }
}
