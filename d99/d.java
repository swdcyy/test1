package d99.d;
import erd.g;
import d99.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import y89.h;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentParam;
import android.view.ViewTreeObserver;
import android.view.View;
import d99.e;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class d implements g	// class@00209a
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oh, "4")) {
          b = tb.q.get();
          oh = tb.x.e;
          NormalDetailBizParam mReplaceFrag = tb.p.mReplaceFragmentParam;
          if (oh != null && (mReplaceFrag != null && (mReplaceFrag.mReplaceFragmentAnimationParam != null && b != null))) {
             oh.getViewTreeObserver().addOnPreDrawListener(new e(tb, oh, mReplaceFrag, b));
          }
       }
    label_0046 :
       return;
    }
}
