package c47.l;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kwai.live.gzone.commandlottery.a;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class l implements FollowHelper$a	// class@0004d7
{
    public final a a;

    public void l(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,g p1){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, l.class, "1")) {
          return;
       }
       this.a.o0(p0);
       return;
    }
}
