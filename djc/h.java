package djc.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.widget.d;
import java.lang.Object;
import android.app.Dialog;

public final class h implements Runnable	// class@0021f9
{
    public final d b;

    public void h(d p0){
       this.b = p0;
    }
    public final void run(){
       this.b.cancel();
    }
}
