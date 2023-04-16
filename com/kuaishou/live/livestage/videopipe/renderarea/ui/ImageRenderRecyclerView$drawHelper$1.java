package com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView$drawHelper$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView;
import java.lang.Object;
import android.graphics.Canvas;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ImageRenderRecyclerView$drawHelper$1 extends Lambda implements q	// class@000c0d
{
    public final ImageRenderRecyclerView this$0;

    public void ImageRenderRecyclerView$drawHelper$1(ImageRenderRecyclerView p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1.intValue(), p2.intValue());
       return l1.a;
    }
    public final void invoke(Canvas p0,int p1,int p2){
       if (PatchProxy.isSupport(ImageRenderRecyclerView$drawHelper$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ImageRenderRecyclerView$drawHelper$1.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       ImageRenderRecyclerView.x(this.this$0, p0);
       return;
    }
}
