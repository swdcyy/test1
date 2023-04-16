package ic9.m;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;

public final class m implements o	// class@00267b
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object apply(Object p0){
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          int i2 = (oobject instanceof Boolean && oobject.booleanValue())? 1: 0;
          i1 = i1 | i2;
       }
       return Boolean.valueOf(i1);
    }
}
