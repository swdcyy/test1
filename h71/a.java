package h71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.a$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import bz1.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import lp3.c;

public final class a extends AbstractLiveJsCommand	// class@00262b
{

    public void a(){
       super();
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       a uoa = a.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof a$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("invalid params, wishBarrageCommentInfo is null");
       }
       if (p0.type != 1) {
          return m.g.c("invalid params, type not support");
       }
       if (this.g(uoa) == null) {
          return m.g.c("LiveAudienceWishRoomService is null");
       }
       a uoa1 = this.g(uoa);
       if (uoa1 != null) {
          uoa1.cl(p0.a());
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
