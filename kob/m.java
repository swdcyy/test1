package kob.m;
import kob.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Throwable;
import java.lang.String;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.retrofit.model.RetrofitException;

public class m extends f	// class@003373
{

    public void m(RecyclerFragment p0){
       super(p0);
    }
    public KwaiEmptyStateView b(Throwable p0,String p1){
       KwaiException mErrorMessag;
       int i;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f1038e5);
       String str = null;
       if (!TextUtils.x(p1)) {
          mErrorMessag = p0.mErrorMessage;
          str = mErrorMessag;
       }
       i.d(R.style.arg_RES_7f110668, mErrorMessag);
       KwaiEmptyStateView kwaiEmptySta = super.b(p0, str);
       i = (p0 instanceof RetrofitException)? 1: 2;
       kwaiEmptySta.d(i);
       return kwaiEmptySta;
    }
}
