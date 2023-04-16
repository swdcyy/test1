package k99.t;
import com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter;
import android.view.View;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;

public final class t extends CoverPadAdaptationPresenter	// class@002b98
{
    public View s;

    public void t(){
       super();
    }
    public View V8(){
       return this.s;
    }
    public Float[] W8(){
       Float[] obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Float[]{Float.valueOf(0x3f800000),Float.valueOf(0x3f4ccccd)};
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a130c);
       return;
    }
}
