package l8a.c$a;
import qvb.f;
import l8a.c;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.merchant.api.core.model.CardCollectionFeedResponse;
import tkd.b;
import tkd.d;
import wr3.d;

public class c$a extends f	// class@002d61
{
    public final c p;

    public void c$a(c p0){
       this.p = p0;
       super();
    }
    public t I1(){
       CardCollectionFeedResponse mCursor;
       String obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.p.v.K())? "0": this.p.v.L0().mCursor;
       return d.a(-1867677587).y1("merchant", this.p.u, obj);
    }
    public boolean i(){
       return false;
    }
}
