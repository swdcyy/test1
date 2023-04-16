package arc.a;
import java.lang.Object;
import wqc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.util.AdvEditUtil;

public final class a	// class@0002be
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "backgroundData");
       String str = this.c(p0);
       if (!TextUtils.x(str) && b.S(new File(str))) {
          return true;
       }
       return false;
    }
    public final String b(b p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "backgroundData");
       obj = "CANVAS_PICTURE_BACKGROUND_"+p0.e()+"_";
       String str = (p0.c().isEmpty())? "": TextUtils.D(p0.c().get(0).getUrl());
       return obj+str+".png";
    }
    public final String c(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "backgroundData");
       String str = "";
       if (p0.f() != 4) {
          return str;
       }
       String str1 = this.b(p0);
       if (!TextUtils.x(str1)) {
          str = new File(AdvEditUtil.e(), str1).getAbsolutePath();
          a.o(str, "File\(AdvEditUtil.getPost¡­undFileName\).absolutePath");
       }
       return str;
    }
}
