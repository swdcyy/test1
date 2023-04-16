package dl9.l1;
import erd.g;
import dl9.u1;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View;

public final class l1 implements g	// class@001f77
{
    public final u1 b;

    public void l1(u1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, u1.class, "10")) {
       }else {
          tb.s.setSelected(p0.mLiked);
          tb.u.setSelected(p0.mLiked);
          tb.e9();
       }
       return;
    }
}
