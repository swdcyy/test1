package f81.d;
import os5.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import dw6.b;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import f81.a;
import pw6.d;
import android.util.Pair;
import os5.b;

public class d implements c	// class@0022cc
{

    public void d(){
       super();
    }
    public String F50(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().F50();
    }
    public void LY(Activity p0,b p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, d.class, "3")) {
          return;
       }
       this.n().LY(p0, p1, p2);
       return;
    }
    public boolean b6(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.n().b6(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public final c n(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-248289942).TM();
    }
    public d re(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.n().re(p0);
    }
    public Pair x7(Fragment p0){
       return b.a(this, p0);
    }
}
