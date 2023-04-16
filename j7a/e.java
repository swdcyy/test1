package j7a.e;
import com.kwai.framework.player.core.b$b;
import j7a.i;
import java.lang.Object;
import java.util.Objects;
import uc6.c;
import sd5.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;

public final class e implements b$b	// class@00292b
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void d(int p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 3) {
          tb.p.N().getCover().setForegroundDrawable(null);
       }
       return;
    }
}
