package ej2.u;
import java.lang.Runnable;
import ej2.v;
import java.lang.Object;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public final class u implements Runnable	// class@00273c
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       if (!j.h(tb.q)) {
          tb.p.U(tb.q);
       }else {
          tb.p.setVisibility(8);
       }
       return;
    }
}
