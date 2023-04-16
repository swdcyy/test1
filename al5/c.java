package al5.c;
import vk5.d$b;
import al5.e;
import java.lang.Object;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import xk5.c;
import vk5.d;
import android.util.Pair;
import java.lang.Integer;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import yk5.f;
import yk5.a;

public final class c implements d$b	// class@0000cc
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final void q0(int p0){
       c ta = this.a;
       if (ta.p.isEnableGIFSearchTAB() && !p0) {
          e t = ta.t;
          if (t != null) {
             t.i();
          }else if(ta.y == p0){
             ta.y = p0;
             ta.x.K0(p0);
             if (ta.p.isEnableGIFSearchTAB()) {
                p0--;
             }
             ta.s.onNext(new Pair(Integer.valueOf(p0), Boolean.TRUE));
             t = ta.t;
             if (t != null) {
                t.b(ta.q.c(p0));
             }
          }
       }else {
          goto label_0014 ;
       }
       return;
    }
}
