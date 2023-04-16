package ox0.l$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import ox0.l;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import brd.t;
import ox0.n;
import ox0.m;
import erd.g;
import crd.b;
import o07.o;

public class l$d implements PopupInterface$h	// class@0035c4
{
    public final int b;
    public final l c;

    public void l$d(l p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d.class, "1")) {
          return;
       }
       l$d tc = this.c;
       tc.c = tc.c(this.b).subscribe(new n(this, this.b, p0.z().findViewById(0x7f0a2d87)), new m(this));
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
