package eo2.b;
import androidx.lifecycle.Observer;
import eo2.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z61.b;
import androidx.lifecycle.MutableLiveData;

public final class b implements Observer	// class@002799
{
    public final g b;

    public void b(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.a.mIsVisible = Boolean.valueOf((p0.booleanValue() ^ 0x01));
          p0 = this.b;
          p0.b.setValue(p0.a);
       }
       return;
    }
}
