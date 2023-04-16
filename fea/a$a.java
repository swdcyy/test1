package fea.a$a;
import wy6.d;
import com.yxcorp.gifshow.featured.detail.live.data.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.n0;

public final class a$a implements d	// class@0028d5
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void C(){
    }
    public boolean T(){
       return false;
    }
    public boolean d2(){
       return false;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.hasMore();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.a.load();
       return;
    }
}
