package gka.s;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Long;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;

public final class s implements g	// class@002b18
{
    public final ProgressFragment b;

    public void s(ProgressFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.O;
       if (p0 != null) {
          p0.a();
       }
       return;
    }
}
