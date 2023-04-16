package fxa.d$c;
import fxa.d$b;
import fxa.d;
import fxa.d$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class d$c extends d$b	// class@002a4e
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super(null);
    }
    public String b(){
       return "CALLING";
    }
    public boolean d(int p0,String p1){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       if (p0 != 5 && (p0 != 6 && (p0 != 14 && p0 != 15))) {
          switch (p0){
              case 18:
              case 20:
              case 19:
                this.c(p0+" handled");
                return true;
              default:
                this.c(p0+" not handled");
                return false;
          }
       }
    label_005a :
       this.c(p0+" handled");
       d$c ta = this.a;
       ta.e(ta.a);
       return true;
    }
}
