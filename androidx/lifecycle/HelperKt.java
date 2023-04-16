package androidx.lifecycle.HelperKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.VMAutoDisposeHelper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class HelperKt	// class@0007c6
{

    public static final VMAutoDisposeHelper getVMAutoDisposeTransformer(ViewModel p0){
       a.p(p0, "$this$getVMAutoDisposeTransformer");
       String str = "com.kuaishou.live.mvvm.ViewMode.getVMAutoDisposeTransformer";
       VMAutoDisposeHelper tag = p0.getTag(str);
       if (tag != null) {
       }else {
          p0 = p0.setTagIfAbsent(str, new VMAutoDisposeHelper());
          a.o(p0, "setTagIfAbsent\(TAG, VMAutoDisposeHelper\(\)\)");
          tag = p0;
       }
       return tag;
    }
}
