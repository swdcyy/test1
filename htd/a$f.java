package htd.a$f;
import ltd.o$e;
import ltd.m;
import ltd.o;
import java.lang.Object;
import htd.p;
import htd.b0;
import htd.b;
import ltd.o$d;
import ltd.e0;
import ltd.c;
import ltd.p;
import kotlin.TypeCastException;
import java.lang.String;

public final class a$f extends o$e	// class@000faf
{

    public void a$f(m p0){
       super(p0);
    }
    public Object e(o p0){
       if (p0 instanceof p) {
       }else if(!p0 instanceof b0){
          p0 = b.c;
       }else {
          p0 = null;
       }
       return p0;
    }
    public Object j(o$d p0){
       o$d a = p0.a;
       if (a == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
       }
       e0 uoe0 = a.e0(p0);
       if (uoe0 == null) {
          return p.a;
       }
       Object b = c.b;
       if (uoe0 == b) {
          return b;
       }
       return null;
    }
}
