package cl5.i;
import android.view.View$OnClickListener;
import cl5.j;
import java.lang.Object;
import android.view.View;
import ql8.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import xk5.c;

public final class i implements View$OnClickListener	// class@0006f7
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       j q = tb.q;
       if (q != null) {
          j p = tb.p;
          if (p != null) {
             a b = p.b;
             if (b instanceof EmotionInfo) {
                q.c(p0, b, tb.r);
             }
          }
       }
       return;
    }
}
