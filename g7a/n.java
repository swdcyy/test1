package g7a.n;
import ok.x;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import java.lang.Object;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Long;

public final class n implements x	// class@0023ee
{
    public final NasaCommentCreatorPresenter b;

    public void n(NasaCommentCreatorPresenter p0){
       this.b = p0;
    }
    public final Object get(){
       return Long.valueOf(this.b.w.getPlayer().getCurrentPosition());
    }
}
