package nfd.z2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.search.utils.f0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;

public class z2 implements PopupInterface$h	// class@001e2d
{
    public final f0 b;

    public void z2(f0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(z2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, z2.class, "1")) {
          return;
       }
       f0.l = null;
       n.C(this.b.a.getActivity());
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
