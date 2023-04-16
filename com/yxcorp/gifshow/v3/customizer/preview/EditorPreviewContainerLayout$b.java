package com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout$b;
import t36.f$a;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Object;
import nwc.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;

public final class EditorPreviewContainerLayout$b implements f$a	// class@000d52
{
    public final EditorPreviewContainerLayout a;
    public final ViewGroup$MarginLayoutParams b;
    public final boolean c;
    public final boolean d;

    public void EditorPreviewContainerLayout$b(EditorPreviewContainerLayout p0,ViewGroup$MarginLayoutParams p1,boolean p2,boolean p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EditorPreviewContainerLayout$b.class, "1")) {
       }else {
          p0.c(this.a.getLimitRect(), this.a.getOriginLayoutRect(), this.a.getCustomTransformRect());
          PatchProxy.onMethodExit(EditorPreviewContainerLayout$b.class, "1");
       }
       return;
    }
}
