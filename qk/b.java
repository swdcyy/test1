package qk.b;
import java.util.Map$Entry;
import java.lang.Object;
import ok.k;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class b implements Map$Entry	// class@002288
{

    public void b(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (k.a(this.getKey(), p0.getKey()) && k.a(this.getValue(), p0.getValue()))) {
          b = true;
       }
    label_0024 :
       return b;
    }
    public abstract Object getKey();
    public abstract Object getValue();
    public int hashCode(){
       Object key = this.getKey();
       Object value = this.getValue();
       int i = 0;
       int i1 = (key == null)? 0: key.hashCode();
       if (value != null) {
          i = value.hashCode();
       }
       return (i1 ^ i);
    }
    public Object setValue(Object p0){
       throw new UnsupportedOperationException();
    }
    public String toString(){
       return this.getKey()+"="+this.getValue();
    }
}
