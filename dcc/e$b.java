package dcc.e$b;
import erd.g;
import dcc.e;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dcc.c;
import com.kwai.library.widget.button.SlipSwitchButton;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class e$b implements g	// class@00216f
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
       }else {
          this.b.d.g(p0.mFavorited, true, false);
          p0 = this.b;
          if (p0.g != null) {
             p0 = p0.h;
             if (p0.mFavorited != null) {
                i = (p0.isFemale())? 0x7f100e5a: 0x7f100e5b;
             }else {
                i = 0x7f100e59;
             }
             i.d(R.style.arg_RES_7f11066a, a1.p(i));
          }
       }
       return;
    }
}
