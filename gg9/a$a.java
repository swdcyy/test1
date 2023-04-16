package gg9.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import gg9.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;

public class a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002472
{
    public final ConstraintLayout b;
    public final float c;
    public final a d;

    public void a$a(a p0,ConstraintLayout p1,float p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       int[] ointArray = n.p(this.d.a);
       if (ointArray[0] || ointArray[1]) {
          this.d.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.d.d(this.b, ointArray, this.c);
       }
       return;
    }
}
