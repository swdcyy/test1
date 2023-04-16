package cl9.a0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import cl9.y;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.Iterator;
import xk9.d;
import kk9.d;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kuaishou.android.model.mix.QComment;
import ek9.t0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import com.kuaishou.weapon.i.WeaponHI;

public class a0 implements BaseEditorFragment$c	// class@000603
{
    public final y a;

    public void a0(y p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "3")) {
          return;
       }
       a0 ta = this.a;
       ta.L = p0.a;
       Iterator iterator = ta.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.a.F.e(), this.a.F.g(), p0);
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       Iterator iterator = this.a.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().e(this.a.F.e(), this.a.F.g(), p0);
       }
       if (p0 != null) {
          a0 ta = this.a;
          y i = ta.I;
          if (i != null) {
             BaseEditorFragment$h c = p0.c;
             if (c != null && p0.a == -1) {
                ta.w.b(0, i);
             }else if(c == null && (p0.a + p0.b) <= n.j(ta.getActivity())){
                ta = this.a;
                ta.w.b(p0.a, ta.I);
             }
          }
       }
       return;
    }
    public void d(BaseEditorFragment$m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       Iterator iterator = this.a.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(this.a.F.e(), this.a.F.g(), p0);
       }
       WeaponHI.setT(3, p0.c);
       return;
    }
}
