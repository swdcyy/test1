package com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewConfiguration;
import android.content.Context;
import lnc.a1;
import io.reactivex.subjects.PublishSubject;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$b;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$a;
import android.util.AttributeSet;
import android.content.res.Configuration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.os.SystemClock;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Runnable;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import java.lang.Number;
import android.graphics.Rect;
import java.lang.Integer;

public class EmotionLongClickRecyclerView extends RecyclerView	// class@000dbe
{
    public EmotionLongClickRecyclerView$c b;
    public float c;
    public float d;
    public float e;
    public float f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;
    public PublishSubject k;
    public EmotionLongClickRecyclerView$b l;
    public static final String m;
    public static final long n;
    public static final int o;

    static {
       EmotionLongClickRecyclerView.m = "EmotionLongClickRecyclerView";
       EmotionLongClickRecyclerView.n = (long)ViewConfiguration.getLongPressTimeout();
       EmotionLongClickRecyclerView.o = ViewConfiguration.get(a1.c()).getScaledTouchSlop();
    }
    public void EmotionLongClickRecyclerView(Context p0){
       super(p0);
       this.h = -1;
       this.j = false;
       this.k = PublishSubject.g();
       this.l = new EmotionLongClickRecyclerView$b(this, null);
    }
    public void EmotionLongClickRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = -1;
       this.j = false;
       this.k = PublishSubject.g();
       this.l = new EmotionLongClickRecyclerView$b(this, null);
    }
    public void EmotionLongClickRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = -1;
       this.j = false;
       this.k = PublishSubject.g();
       this.l = new EmotionLongClickRecyclerView$b(this, null);
    }
    public PublishSubject getConfigSubject(){
       return this.k;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionLongClickRecyclerView.class, "2")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.k.onNext(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EmotionLongClickRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.getAction() & 0x00ff;
       if (i == 3 || i == 1) {
          this.z(p0);
          this.getParent().requestDisallowInterceptTouchEvent(true);
          EmotionLongClickRecyclerView tb = this.b;
          if (tb != null) {
             tb.c();
          }
          this.j = false;
          return false;
       }else if(i){
          if (i == 2) {
             int o = EmotionLongClickRecyclerView.o;
             if (Math.abs((p0.getX() - this.c)) - (float)o > 0 || Math.abs((p0.getY() - this.d)) - (float)o > 0) {
                this.z(p0);
             }
             this.c = p0.getX();
             this.d = p0.getY();
             if ((SystemClock.elapsedRealtime() - this.g) - EmotionLongClickRecyclerView.n > 0) {
                this.z(p0);
                this.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
             }
          }
       }else {
          this.c = p0.getX();
          this.d = p0.getY();
          this.g = SystemClock.elapsedRealtime();
          this.h = -1;
          EmotionLongClickRecyclerView tl = this.l;
          tl.b = this.x(p0);
          this.postDelayed(tl, EmotionLongClickRecyclerView.n);
          this.i = true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       EmotionLongClickRecyclerView obj = PatchProxy.applyOneRefs(p0, this, EmotionLongClickRecyclerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.getAction() & 0x00ff;
       if (!i) {
          this.e = p0.getX();
          this.f = p0.getY();
       }else if(i == 2){
          int o = EmotionLongClickRecyclerView.o;
          if (Math.abs((p0.getX() - this.e)) - (float)o > 0 || Math.abs((p0.getY() - this.f)) - (float)o > 0) {
             this.z(p0);
          }
          this.e = p0.getX();
          this.f = p0.getY();
          if ((SystemClock.elapsedRealtime() - this.g) - EmotionLongClickRecyclerView.n < 0) {
             return super.onTouchEvent(p0);
          }else if(this.j != null){
             this.y(this.x(p0));
             return true;
          }
       }else if(i == 3 || i == 1){
          this.z(p0);
          obj = this.b;
          if (obj != null) {
             obj.c();
          }
          this.j = false;
       }
       return super.onTouchEvent(p0);
    }
    public void setOnLongClickPreviewListener(EmotionLongClickRecyclerView$c p0){
       this.b = p0;
    }
    public final int x(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EmotionLongClickRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int childCount = this.getChildCount();
       Rect rect = new Rect();
       int i2 = -1;
       int i3 = 0;
       while (i3 < childCount) {
          this.getChildAt(i3).getHitRect(rect);
          if (rect.contains(i, i1)) {
             i2 = i3;
             break ;
          }else {
             i3 = i3 + 1;
          }
       }
       return i2;
    }
    public void y(int p0){
       if (PatchProxy.isSupport(EmotionLongClickRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EmotionLongClickRecyclerView.class, "4")) {
          return;
       }
       EmotionLongClickRecyclerView tb = this.b;
       if (tb != null) {
          EmotionLongClickRecyclerView th = this.h;
          if (p0 != th) {
             if (p0 == -1) {
                tb.a();
             }else {
                tb.b(th, p0);
             }
             this.h = p0;
          }
       }
       return;
    }
    public final void z(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionLongClickRecyclerView.class, "6")) {
          return;
       }
       if (this.i != null) {
          this.x(p0);
          this.removeCallbacks(this.l);
          this.i = false;
       }
       return;
    }
}
