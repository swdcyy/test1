package nn1.m;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public final class m	// class@00338c
{
    public final KwaiImageView a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final LifecycleOwner e;

    public void m(View p0,LifecycleOwner p1){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       super();
       this.d = p0;
       this.e = p1;
       this.a = p0.findViewById(0x7f0a201b);
       this.b = p0.findViewById(0x7f0a201c);
       this.c = p0.findViewById(0x7f0a201e);
    }
}
