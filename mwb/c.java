package mwb.c;
import yf7.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;

public final class c implements c	// class@001ee8
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public int d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Log.b(p0, p1);
       return 0;
    }
    public int e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Log.d(p0, p1);
       return 0;
    }
    public int i(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Log.g(p0, p1);
       return 0;
    }
    public int v(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Log.l(p0, p1);
       return 0;
    }
    public int w(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Log.n(p0, p1);
       return 0;
    }
}
