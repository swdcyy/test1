package hb2.p;
import hb2.a;
import vl8.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class p extends c implements a	// class@002d51
{
    public View c;

    public void p(View p0){
       super();
       this.c = p0.findViewById(0x7f0a2525);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.c.setVisibility(8);
       return;
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c.getVisibility())? true: false;
       return b;
    }
    public View i(){
       return this.c;
    }
    public boolean o(){
       return false;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.c.setVisibility(0);
       return;
    }
}
