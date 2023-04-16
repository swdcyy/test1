package bg5.a;
import java.lang.String;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import java.lang.Boolean;

public class a	// class@000497
{
    public final int a;
    public final QRecoTag b;
    public final String c;

    public void a(int p0,String p1,QRecoTag p2){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public static a a(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p0, a.b().getString(p1), null);
    }
    public static a b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return a.a(10, 0x7f103c4a);
       }else {
          return a.a(3, 0x7f103c48);
       }
    }
}
