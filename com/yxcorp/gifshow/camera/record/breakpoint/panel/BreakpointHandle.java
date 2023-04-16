package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle;
import ml8.d;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import e3a.a;
import java.util.Objects;
import com.yxcorp.utility.n;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import rc9.a;
import java.lang.CharSequence;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.DateUtils;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import java.lang.Boolean;
import lnc.q4;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointBar;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.AbstractMediaPlayer;
import java.lang.Runnable;
import ekd.k1;

public class BreakpointHandle extends LinearLayout implements d	// class@000db3
{
    public float b;
    public float c;
    public float d;
    public float e;
    public TextView f;
    public a g;
    public BreakpointBar h;
    public static final int i;

    static {
       BreakpointHandle.i = a1.e(16.00f);
    }
    public void BreakpointHandle(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, BreakpointHandle.class, "9")) {
          return;
       }
       int i = BreakpointHandle.i;
       Activity uActivity = a.b(this.getContext());
       Objects.requireNonNull(uActivity);
       int i1 = n.k(uActivity) - i;
       float f = (float)n.o(this)[0];
       float f1 = (float)this.getMeasuredWidth() + f;
       float f2 = (float)i;
       if (f - f2 < 0) {
          f2 = f2 - f;
       }else {
          f2 = (float)i1;
          f2 = (f1 - f2 > 0)? f2 - f1: 0;
       }
       this.f.setTranslationX(f2);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, BreakpointHandle.class, "7")) {
          return;
       }
       a p = this.g.p;
       int i = 0;
       BreakpointHandle uBreakpointH = (p.d < p.a || p.j != null)? 1: null;
       BreakpointHandle tf = this.f;
       if (!uBreakpointH) {
          i = 4;
       }
       tf.setVisibility(i);
       this.f.setText(this.getTimeLabel());
       this.a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreakpointHandle.class, "1")) {
          return;
       }
       this.f = m1.f(p0, 0x7f0a0513);
       return;
    }
    public final String getTimeLabel(){
       Object obj = PatchProxy.apply(null, this, BreakpointHandle.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DateUtils.p((long)this.g.p.d);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BreakpointHandle.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.getViewTreeObserver().addOnGlobalLayoutListener(new BreakpointHandle$a(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       BreakpointHandle tg;
       a q;
       a uoa = a.class;
       a uoa1 = a.class;
       BreakpointBar obj = PatchProxy.applyOneRefs(p0, this, BreakpointHandle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_00bb :
                   if (!PatchProxy.applyVoidOneRefs(p0, this, BreakpointHandle.class, "6")) {
                      tg = this.g;
                      Objects.requireNonNull(tg);
                      if (!PatchProxy.applyVoid(null, tg, uoa1, "18")) {
                         uoa1 = tg.p;
                         uoa1.i = b;
                         uoa1.j = true;
                         q = tg.q;
                         Objects.requireNonNull(q);
                         if (!PatchProxy.applyVoid(null, q, uoa, "10") && q.c(true)) {
                            q.a(true);
                         }
                      }
                      this.b();
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(p0, this, BreakpointHandle.class, "5")){
                float f = q4.a((this.c + (p0.getRawX() - this.b)), this.d, this.e);
                obj = this.h.l;
                if (obj) {
                   BreakpointHandle tg1 = this.g;
                   int i = (int)(f / obj);
                   Objects.requireNonNull(tg1);
                   if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tg1, uoa1, "17")) {
                      uoa1 = tg1.p;
                      uoa1.d = i;
                      uoa1.e = i;
                      q = tg1.s;
                      String str = "9";
                      if (q != null && !PatchProxy.applyVoid(null, q, BreakpointPanel.class, str)) {
                         q.f();
                         q.g.a();
                      }
                      q = tg1.q;
                      Objects.requireNonNull(q);
                      if (!PatchProxy.applyVoid(null, q, uoa, str) && q.c(true)) {
                         uoa = q.e;
                         uoa.e = uoa.d;
                         q.f.setOnSeekCompleteListener(null);
                         k1.r(q.l, 40);
                         q.d();
                      }
                   }
                }
                this.f.setText(this.getTimeLabel());
             }
          }else {
             goto label_00bb ;
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, BreakpointHandle.class, "4")){
          this.b = p0.getRawX();
          this.c = this.getTranslationX();
          this.f.setVisibility(b);
          tg = this.g;
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(null, tg, uoa1, "16")) {
             uoa1 = tg.p;
             uoa1.i = true;
             uoa1.j = true;
             q = tg.q;
             Objects.requireNonNull(q);
             if (!PatchProxy.applyVoid(null, q, uoa, "8") && q.c(true)) {
                q.b(b);
                q.g();
             }
          }
       }
       return true;
    }
}
