package gka.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import android.widget.ImageView;

public final class v implements Runnable	// class@002b1b
{
    public final ProgressFragment b;

    public void v(ProgressFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.t.setVisibility(0);
    }
}
