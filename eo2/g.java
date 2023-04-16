package eo2.g;
import androidx.lifecycle.LifecycleOwner;
import x61.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import z61.e;
import androidx.lifecycle.MutableLiveData;

public final class g	// class@00279e
{
    public final e a;
    public final MutableLiveData b;
    public final LifecycleOwner c;
    public final c d;

    public void g(LifecycleOwner p0,c p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "liveBottomBarService");
       super();
       this.c = p0;
       this.d = p1;
       this.a = new e();
       this.b = new MutableLiveData();
    }
}
