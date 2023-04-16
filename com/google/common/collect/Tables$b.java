package com.google.common.collect.Tables$b;
import com.google.common.collect.s$a;
import java.lang.Object;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class Tables$b implements s$a	// class@001895
{

    public void Tables$b(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof s$a) {
          return false;
       }
       if (!k.a(this.getRowKey(), p0.getRowKey()) || (!k.a(this.getColumnKey(), p0.getColumnKey()) || !k.a(this.getValue(), p0.getValue()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.getRowKey(),this.getColumnKey(),this.getValue()};
       return k.b(objArray);
    }
    public String toString(){
       return "\("+this.getRowKey()+","+this.getColumnKey()+"\)="+this.getValue();
    }
}
