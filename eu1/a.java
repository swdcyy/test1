package eu1.a;
import sp5.b;
import du1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public final class a	// class@0021f7
{
    public final MutableLiveData a;
    public final LiveData b;
    public final MutableLiveData c;
    public final LiveData d;
    public b e;
    public b f;
    public final d g;

    public void a(b p0,d p1){
       a.p(p0, "parentContainerSize");
       a.p(p1, "renderDelegate");
       super();
       this.f = p0;
       this.g = p1;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       this.d = mutableLiveD;
    }
    public final LiveData a(){
       return this.b;
    }
}
