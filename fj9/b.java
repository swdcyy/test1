package fj9.b;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import fj9.a;
import cjd.e;
import erd.o;
import java.util.List;
import com.yxcorp.gifshow.channel.api.ChannelDetailListResponse;
import la6.b;
import kp.y1;
import java.util.Collection;

public class b extends f	// class@00231e
{
    public String p;
    public long q;
    public String r;
    public int s;
    public String t;

    public void b(){
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1123e2fa).a(this.t, 20, this.p, this.q, this.r, this.s).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(ChannelDetailListResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       List list = this.W1(p0, p1);
       if (list == null) {
          return;
       }
       y1.c(list, p0.mLlsid);
       p1.addAll(list);
       this.V1(list);
       this.p = p0.getCursor();
       return;
    }
}
