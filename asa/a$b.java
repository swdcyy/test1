package asa.a$b;
import zq6.u;
import asa.a;
import java.lang.Object;
import wn5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import wq6.f;
import wq6.g;
import java.lang.CharSequence;
import wq6.h;
import com.kwai.kcube.TabIdentifier;
import bo5.a;
import zq6.p;

public final class a$b implements u	// class@0002d9
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public final void a(b p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "tabText");
       Activity uActivity = n.d(a.S8(this.a));
       if (!uActivity instanceof FragmentActivity) {
          uActivity = null;
       }
       String str = "ato_operate";
       if (uActivity != null) {
          d uod = c.a(uActivity);
          a.o(uod, "IKCubeHomeTabDataStore.get\(activity\)");
          b = uod.d().d(str);
       }else {
          b = a.P8(this.a).x(str);
       }
       String str1 = p0.d(b);
       a.S8(this.a).setText(str1);
       a.S8(this.a).setContentDescription(str1);
       if (a.g(a.R8(this.a).M2().getType(), str)) {
          p s = a.s;
          a.o(s, "HomeTopStateId.TAB_TEXT");
          this.a.W8(s, p0);
       }
       return;
    }
    public void onChange(Object p0){
       this.a(p0);
    }
}
