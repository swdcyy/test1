package dw2.j$c;
import java.lang.Runnable;
import dw2.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import dw2.i$b;
import kotlin.jvm.internal.a;
import dw2.i;

public final class j$c implements Runnable	// class@0025be
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       j$c tb = this.b;
       i$b d = i$b.d;
       tb.r0(tb.u0()).setValue(d);
       if (a.g(this.b.b, d) ^ 0x01) {
          tb = this.b;
          tb.w0(tb.b);
          this.b.b = d;
       }
       return;
    }
}
