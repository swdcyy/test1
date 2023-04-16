package bp6.q0;
import erd.o;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import bp6.j2;
import android.content.res.Resources;
import android.content.Context;

public final class q0 implements o	// class@000545
{
    public final v b;
    public final KwaiMsg c;

    public void q0(v p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       q0 tc = this.c;
       p0 = this.b.f;
       Objects.requireNonNull(p0);
       if (TextUtils.isEmpty(tc.getName())) {
          p0 = "";
       }else {
          p0 = p0.a;
          Resources resources = p0.getResources();
          Resources resources1 = p0.getResources();
          p0 = resources.getString(resources1.getIdentifier(tc.getName(), "string", p0.getPackageName()));
       }
       return p0;
    }
}
