package bd3.e;
import qd3.r$a;
import com.kuaishou.live.lite.redpacket.a;
import android.view.View;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.redpacket.LiveLiteRedPackPendantView;
import qd3.q;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.lite.tempplay.d;

public class e implements r$a	// class@000383
{
    public final View a;
    public final a b;

    public void e(a p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public View a(Context p0){
       return this.a;
    }
    public LivePkShimmerLayout b(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.p;
       if (obj != null) {
          objArray = obj.getShimmerView();
       }
       return objArray;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       q.b(this);
       b.P(LiveLiteLogTag.LIVE_LITE_RED_PACK.appendTag("LiveLiteRedPackController"), "onRemovedFromProfitArea");
       return;
    }
    public View d(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.p;
       if (obj != null) {
          objArray = obj.getAnchorView();
       }
       return objArray;
    }
    public boolean e(){
       return true;
    }
    public View f(){
       return this.b.q;
    }
    public void g(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       d.b(this.b.l.a(), "LEEE", null);
       return;
    }
    public int getBizId(){
       return 2;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       q.a(this);
       b.P(LiveLiteLogTag.LIVE_LITE_RED_PACK.appendTag("LiveLiteRedPackController"), "onAddedToProfitArea");
       return;
    }
    public String i(){
       return "RED_PACKAGE";
    }
}
