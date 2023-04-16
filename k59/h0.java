package k59.h0;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$d;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.l;
import java.util.Objects;
import g59.k0;

public final class h0 implements AdYodaFragment$d	// class@002ae1
{
    public final j a;

    public void h0(j p0){
       this.a = p0;
    }
    public final l a(View p0){
       h0 ta = this.a;
       Objects.requireNonNull(ta);
       k0.e(p0.findViewById(R.id.title_root));
       return ta.y;
    }
}
