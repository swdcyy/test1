package b8a.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import java.util.LinkedHashMap;
import java.util.Map;

public final class w extends ViewModel	// class@000413
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final Map c;
    public final Map d;

    public void w(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new LinkedHashMap();
       this.d = new LinkedHashMap();
    }
    public final Map o0(){
       return this.d;
    }
    public final Map p0(){
       return this.c;
    }
    public final MutableLiveData q0(){
       return this.a;
    }
    public final MutableLiveData r0(){
       return this.b;
    }
}
