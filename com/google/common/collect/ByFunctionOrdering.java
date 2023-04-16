package com.google.common.collect.ByFunctionOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import ok.h;
import java.lang.Object;
import ok.n;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public final class ByFunctionOrdering extends Ordering implements Serializable	// class@0017a8
{
    public final h function;
    public final Ordering ordering;
    public static final long serialVersionUID;

    public void ByFunctionOrdering(h p0,Ordering p1){
       super();
       n.j(p0);
       this.function = p0;
       n.j(p1);
       this.ordering = p1;
    }
    public int compare(Object p0,Object p1){
       return this.ordering.compare(this.function.apply(p0), this.function.apply(p1));
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ByFunctionOrdering) {
          return false;
       }
       if (!this.function.equals(p0.function) || !this.ordering.equals(p0.ordering)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.function,this.ordering};
       return k.b(objArray);
    }
    public String toString(){
       return this.ordering+".onResultOf\("+this.function+"\)";
    }
}
