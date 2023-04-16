package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$onTouchEvent$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.view.MotionEvent;
import java.lang.Object;
import tb5.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.component.homepage_interface.uxmonitor.GestureType;
import java.lang.Math;
import android.view.ViewConfiguration;

public final class InvalidGestureChecker$onTouchEvent$2 extends Lambda implements l	// class@00097c
{
    public final MotionEvent $event;
    public final InvalidGestureChecker this$0;

    public void InvalidGestureChecker$onTouchEvent$2(InvalidGestureChecker p0,MotionEvent p1){
       this.this$0 = p0;
       this.$event = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       GestureType rIGHT_SLIDE;
       if (PatchProxy.applyVoidOneRefs(p0, this, InvalidGestureChecker$onTouchEvent$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       InvalidGestureChecker$onTouchEvent$2 tthis$0 = this.this$0;
       InvalidGestureChecker$onTouchEvent$2 t$event = this.$event;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefs(t$event, p0, tthis$0, InvalidGestureChecker.class, "3") && p0.e == GestureType.UNKNOWN) {
          float f = t$event.getRawX() - p0.a;
          float f1 = Math.abs(f);
          float f2 = t$event.getRawY() - p0.b;
          float f3 = Math.abs(f2);
          if (f1 - (float)tthis$0.d.getScaledPagingTouchSlop() > 0 && (0x3f000000 * f1) - f3 > 0) {
             rIGHT_SLIDE = (f - (float)0 > 0)? GestureType.RIGHT_SLIDE: GestureType.LEFT_SLIDE;
             p0.e(rIGHT_SLIDE);
          }else if(f3 - (float)tthis$0.d.getScaledPagingTouchSlop() > 0 && f3 - f1 > 0){
             rIGHT_SLIDE = (f2 - (float)0 > 0)? GestureType.DOWN_SLIDE: GestureType.UP_SLIDE;
             p0.e(rIGHT_SLIDE);
          }
       }
       return;
    }
}
