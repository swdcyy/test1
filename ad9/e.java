package ad9.e;
import java.lang.Runnable;
import ad9.i;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import ad9.f;
import com.kwai.library.widget.popup.common.f;

public final class e implements Runnable	// class@00009c
{
    public final i b;
    public final View c;

    public void e(i p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       f.G(tc, new f(tb, tc));
    }
}
