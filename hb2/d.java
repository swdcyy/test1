package hb2.d;
import tq5.a;
import hb2.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import xj2.a;
import kp3.e;
import com.kuaishou.live.core.basic.utils.e;
import f12.d;

public final class d implements a	// class@002d43
{
    public final g a;

    public void d(g p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       d ta = this.a;
       Objects.requireNonNull(ta);
       g obj = PatchProxy.apply(null, ta, g.class, "9");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = ta.y;
          if (obj != null && !obj.getTranslationX()) {
             if (ta.getActivity() instanceof LivePlayActivity) {
                ta.s.c.m();
             }else if(e.s(ta.getActivity())){
                ta.R8().l().m();
             }
             ta.V8(b);
          }else {
             b = 0;
          }
       }
       return b;
    }
}
