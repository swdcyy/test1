package awd.k;
import java.lang.Object;
import awd.i;
import java.lang.String;

public final class k	// class@00029b
{
    public final Object a;
    public final i b;
    public boolean c;

    public void k(Object p0,i p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = true;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof k && (this.a == p0.a && this.b.equals(p0.b))) {
          b = true;
       }
    label_0018 :
       return b;
    }
    public int hashCode(){
       return (this.a.hashCode() + (this.b.f).hashCode());
    }
}
