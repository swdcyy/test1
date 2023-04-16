package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropRangeView;
import android.view.View;
import android.content.Context;
import android.graphics.RectF;
import lnc.a1;
import android.view.ViewConfiguration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.ImageView;
import java.lang.Float;
import java.lang.Runnable;
import android.os.Handler;
import android.widget.FrameLayout;
import mwc.p;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView$b;

public class KtvCropRangeView extends View	// class@000fbe
{
    public KtvBaseTimeLineView b;
    public CustomHorizontalScroller c;
    public i d;
    public RectF e;
    public RectF f;
    public int g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;

    public void KtvCropRangeView(Context p0){
       super(p0);
       this.e = new RectF();
       this.f = new RectF();
       this.g = a1.e(22.00f);
       this.m = ViewConfiguration.get(a1.c()).getScaledTouchSlop();
       this.setBackgroundResource(R.drawable.arg_RES_7f080fe8);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, KtvCropRangeView.class, "3")) {
          return;
       }
       this.h = 0xbf800000;
       this.k = false;
       this.l = false;
       this.n = false;
       this.c.requestDisallowInterceptTouchEvent(false);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KtvCropRangeView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KtvCropRangeView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       float f = (float)this.getMeasuredHeight();
       this.e.set(0, 0, (float)this.g, f);
       this.f.set((float)(p0 - this.g), 0, (float)p0, f);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       KtvCropRangeView tb1;
       float f2;
       KtvBaseTimeLineView v;
       KtvBaseTimeLineView w;
       KtvCropRangeView obj = PatchProxy.applyOneRefs(p0, this, KtvCropRangeView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean action = p0.getAction();
       boolean b = false;
       boolean b1 = true;
       if (action) {
          if (action != b1) {
             if (action != 2) {
                if (action == 3) {
                label_0128 :
                   if (this.n == null) {
                      this.a();
                   }else {
                      obj = this.k;
                      if (obj != null || this.l != null) {
                         KtvCropRangeView tb = this.b;
                         Objects.requireNonNull(tb);
                         if (!PatchProxy.isSupport(KtvBaseTimeLineView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(obj), tb, KtvBaseTimeLineView.class, "12")) {
                            tb.d.setActivated(b);
                            p op = p.a();
                            float f = 1000.00f;
                            op.i = (obj != null)? (int)((tb.u / tb.i) * f): (int)((tb.v / tb.i) * f);
                            p.r(tb.getProject(), tb.c);
                            p.q(tb.b);
                            tb.z.removeCallbacks(tb.C);
                            if (obj != null) {
                               tb.getPlayer().seekToPlaybackStart();
                               tb.g.setTranslationX(tb.u);
                            }else {
                               f = 2.00f;
                               tb.getPlayer().seekToPlaybackPosition((double)(((float)op.e() / f) - f));
                               tb.g.setTranslationX((tb.v - (tb.i * f)));
                            }
                            tb.getPlayer().play();
                            tb.g.setVisibility(b);
                            tb.h();
                            KtvBaseTimeLineView b2 = tb.B;
                            if (b2 != null) {
                               b2.a(obj, op.c(), op.d());
                            }
                         }
                      }
                      this.a();
                   }
                }
             }else {
                float f1 = p0.getRawX() - this.h;
                if (Math.abs(f1) - (float)this.m >= 0) {
                   if (this.n == null) {
                      this.n = b1;
                      tb1 = this.b;
                      Objects.requireNonNull(tb1);
                      if (!PatchProxy.applyVoid(null, tb1, KtvBaseTimeLineView.class, "11")) {
                         tb1.getPlayer().pause();
                         tb1.g.setVisibility(4);
                      }
                   }
                   if (this.k != null) {
                      tb1 = this.b;
                      f2 = this.i + f1;
                      Objects.requireNonNull(tb1);
                      if (!PatchProxy.isSupport(KtvBaseTimeLineView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f2), tb1, KtvBaseTimeLineView.class, "8")) {
                         v = tb1.v;
                         w = tb1.w;
                         if ((v - f2) - w < 0) {
                            tb1.u = Math.max(0, (v - w));
                            tb1.d.setActivated(b1);
                         }else {
                            tb1.u = Math.max(0, f2);
                            tb1.d.setActivated(b);
                         }
                         tb1.A = tb1.u / tb1.i;
                         if (tb1.f()) {
                            tb1.z.postDelayed(tb1.C, 50);
                         }
                         tb1.h();
                         tb1.requestLayout();
                      }
                   }else if(this.l != null){
                      tb1 = this.b;
                      f2 = this.j + f1;
                      Objects.requireNonNull(tb1);
                      if (!PatchProxy.isSupport(KtvBaseTimeLineView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f2), tb1, KtvBaseTimeLineView.class, "9")) {
                         v = tb1.u;
                         w = tb1.w;
                         if ((f2 - v) - w < 0) {
                            tb1.v = Math.min(tb1.j, (v + w));
                            tb1.d.setActivated(b1);
                         }else {
                            tb1.v = Math.min(tb1.j, f2);
                            tb1.d.setActivated(b);
                         }
                         tb1.A = tb1.v / tb1.i;
                         if (tb1.f()) {
                            tb1.z.postDelayed(tb1.C, 50);
                         }
                         tb1.h();
                         tb1.requestLayout();
                      }
                   }
                }
             }
          }else {
             goto label_0128 ;
          }
       }else {
          this.a();
          action = this.e.contains(p0.getX(), p0.getY());
          boolean b3 = this.f.contains(p0.getX(), p0.getY());
          if (action && b3) {
             if (Math.abs((this.e.centerX() - p0.getX())) - Math.abs((this.f.centerX() - p0.getX())) <= 0) {
                b = action;
                b3 = false;
             }
          }else {
             b = action;
          }
          if (b) {
             this.h = p0.getRawX();
             this.i = this.b.u;
             this.k = b1;
             this.c.requestDisallowInterceptTouchEvent(b1);
             return b1;
          }else if(b3){
             this.h = p0.getRawX();
             this.j = this.b.v;
             this.l = b1;
             this.c.requestDisallowInterceptTouchEvent(b1);
             return b1;
          }
       }
    label_0254 :
       return super.onTouchEvent(p0);
    }
}
