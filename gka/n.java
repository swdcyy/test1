package gka.n;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.fragment.ObservableBox$c;

public final class n implements g	// class@002b13
{
    public final ProgressFragment b;

    public void n(ProgressFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       if (p0 instanceof ObservableBox$c) {
          tb.Oh(p0.c, p0.b);
       }
       return;
    }
}
