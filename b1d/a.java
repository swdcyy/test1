package b1d.a;
import java.lang.Runnable;
import com.yxcorp.login.authorization.slide.AuthHorizontalSlideView;
import java.lang.Object;
import com.yxcorp.login.authorization.slide.AuthHorizontalSlideView$a;
import com.kwai.library.widget.scrollview.HorizontalSlideView;

public final class a implements Runnable	// class@000314
{
    public final AuthHorizontalSlideView b;

    public void a(AuthHorizontalSlideView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       tb.k.b(tb);
    }
}
