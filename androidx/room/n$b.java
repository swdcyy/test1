package androidx.room.n$b;
import a3.f;
import java.lang.String;
import androidx.room.a;
import java.lang.Object;
import java.util.ArrayList;
import z0.a;
import a3.b;
import java.lang.Double;
import java.lang.Long;
import a3.d;
import v2.m;
import androidx.room.o;
import androidx.room.r;
import androidx.room.p;
import java.lang.Integer;
import androidx.room.s;
import androidx.room.q;

public class n$b implements f	// class@000968
{
    public final String b;
    public final ArrayList c;
    public final a d;

    public void n$b(String p0,a p1){
       super();
       this.c = new ArrayList();
       this.b = p0;
       this.d = p1;
    }
    public static Object a(f p0){
       n$b.e(p0);
       return null;
    }
    public static Object b(n$b p0,a p1,b p2){
       return p0.f(p1, p2);
    }
    public static Object e(f p0){
       p0.execute();
       return null;
    }
    private Object f(a p0,b p1){
       f uof = p1.compileStatement(this.b);
       this.c(uof);
       return p0.apply(uof);
    }
    public void bindBlob(int p0,byte[] p1){
       this.g(p0, p1);
    }
    public void bindDouble(int p0,double p1){
       this.g(p0, Double.valueOf(p1));
    }
    public void bindLong(int p0,long p1){
       this.g(p0, Long.valueOf(p1));
    }
    public void bindNull(int p0){
       this.g(p0, null);
    }
    public void bindString(int p0,String p1){
       this.g(p0, p1);
    }
    public final void c(f p0){
       int i = 0;
       while (i < this.c.size()) {
          int i1 = i + 1;
          Object obj = this.c.get(i);
          if (obj == null) {
             p0.bindNull(i1);
          }else if(obj instanceof Long){
             p0.bindLong(i1, obj.longValue());
          }else if(obj instanceof Double){
             p0.bindDouble(i1, obj.doubleValue());
          }else if(obj instanceof String){
             p0.bindString(i1, obj);
          }else if(obj instanceof byte[]){
             p0.bindBlob(i1, obj);
          }
          i = i1;
       }
       return;
    }
    public void clearBindings(){
       this.c.clear();
    }
    public void close(){
    }
    public final Object d(a p0){
       return this.d.c(new m(this, p0));
    }
    public void execute(){
       this.d(o.a);
    }
    public long executeInsert(){
       return this.d(r.a).longValue();
    }
    public int executeUpdateDelete(){
       return this.d(p.a).intValue();
    }
    public final void g(int p0,Object p1){
       p0--;
       if (p0 >= this.c.size()) {
          for (int i = this.c.size(); i <= p0; i = i + 1) {
             this.c.add(null);
          }
       }
       this.c.set(p0, p1);
       return;
    }
    public long simpleQueryForLong(){
       return this.d(s.a).longValue();
    }
    public String simpleQueryForString(){
       return this.d(q.a);
    }
}
