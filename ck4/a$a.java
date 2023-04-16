package ck4.a$a;
import ak4.a$a;
import androidx.fragment.app.FragmentActivity;
import u07.t$a;
import java.lang.String;
import lnc.a1;
import ck4.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public final class a$a extends a$a	// class@000487
{
    public FragmentActivity D0;

    public void a$a(FragmentActivity p0){
       super(p0);
       this.D0 = p0;
       this.W0(R.string.arg_RES_7f1040f5);
       this.Y0(a1.p(R.string.arg_RES_7f1033d1));
    }
    public a a1(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.D0);
    }
    public t b0(){
       return this.a1();
    }
    public c k(){
       return this.a1();
    }
}
