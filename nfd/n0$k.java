package nfd.n0$k;
import nfd.n0$c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zf6.j;
import android.graphics.Typeface;

public class n0$k extends n0$c	// class@001dde
{

    public void n0$k(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$k.class, "1")) {
          return;
       }
       n0$c ta = this.a;
       if (ta != null) {
          ta.setBackgroundResource(this.e());
       }
       ta = this.c;
       if (ta != null) {
          ta.setTextColor(j.d(ta, this.f(R.color.arg_RES_7f0620d1)));
          this.c.setTypeface(Typeface.defaultFromStyle(1));
       }
       this.g(1, 1);
       return;
    }
}
