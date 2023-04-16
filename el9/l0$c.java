package el9.l0$c;
import erd.g;
import el9.l0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.a;
import pk9.f;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.gifshow.comment.presenter.global.CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1;
import qrd.l1;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class l0$c implements g	// class@0021f7
{
    public final l0 b;

    public void l0$c(l0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$c.class, "1")) {
       }else if(this.b.r != null){
          Object[] objArray = new Object[0];
          m1.C().w("CommentSubCommentAnimPresenter", "set itemAnimator", objArray);
          p0 = this.b;
          p0.r = true;
          p0 = l0.P8(p0).h0();
          a.o(p0, "mFragment.recyclerView");
          f uof = new f();
          uof.w(300);
          uof.A(150);
          uof.z(300);
          uof.x(0);
          uof.v = new CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1(this);
          p0.setItemAnimator(uof);
          l0.P8(this.b).h0().postDelayed(this.b.s, 500);
       }
       return;
    }
}
