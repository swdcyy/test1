package cb8.b;
import erd.g;
import fc8.i;
import java.lang.Object;
import java.lang.Throwable;
import com.mini.d;
import java.lang.String;

public final class b implements g	// class@0003da
{
    public final i b;

    public void b(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (d.f()) {
          d.b("#KeyboardBindApi#", "没有找到正在输入的输入框", p0);
       }
       tb.h("no focused input");
       return;
    }
}
