package laa.s;
import ekd.q$b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;

public final class s implements q$b	// class@002d9b
{
    public final List a;

    public void s(List p0){
       this.a = p0;
    }
    public final boolean a(Object p0){
       boolean b;
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p0.startsWith(iterator.next())) {
                b = false;
                break ;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
}
