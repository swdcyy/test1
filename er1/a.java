package er1.a;
import ms1.a;
import yh3.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public class a extends a implements a	// class@0021e0
{
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;

    public void a(){
       super();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
    }
    public LiveData K(){
       return this.e;
    }
    public LiveData M(){
       return this.d;
    }
    public LiveData f(){
       return this.f;
    }
    public LiveData getIcon(){
       return this.c;
    }
    public LiveData getText(){
       return this.b;
    }
    public final void u0(int p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, a.class, "1")) {
          return;
       }
       a.p(p2, "text");
       this.c.setValue(Integer.valueOf(p0));
       this.e.setValue(p1);
       this.d.setValue(Integer.valueOf(p3));
       this.b.setValue(p2);
       return;
    }
}
