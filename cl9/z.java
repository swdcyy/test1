package cl9.z;
import com.yxcorp.gifshow.comment.utils.e$c;
import cl9.y;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.Iterator;
import xk9.d;
import kk9.d;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Boolean;
import hl9.i0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;

public class z implements e$c	// class@00068c
{
    public final y a;

    public void z(y p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       Iterator iterator = this.a.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.a.F.e(), p0);
       }
       return;
    }
    public Boolean b(BaseEditorFragment$g p0){
       return i0.d(this, p0);
    }
    public void c(BaseEditorFragment$g p0){
       i0.a(this, p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       z ta = this.a;
       if (ta.E == null) {
          return;
       }
       if (TextUtils.x(ta.F.k())) {
          this.a.E.setVisibility(8);
       }else {
          this.a.E.setVisibility(0);
       }
       return;
    }
}
