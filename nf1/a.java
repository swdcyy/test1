package nf1.a;
import cp3.a;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wkd.b;
import cn1.a;
import lnc.a1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

public final class a implements a	// class@003305
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Drawable a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "badgeKey");
       return new BitmapDrawable(a1.m(), b.a(-402039372).a(p0, a1.e(14.00f)));
    }
}
