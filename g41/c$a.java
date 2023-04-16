package g41.c$a;
import java.lang.Runnable;
import g41.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class c$a implements Runnable	// class@00241a
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       c$a tb1 = this.b;
       tb.e(tb.n.getMeasuredWidth(), this.b.n.getMeasuredHeight(), -1, this.b.o.getView(), tb1.m, tb1.n);
       return;
    }
}
