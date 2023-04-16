package com.yxcorp.gifshow.util.ARecyclerAdapter$e;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class ARecyclerAdapter$e	// class@001ec6
{
    public final int a;
    public final Object b;

    public void ARecyclerAdapter$e(int p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(){
       return this.b;
    }
    public final int b(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ARecyclerAdapter$e && (this.a == p0.a && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i = this.a * 31;
       ARecyclerAdapter$e tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       return "Item\(type="+this.a+", data="+this.b+"\)";
    }
}
