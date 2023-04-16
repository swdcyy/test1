package com.kwai.statechart.UmlKt$expandCollapsedStates$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class UmlKt$expandCollapsedStates$1 extends Lambda implements l	// class@0018f4
{
    public final String $expanded;
    public final l $oldFilter;

    public void UmlKt$expandCollapsedStates$1(String p0,l p1){
       this.$expanded = p0;
       this.$oldFilter = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UmlKt$expandCollapsedStates$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (!a.g(p0, this.$expanded) && this.$oldFilter.invoke(p0).booleanValue())? true: false;
       return b;
    }
}
