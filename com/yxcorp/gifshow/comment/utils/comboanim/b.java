package com.yxcorp.gifshow.comment.utils.comboanim.b;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import il9.d;

public class b implements GestureDetector$OnGestureListener	// class@00110c
{
    public final ComboAnimView b;

    public void b(ComboAnimView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b tb = this.b;
       if (tb.q == null) {
          return;
       }
       tb.g = true;
       tb.e.sendEmptyMessage(2);
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       return true;
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ComboAnimView l = this.b.l;
       if (l != null && l.a(true, false)) {
          this.b.b(false);
       }
       return true;
    }
}
