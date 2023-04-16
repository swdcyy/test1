package n90.g$j;
import erd.g;
import n90.g;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;

public final class g$j implements g	// class@0026dd
{
    public final g b;
    public final boolean c;

    public void g$j(g p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$j.class, "1")) {
       }else if(this.b.d == null){
          this.b.g().setValue(Integer.valueOf((int)((float)p0.intValue() * 0x3f000000)));
       }
       PatchProxy.onMethodExit(g$j.class, "1");
       return;
    }
}
