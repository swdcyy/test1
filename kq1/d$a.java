package kq1.d$a;
import kq1.d;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class d$a extends d	// class@002dc8
{
    public final LiveLineInviteItem a;

    public void d$a(LiveLineInviteItem p0){
       super();
       this.a = p0;
    }
    public int a(){
       return 0x7f060752;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (this.a.isMultiLineState())? 0x7f1027e8: 0x7f102991;
       return a1.p(i);
    }
}
