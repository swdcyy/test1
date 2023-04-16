package mg.l2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsFetchExtActivityParams;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import i46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import org.json.JSONObject;

public final class l2 implements Runnable	// class@002632
{
    public final JsFetchExtActivityParams b;
    public final g c;

    public void l2(JsFetchExtActivityParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       l2 tb = this.b;
       l2 tc = this.c;
       a.p(tb, "params");
       b uob = y6.r(b.class);
       if (uob == null) {
          if (tb.mToString != null) {
             if (tc != null) {
                tc.onSuccess("");
             }
          }else if(tc != null){
             tc.onSuccess(new JSONObject());
          }
       }else if(tc != null){
          tc.onSuccess(uob.ZZ(tb.mToString));
       }
       return;
    }
}
