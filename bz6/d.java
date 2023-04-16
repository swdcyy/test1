package bz6.d;
import java.lang.Runnable;
import com.kwai.library.slide.base.widget.d$a;
import java.lang.Object;
import android.view.View;

public final class d implements Runnable	// class@0004bd
{
    public final d$a b;

    public void d(d$a p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       tb.getView().setAlpha(0x3f800000);
       tb.D();
    }
}
