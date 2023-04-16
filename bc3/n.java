package bc3.n;
import qd3.r$a;
import com.kuaishou.live.lite.luckystar.d;
import android.view.View;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.luckystar.LiveLiteLuckyStarPendantView;
import qd3.q;
import z1.k;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.tempplay.d;

public class n implements r$a	// class@00037c
{
    public final View a;
    public final d b;

    public void n(d p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public View a(Context p0){
       return this.a;
    }
    public LivePkShimmerLayout b(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.h;
       if (obj != null) {
          objArray = obj.getShimmerView();
       }
       return objArray;
    }
    public void c(){
       q.b(this);
    }
    public View d(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.h;
       if (obj != null) {
          objArray = obj.getAnchorView();
       }
       return objArray;
    }
    public boolean e(){
       return true;
    }
    public View f(){
       return this.b.g;
    }
    public void g(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       d.b(this.b.e.get().a(), "LUCY_ASST", null);
       return;
    }
    public int getBizId(){
       return 1;
    }
    public void h(){
       q.a(this);
    }
    public String i(){
       return "LUCY_ASST";
    }
}
