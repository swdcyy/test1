package bja.m;
import erd.o;
import r26.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import r26.a;
import brd.t;

public final class m implements o	// class@0003ed
{
    public final c b;
    public final QPhoto c;

    public void m(c p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       m tc = this.c;
       p0 = this.b.LC(p0, false);
       if (p0 == null && tc != null) {
          p0 = t.just(tc);
       }else if(p0 == null){
          p0 = t.empty();
       }else {
          p0 = t.just(p0);
       }
       return p0;
    }
}
