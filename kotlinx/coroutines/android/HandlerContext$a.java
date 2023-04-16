package kotlinx.coroutines.android.HandlerContext$a;
import ftd.c1;
import kotlinx.coroutines.android.HandlerContext;
import java.lang.Runnable;
import java.lang.Object;
import android.os.Handler;

public final class HandlerContext$a implements c1	// class@001931
{
    public final HandlerContext b;
    public final Runnable c;

    public void HandlerContext$a(HandlerContext p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void dispose(){
       this.b.d.removeCallbacks(this.c);
    }
}
