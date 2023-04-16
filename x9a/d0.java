package x9a.d0;
import x9a.a;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public abstract class d0 implements a	// class@0044a1
{
    public final Activity a;
    public final KemDialogResponse b;
    public final k0 c;

    public void d0(Activity p0,KemDialogResponse p1,k0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Activity a(){
       return this.a;
    }
    public final KemDialogResponse b(){
       return this.b;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.a.hasWindowFocus() || (this.b.mEffectPolicy == b && !TextUtils.n(this.c.a, QCurrentUser.ME.getId()))) {
          b = false;
       }
       return b;
    }
}
