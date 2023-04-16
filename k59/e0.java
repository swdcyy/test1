package k59.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.e;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.f;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;

public final class e0 implements View$OnClickListener	// class@002ad5
{
    public final e b;

    public void e0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f s = this.b.a.s;
       if (s != null) {
          s.d();
       }
       return;
    }
}
