package bod.b;
import bod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import d0c.a;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;
import qkd.b;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import faa.a;
import q87.c;

public final class b	// class@000294
{

    public static final a a(a p0){
       String obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$fillFontInfo");
       if (p0.c()) {
          return p0;
       }
       obj = p0.b().c();
       if (obj != null) {
          File uFile = new File(FontEnv.a(), obj);
          if (b.S(uFile)) {
             p0.f(true);
             obj = uFile.getAbsolutePath();
             a.o(obj, "fontFile.absolutePath");
             p0.g(obj);
          }else {
             String str = "SourceHanSansCN-Bold.otf";
             if (a.g(obj, str)) {
                File uFile1 = new File(p.d(Category.TEXT, ""), str);
                int i = 0;
                if (b.S(uFile1)) {
                   Object[] objArray = new Object[i];
                   a.D().w("FontItem", "fillFontInfo use Resource font file", objArray);
                   p0.f(true);
                   obj = uFile1.getAbsolutePath();
                   a.o(obj, "fontFile.absolutePath");
                   p0.g(obj);
                }else {
                   Object[] objArray1 = new Object[i];
                   a.D().w("FontItem", "fillFontInfo use Resource font file not exist", objArray1);
                }
             }
          }
       }
       return p0;
    }
}
