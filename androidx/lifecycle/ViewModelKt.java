package androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModel;
import ftd.k0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.CloseableCoroutineScope;
import ftd.z1;
import ftd.c3;
import ftd.j2;
import ftd.z0;
import kotlin.coroutines.CoroutineContext;

public final class ViewModelKt	// class@000802
{

    public static final k0 getViewModelScope(ViewModel p0){
       a.q(p0, "receiver$0");
       String str = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";
       k0 tag = p0.getTag(str);
       if (tag != null) {
          return tag;
       }
       p0 = p0.setTagIfAbsent(str, new CloseableCoroutineScope(c3.d(null, 1, null).plus(z0.g())));
       a.h(p0, "setTagIfAbsent\(JOB_KEY,\n¡­ob\(\) + Dispatchers.Main\)\)");
       return p0;
    }
}
