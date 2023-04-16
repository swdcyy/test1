package jg9.s0;
import p79.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import th0.e;
import android.animation.TimeInterpolator;
import jg9.s0$a;
import android.animation.Animator$AnimatorListener;

public class s0 extends h	// class@002ab2
{

    public void s0(){
       super();
    }
    public void Q(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s0.class, "2")) {
          return;
       }
       p0.setAlpha(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       return;
    }
    public ViewPropertyAnimator V(RecyclerView$ViewHolder p0,View p1,ViewPropertyAnimator p2,ArrayList p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, s0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1.setPivotX(((float)p1.getWidth() / 2.00f));
       p1.setPivotY(((float)p1.getHeight() / 2.00f));
       s0$a uoa = new s0$a(this, p0, p2, p1, p3);
       p2.alpha(0).scaleX(0).scaleY(0).setDuration(300).setInterpolator(new e()).setListener(v7);
       return p2;
    }
}
