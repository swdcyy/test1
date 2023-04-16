package androidx.lifecycle.LiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import msd.l;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1;

public final class LiveDataKt	// class@0007dc
{

    public static final Observer observe(LiveData p0,LifecycleOwner p1,l p2){
       a.q(p0, "receiver$0");
       a.q(p1, "owner");
       a.q(p2, "onChanged");
       LiveDataKt$observe$wrappedObserver$1 oobserve$wra = new LiveDataKt$observe$wrappedObserver$1(p2);
       p0.observe(p1, oobserve$wra);
       return oobserve$wra;
    }
}
