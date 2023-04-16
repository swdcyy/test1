package com.google.common.base.a$b;
import com.google.common.base.a;
import com.google.common.base.a$a;
import java.lang.Appendable;
import java.util.Iterator;
import java.lang.Object;
import ok.n;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import com.google.common.base.a$c;

public class a$b extends a	// class@001733
{
    public final a b;

    public void a$b(a p0,a p1){
       this.b = p0;
       super(p1, null);
    }
    public Appendable a(Appendable p0,Iterator p1){
       Object obj;
       n.k(p0, "appendable");
       n.k(p1, "parts");
       while (true) {
          if (p1.hasNext()) {
             obj = p1.next();
             if (obj != null) {
                p0.append(this.b.i(obj));
             }
          }
          while (p1.hasNext()) {
             obj = p1.next();
             if (obj != null) {
                p0.append(this.b.a);
                p0.append(this.b.i(obj));
             }else {
                continue ;
             }
          }
          return p0;
       }
    }
    public a j(String p0){
       throw new UnsupportedOperationException("already specified skipNulls");
    }
    public a$c k(String p0){
       throw new UnsupportedOperationException("can\'t use .skipNulls\(\) with maps");
    }
}
