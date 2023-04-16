package com.kuaishou.live.facemagic.LiveFMEffectRenderView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import h02.b;
import h02.a;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import msd.a;

public final class LiveFMEffectRenderView extends FrameLayout	// class@001bc1
{
    public a b;
    public HashMap c;

    public void LiveFMEffectRenderView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.a();
    }
    public void LiveFMEffectRenderView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.a();
    }
    public void LiveFMEffectRenderView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveFMEffectRenderView.class, "1")) {
          return;
       }
       Context context = this.getContext();
       a.o(context, "context");
       a uoa = d.a(-204054297).CY(context);
       this.b = uoa;
       if (uoa == null) {
          a.S("mFMEffectRenderViewHandler");
       }
       this.addView(uoa.getView(), new FrameLayout$LayoutParams(-1, -1));
       return;
    }
    public final void setEffectPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFMEffectRenderView.class, "3")) {
          return;
       }
       a.p(p0, "filePath");
       LiveFMEffectRenderView tb = this.b;
       if (tb == null) {
          a.S("mFMEffectRenderViewHandler");
       }
       tb.a(p0);
       return;
    }
    public final void setOnCreateCallback(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFMEffectRenderView.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       LiveFMEffectRenderView tb = this.b;
       if (tb == null) {
          a.S("mFMEffectRenderViewHandler");
       }
       tb.b(p0);
       return;
    }
}
