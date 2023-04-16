package com.yxcorp.gifshow.widget.ShadowedFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.n0;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.View;

public class ShadowedFrameLayout extends FrameLayout	// class@0018c4
{
    public n0 b;

    public void ShadowedFrameLayout(Context p0){
       super(p0);
       this.a(p0);
    }
    public void ShadowedFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void ShadowedFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShadowedFrameLayout.class, "1")) {
          return;
       }
       this.b = new n0(p0);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShadowedFrameLayout.class, "3")) {
          return;
       }
       super.dispatchDraw(p0);
       this.b.a(this, p0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ShadowedFrameLayout.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       this.b.b(this);
       return;
    }
}
