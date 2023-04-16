package eo2.c;
import androidx.lifecycle.Observer;
import eo2.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z61.e;
import androidx.lifecycle.MutableLiveData;

public final class c implements Observer	// class@00279a
{
    public final g b;

    public void c(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.a.d = p0.booleanValue() ^ 0x01;
          p0 = this.b;
          p0.b.setValue(p0.a);
       }
       return;
    }
}
