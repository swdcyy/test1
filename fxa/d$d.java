package fxa.d$d;
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

public final class d$d extends d$b	// class@002a4f
{
    public final d a;

    public void d$d(d p0){
       this.a = p0;
       super(null);
    }
    public String b(){
       return "DIALING";
    }
    public boolean d(int p0,String p1){
       d$d ta;
       d$d uod = d$d.class;
       if (PatchProxy.isSupport(uod)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       boolean b = true;
       String str = " handled";
       switch (p0){
           case 4:
             this.c(p0+str);
             ta = this.a;
             ta.e(ta.d);
             return b;
           case 6:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:
           case 18:
           case 20:
           case 7:
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
