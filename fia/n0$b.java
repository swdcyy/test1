package fia.n0$b;
import erd.g;
import fia.n0;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import fia.a;
import kotlin.jvm.internal.a;

public final class n0$b implements g	// class@002927
{
    public final n0 b;

    public void n0$b(n0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$b.class, "1")) {
       }else {
          n0$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, n0.class, "5") && p0 != null) {
             RealAction mFeed = p0.mFeed;
             String id = (mFeed != null)? mFeed.getId(): null;
             boolean b = a.g(id, tb.b9().getPhotoId());
             if (tb.s9() && (b && (tb.q9() && p0.mActionType == 3))) {
                tb.l9();
             }
          }
       }
    label_004f :
       return;
    }
}
