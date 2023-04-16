package dac.h;
import erd.g;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import wwb.o;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import java.lang.Throwable;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import xac.f;
import qvb.n0;
import qvb.a;

public final class h implements g	// class@002140
{
    public final ExploreFriendContactFragment b;
    public final boolean c;

    public void h(ExploreFriendContactFragment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a uoa;
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       if (i) {
          if (i != 1) {
             if (i == 2) {
             label_006a :
                uoa = new a(null, -1, null, null, 0, 0);
                tb.sh().k(true, new KwaiException(v13));
                tb.Ac().setEnabled(false);
             }
          }else if(!o.c(QCurrentUser.me().getId()) && tc != null){
             uoa = new a(null, -1, null, null, 0, 0);
             tb.sh().k(true, new KwaiException(v13));
             tb.Ac().setEnabled(false);
          }else if(tb.c1() && (!tb.Ih().isLoading() && tb.Ih().isEmpty())){
             tb.a();
          }
       }else {
          goto label_006a ;
       }
       return;
    }
}
