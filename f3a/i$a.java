package f3a.i$a;
import android.view.View$OnClickListener;
import f3a.i;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class i$a implements View$OnClickListener	// class@002283
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.b.d.a();
       return;
    }
}
