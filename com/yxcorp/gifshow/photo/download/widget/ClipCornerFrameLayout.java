package com.yxcorp.gifshow.photo.download.widget.ClipCornerFrameLayout;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor$a;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;

public final class ClipCornerFrameLayout extends FrameLayout implements ClipCornerProcessor$a	// class@000f27
{
    public final ClipCornerProcessor b;

    public void ClipCornerFrameLayout(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void ClipCornerFrameLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void ClipCornerFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.O);
       a.o(typedArray, "context.obtainStyledAttr¡­le.ClipCornerFrameLayout\)");
       float dimension = typedArray.getDimension(1, 0);
       float dimension1 = typedArray.getDimension(0, 0);
       typedArray.recycle();
       ClipCornerProcessor uClipCornerP = new ClipCornerProcessor(this);
       this.b = uClipCornerP;
       uClipCornerP.e(dimension);
       uClipCornerP.c = dimension1;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerFrameLayout.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       this.b.a(p0);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerFrameLayout.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       this.b.b(p0);
       return;
    }
    public View getView(){
       return this;
    }
    public void j(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerFrameLayout.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       super.draw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ClipCornerFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ClipCornerFrameLayout.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b.d(p0, p1, p2, p3);
       return;
    }
    public void v(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerFrameLayout.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       super.dispatchDraw(p0);
       return;
    }
}
