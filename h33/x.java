package h33.x;
import ok.h;
import h33.y;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton;
import erd.g;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import h33.w;
import h33.v;
import crd.b;

public class x implements h	// class@002c33
{
    public final String b;
    public final boolean c;
    public final SlipSwitchButton d;
    public final boolean e;
    public final g f;
    public final y g;

    public void x(y p0,String p1,boolean p2,SlipSwitchButton p3,boolean p4,g p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, x.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          x td = this.d;
          d.a(-1188553266).jg(this.b, this.c).subscribe(new w(this, td, this.e, this.f), new v(this, td));
          p0 = null;
       }
       return p0;
    }
}
