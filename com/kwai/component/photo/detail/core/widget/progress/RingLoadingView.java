package com.kwai.component.photo.detail.core.widget.progress.RingLoadingView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.widget.progress.MaterialRingLoadingRenderer;
import com.kwai.component.photo.detail.core.widget.progress.b;
import ke5.d;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.lang.Integer;

public class RingLoadingView extends ImageView	// class@000a3d
{
    public d b;

    public void RingLoadingView(Context p0){
       super(p0);
    }
    public void RingLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoid(null, this, RingLoadingView.class, "1")) {
       }else {
          this.setLoadingRenderer(new MaterialRingLoadingRenderer(this.getContext()));
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RingLoadingView.class, "6")) {
          return;
       }
       if (this.b != null && !this.getVisibility()) {
          this.b.start();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RingLoadingView.class, "7")) {
          return;
       }
       RingLoadingView tb = this.b;
       if (tb != null) {
          tb.stop();
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RingLoadingView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.a();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RingLoadingView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
    public void setLoadingRenderer(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RingLoadingView.class, "2")) {
          return;
       }
       this.setLayerType(1, null);
       d uod = new d(p0);
       this.b = uod;
       this.setImageDrawable(uod);
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(RingLoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RingLoadingView.class, "5")) {
          return;
       }
       super.setVisibility(p0);
       if (!p0) {
          this.a();
       }else {
          this.b();
       }
       return;
    }
}
