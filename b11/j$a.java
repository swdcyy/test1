package b11.j$a;
import b11.j$b;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class j$a implements j$b	// class@0002ff
{

    public void j$a(){
       super();
    }
    public CharSequence a(int p0,LiveWealthGradeInfo p1){
       if (PatchProxy.isSupport(j$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, j$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a1.p(0x7f102ec9);
    }
}
