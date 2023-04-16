package g7a.t;
import ekd.f$j;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class t extends f$j	// class@0023fc
{
    public final NasaCommentExternalEditorPresenter a;

    public void t(NasaCommentExternalEditorPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       t ta = this.a;
       ta.S8(ta.B);
       ta.B = null;
       return;
    }
}
