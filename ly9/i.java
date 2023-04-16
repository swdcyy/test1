package ly9.i;
import erd.g;
import ly9.k;
import java.lang.Object;
import java.lang.Boolean;
import ly9.m;

public final class i implements g	// class@002ebc
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       tb.c.b = p0.booleanValue();
       if (p0.booleanValue()) {
          tb.c();
       }else {
          tb.b();
       }
       return;
    }
}
