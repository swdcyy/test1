package nn1.g;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import android.widget.TextView;

public final class g	// class@003382
{
    public final KwaiImageView a;
    public final LiveCoverIconView b;
    public final TextView c;
    public final KwaiImageView d;
    public final View e;
    public final LifecycleOwner f;

    public void g(View p0,LifecycleOwner p1){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       super();
       this.e = p0;
       this.f = p1;
       this.a = p0.findViewById(0x7f0a2016);
       this.b = p0.findViewById(0x7f0a2018);
       this.c = p0.findViewById(0x7f0a2019);
       this.d = p0.findViewById(0x7f0a2017);
    }
}
