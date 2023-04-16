package ab0.u$b;
import erd.g;
import ab0.u;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.RetrofitException;
import e17.i;
import ab0.t;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.util.PostUtils;

public final class u$b implements g	// class@000055
{
    public final u b;
    public final boolean c;

    public void u$b(u p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$b.class, "1")) {
       }else {
          a.p(p0, "throwable");
          if (p0 instanceof RetrofitException) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
             t.P8(this.b.a).g(this.c, true, false);
          }
          PostUtils.D("SmartAlbumSettingsPresenter", "changePrivateOption", p0);
       }
       return;
    }
}
