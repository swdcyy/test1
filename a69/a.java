package a69.a;
import erd.g;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.Fragment;
import y8c.g;
import g9c.a;

public final class a implements g	// class@00004b
{
    public final FeedAggregateFragment b;

    public void a(FeedAggregateFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, FeedAggregateFragment.class, "13")) {
       }else if(tb.L != 16 || p0.d != null){
          if (p0.c == null) {
             Iterator iterator = tb.q().getItems().iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                if (TextUtils.n(p0.b, qPhoto.getUserId())) {
                   tb.q().remove(qPhoto);
                }
             }
             if (tb.q().isEmpty()) {
                tb.q().a();
             }
          }
          if (p0.c != null && (!tb.isResumed() && tb.g7().R0())) {
             tb.q().a();
          }
       }
    label_007c :
       return;
    }
}
