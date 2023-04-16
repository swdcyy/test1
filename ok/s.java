package ok.s;
import ok.s$e;
import ok.b;
import java.lang.Object;
import ok.n;
import ok.q;
import java.lang.String;
import ok.s$a;
import java.lang.CharSequence;
import java.lang.Iterable;
import ok.s$b;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import ok.s$c;

public final class s	// class@002054
{
    public final b a;
    public final boolean b;
    public final s$e c;
    public final int d;

    public void s(s$e p0){
       super(p0, false, b.g(), Integer.MAX_VALUE);
    }
    public void s(s$e p0,boolean p1,b p2,int p3){
       super();
       this.c = p0;
       this.b = p1;
       this.a = p2;
       this.d = p3;
    }
    public static s b(char p0){
       b uob = b.e(p0);
       n.j(uob);
       return new s(new q(uob));
    }
    public static s c(String p0){
       s$a uoa = 1;
       boolean b = (p0.length())? true: false;
       n.c(b, "The separator may not be the empty string.");
       if (p0.length() == uoa) {
          return s.b(p0.charAt(0));
       }else {
          return new s(new s$a(p0));
       }
    }
    public s a(){
       return new s(this.c, true, this.a, this.d);
    }
    public Iterable d(CharSequence p0){
       n.j(p0);
       return new s$b(this, p0);
    }
    public List e(CharSequence p0){
       n.j(p0);
       Iterator iterator = this.f(p0);
       ArrayList uArrayList = new ArrayList();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next());
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public Iterator f(CharSequence p0){
       return this.c.a(this, p0);
    }
    public s g(){
       b uob = b.j();
       n.j(uob);
       return new s(this.c, this.b, uob, this.d);
    }
    public s$c h(String p0){
       return new s$c(this, s.c(p0), null);
    }
}
