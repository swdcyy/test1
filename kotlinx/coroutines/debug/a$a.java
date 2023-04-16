package kotlinx.coroutines.debug.a$a;
import java.lang.instrument.ClassFileTransformer;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import java.security.ProtectionDomain;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.debug.a;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import isd.a;

public final class a$a implements ClassFileTransformer	// class@0019a4
{
    public static final a$a a;

    static {
       a$a.a = new a$a();
    }
    public void a$a(){
       super();
    }
    public byte[] a(ClassLoader p0,String p1,Class p2,ProtectionDomain p3,byte[] p4){
       if (a.g(p1, "kotlin/coroutines/jvm/internal/DebugProbesKt") ^ 1) {
          return null;
       }
       a.c.d(1);
       return a.p(SplitAssetHelper.getResourceAsStream(p0, "DebugProbesKt.bin"));
    }
}
