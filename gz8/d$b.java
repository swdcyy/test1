package gz8.d$b;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import vq4.d;

public final class d$b implements g	// class@002528
{
    public final QPhoto b;

    public void d$b(QPhoto p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          QPhoto mEntity = this.b.mEntity;
          a.o(mEntity, "liveInfo.mEntity");
          p0.F.o = mEntity.getId();
          p0.o0 = 1;
       }
       return;
    }
}
