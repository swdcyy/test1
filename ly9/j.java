package ly9.j;
import erd.g;
import ly9.k;
import java.lang.Object;
import java.lang.Boolean;
import ly9.m;

public final class j implements g	// class@002ebd
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       tb.c.e((p0.booleanValue() ^ 0x01));
       if (p0.booleanValue()) {
          tb.b();
       }else {
          tb.c();
       }
       return;
    }
}
