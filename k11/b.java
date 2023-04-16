package k11.b;
import k11.a;
import android.view.View;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class b extends a	// class@002c5d
{

    public void b(View p0,HighFluencyLikeViewStateController p1,long p2){
       super(p0, p1, p2);
    }
    public void a(){
    }
    public void b(){
    }
    public void c(View p0){
    }
    public int d(){
       return 0;
    }
    public void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 >= 50) {
          this.b.c(3, p0);
       }else if(p0 >= 10){
          this.b.c(2, p0);
       }else if(p0 >= 5){
          this.b.c(1, p0);
       }
       return;
    }
}
