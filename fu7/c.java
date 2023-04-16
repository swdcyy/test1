package fu7.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jga.f$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public abstract class c extends PresenterV2	// class@0024e0
{

    public void c(){
       super();
    }
    public void P8(f$a p0){
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(172);
    }
    public abstract String S8();
    public abstract boolean V8();
    public abstract t W8();
}
