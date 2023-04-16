package k99.h0;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.f;
import java.lang.Object;
import android.view.View$OnLayoutChangeListener;
import android.view.View;

public final class h0 implements Runnable	// class@002b7c
{
    public final f b;

    public void h0(f p0){
       this.b = p0;
    }
    public final void run(){
       h0 tb = this.b;
       tb.x.addOnLayoutChangeListener(tb.F);
    }
}
