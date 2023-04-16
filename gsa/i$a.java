package gsa.i$a;
import com.yxcorp.image.fresco.wrapper.a$h;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class i$a implements a$h	// class@002bef
{
    public final String a;

    public void i$a(String p0){
       this.a = p0;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       Log.e("NasaBottomTabIconUtils", "", p0);
       return;
    }
    public void onResult(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Log.g("NasaBottomTabIconUtils", this.a+", result "+p0);
       return;
    }
}
