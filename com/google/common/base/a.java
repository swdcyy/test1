package com.google.common.base.a;
import java.lang.Object;
import com.google.common.base.a$a;
import java.lang.String;
import ok.n;
import java.lang.Appendable;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.Iterable;
import ok.i;
import java.util.List;
import java.util.Arrays;
import com.google.common.base.a$b;
import com.google.common.base.a$c;

public class a	// class@0004c2
{
    public final String a;

    public void a(a p0){
       super();
       this.a = p0.a;
    }
    public void a(a p0,a$a p1){
       super(p0);
    }
    public void a(String p0){
       super();
       n.j(p0);
       this.a = p0;
    }
    public static a f(char p0){
       return new a(String.valueOf(p0));
    }
    public static a g(String p0){
       return new a(p0);
    }
    public Appendable a(Appendable p0,Iterator p1){
       n.j(p0);
       if (p1.hasNext()) {
          p0.append(this.i(p1.next()));
          while (p1.hasNext()) {
             p0.append(this.a);
             p0.append(this.i(p1.next()));
          }
       }
       return p0;
    }
    public final StringBuilder b(StringBuilder p0,Iterator p1){
       try{
          this.a(p0, p1);
          return p0;
       }catch(java.io.IOException e1){
          throw new AssertionError(e1);
       }
    }
    public final String c(Iterable p0){
       StringBuilder str = "";
       this.b(str, p0.iterator());
       return str;
    }
    public final String d(Object p0,Object p1,Object[] p2){
       n.j(p2);
       return this.c(new i(p2, p0, p1));
    }
    public final String e(Object[] p0){
       return this.c(Arrays.asList(p0));
    }
    public a h(){
       return new a$b(this, this);
    }
    public CharSequence i(Object p0){
       n.j(p0);
       if (p0 instanceof CharSequence) {
       }else {
          p0 = p0.toString();
       }
       return p0;
    }
    public a j(String p0){
       n.j(p0);
       return new a$a(this, this, p0);
    }
    public a$c k(String p0){
       return new a$c(this, p0, null);
    }
}
