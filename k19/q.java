package k19.q;
import android.view.View$OnClickListener;
import k19.r;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import yx.j0;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class q implements View$OnClickListener	// class@002a8d
{
    public final r b;

    public void q(r p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       j0.a("AdDetailMerchandiseItemClosePresenter", "close click", objArray);
       tb.p.onNext(Integer.valueOf(3));
    }
}
