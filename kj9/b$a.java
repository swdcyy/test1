package kj9.b$a;
import androidx.recyclerview.widget.RecyclerView$o;
import kj9.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView;
import androidx.recyclerview.widget.RecyclerView;

public class b$a implements RecyclerView$o	// class@002ca4
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.S8(0);
       b t = this.b.t;
       if (t != null) {
          t.z();
          b$a tb = this.b;
          tb.t.removeOnChildAttachStateChangeListener(tb.y);
       }
       return;
    }
}
