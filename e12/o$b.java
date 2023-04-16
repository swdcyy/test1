package e12.o$b;
import ub2.j;
import e12.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import wg3.b;
import java.util.List;
import z12.x;

public class o$b implements j	// class@002606
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
          return;
       }
       o.D0(this.a, p0.getEntity());
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "2")) {
          return;
       }
       o.E0(this.a, x.J(p0));
       return;
    }
}
