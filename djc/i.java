package djc.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.widget.d;
import java.lang.Object;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class i implements Runnable	// class@0021fd
{
    public final d b;

    public void i(d p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       tb.y.setPeekHeight(tb.m.getMeasuredHeight());
    }
}
