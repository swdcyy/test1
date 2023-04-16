package hg9.f1;
import android.view.View$OnTouchListener;
import android.view.View;
import com.yxcorp.gifshow.camera.record.photo.q;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class f1 implements View$OnTouchListener	// class@00265a
{
    public final View b;
    public final q c;

    public void f1(View p0,q p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       boolean b;
       f1 tb = this.b;
       f1 tc = this.c;
       q oq = q.class;
       if (p0 == null) {
          b = false;
       }else if(tb == null){
          tb = p0;
       }
       int action = p1.getAction();
       if (action) {
          if (action != 1) {
             if (action == 3 && !PatchProxy.applyVoidOneRefs(tb, null, oq, "3")) {
                tb.clearAnimation();
             }
          }else if(!PatchProxy.applyVoidTwoRefs(tc, tb, null, oq, "2") && tc.b != null){
             tb.startAnimation(AnimationUtils.loadAnimation(tb.getContext(), tc.b));
          }
       }else if(!PatchProxy.applyVoidTwoRefs(tc, tb, null, oq, "1") && tc.a != null){
          tb.startAnimation(AnimationUtils.loadAnimation(tb.getContext(), tc.a));
       }
       b = p0.onTouchEvent(p1);
       return b;
    }
}
