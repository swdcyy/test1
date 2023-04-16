package c0d.d;
import java.lang.Comparable;
import java.lang.String;
import com.yxcorp.httpdns.ResolverType;
import java.lang.Object;
import java.lang.System;

public class d implements Comparable	// class@0004c2
{
    public final String b;
    public final String c;
    public final long d;
    public String e;
    public long f;

    public void d(String p0,String p1,ResolverType p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.e = p2.mValue;
       this.d = System.currentTimeMillis() + p3;
    }
    public int compareTo(Object p0){
       return (int)(this.f - p0.f);
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof d && (this.c).equals(p0.c))? true: false;
       return b;
    }
    public int hashCode(){
       return (this.c).hashCode();
    }
    public String toString(){
       return this.c;
    }
}
