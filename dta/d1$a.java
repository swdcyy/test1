package dta.d1$a;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import wq6.h;
import tkd.b;
import tkd.d;
import lp5.a;
import com.kwai.kcube.TabIdentifier;

public final class d1$a implements BottomActionBarTabLayout$a	// class@00252a
{

    public void d1$a(){
       super();
    }
    public boolean a(TabLayout$f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "tab");
       h oh = p0.d();
       if (oh != null) {
          return d.a(0x193fad4a).n5(oh.M2());
       }
       return false;
    }
}
