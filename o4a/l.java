package o4a.l;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import u3a.f;
import java.util.Objects;
import f4a.f;

public final class l implements g	// class@00328c
{
    public final b b;

    public void l(b p0,boolean p1){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       l tb = this.b;
       Objects.requireNonNull(tb);
       tb.V = p0.a;
       if (tb.T != null) {
       }else if(tb.W.d == null){
          tb.R8(tb.V8(p0, true));
       }
       if (p0.a != null) {
          i = (p0.b != null)? 13: 12;
       }else if(p0.b != null){
          i = 15;
       }else {
          i = 14;
       }
       tb.R8(i);
       return;
    }
}
