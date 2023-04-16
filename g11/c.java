package g11.c;
import z1.a;
import g11.e;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;

public final class c implements a	// class@0023fd
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, e.class, "6")) {
       }else {
          ta.b = 0;
          ta.a.setValue(Integer.valueOf(0));
          ta.c = false;
          ta.e = null;
       }
       return;
    }
}
