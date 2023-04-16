package fx9.b$b;
import xk9.j;
import fx9.b;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.response.CommentReportParams;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class b$b implements j	// class@002365
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public Map a(){
       HashMap obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       b$b ta = this.a;
       obj.put("commentReportParams", new Gson().q(new CommentReportParams(ta.s, ta.q.getPlayer().getCurrentPosition())));
       return obj;
    }
    public Map b(){
       HashMap obj = PatchProxy.apply(null, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("playerSessionId", this.a.q.c());
       obj.put("currentTranscodeType", this.a.q.getPlayer().getCurrentTranscodeType());
       return obj;
    }
}
