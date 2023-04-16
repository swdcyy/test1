package mu1.d;
import java.lang.Runnable;
import mu1.e;
import java.lang.Object;
import kotlin.Pair;
import mu1.a;
import android.widget.FrameLayout;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import hu1.c;

public final class d implements Runnable	// class@00321b
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       e b = tb.b;
       tb.b.p.a().setValue(new Pair(b.r, Integer.valueOf(b.l.getMeasuredWidth())));
    }
}
