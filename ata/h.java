package ata.h;
import w4.c;
import ata.d$c;
import java.lang.Object;
import w4.i;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ata.d;
import android.graphics.BitmapFactory$Options;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.util.Base64;
import android.graphics.BitmapFactory;
import java.lang.NullPointerException;

public final class h implements c	// class@000300
{
    public final d$c a;

    public void h(d$c p0){
       this.a = p0;
       super();
    }
    public final Bitmap a(i p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$c obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "asset");
       obj = this.a.b;
       Objects.requireNonNull(obj);
       Bitmap uBitmap = PatchProxy.applyOneRefs(p0, obj, d.class, "15");
       if (uBitmap != patchProxyRe) {
       }else {
          try{
             String str = p0.c();
             a.o(str, "asset.getFileName\(\)");
             BitmapFactory$Options options = new BitmapFactory$Options();
             boolean b = true;
             options.inScaled = b;
             options.inDensity = 160;
             if (u.q2(str, "data:", false, 2, null) && StringsKt__StringsKt.i3(str, "base64,", 0, false, 6, null) > 0) {
                String str1 = str;
                int i = StringsKt__StringsKt.h3(str1, ',', 0, false, 6, null) + b;
                if (str != null) {
                   str = str.substring(i);
                   a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                   byte[] uobyteArray = Base64.decode(str, false);
                   a.o(uobyteArray, "Base64.decode\(filename.s¡­,\'\) + 1\), Base64.DEFAULT\)");
                   uBitmap = BitmapFactory.decodeByteArray(uobyteArray, false, uobyteArray.length, options);
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
             }else {
                uBitmap = null;
             }
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
}
