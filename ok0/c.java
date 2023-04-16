package ok0.c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.util.List;
import ok0.d;

public final class c implements Observer	// class@00350f
{
    public final KwaiImageView b;

    public void c(KwaiImageView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       d.b(this.b, p0);
    }
}
