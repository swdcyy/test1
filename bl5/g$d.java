package bl5.g$d;
import androidx.recyclerview.widget.RecyclerView$n;
import bl5.g;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ol8.a;
import lnc.a1;
import uk5.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import nk5.m;
import com.kwai.robust.PatchProxyResult;
import com.kwai.emotionsdk.util.ActivityContext;
import android.app.Activity;
import java.lang.Number;
import com.yxcorp.utility.n;
import java.lang.Integer;

public class g$d extends RecyclerView$n	// class@0004d5
{
    public int a;
    public int b;
    public final g c;

    public void g$d(g p0){
       this.c = p0;
       super();
       this.f();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g$d.class, "2")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       int i = 1;
       if (this.c.v.f0(childAdapter) == i) {
          p0.top = a1.d(0x7f070295);
          p0.bottom = a1.d(0x7f07030a);
          p0.left = a1.d(0x7f0702ab);
       }else if(!this.c.v.f0(childAdapter)){
          p0.top = a.f;
          g$d tc = this.c;
          g d = tc.D;
          int i1 = this.c.z.size() % d;
          if (i1) {
             d = i1;
          }
          if ((tc.v.getItemCount() - childAdapter) <= d) {
             p0.bottom = a.g;
          }
          if (!q.f(this.c.B)) {
             i1 = (childAdapter <= (this.c.B.size() + i))? (childAdapter - 1) % this.c.D: ((childAdapter - this.c.B.size()) - 2) % this.c.D;
          }else {
             i1 = (childAdapter - 1) % this.c.D;
          }
          p0.left = (a.e + ((this.b + a.d) * i1)) - ((this.a / this.c.D) * i1);
          m.b("EmotionSDK", "outLeft:"+p0.left+"pos:"+childAdapter);
       }
       return;
    }
    public void f(){
       Activity uActivity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$d.class, "1")) {
          return;
       }
       g x = this.c.x;
       int i = 0;
       if (x <= null) {
          uActivity = ActivityContext.d().c();
          Object obj1 = PatchProxy.applyOneRefs(uActivity, objArray, uoa, "3");
          if (obj1 != patchProxyRe) {
             x = obj1.intValue();
          }else if(uActivity == null){
             x = 0;
          }else {
             x = n.m(uActivity);
          }
       }
       this.a = x;
       uActivity = ActivityContext.d().c();
       g$d tc = this.c;
       g d = tc.D;
       g x1 = tc.x;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyThreeRefs(uActivity, Integer.valueOf(d), Integer.valueOf(x1), null, a.class, "2");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(d <= 1){
             if (x1 <= null && uActivity != null) {
                x1 = n.m(uActivity);
             }
             i = ((x1 - (a.e * 2)) - (a.d * d)) / (d - 1);
          }
       }else {
          goto label_006c ;
       }
       this.b = i;
       return;
    }
}
