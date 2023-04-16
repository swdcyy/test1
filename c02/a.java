package c02.a;
import ih3.a;
import xp5.g;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;

public class a implements a	// class@000447
{
    public final g a;

    public void a(g p0){
       super();
       this.a = p0;
    }
    public Map a(){
       HashMap obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("anchorId", this.a.d());
       obj.put("liveStreamId", this.a.getLiveStreamId());
       obj.put("currentUserId", QCurrentUser.me().getId());
       return obj;
    }
}
