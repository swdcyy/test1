package hx1.b;
import hx1.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b61.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import aq5.d;
import lp3.e;
import lp3.c;
import lp3.b;

public class b implements a	// class@00279f
{
    public d b;
    public List c;

    public void b(){
       super();
    }
    public List Bi(){
       return this.c;
    }
    public void Dl(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       this.c = p0;
       if (!a.b(tc, p0)) {
          return;
       }
       if (!a.d(this.c)) {
          this.b.yj(AudienceBizRelation.SPECIAL_ROLE);
       }else {
          AudienceBizRelation sPECIAL_ROLE = AudienceBizRelation.SPECIAL_ROLE;
          if (this.b.ck(sPECIAL_ROLE)) {
             this.b.Pj(sPECIAL_ROLE);
          }
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void r(d p0){
       this.b = p0;
    }
}
