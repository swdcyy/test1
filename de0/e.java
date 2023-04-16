package de0.e;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import de0.e$a;
import androidx.lifecycle.LiveData;

public final class e extends MutableLiveData	// class@001f83
{
    public final AtomicBoolean a;

    public void e(){
       super();
       this.a = new AtomicBoolean(false);
    }
    public void observe(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "observer");
       super.observe(p0, new e$a(this, p1));
       return;
    }
    public void setValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.a.set(true);
       super.setValue(p0);
       return;
    }
}
