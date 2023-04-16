package com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutMarginRight$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class GrowthCommonExtKt$layoutMarginRight$1 extends Lambda implements p	// class@001595
{
    public final int $value;

    public void GrowthCommonExtKt$layoutMarginRight$1(int p0){
       this.$value = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(ViewGroup$MarginLayoutParams p0,int p1){
       if (PatchProxy.isSupport(GrowthCommonExtKt$layoutMarginRight$1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GrowthCommonExtKt$layoutMarginRight$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.rightMargin = this.$value;
       return;
    }
}
