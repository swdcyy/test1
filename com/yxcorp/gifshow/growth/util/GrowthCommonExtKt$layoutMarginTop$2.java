package com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutMarginTop$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class GrowthCommonExtKt$layoutMarginTop$2 extends Lambda implements l	// class@001597
{
    public static final GrowthCommonExtKt$layoutMarginTop$2 INSTANCE;

    static {
       GrowthCommonExtKt$layoutMarginTop$2.INSTANCE = new GrowthCommonExtKt$layoutMarginTop$2();
    }
    public void GrowthCommonExtKt$layoutMarginTop$2(){
       super(1);
    }
    public final int invoke(ViewGroup$MarginLayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCommonExtKt$layoutMarginTop$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$receiver");
       return p0.topMargin;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
