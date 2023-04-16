package b11.j$d;
import b11.j$b;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import lnc.a1;
import java.lang.StringBuilder;
import b11.k;

public class j$d implements j$b	// class@000302
{

    public void j$d(){
       super();
    }
    public CharSequence a(int p0,LiveWealthGradeInfo p1){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "1");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       return new k().a(a1.m().getString(0x7f10465a), a1.a(0x7f0613e2)).a(" +"+p0+a1.m().getString(0x7f10465b), a1.a(0x7f0604ba)).a;
    }
}
