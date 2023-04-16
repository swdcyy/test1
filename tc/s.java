package tc.s;
import tc.v;
import tc.x;
import java.lang.Object;
import java.lang.String;
import ta.a;
import com.facebook.common.references.a;
import ab.f;
import com.facebook.common.memory.MemoryTrimType;
import eb.b;

public class s implements v	// class@0024c5
{
    public final v a;
    public final x b;

    public void s(v p0,x p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean contains(Object p0){
       return this.a.contains(p0);
    }
    public String d(){
       return this.a.d();
    }
    public a get(Object p0){
       a uoa = this.a.get(p0);
       if (uoa == null) {
          this.b.b(p0);
       }else {
          this.b.a(p0);
       }
       return uoa;
    }
    public int getCount(){
       return this.a.getCount();
    }
    public int getSizeInBytes(){
       return this.a.getSizeInBytes();
    }
    public void i(Object p0){
       this.a.i(p0);
    }
    public a j(Object p0,a p1){
       this.b.c(p0);
       return this.a.j(p0, p1);
    }
    public boolean m(f p0){
       return this.a.m(p0);
    }
    public void o(MemoryTrimType p0){
       this.a.o(p0);
    }
    public int p(f p0){
       return this.a.p(p0);
    }
}
