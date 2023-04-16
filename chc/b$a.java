package chc.b$a;
import androidx.lifecycle.Observer;
import chc.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$a implements Observer	// class@0005a1
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else if(p0 != null){
          this.b.P8(p0.booleanValue());
       }
       return;
    }
}
