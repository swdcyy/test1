package ls1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b	// class@00300e
{

    public static final LiveData a(MutableLiveData p0){
       a.p(p0, "$this$immutate");
       return p0;
    }
    public static final MutableLiveData b(LiveData p0){
       a.p(p0, "$this$mutate");
       return p0;
    }
}
