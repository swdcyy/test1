package fxa.d$f;
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

public final class d$f extends d$b	// class@002a51
{
    public final d a;

    public void d$f(d p0){
       this.a = p0;
       super(null);
    }
    public String b(){
       return "REQUESTED";
    }
    public boolean d(int p0,String p1){
       d$f ta;
       d$f uof = d$f.class;
       if (PatchProxy.isSupport(uof)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       boolean b = true;
       String str = " handled";
       switch (p0){
           case 3:
             this.c(p0+str);
             ta = this.a;
             ta.e(ta.d);
             return b;
           case 6:
           case 9:
           case 13:
           case 14:
           case 15:
           case 17:
           case 18:
           case 20:
           case 8:
             this.c(p0+str);
             ta = this.a;
             ta.e(ta.a);
             return b;
           case 19:
             this.c(p0+str);
             return b;
           default:
          label_0023 :
             this.c(p0+" not handled");
             return false;
       }
    }
}
