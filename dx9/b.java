package dx9.b;
import erd.g;
import com.yxcorp.gifshow.detail.comment.limitcomment.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements g	// class@001fe6
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f1007b3);
       tb.getActivity().finish();
    }
}
