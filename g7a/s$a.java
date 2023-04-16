package g7a.s$a;
import uid.e$a;
import g7a.s;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import com.yxcorp.gifshow.comment.utils.e;

public final class s$a implements e$a	// class@0023f7
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public final void a(QMedia p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       NasaCommentExternalEditorPresenter.P8(this.a.b).y(p0);
       NasaCommentExternalEditorPresenter.P8(this.a.b).B();
       return;
    }
}
