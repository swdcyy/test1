package e12.m;
import lm9.a$b;
import e12.l;
import brd.v;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import java.lang.Object;
import lm9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public class m implements a$b	// class@002602
{
    public final v a;
    public final LiveSlideResponse b;
    public final l c;

    public void m(l p0,v p1,LiveSlideResponse p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       b.d(this);
    }
    public void b(){
       b.c(this);
    }
    public void onError(){
       b.a(this);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.a.onNext(this.b);
       return;
    }
}
