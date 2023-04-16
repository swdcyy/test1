package mg.d$n;
import erd.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import java.util.Objects;
import android.util.Base64;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.IllegalArgumentException;

public final class d$n implements o	// class@0025e8
{
    public static final d$n b;

    static {
       d$n.b = new d$n();
    }
    public void d$n(){
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("base64ToBitmap : base64Code is empty");
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.substring((StringsKt__StringsKt.i3(p0, ",", 0, false, 6, null) + 1));
       a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
       p0 = Base64.decode(p0, 0);
       a.o(p0, "Base64.decode\(effectiveBase64, DEFAULT\)");
       p0 = BitmapFactory.decodeByteArray(p0, 0, p0.length);
       Objects.requireNonNull(p0, "base64ToBitmap : bitmap = null");
       return p0;
    }
}
