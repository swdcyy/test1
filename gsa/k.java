package gsa.k;
import jo5.a;
import com.kwai.framework.model.channel.HotChannel;
import wq6.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.g0;

public class k extends a	// class@002bf6
{
    public final HotChannel c;
    public final h d;

    public void k(HotChannel p0,h p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g0.a(this.c);
    }
    public h b(){
       return this.d;
    }
}
