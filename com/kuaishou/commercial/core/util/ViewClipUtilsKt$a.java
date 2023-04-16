package com.kuaishou.commercial.core.util.ViewClipUtilsKt$a;
import android.view.ViewOutlineProvider;
import msd.p;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ViewClipUtilsKt$a extends ViewOutlineProvider	// class@0014a9
{
    public final p a;

    public void ViewClipUtilsKt$a(p p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ViewClipUtilsKt$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       this.a.invoke(p0, p1);
       PatchProxy.onMethodExit(ViewClipUtilsKt$a.class, "1");
       return;
    }
}
