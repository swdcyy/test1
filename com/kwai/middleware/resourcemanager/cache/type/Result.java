package com.kwai.middleware.resourcemanager.cache.type.Result;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class Result	// class@000f42
{
    public Result$SOURCE a;
    public boolean b;
    public List c;

    public void Result(Result$SOURCE p0,boolean p1,List p2){
       a.p(p0, "source");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final List a(){
       return this.c;
    }
    public final Result$SOURCE b(){
       return this.a;
    }
    public final boolean c(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof Result && (a.g(this.a, p0.a) && (this.b == p0.b && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Result ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       Result tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "Result\(source="+this.a+", isChanged="+this.b+", infoList="+this.c+"\)";
    }
}
