package bf6.d;
import u07.u;
import bf6.h;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import jyc.b;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;

public final class d implements u	// class@000491
{
    public final h b;
    public final Activity c;

    public void d(h p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, h.class, "7")) {
       }else {
          tb.c(false);
          KwaiYodaWebViewActivity.L3(tc, b.e(WebEntryUrls.d, 1));
       }
       return;
    }
}
