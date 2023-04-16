package j21.j;
import vq5.b;
import j21.k;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public final class j implements b	// class@002a41
{
    public final k a;

    public void j(k p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       j ta = this.a;
       Objects.requireNonNull(ta);
       ta.P = p0.getBooleanQueryParameter("blockinsertguide", false);
       String queryParamet = p0.getQueryParameter("interjumpurl");
       if (!TextUtils.x(queryParamet)) {
          ta.K.r4(queryParamet, ta.getContext());
       }
       return;
    }
}
