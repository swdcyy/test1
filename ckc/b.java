package ckc.b;
import so7.c;
import java.lang.Object;
import ckc.b$a;
import ckc.b$b;
import java.lang.String;
import so7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import ckc.a;

public class b implements c	// class@0005c5
{

    public void b(){
       super();
    }
    public void b(b$a p0){
       super();
    }
    public static b b(){
       return b$b.a;
    }
    public b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return new a(p0);
    }
}
