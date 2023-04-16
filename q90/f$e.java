package q90.f$e;
import erd.a;
import q90.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public final class f$e implements a	// class@00298c
{
    public final f b;

    public void f$e(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$e.class, "1")) {
          return;
       }
       f$e tb = this.b;
       tb.A.removeObservers(tb.X8());
       this.b.A.setValue(null);
       this.b.B = null;
       return;
    }
}
