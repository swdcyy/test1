package htd.n;
import htd.l;
import htd.h;
import htd.u;
import htd.a0;
import htd.r;
import htd.l$b;
import java.lang.Object;

public final class n	// class@000fd5
{

    public static final l a(int p0){
       h oh;
       if (p0 != -2) {
          if (p0 != -1) {
             if (p0) {
                oh = (p0 != Integer.MAX_VALUE)? new h(p0): new u();
             }else {
                oh = new a0();
             }
          }else {
             oh = new r();
          }
       }else {
          oh = new h(l.q0.a());
       }
       return oh;
    }
    public static l b(int p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       return n.a(p0);
    }
}
