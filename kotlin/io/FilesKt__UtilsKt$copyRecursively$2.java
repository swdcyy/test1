package kotlin.io.FilesKt__UtilsKt$copyRecursively$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import java.io.IOException;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.io.OnErrorAction;
import kotlin.io.TerminateException;

public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements p	// class@001882
{
    public final p $onError;

    public void FilesKt__UtilsKt$copyRecursively$2(p p0){
       this.$onError = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(File p0,IOException p1){
       a.p(p0, "f");
       a.p(p1, "e");
       if (this.$onError.invoke(p0, p1) != OnErrorAction.TERMINATE) {
          return;
       }
       throw new TerminateException(p0);
    }
}
