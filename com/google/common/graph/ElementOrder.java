package com.google.common.graph.ElementOrder;
import com.google.common.graph.ElementOrder$Type;
import java.util.Comparator;
import java.lang.Object;
import ok.n;
import ok.k;
import java.lang.String;
import ok.j$b;
import ok.j;

public final class ElementOrder	// class@0018d4
{
    public final ElementOrder$Type a;
    public final Comparator b;

    public void ElementOrder(ElementOrder$Type p0,Comparator p1){
       super();
       n.j(p0);
       this.a = p0;
       this.b = null;
       int i = (p0 == ElementOrder$Type.SORTED)? 1: 0;
       n.n((i ^ 1));
       return;
    }
    public static ElementOrder a(){
       return new ElementOrder(ElementOrder$Type.INSERTION, null);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ElementOrder) {
          return false;
       }
       if (this.a != p0.a || !k.a(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return k.b(objArray);
    }
    public String toString(){
       j$b uob = j.b(this);
       uob.c("type", this.a);
       ElementOrder tb = this.b;
       if (tb != null) {
          uob.c("comparator", tb);
       }
       return uob.toString();
    }
}
