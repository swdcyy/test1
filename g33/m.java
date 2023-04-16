package g33.m;
import erd.g;
import ps5.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Boolean;

public final class m implements g	// class@002a57
{
    public final b b;

    public void m(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       if (tb != null) {
          tb.accept(Boolean.FALSE);
       }
       return;
    }
}
