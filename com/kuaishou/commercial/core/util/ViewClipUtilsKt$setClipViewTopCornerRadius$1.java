package com.kuaishou.commercial.core.util.ViewClipUtilsKt$setClipViewTopCornerRadius$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import android.graphics.Outline;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ViewClipUtilsKt$setClipViewTopCornerRadius$1 extends Lambda implements p	// class@0014aa
{
    public final int $radius;

    public void ViewClipUtilsKt$setClipViewTopCornerRadius$1(int p0){
       this.$radius = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewClipUtilsKt$setClipViewTopCornerRadius$1.class, "1")) {
          return;
       }
       a.p(p0, "out");
       a.p(p1, "outline");
       ViewClipUtilsKt$setClipViewTopCornerRadius$1 t$radius = this.$radius;
       p1.setRoundRect(0, 0, p0.getWidth(), (p0.getHeight() + t$radius), (float)t$radius);
       return;
    }
}
