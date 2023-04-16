package gr8.c;
import brd.t;
import gr8.b;
import erd.o;
import java.lang.Object;
import java.lang.String;
import hr8.a;
import com.trello.rxlifecycle3.c;
import brd.w;
import erd.c;
import com.trello.rxlifecycle3.a;
import erd.r;
import com.trello.rxlifecycle3.b;

public class c	// class@0024bc
{

    public static b a(t p0){
       return new b(p0);
    }
    public static b b(t p0,o p1){
       a.a(p0, "lifecycle == null");
       a.a(p1, "correspondingEvents == null");
       p0 = p0.share();
       return c.a(t.combineLatest(p0.take(1).map(p1), p0.skip(1), new c()).onErrorReturn(a.a).filter(a.b));
    }
    public static b c(t p0,Object p1){
       a.a(p0, "lifecycle == null");
       a.a(p1, "event == null");
       return c.a(p0.filter(new b(p1)));
    }
}
