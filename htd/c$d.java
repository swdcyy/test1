package htd.c$d;
import ltd.o$e;
import java.lang.Object;
import ltd.m;
import ltd.o;
import htd.p;
import htd.z;
import htd.b;
import ltd.o$d;
import ltd.e0;
import ltd.c;
import ltd.p;
import kotlin.TypeCastException;
import java.lang.String;

public final class c$d extends o$e	// class@000fbb
{
    public final Object e;

    public void c$d(Object p0,m p1){
       super(p1);
       this.e = p0;
    }
    public Object e(o p0){
       if (p0 instanceof p) {
       }else if(!p0 instanceof z){
          p0 = b.b;
       }else {
          p0 = null;
       }
       return p0;
    }
    public Object j(o$d p0){
       o$d a = p0.a;
       if (a == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveOrClosed<E>");
       }
       e0 uoe0 = a.d(this.e, p0);
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
