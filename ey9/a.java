package ey9.a;
import erd.g;
import ey9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import qp7.b;

public final class a implements g	// class@00224b
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.c0();
       }else {
          tb.b0();
       }
       return;
    }
}
