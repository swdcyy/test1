package esa.h$a;
import zr6.d;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zr6.j;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import lp5.a;
import esa.n;

public class h$a extends d	// class@0027c7
{

    public void h$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
    }
    public IContainerDecorator c(){
       Integer obj = PatchProxy.apply(null, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a("HOME_UI_MODE_ID");
       if (obj != null && obj.intValue() == 5) {
          return d.a(0x193fad4a).At();
       }
       return new n();
    }
}
