package b4d.x0;
import java.lang.Runnable;
import b4d.v0$d;
import java.lang.Object;
import b4d.v0;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class x0 implements Runnable	// class@00039e
{
    public final v0$d b;

    public void x0(v0$d p0){
       this.b = p0;
    }
    public final void run(){
       x0 tb = this.b;
       v0$d d = tb.d;
       if (d.G == null) {
          d.E.setImageDrawable(null);
          tb.d.E.setVisibility(8);
       }
       return;
    }
}
