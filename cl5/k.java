package cl5.k;
import android.view.View$OnClickListener;
import cl5.l;
import java.lang.Object;
import android.view.View;
import ql8.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import xk5.c;

public final class k implements View$OnClickListener	// class@0006f9
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       l q = tb.q;
       if (q != null) {
          a b = tb.p.b;
          if (b instanceof EmotionInfo) {
             q.c(p0, b, tb.r);
          }
       }
       return;
    }
}
