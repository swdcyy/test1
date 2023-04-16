package b58.n;
import z0.a;
import java.lang.String;
import java.lang.Object;
import b58.m;
import java.lang.Boolean;

public final class n implements a	// class@000308
{
    public final boolean a;
    public final String b;

    public void n(boolean p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       boolean b = (p0.b == this.a && (p0.d).equalsIgnoreCase(tb))? true: false;
       return Boolean.valueOf(b);
    }
}
