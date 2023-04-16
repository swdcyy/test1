package m90.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.gifshow.kuaishan.ui.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;

public class b extends m	// class@0025ba
{
    public final a c;

    public void b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       KwaiYodaWebViewActivity.L3(tc.e, tc.g);
       return;
    }
}
