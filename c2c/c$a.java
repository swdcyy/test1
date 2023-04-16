package c2c.c$a;
import erd.g;
import c2c.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;

public final class c$a implements g	// class@0004f7
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "1") && b)) {
          this.b.b.V8();
       }
       return;
    }
}
