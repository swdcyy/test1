package ga.f0;
import ea.b;
import ga.g0;
import java.lang.Object;
import fa.b;
import java.text.DateFormat;
import java.lang.String;
import ga.v0;
import java.util.Date;
import ga.a;
import ca.b;
import ea.f;
import java.text.ParseException;

public class f0 implements b	// class@002060
{
    public final g0 a;

    public void f0(g0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       try{
          this.a.f.c.a(b.b.a().parse(this.a.r.a()));
       }catch(java.text.ParseException e0){
          e0.printStackTrace();
       }
       return;
    }
}
