package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import android.content.Context;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class DetailPendantViewPager extends CustomViewPager	// class@000754
{
    public DetailPendantViewPager$b A;
    public b B;
    public final Handler C;
    public int w;
    public long x;
    public boolean y;
    public boolean z;

    public void DetailPendantViewPager(Context p0){
       super(p0);
       this.x = 3000;
       this.C = new DetailPendantViewPager$a(this);
    }
    public void DetailPendantViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 3000;
       this.C = new DetailPendantViewPager$a(this);
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, DetailPendantViewPager.class, "4")) {
          return;
       }
       if (this.y == null) {
          this.C.removeMessages(0);
          this.C.sendEmptyMessageDelayed(0, this.x);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailPendantViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0.getAction()) {
          if (!PatchProxy.applyVoid(null, this, DetailPendantViewPager.class, "3")) {
             this.C.removeMessages(b);
          }
       }else if(p0.getAction() == 1 || p0.getAction() == 3){
          this.o();
       }
       if (this.z == null && super.onInterceptTouchEvent(p0)) {
          b = true;
       }
       return b;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, DetailPendantViewPager.class, "2")) {
          return;
       }
       this.y = true;
       this.w = 0;
       this.C.removeMessages(0);
       return;
    }
    public void setAutoLoopDuration(long p0){
       this.x = p0;
    }
    public void setForbidGestureSliding(boolean p0){
       this.z = p0;
    }
}
