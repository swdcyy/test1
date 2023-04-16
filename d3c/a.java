package d3c.a;
import b3c.g;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import d3c.b;
import com.yxcorp.gifshow.profile.ProfileStyle;
import b3c.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e3c.b;
import com.kwai.page.component.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import ae7.b;
import ee7.d;
import com.kwai.framework.model.user.User;
import e3c.a;
import be7.a;
import androidx.lifecycle.Observer;

public class a extends g	// class@0020bd
{
    public final b p;

    public void a(LifecycleOwner p0,View p1,b p2,ProfileStyle p3){
       super(p0, p1, p2, p3);
       this.p = p2;
    }
    public void m(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       super.m();
       b uob = new b(this, this.p.f, this.c.c, this.m.mUser);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
          uob.a.e(uob.c, new a(uob));
       }
       return;
    }
}
