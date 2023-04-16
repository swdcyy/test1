package a63.q;
import com.yxcorp.image.fresco.wrapper.a$g;
import brd.v;
import java.lang.Object;
import java.lang.Boolean;
import brd.g;

public final class q implements a$g	// class@000061
{
    public final v a;

    public void q(v p0){
       this.a = p0;
    }
    public final void onResult(boolean p0){
       q ta = this.a;
       ta.onNext(Boolean.valueOf(p0));
       ta.onComplete();
    }
}
