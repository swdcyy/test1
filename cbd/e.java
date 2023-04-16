package cbd.e;
import android.view.View$OnLongClickListener;
import com.yxcorp.plugin.search.kbox.weak.a;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.utils.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.utils.f0$c;

public final class e implements View$OnLongClickListener	// class@00051a
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       e tb = this.b;
       a p = tb.p;
       if (!p instanceof SearchResultFragment) {
       }else {
          new f0().g(p, tb.q, tb.m8(), tb.m8(), null);
       }
       return true;
    }
}
