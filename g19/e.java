package g19.e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Object;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class e implements g	// class@0023b5
{
    public final MilanoItemProfileSidePresenter b;

    public void e(MilanoItemProfileSidePresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       if (tb.W != null) {
          tb.R.onNext(Boolean.TRUE);
       }
       return;
    }
}
