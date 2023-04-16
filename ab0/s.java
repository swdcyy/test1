package ab0.s;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.RetrofitException;
import e17.i;
import com.yxcorp.gifshow.util.PostUtils;

public final class s implements g	// class@00004d
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          a.p(p0, "throwable");
          if (p0 instanceof RetrofitException) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          }
          PostUtils.D("SmartAlbumRestartPresenter", "changePrivateOption", p0);
       }
       return;
    }
}
