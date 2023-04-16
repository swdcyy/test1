package com.google.common.base.a$c;
import com.google.common.base.a;
import java.lang.String;
import com.google.common.base.a$a;
import java.lang.Object;
import ok.n;
import java.lang.Appendable;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;
import java.lang.StringBuilder;
import java.lang.AssertionError;

public final class a$c	// class@001734
{
    public final a a;
    public final String b;

    public void a$c(a p0,String p1,a$a p2){
       super();
       this.a = p0;
       n.j(p1);
       this.b = p1;
    }
    public Appendable a(Appendable p0,Iterator p1){
       n.j(p0);
       if (p1.hasNext()) {
          Map$Entry uEntry = p1.next();
          p0.append(this.a.i(uEntry.getKey()));
          p0.append(this.b);
          p0.append(this.a.i(uEntry.getValue()));
          while (p1.hasNext()) {
             p0.append(this.a.a);
             uEntry = p1.next();
             p0.append(this.a.i(uEntry.getKey()));
             p0.append(this.b);
             p0.append(this.a.i(uEntry.getValue()));
          }
       }
       return p0;
    }
    public String b(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       try{
          StringBuilder str = "";
          this.a(str, iterator);
          return str;
       }catch(java.io.IOException e2){
          throw new AssertionError(e2);
       }
    }
}
