package j02.o$a;
import aq5.b;
import j02.o;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import k02.a;
import kotlin.jvm.internal.a;

public final class o$a implements b	// class@002a26
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       a.o(p0, "bizRelation");
       uoa.r0(uoa.u0()).setValue(new a(p0, p1));
       return;
    }
}
