package com.kuaishou.tk.api.view.player.TextureRenderView;
import wx4.a;
import android.view.TextureView;
import com.kuaishou.tk.api.view.player.TextureRenderView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tk.api.view.player.TextureRenderView$c;
import android.util.AttributeSet;
import wx4.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Map;
import com.kuaishou.tk.api.view.player.TextureRenderView$b;
import java.lang.ref.WeakReference;
import android.graphics.SurfaceTexture;
import wx4.a$c;
import nsd.s0;
import wx4.d;
import android.view.View;
import android.view.TextureView$SurfaceTextureListener;
import android.view.accessibility.AccessibilityEvent;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Math;
import com.kuaishou.tk.api.view.player.TextureRenderView$d;
import java.lang.Runnable;

public final class TextureRenderView extends TextureView implements a	// class@000fb5
{
    public d b;
    public TextureRenderView$c c;
    public HashMap d;
    public static final TextureRenderView$a e;

    static {
       TextureRenderView.e = new TextureRenderView$a(null);
    }
    public void TextureRenderView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.c = new TextureRenderView$c();
       this.c();
    }
    public void TextureRenderView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.c = new TextureRenderView$c();
       this.c();
    }
    public void TextureRenderView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c = new TextureRenderView$c();
       this.c();
    }
    public void a(a$b p0){
       TextureRenderView$c i;
       TextureRenderView$b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       TextureRenderView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, TextureRenderView$c.class, "2")) {
          a.p(p0, "callback");
          tc.j.put(p0, p0);
          TextureRenderView textureRende = null;
          if (tc.b != null) {
             i = tc.i;
             TextureRenderView textureRende1 = (i != null)? i.get(): textureRende;
             uob = new TextureRenderView$b(textureRende1, tc.b);
             p0.a(uob, tc.d, tc.e);
          }else {
             uob = textureRende;
          }
          if (tc.c != null) {
             if (uob == null) {
                i = tc.i;
                if (i != null) {
                   textureRende = i.get();
                }
                uob = new TextureRenderView$b(textureRende, tc.b);
             }
             p0.b(uob, 0, tc.d, tc.e);
          }
       }
       return;
    }
    public void b(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       TextureRenderView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, TextureRenderView$c.class, "3")) {
          TextureRenderView$c j = tc.j;
          Objects.requireNonNull(j, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
          s0.k(j).remove(p0);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, TextureRenderView.class, "2")) {
          return;
       }
       this.b = new d(this);
       this.setSurfaceTextureListener(this.c);
       TextureRenderView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(this, tc, TextureRenderView$c.class, "1")) {
          a.p(this, "renderView");
          tc.i = new WeakReference(this);
       }
       return;
    }
    public View getView(){
       return this;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextureRenderView.class, "3")) {
          return;
       }
       TextureRenderView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, TextureRenderView$c.class, "9")) {
          tc.g = true;
       }
       super.onDetachedFromWindow();
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, TextureRenderView$c.class, "10")) {
          tc.h = true;
       }
       return;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView.class, "11")) {
          return;
       }
       a.p(p0, "event");
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName("com.kuaishou.tk.api.view.player.TextureRenderView");
       return;
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView.class, "12")) {
          return;
       }
       a.p(p0, "info");
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName("com.kuaishou.tk.api.view.player.TextureRenderView");
       return;
    }
    public void onMeasure(int p0,int p1){
       int i;
       int i1;
       float f3;
       d e;
       int i4;
       Object obj = this;
       if (PatchProxy.isSupport(TextureRenderView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, TextureRenderView.class, "8")) {
          return;
       }
       TextureRenderView b = obj.b;
       String str = "mMeasureHelper";
       if (b == null) {
          a.S(str);
       }
       Objects.requireNonNull(b);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), b, uod, "1")) {
          uod = b.f;
          d uod1 = 270;
          d uod2 = 90;
          if (uod == uod2 || uod == uod1) {
             i = p0;
             i1 = p1;
          }else {
             i1 = p0;
             i = p1;
          }
          int defaultSize = View.getDefaultSize(b.b, i1);
          int defaultSize1 = View.getDefaultSize(b.c, i);
          if (b.i != 3) {
             if (b.b > null && b.c > null) {
                defaultSize = View$MeasureSpec.getMode(i1);
                i1 = View$MeasureSpec.getSize(i1);
                defaultSize1 = View$MeasureSpec.getMode(i);
                i = View$MeasureSpec.getSize(i);
                float f = Integer.MIN_VALUE;
                if (defaultSize == f && defaultSize1 == f) {
                   float f1 = (float)i1;
                   float f2 = (float)i;
                   f = f1 / f2;
                   d i2 = b.i;
                   if (i2 != null && (i2 != 1 && i2 != 2)) {
                      if (i2 != 4) {
                         if (i2 != 5) {
                            f3 = (float)b.b / (float)b.c;
                            uod2 = b.d;
                            if (uod2 > null) {
                               e = b.e;
                               if (e > null) {
                               label_00d7 :
                                  f3 = (f3 * (float)uod2) / (float)e;
                               }
                            }
                         }else {
                            e = b.f;
                            f3 = (e == uod2 || e == uod1)? 0x3f400000: 0x3faaaaab;
                         }
                      }else {
                         e = b.f;
                         f3 = (e == uod2 || e == uod1)? 0x3f100000: 0x3fe38e39;
                      }
                   }else {
                      f3 = (float)b.b / (float)b.c;
                      uod2 = b.d;
                      if (uod2 > null) {
                         e = b.e;
                         if (e > null) {
                            goto label_00d7 ;
                         }
                      }
                   }
                   uod2 = (f3 - f > 0)? 1: null;
                   if (i2 != null) {
                      if (i2 != 1) {
                         if (i2 != 2) {
                            if (i2 != 4 && i2 != 5) {
                               if (uod2) {
                                  i1 = Math.min(b.b, i1);
                               label_0105 :
                                  i = (int)((float)i1 / f3);
                               }else {
                                  i = Math.min(b.c, i);
                               }
                            }
                         }else if(uod2 != null){
                            i1 = Math.min(b.b, i1);
                            goto label_0105 ;
                         }else {
                            i = Math.min(b.c, i);
                         }
                         i1 = (int)((float)i * f3);
                      }else if(uod2 != null){
                      label_011f :
                         i1 = (int)(f2 * f3);
                      }else {
                      label_011b :
                         i = (int)(f1 / f3);
                      }
                   }
                   if (uod2 != null) {
                      goto label_011b ;
                   }else {
                      goto label_011f ;
                   }
                }else {
                   uod1 = 0x40000000;
                   if (defaultSize == uod1 && defaultSize1 == uod1) {
                      uod1 = b.b;
                      int i3 = uod1 * i;
                      d c = b.c;
                      defaultSize1 = i1 * c;
                      if (i3 < defaultSize1) {
                         i1 = i3 / c;
                      }else if(i3 > defaultSize1){
                         i = defaultSize1 / uod1;
                      }
                   }else if(defaultSize == uod1){
                      i4 = (b.c * i1) / b.b;
                      if (defaultSize1 != f || i4 <= i) {
                         i = i4;
                      }
                   }else if(defaultSize1 == uod1){
                      i4 = (b.b * i) / b.c;
                      if (defaultSize != f || i4 <= i1) {
                         i1 = i4;
                      }
                   }else {
                      uod1 = b.b;
                      uod2 = b.c;
                      if (defaultSize1 == f && uod2 > i) {
                         defaultSize1 = (i * uod1) / uod2;
                      }else {
                         d uod3 = uod1;
                         i = uod2;
                      }
                      if (defaultSize == f && defaultSize1 > i1) {
                         i = (uod2 * i1) / uod1;
                      }else {
                         i1 = defaultSize1;
                      }
                   }
                }
             }else {
                i1 = defaultSize;
                i = defaultSize1;
             }
          }
          b.g = i1;
          b.h = i;
       }
       b = obj.b;
       if (b == null) {
          a.S(str);
       }
       d g = b.g;
       TextureRenderView b1 = obj.b;
       if (b1 == null) {
          a.S(str);
       }
       obj.setMeasuredDimension(g, b1.h);
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, TextureRenderView.class, "1")) {
          return;
       }
       super.requestLayout();
       this.post(new TextureRenderView$d(this));
       return;
    }
    public void setAspectRatio(int p0){
       if (PatchProxy.isSupport(TextureRenderView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextureRenderView.class, "7")) {
          return;
       }
       TextureRenderView tb = this.b;
       if (tb == null) {
          a.S("mMeasureHelper");
       }
       tb.i = p0;
       this.requestLayout();
       return;
    }
    public void setVideoRotation(int p0){
       if (PatchProxy.isSupport(TextureRenderView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextureRenderView.class, "6")) {
          return;
       }
       TextureRenderView tb = this.b;
       if (tb == null) {
          a.S("mMeasureHelper");
       }
       tb.f = p0;
       this.setRotation((float)p0);
       return;
    }
    public void setVideoSampleAspectRatio(int p0,int p1){
       if (PatchProxy.isSupport(TextureRenderView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextureRenderView.class, "5")) {
          return;
       }
       if (p0 > 0 && p1 > 0) {
          TextureRenderView tb = this.b;
          if (tb == null) {
             a.S("mMeasureHelper");
          }
          tb.d = p0;
          tb.e = p1;
          this.requestLayout();
       }
       return;
    }
    public void setVideoSize(int p0,int p1){
       if (PatchProxy.isSupport(TextureRenderView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextureRenderView.class, "4")) {
          return;
       }
       if (p0 > 0 && p1 > 0) {
          TextureRenderView tb = this.b;
          if (tb == null) {
             a.S("mMeasureHelper");
          }
          tb.b = p0;
          tb.c = p1;
          this.requestLayout();
       }
       return;
    }
    public boolean shouldWaitForResize(){
       return false;
    }
}
