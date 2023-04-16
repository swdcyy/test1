package com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$a;
import nsd.u;
import ve7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.System;
import ve7.a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$b;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$EventType;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener$c;
import java.lang.Enum;
import java.lang.Math;
import android.view.MotionEvent;

public final class CustomGestureListener extends GestureDetector$SimpleOnGestureListener	// class@001075
{
    public final c b;
    public final ArrayList c;
    public static final CustomGestureListener$a d;

    static {
       CustomGestureListener.d = new CustomGestureListener$a(null);
    }
    public void CustomGestureListener(c p0){
       a.p(p0, "processor");
       super();
       this.b = p0;
       this.c = new ArrayList(10);
    }
    public final long a(){
       return System.currentTimeMillis();
    }
    public final a b(long p0){
       int i;
       if (this.c.isEmpty()) {
          return null;
       }
       CustomGestureListener$b uob = CollectionsKt___CollectionsKt.Y2(this.c);
       switch (CustomGestureListener$c.a[uob.b().ordinal()]){
           case 1:
             i = 3;
             break;
           case 2:
             i = 4;
             break;
           case 3:
           case 4:
             i = 5;
             break;
           case 5:
           case 6:
             i = 2;
             break;
           default:
             i = 1;
       }
       a uoa = new a(i, CollectionsKt___CollectionsKt.m2(this.c).a(), Math.min((uob.a() + 2000), p0));
       return p0;
    }
    public boolean onDoubleTap(MotionEvent p0){
       this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.DOUBLE_TAP, this.a()));
       return super.onDoubleTap(p0);
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       a.p(p0, "e");
       if ((p0.getAction() & 0x00ff) == 1) {
          this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.DOUBLE_EVENT, this.a()));
       }
       return super.onDoubleTapEvent(p0);
    }
    public boolean onDown(MotionEvent p0){
       long l = this.a();
       CustomGestureListener$b uob = 1;
       if (this.c.isEmpty()) {
       }else if(CollectionsKt___CollectionsKt.Y2(this.c).b() == CustomGestureListener$EventType.DOUBLE_TAP){
          uob = null;
       }else {
          a uoa = this.b(l);
          a.m(uoa);
          this.b.a(uoa);
          this.c.clear();
       }
       if (uob) {
          this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.DOWN, l));
       }
       return super.onDown(p0);
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.FLING, this.a()));
       return super.onFling(p0, p1, p2, p3);
    }
    public void onLongPress(MotionEvent p0){
       this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.LONG_PRESS, this.a()));
       super.onLongPress(p0);
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       CustomGestureListener$b uob = CollectionsKt___CollectionsKt.e3(this.c);
       CustomGestureListener uCustomGestu = (uob == null)? null: uob.b();
       CustomGestureListener$EventType sCROLL = CustomGestureListener$EventType.SCROLL;
       if (uCustomGestu == sCROLL) {
          uCustomGestu = this.c;
          uCustomGestu.remove(CollectionsKt___CollectionsKt.Y2(uCustomGestu));
       }
       this.c.add(new CustomGestureListener$b(sCROLL, this.a()));
       return super.onScroll(p0, p1, p2, p3);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       this.c.add(new CustomGestureListener$b(CustomGestureListener$EventType.SINGLE_TAP, this.a()));
       return super.onSingleTapConfirmed(p0);
    }
}
