package qk.s;
import java.util.Map$Entry;
import qk.t;
import java.lang.Object;

public abstract class s extends t implements Map$Entry	// class@002a17
{

    public void s(){
       super();
    }
    public Object delegate(){
       return this.q();
    }
    public boolean equals(Object p0){
       return this.q().equals(p0);
    }
    public Object getKey(){
       return this.q().getKey();
    }
    public Object getValue(){
       return this.q().getValue();
    }
    public int hashCode(){
       return this.q().hashCode();
    }
    public abstract Map$Entry q();
    public Object setValue(Object p0){
       return this.q().setValue(p0);
    }
}
