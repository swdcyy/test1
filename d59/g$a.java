package d59.g$a;
import q59.b;
import d59.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import x49.a;
import d59.c;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import java.util.Objects;
import android.util.LruCache;
import uv8.h1;
import java.lang.CharSequence;
import e17.i;

public final class g$a extends b	// class@00204a
{
    public final g b;

    public void g$a(g p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void updateData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       a.p(p0, "newData");
       a b = a.b;
       String str = c.P8(this.b.b).e();
       String str1 = c.P8(this.b.b).f();
       if (str1 == null) {
          str1 = "0";
       }
       String str2 = str1;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidThreeRefs(str, str2, p0, b, a.class, "6")) {
          a.p(str, "pageId");
          a.p(str2, "pageVersion");
          a.p(p0, "pageJson");
          a.a.put(b.d(str, str2), p0);
       }
       h1.a.b("修改内存缓存pageJson成功，可以重新进入页面体验");
       return;
    }
}
