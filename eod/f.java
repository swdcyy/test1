package eod.f;
import com.yxcorp.gifshow.widget.r;
import eod.e;
import tyc.f3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import java.lang.Boolean;
import god.b;

public final class f extends r	// class@000dbe
{
    public final e c;

    public void f(e p0,f3 p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.c.h.o0().setValue(Boolean.FALSE);
       b.a.a(false);
       return;
    }
}
