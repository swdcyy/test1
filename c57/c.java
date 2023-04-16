package c57.c;
import erd.g;
import c57.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import c57.f$a;
import java.lang.Enum;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.Fragment;
import wkd.b;
import z47.c;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c implements g	// class@0004e7
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       int i = f$a.a[p0.ordinal()];
       if (i != 1 && (i == 2 && tb.r.b().isResumed())) {
          i = b.a(-1181769043);
          String userId = tb.u.getUserId();
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoidOneRefs(userId, i, c.class, "2") && !TextUtils.x(userId)) {
             i.a = userId;
          }
       }
       return;
    }
}
