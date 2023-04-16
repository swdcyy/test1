package com.kwai.widget.customer.mediapreview.t$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.widget.customer.mediapreview.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.util.Pair;
import java.lang.Integer;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p1;
import android.animation.ValueAnimator;
import ix7.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ix7.x;
import android.animation.Animator$AnimatorListener;

public class t$a implements ViewTreeObserver$OnPreDrawListener	// class@001145
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       t$a obj = PatchProxy.apply(null, this, t$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(this, obj, t.class, "8") && !obj.S8()) {
          View view = obj.V8();
          if (view != null) {
             t v = obj.v;
             Rect left = v.left;
             t y = obj.y;
             Rect left1 = y.left;
             v = obj.v;
             left = v.top;
             y = obj.y;
             left1 = y.top;
             v = obj.v;
             t y1 = obj.y;
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             obj.z = valueAnimato;
             s os = new s(obj, view, (((float)(v.right - v.left) * 0x3f800000) / (float)(y1.right - y1.left)), (((float)(v.bottom - v.top) * 0x3f800000) / (float)(y1.bottom - y1.top)), (((((float)((v.right - left) / 2) - ((float)(y.right - left1) / 2.00f)) + (float)left) - (float)left1) - (float)((obj.q.getWidth() - obj.x.first.intValue()) / 2)), ((((((float)((v.bottom - left) / 2) - ((float)(y.bottom - left1) / 2.00f)) + (float)left) - (float)left1) - (float)((obj.q.getHeight() - obj.x.second.intValue()) / 2)) - (float)p1.f(obj.getContext())));
             valueAnimato.addUpdateListener(v10);
             obj.z.setInterpolator(new DecelerateInterpolator());
             obj.z.addListener(new x(obj, this));
             obj.z.setDuration(300);
             obj.z.start();
          }
       }
       return true;
    }
}
