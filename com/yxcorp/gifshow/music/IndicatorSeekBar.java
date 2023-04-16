package com.yxcorp.gifshow.music.IndicatorSeekBar;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.app.Application;
import com.yxcorp.utility.SystemUtil;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.view.WindowManager;
import android.widget.TextView;
import android.content.res.Resources;
import android.widget.SeekBar;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.music.IndicatorSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.utility.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.FrameLayout;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.graphics.Rect;
import android.widget.AbsSeekBar;

public final class IndicatorSeekBar extends KwaiSeekBar	// class@001fce
{
    public float A;
    public float B;
    public final float r;
    public final float s;
    public final float t;
    public WindowManager u;
    public TextView v;
    public final List w;
    public boolean x;
    public final float y;
    public final float z;

    public void IndicatorSeekBar(Context p0){
       super(p0, null);
    }
    public void IndicatorSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void IndicatorSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float f = 20.00f;
       this.r = f;
       this.s = f;
       this.t = 4.00f;
       this.w = new ArrayList();
       this.y = 54.00f;
       this.z = 48.00f;
       TextView systemServic = SystemUtil.e(p0).getSystemService("window");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
       this.u = systemServic;
       systemServic = new TextView(p0);
       this.v = systemServic;
       systemServic.setBackgroundResource(R.drawable.arg_RES_7f08103d);
       IndicatorSeekBar tv = this.v;
       if (tv != null) {
          tv.setGravity(17);
       }
       tv = this.v;
       if (tv != null) {
          tv.setTextColor(this.getResources().getColor(R.color.arg_RES_7f0606da));
       }
       tv = this.v;
       if (tv != null) {
          tv.setTypeface(d0.a("alte-din.ttf", p0));
       }
       tv = this.v;
       if (tv != null) {
          tv.setTextSize(2, f);
       }
       super.setOnSeekBarChangeListener(new IndicatorSeekBar$a(this));
       this.setThumbOffset(n.c(p0, 4.00f));
       return;
    }
    public final void c(SeekBar$OnSeekBarChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IndicatorSeekBar.class, "3")) {
          return;
       }
       a.p(p0, "onSeekBarChangeListener");
       this.w.add(p0);
       return;
    }
    public final float getIndicatorX(){
       Object obj = PatchProxy.apply(null, this, IndicatorSeekBar.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       KwaiSeekBar tb = this.b;
       a.o(tb, "mThumbDrawable");
       return ((((this.B * (float)this.getProgress()) / (float)this.getMax()) + this.A) - ((((float)this.getProgress() - ((float)this.getMax() / 2.00f)) / ((float)this.getMax() / 2.00f)) * (((float)tb.getIntrinsicWidth() / 2.00f) - (float)n.c(this.getContext(), this.t))));
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, IndicatorSeekBar.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.x != null) {
          View view = this.getRootView().findViewById(0x1020002);
          a.o(view, "rootView.findViewById\(android.R.id.content\)");
          view.removeView(this.v);
          this.x = false;
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Drawable obj = PatchProxy.applyOneRefs(p0, this, IndicatorSeekBar.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getAction()) {
          obj = this.getThumb();
          a.o(obj, "thumb");
          Rect bounds = obj.getBounds();
          a.o(bounds, "thumb.bounds");
          Object obj1 = PatchProxy.applyTwoRefs(p0, bounds, this, IndicatorSeekBar.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             float x = p0.getX();
             int i = (bounds.left - this.getThumbOffset()) + this.getPaddingLeft();
             int i1 = bounds.width() + i;
             IndicatorSeekBar tr = this.r;
             b = (x - ((float)i - tr) >= 0 && x - ((float)i1 + tr) <= 0)? true: false;
          }
          if (!b) {
             return false;
          }
       }
       return super.onTouchEvent(p0);
    }
}
