package gqa.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.publicdomainguide.c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import vma.a;

public final class d implements Runnable	// class@002b67
{
    public final c b;

    public void d(c p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       c t = tb.t;
       if (t != null) {
          if (t.K()) {
             a.v((a.g() + 1));
          }
          tb.t.q(3);
          tb.t = null;
       }
       return;
    }
}
