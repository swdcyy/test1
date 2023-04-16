package gy0.f;
import vq5.b;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ft5.b;

public final class f implements b	// class@0025a9
{
    public final e a;

    public void f(e p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       String queryParamet = p0.getQueryParameter("comment");
       if (!TextUtils.x(queryParamet)) {
          ta.P.U2(queryParamet);
       }
       return;
    }
}
