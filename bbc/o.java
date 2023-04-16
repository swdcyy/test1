package bbc.o;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;

public final class o implements Runnable	// class@000435
{
    public final WeakReference b;
    public final ProgressFragment c;

    public void o(WeakReference p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       o tb = this.b;
       o tc = this.c;
       if (tb.get() != null) {
          tc.show(tb.get().getSupportFragmentManager(), "runner");
       }
       return;
    }
}
