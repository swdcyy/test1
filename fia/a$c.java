package fia.a$c;
import d6a.a;
import fia.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$c extends a	// class@0028e6
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "2")) {
          return;
       }
       this.b.m9(false);
       this.b.X8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.b.m9(true);
       return;
    }
}
