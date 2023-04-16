package com.google.common.collect.Maps$r;
import com.google.common.collect.f$a;
import java.lang.Object;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public class Maps$r implements f$a	// class@001853
{
    public final Object a;
    public final Object b;

    public void Maps$r(Object p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object a(){
       return this.a;
    }
    public Object b(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof f$a && (k.a(this.a, p0.a()) && k.a(this.b, p0.b()))) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return k.b(objArray);
    }
    public String toString(){
       return "\("+this.a+", "+this.b+"\)";
    }
}
