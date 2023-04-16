package g7a.r;
import n3d.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import m9a.t$c;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class r implements a	// class@0023f6
{
    public final NasaCommentExternalEditorPresenter b;
    public final int c;
    public final t$c d;

    public void r(NasaCommentExternalEditorPresenter p0,int p1,t$c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, r.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          this.b.W8(this.c, this.d);
       }
       return;
    }
}
