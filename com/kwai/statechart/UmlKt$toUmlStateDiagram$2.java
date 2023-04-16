package com.kwai.statechart.UmlKt$toUmlStateDiagram$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class UmlKt$toUmlStateDiagram$2 extends Lambda implements l	// class@0018f6
{
    public final Set $collapseSubChart;

    public void UmlKt$toUmlStateDiagram$2(Set p0){
       this.$collapseSubChart = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UmlKt$toUmlStateDiagram$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return this.$collapseSubChart.contains(p0);
    }
}
