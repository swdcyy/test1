package cg9.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import cg9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import lnc.a1;
import android.view.ViewGroup;

public class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005e5
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.b.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int i = a1.d(R.dimen.arg_RES_7f07013a);
       int width = this.b.q.getWidth();
       if (i < width) {
          d t = this.b.t;
          t.setPadding((int)((float)a1.d(R.dimen.arg_RES_7f07012b) + ((float)(width - i) * 0x3f000000)), t.getPaddingTop(), (int)((float)a1.d(R.dimen.arg_RES_7f07012b) + ((float)(width - i) * 0x3f000000)), this.b.t.getPaddingBottom());
       }
       return;
    }
}
