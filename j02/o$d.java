package j02.o$d;
import oq5.c;
import j02.o;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;

public final class o$d implements c	// class@002a29
{
    public final o b;

    public void o$d(o p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$d.class, "1")) {
          return;
       }
       o$d tb = this.b;
       MutableLiveData mutableLiveD = tb.r0(tb.C0());
       boolean b = (p0.orientation == 2)? true: false;
       mutableLiveD.setValue(Boolean.valueOf(b));
       return;
    }
}
