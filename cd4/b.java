package cd4.b;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import lnc.b3;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.text.SpannableString;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import cd4.b$a;
import com.yxcorp.image.fresco.wrapper.a;

public class b	// class@0004f7
{

    public void b(){
       super();
    }
    public static CharSequence a(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a1.e(14.00f);
       b3 uob3 = new b3(a.b(), p0);
       uob3.b(false);
       uob3.g(a1.e(2.00f));
       uob3.d((int)((((float)p0.getIntrinsicWidth() * 0x3f800000) / (float)p0.getIntrinsicHeight()) * (float)i), i);
       return uob3.a();
    }
    public static void b(String p0,ImageCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       a.d(ImageRequestBuilder.k(Uri.parse(p0)).a(), new b$a(p1));
       return;
    }
}
