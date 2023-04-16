package h43.b$a;
import h43.b;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h43.d;
import z61.b;
import java.lang.Boolean;
import h43.a;
import x61.c;
import lp3.c;
import lp3.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;
import nl8.l;
import nl8.o;
import lp3.i;

public class b$a implements b	// class@002c39
{
    public e a;
    public final d b;
    public final MutableLiveData c;

    public void b$a(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       d uod = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
          uod.mFeatureId = 4003;
          uod.mIsVisible = Boolean.FALSE;
          uod.mClickCallback = new a(p0);
       }
       this.b = uod;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "5")) {
          return;
       }
       this.a.a(c.class).O0(4003);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "4")) {
          return;
       }
       this.c.setValue(this.b);
       this.a.a(c.class).v1(this.c);
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       this.a = p0.e(i.class);
       return;
    }
    public void setVisible(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
