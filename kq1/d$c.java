package kq1.d$c;
import kq1.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class d$c extends d	// class@002dca
{

    public void d$c(){
       super();
    }
    public int a(){
       return 0x7f060622;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, d$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1004b4);
    }
}
