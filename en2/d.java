package en2.d;
import com.yxcorp.image.fresco.wrapper.a$g;
import brd.v;
import java.lang.Object;
import java.lang.Boolean;
import brd.g;

public final class d implements a$g	// class@002792
{
    public final v a;

    public void d(v p0){
       this.a = p0;
    }
    public final void onResult(boolean p0){
       d ta = this.a;
       ta.onNext(Boolean.valueOf(p0));
       ta.onComplete();
    }
}
