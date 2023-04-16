package es1.b;
import es1.a;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import as1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b implements a	// class@0021ec
{
    public final MutableLiveData a;

    public void b(){
       super();
       this.a = new MutableLiveData();
    }
    public LiveData a(){
       return this.b();
    }
    public MutableLiveData b(){
       return this.a;
    }
    public final void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "participantInfoModel");
       this.b().setValue(p0);
       return;
    }
}
