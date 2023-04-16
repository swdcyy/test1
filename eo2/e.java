package eo2.e;
import java.lang.Runnable;
import eo2.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import x61.c;

public final class e implements Runnable	// class@00279c
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       tb.d.v1(tb.b);
       return;
    }
}
