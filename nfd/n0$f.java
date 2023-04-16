package nfd.n0$f;
import nfd.n0$c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import com.yxcorp.plugin.search.utils.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zf6.j;
import android.graphics.Typeface;

public class n0$f extends n0$c	// class@001dd9
{

    public void n0$f(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
       this.b(R.drawable.arg_RES_7f081ebb);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$f.class, "1")) {
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
       this.g(1, false);
       return;
    }
}
