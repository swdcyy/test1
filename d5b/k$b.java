package d5b.k$b;
import erd.g;
import d5b.k;
import java.lang.Object;
import a5b.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.yxcorp.utility.n;

public final class k$b implements g	// class@002447
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
       }else if(TextUtils.isEmpty(p0.a())){
          n.Y(k.P8(this.b), 0, 0);
       }else {
          n.Y(k.P8(this.b), 4, true);
       }
       return;
    }
}
