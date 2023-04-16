package b3d.j;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import com.kwai.library.widget.popup.common.c;

public final class j implements u	// class@000331
{
    public final GifshowActivity b;
    public final String c;

    public void j(GifshowActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       j tb = this.b;
       m.a("FREEZE_PRODUCTED_POP", "account_unfreeze", null);
       c.i(tb, KwaiWebViewActivity.N3(tb, this.c).a());
       p0.o();
    }
}
