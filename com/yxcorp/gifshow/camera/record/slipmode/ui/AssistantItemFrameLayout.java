package com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.record.BoxShadowLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.Float;
import android.widget.ImageView;
import java.lang.Boolean;

public final class AssistantItemFrameLayout extends FrameLayout	// class@000f23
{
    public View b;
    public View c;
    public View d;
    public float e;
    public Float f;
    public BoxShadowLayout g;
    public AppCompatImageView h;
    public static final AssistantItemFrameLayout$a i;

    static {
       AssistantItemFrameLayout.i = new AssistantItemFrameLayout$a(null);
    }
    public void AssistantItemFrameLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       this.e = 0x3f300000;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, AssistantItemFrameLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a2f87);
       this.c = this.findViewById(0x7f0a457b);
       this.d = this.findViewById(0x7f0a133b);
       this.g = this.findViewById(0x7f0a38be);
       this.h = this.findViewById(0x7f0a3433);
       return;
    }
    public final void setFraction(float p0){
       AssistantItemFrameLayout th;
       if (PatchProxy.isSupport(AssistantItemFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AssistantItemFrameLayout.class, "4")) {
          return;
       }
       this.f = Float.valueOf(p0);
       AssistantItemFrameLayout te = this.e;
       float f = 0x3f800000;
       float f1 = te + ((f - te) * p0);
       AssistantItemFrameLayout td = this.d;
       if (td != null) {
          td.setScaleX(f1);
       }
       td = this.d;
       if (td != null) {
          td.setScaleY(f1);
       }
       float f2 = (0.25f * p0) + 0x3f400000;
       te = this.c;
       if (te != null) {
          te.setScaleX(f2);
       }
       te = this.c;
       if (te != null) {
          te.setScaleY(f2);
       }
       te = this.g;
       if (te != null) {
          f2 = (0.33f * p0) + f;
          te.setScaleX(f2);
          te.setScaleY(f2);
       }
       te = this.c;
       if (te != null) {
          te.setAlpha((f - p0));
       }
       te = this.g;
       if (te != null) {
          te.setAlpha((f - p0));
       }
       if (p0 > 0) {
          th = this.h;
          if (th != null) {
             th.setVisibility(4);
          }
       }else {
          th = this.h;
          if (th != null) {
             th.setVisibility(0);
          }
       }
       return;
    }
    public final void setPartitionTranslationX(float p0){
       if (PatchProxy.isSupport(AssistantItemFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AssistantItemFrameLayout.class, "3")) {
          return;
       }
       AssistantItemFrameLayout tb = this.b;
       if (tb != null) {
          tb.setTranslationX(p0);
       }
       return;
    }
    public final void setWhiteCircleVisible(boolean p0){
       AssistantItemFrameLayout tc;
       if (PatchProxy.isSupport(AssistantItemFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AssistantItemFrameLayout.class, "2")) {
          return;
       }
       if (p0) {
          this.e = 0x3f300000;
          tc = this.c;
          if (tc != null) {
             tc.setVisibility(0);
          }
       }else {
          this.e = 0x3f400000;
          tc = this.c;
          if (tc != null) {
             tc.setVisibility(8);
          }
       }
       tc = this.f;
       if (tc != null) {
          a.m(tc);
          this.setFraction(tc.floatValue());
       }
       return;
    }
}
