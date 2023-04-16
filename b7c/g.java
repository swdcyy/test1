package b7c.g;
import erd.g;
import com.yxcorp.gifshow.pymk.element.b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o7c.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class g implements g	// class@0003c8
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, str)) {
       }else {
          b s = tb.s;
          if (s instanceof b) {
             b v = tb.v;
             Objects.requireNonNull(s);
             if (!PatchProxy.applyVoidTwoRefs(p0, v, s, b.class, str) && (p0 != null && p0.isFollowingOrFollowRequesting())) {
                p0 = s.f;
                if (p0 != null) {
                   p0.smoothScrollBy((v.getWidth() + b.g), 0);
                }
             }
          }
       }
       return;
    }
}
