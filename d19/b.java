package d19.b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.String;
import yx.j0;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class b implements g	// class@002027
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = new Object[0];
       j0.f("BasePhotoCoverPresenter", "new photo update", p0);
       tb.V8(tb.P8(), tb.q.getColor(), true);
    }
}
