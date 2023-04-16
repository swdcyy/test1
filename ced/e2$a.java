package ced.e2$a;
import android.view.View$OnClickListener;
import ced.e2;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import gbd.s;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.utils.k;

public final class e2$a implements View$OnClickListener	// class@00054f
{
    public final e2 b;
    public final KBoxObjectModel c;

    public void e2$a(e2 p0,KBoxObjectModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e2$a.class, "1")) {
          return;
       }
       e2$a tc = this.c;
       if (tc != null) {
          KBoxObjectModel mActionUrl = tc.mActionUrl;
          if (mActionUrl != null) {
             if (e2.P8(this.b) instanceof SearchResultFragment) {
                SearchResultFragment searchResult = e2.P8(this.b);
                e2 t = this.b.t;
                if (t == null) {
                   a.S("mSearchItem");
                }
                s.c(searchResult, 1, false, t);
             }
             k.c(this.b.getActivity(), mActionUrl);
          }
       }
       return;
    }
}
