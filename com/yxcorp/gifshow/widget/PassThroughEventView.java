package com.yxcorp.gifshow.widget.PassThroughEventView;
import tyc.z1;
import android.view.View;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import tyc.a2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.widget.v;
import java.util.Comparator;
import java.util.Collections;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class PassThroughEventView extends View implements z1	// class@001891
{
    public View b;
    public float c;
    public float d;
    public int e;
    public final List f;
    public static final int g;

    public void PassThroughEventView(Context p0){
       super(p0);
       this.f = new ArrayList();
       this.c(p0);
    }
    public void PassThroughEventView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new ArrayList();
       this.c(p0);
    }
    public void PassThroughEventView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new ArrayList();
       this.c(p0);
    }
    public void a(a2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PassThroughEventView.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       WeakReference weakReferenc = null;
       Iterator iterator = this.f.iterator();
       while (true) {
          if (iterator.hasNext()) {
             WeakReference weakReferenc1 = iterator.next();
             if (weakReferenc1.get() != null && weakReferenc1.get() == p0) {
                weakReferenc = weakReferenc1;
             }
          }
          if (weakReferenc != null) {
             this.f.remove(weakReferenc);
             break ;
          }
          break ;
       }
       return;
    }
    public void b(a2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PassThroughEventView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a(p0);
       this.f.add(new WeakReference(p0));
       if (!PatchProxy.applyVoid(null, this, PassThroughEventView.class, "4") && !this.f.isEmpty()) {
          Collections.sort(this.f, v.b);
       }
       return;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PassThroughEventView.class, "1")) {
          return;
       }
       this.e = ViewConfiguration.get(p0).getScaledPagingTouchSlop();
       this.setTag(R.id.view_status_tag, "ignore");
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a2 obj = PatchProxy.applyOneRefs(p0, this, PassThroughEventView.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, PassThroughEventView.class, "6");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.getTag() instanceof Boolean && this.getTag().booleanValue()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.setTag(Boolean.FALSE);
       }
       if (b) {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next().get();
             if (obj == null || (obj.i() && obj.t(p0))) {
                break ;
             }
          }
          return true;
       }else {
          PassThroughEventView tb = this.b;
          if (tb != null) {
             tb.dispatchTouchEvent(p0);
          }
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc.get() != null && weakReferenc.get().t(p0)) {
                break ;
             }
          }
          if (!p0.getAction()) {
             this.c = p0.getX();
             this.d = p0.getY();
          }else if(p0.getAction() == 1){
             float f = Math.abs((p0.getY() - this.d));
             PassThroughEventView te = this.e;
             if (Math.abs((p0.getX() - this.c)) - (float)te <= 0 && f - (float)te <= 0) {
                this.performClick();
             }
          }
          return true;
       }
    }
    public void setUndersideView(View p0){
       this.b = p0;
    }
}
