package com.yxcorp.gifshow.relation.explore.view.HorizontalRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewParent;
import android.view.ViewGroup;

public final class HorizontalRecyclerView extends CustomRecyclerView	// class@00188c
{
    public float q;
    public float r;
    public boolean s;

    public void HorizontalRecyclerView(Context p0){
       super(p0, null);
    }
    public void HorizontalRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == 0.00f) {
             if (Math.abs((p0.getX() - this.q)) - Math.abs((p0.getY() - this.r)) > 0 || this.s != null) {
                this.getParent().requestDisallowInterceptTouchEvent(b);
             }else {
                this.getParent().requestDisallowInterceptTouchEvent(false);
             }
          }
       }else {
          this.q = p0.getX();
          this.r = p0.getY();
          this.getParent().requestDisallowInterceptTouchEvent(b);
       }
       return super.dispatchTouchEvent(p0);
    }
    public final boolean getInterceptAll(){
       return this.s;
    }
    public final void setInterceptAll(boolean p0){
       this.s = p0;
    }
}
