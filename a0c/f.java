package a0c.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;
import java.io.File;
import kotlin.jvm.internal.a;

public final class f	// class@00000e
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static final String a(int p0){
       String str;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          str = (p0 != 2)? "post_res": "post_dialog_res";
       }else {
          str = "post_bubble_res";
       }
       str = b.a(-1504323719).c(str).getAbsolutePath();
       a.o(str, "Singleton.get\(FileManage¡­che\(subPath\).absolutePath");
       return str;
    }
}
