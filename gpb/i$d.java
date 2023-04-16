package gpb.i$d;
import erd.g;
import gpb.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hka.a;

public final class i$d implements g	// class@002b60
{
    public final i b;

    public void i$d(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
       }else if(!p0.booleanValue()){
          this.b.w.onBackPressed();
       }
       return;
    }
}
