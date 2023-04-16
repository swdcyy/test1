package h5a.a;
import com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;

public final class a extends CoverPadAdaptationPresenter	// class@00256b
{
    public View s;

    public void a(){
       super();
    }
    public View V8(){
       return this.s;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a43e1);
       return;
    }
}
