package kd9.s0;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.frame.o;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public final class s0 implements Runnable	// class@002c69
{
    public final o b;
    public final View c;
    public final Guideline d;
    public final int e;

    public void s0(o p0,View p1,Guideline p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       s0 tb = this.b;
       s0 tc = this.c;
       s0 td = this.d;
       s0 te = this.e;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidThreeRefs(tc, td, Integer.valueOf(te), tb, o.class, "3")) {
          td.setGuidelineEnd((td.getLayoutParams().b + te));
          tc.getLayoutParams().height = tc.getMeasuredHeight() + te;
          tc.requestLayout();
       }
       return;
    }
}
