package mf9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import android.view.ViewGroup;

public final class e implements Runnable	// class@003025
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       d l = tb.l;
       if (l == null) {
       }else {
          View view = l.findViewById(R.id.use_sample_view_stub);
          if (view == null) {
             view = tb.l.findViewById(R.id.follow_shoot_sample_view);
          }
          if (view != null) {
             tb.v = tb.l.indexOfChild(view) + 1;
          }
       }
       return;
    }
}
