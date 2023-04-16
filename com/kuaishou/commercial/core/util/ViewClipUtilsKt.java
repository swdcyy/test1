package com.kuaishou.commercial.core.util.ViewClipUtilsKt;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.commercial.core.util.ViewClipUtilsKt$setClipViewTopCornerRadius$1;
import msd.p;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.core.util.ViewClipUtilsKt$a;
import android.view.ViewOutlineProvider;

public final class ViewClipUtilsKt	// class@0014ac
{

    public static final void a(View p0,int p1){
       ViewClipUtilsKt viewClipUtil = ViewClipUtilsKt.class;
       if (PatchProxy.isSupport(viewClipUtil) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, viewClipUtil, "1")) {
          return;
       }
       ViewClipUtilsKt.b(p0, new ViewClipUtilsKt$setClipViewTopCornerRadius$1(p1));
       return;
    }
    public static final void b(View p0,p p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ViewClipUtilsKt.class, "4")) {
          return;
       }
       a.p(p1, "block");
       if (p0 != null) {
          p0.setClipToOutline(true);
          p0.setOutlineProvider(new ViewClipUtilsKt$a(p1));
       }
       return;
    }
}
