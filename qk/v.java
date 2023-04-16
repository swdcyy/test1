package qk.v;
import java.util.Set;
import qk.p;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.o;
import ok.n;

public abstract class v extends p implements Set	// class@002a1c
{

    public void v(){
       super();
    }
    public Object delegate(){
       return this.delegate();
    }
    public Collection delegate(){
       return this.delegate();
    }
    public abstract Set delegate();
    public boolean equals(Object p0){
       boolean b = (p0 == this || this.delegate().equals(p0))? true: false;
       return b;
    }
    public int hashCode(){
       return this.delegate().hashCode();
    }
    public boolean standardEquals(Object p0){
       return o.b(this, p0);
    }
    public int standardHashCode(){
       return o.d(this);
    }
    public boolean standardRemoveAll(Collection p0){
       n.j(p0);
       return o.m(this, p0);
    }
}
