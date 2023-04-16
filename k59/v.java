package k59.v;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$d;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.l;
import java.util.Objects;
import g59.k0;

public final class v implements AdYodaFragment$d	// class@002b2c
{
    public final f a;

    public void v(f p0){
       this.a = p0;
    }
    public final l a(View p0){
       v ta = this.a;
       Objects.requireNonNull(ta);
       k0.e(p0.findViewById(R.id.title_root));
       return ta.w;
    }
}
