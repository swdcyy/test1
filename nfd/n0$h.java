package nfd.n0$h;
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

public class n0$h extends n0$c	// class@001ddb
{

    public void n0$h(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$h.class, "1")) {
          return;
       }
       n0$c ta = this.a;
       if (ta != null) {
          ta.setBackgroundResource(R.drawable.arg_RES_7f081e62);
       }
       ta = this.c;
       if (ta != null) {
          ta.setTextColor(j.d(ta, R.color.arg_RES_7f061e52));
          this.c.setTypeface(Typeface.defaultFromStyle(1));
       }
       this.g(1, 1);
       return;
    }
}
