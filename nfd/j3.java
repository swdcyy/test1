package nfd.j3;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.utils.h0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.fragment.f;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class j3 implements View$OnClickListener	// class@001dc0
{
    public final h0 b;

    public void j3(h0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j3 tb = this.b;
       Objects.requireNonNull(tb);
       if (!NetworkUtilsCached.k()) {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f104dbe));
       }else {
          tb.g.q().a();
       }
       return;
    }
}
