package y66.d;
import com.yxcorp.image.common.log.Log$b;
import java.lang.Object;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y66.d$a;
import java.lang.Enum;
import y66.a;
import q87.c;

public class d implements Log$b	// class@002847
{

    public void d(){
       super();
    }
    public void a(Log$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "1")) {
          return;
       }
       int i = d$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                a.C().r(p1, p2, p3);
             }else {
                a.C().v(p1, p2, p3);
             }
          }else {
             a.C().z(p1, p2, p3);
          }
       }else {
          a.C().e(p1, p2, p3);
       }
       return;
    }
}
