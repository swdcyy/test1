package com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$a;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.animation.TypeEvaluator;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class AdvertisementFloatingManagerImpl$a implements View$OnTouchListener	// class@00135a
{
    public int b;
    public int c;
    public float d;
    public float e;
    public ValueAnimator f;
    public final WindowManager g;
    public final WindowManager$LayoutParams h;
    public final AdvertisementFloatingManagerImpl i;

    public void AdvertisementFloatingManagerImpl$a(AdvertisementFloatingManagerImpl p0,WindowManager p1,WindowManager$LayoutParams p2){
       this.i = p0;
       super();
       this.g = p1;
       this.h = p2;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       AdvertisementFloatingManagerImpl$a ti;
       AdvertisementFloatingManagerImpl$a th;
       ValueAnimator obj = PatchProxy.applyTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          AdvertisementFloatingManagerImpl$a uoa = 2;
          float f = Float.MIN_VALUE;
          if (action != f) {
             if (action == uoa) {
                this.h.x = this.b + (int)(p1.getRawX() - this.d);
                this.h.y = this.c + (int)(p1.getRawY() - this.e);
                this.g.updateViewLayout(p0, this.h);
                ti = this.i;
                th = this.h;
                ti.b = th.x;
                ti.c = th.y;
             }
          }else {
             th = this.f;
             obj = null;
             if (th != null) {
                th.cancel();
                this.f = obj;
             }
             WindowManager$LayoutParams x = this.h.x;
             if (x != null) {
                Object[] objArray = new Object[uoa];
                objArray[0] = Integer.valueOf(x);
                objArray[f] = Integer.valueOf(false);
                ValueAnimator valueAnimato = ValueAnimator.ofObject(obj, objArray);
                this.f = valueAnimato;
                valueAnimato.setDuration(200);
                this.f.start();
                this.f.addUpdateListener(new AdvertisementFloatingManagerImpl$a$a(this, p0));
                return f;
             }
          }
       }else {
          ti = this.h;
          this.b = ti.x;
          this.c = ti.y;
          this.d = p1.getRawX();
          this.e = p1.getRawY();
       }
       return false;
    }
}
