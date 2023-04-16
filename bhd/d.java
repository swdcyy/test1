package bhd.d;
import ygc.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import chc.a;
import chc.b;
import zgc.b;
import bhd.e;
import android.view.ViewGroup;
import y8c.f;
import ygc.d;
import ygc.c;
import android.view.View;
import ygc.a;
import com.yxcorp.plugin.setting.stencil.item.bindphone.BindPhoneItem;

public class d implements b	// class@000264
{

    public void d(){
       super();
    }
    public PresenterV2 a(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new b());
       obj.U7(new b());
       obj.U7(new e());
       PatchProxy.onMethodExit(d.class, "2");
       return obj;
    }
    public int b(){
       return 0x7f0d14c3;
    }
    public f c(ViewGroup p0){
       return c.b(this, p0);
    }
    public View d(ViewGroup p0){
       return a.a(this, p0);
    }
    public Class e(){
       return BindPhoneItem.class;
    }
}
