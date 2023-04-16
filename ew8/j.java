package ew8.j;
import java.util.concurrent.Callable;
import ew8.k;
import java.lang.Object;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.String;
import ew8.g;
import java.lang.Throwable;
import yv8.b;
import java.lang.Boolean;

public final class j implements Callable	// class@002243
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final Object call(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       Iterator iterator = tb.b.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          g og = tb.b.get(str);
          if (og != null && og.b() == 2) {
             tb.i(str, og, tb.f(og));
          }else if(og != null && og.b() == 3){
             tb.i(str, og, "");
             tb.b.remove(str);
          }
       }
       return Boolean.TRUE;
    }
}
