package a8d.b$a;
import qvb.q;
import a8d.b;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.kbox.atmosphere.SearchAtmosphereResource;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import y9d.a;

public class b$a implements q	// class@00009e
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, b$a.class, "1")) {
          return;
       }
       if (p0) {
          b$a tb = this.b;
          tb.y = null;
          tb.x = false;
          if (tb.q.kc() != SearchPage.AGGREGATE) {
             return;
          }else {
             tb = this.b;
             tb.z = tb.q.q().L0();
             b z = this.b.z;
             if (z != null && (z.mExtParams != null && (z.isAtmosphereTheme() && this.b.z.mExtParams.getAtmosphere().contains(1)))) {
                tb = this.b;
                tb.y = a.c(tb.z.mExtParams.getAtmosphere().getColorLight());
                tb = this.b;
                tb.x = tb.z.mExtParams.getAtmosphere().isTopAtmosphere();
             }
          }
       }
       return;
    }
}
