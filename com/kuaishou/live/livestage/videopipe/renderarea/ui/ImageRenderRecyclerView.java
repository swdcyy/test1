package com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderOverlayRecyclerView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import se3.e;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView$drawHelper$1;
import msd.q;
import android.util.AttributeSet;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.ImageRenderRecyclerView$a;
import android.view.View$OnLayoutChangeListener;

public final class ImageRenderRecyclerView extends RenderOverlayRecyclerView	// class@000c0e
{
    public final e b;
    public ViewGroup c;

    public void ImageRenderRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = new e(new ImageRenderRecyclerView$drawHelper$1(this));
    }
    public void ImageRenderRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = new e(new ImageRenderRecyclerView$drawHelper$1(this));
    }
    public void ImageRenderRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new e(new ImageRenderRecyclerView$drawHelper$1(this));
    }
    public static final void x(ImageRenderRecyclerView p0,Canvas p1){
       super.draw(p1);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageRenderRecyclerView.class, "2")) {
          return;
       }
       a.p(p0, "c");
       ImageRenderRecyclerView tb = this.b;
       ImageRenderRecyclerView tc = this.c;
       if (tc == null) {
          a.S("videoContainer");
       }
       tb.a(p0, tc);
       return;
    }
    public final void y(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageRenderRecyclerView.class, "1")) {
          return;
       }
       a.p(p0, "videoContainer");
       this.c = p0;
       p0.addOnLayoutChangeListener(new ImageRenderRecyclerView$a(this));
       return;
    }
}
