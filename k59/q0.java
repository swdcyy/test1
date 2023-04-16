package k59.q0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.i;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.j;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;

public final class q0 implements View$OnClickListener	// class@002b05
{
    public final i b;

    public void q0(i p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j s = this.b.a.s;
       if (s != null) {
          s.d();
       }
       return;
    }
}
