package fia.a$h;
import erd.g;
import fia.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public final class a$h implements g	// class@0028eb
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          this.b.q = 3;
          c.e(KsLogFollowTag.FOLLOW_GUIDE.appendTag("BaseFeatureToFollowGuidePresenter"), "requestGuideData", p0);
       }
       return;
    }
}
