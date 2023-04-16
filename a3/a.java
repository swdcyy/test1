package a3.a;
import a3.e;
import java.lang.String;
import java.lang.Object;
import a3.d;
import java.lang.Float;
import java.lang.Double;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class a implements e	// class@000013
{
    public final String b;
    public final Object[] c;

    public void a(String p0){
       super(p0, null);
    }
    public void a(String p0,Object[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public static void b(d p0,int p1,Object p2){
       if (p2 == null) {
          p0.bindNull(p1);
       }else if(p2 instanceof byte[]){
          p0.bindBlob(p1, p2);
       }else if(p2 instanceof Float){
          p0.bindDouble(p1, (double)p2.floatValue());
       }else if(p2 instanceof Double){
          p0.bindDouble(p1, p2.doubleValue());
       }else if(p2 instanceof Long){
          p0.bindLong(p1, p2.longValue());
       }else if(p2 instanceof Integer){
          p0.bindLong(p1, (long)p2.intValue());
       }else if(p2 instanceof Short){
          p0.bindLong(p1, (long)p2.shortValue());
       }else if(p2 instanceof Byte){
          p0.bindLong(p1, (long)p2.byteValue());
       }else if(p2 instanceof String){
          p0.bindString(p1, p2);
       }else if(p2 instanceof Boolean){
          long l = (p2.booleanValue())? 1: 0;
          p0.bindLong(p1, l);
       }else {
          throw new IllegalArgumentException("Cannot bind "+p2+" at index "+p1+" Supported types: null, byte[], float, double, long, int, short, byte, string");
       }
       return;
    }
    public static void e(d p0,Object[] p1){
       if (p1 == null) {
          return;
       }
       int len = p1.length;
       int i = 0;
       while (i < len) {
          i = i + 1;
          a.b(p0, i, p1[i]);
       }
       return;
    }
    public int a(){
       a tc = this.c;
       int i = (tc == null)? 0: tc.length;
       return i;
    }
    public String c(){
       return this.b;
    }
    public void d(d p0){
       a.e(p0, this.c);
    }
}
