package kotlin.io.FilesKt__UtilsKt$copyRecursively$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import java.io.IOException;
import java.lang.Void;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements p	// class@001881
{
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE;

    static {
       FilesKt__UtilsKt$copyRecursively$1.INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();
    }
    public void FilesKt__UtilsKt$copyRecursively$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Void invoke(File p0,IOException p1){
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "exception");
       throw p1;
    }
}
