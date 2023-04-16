package v2b.h;
import v2b.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class h implements a	// class@00266a
{

    public void h(){
       super();
    }
    public void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "1")) {
          return;
       }
       int i = 0x4b316083;
       if (b.a(i) != null) {
          b.a(i).f1(p0, p1, p2);
       }
       return;
    }
}
