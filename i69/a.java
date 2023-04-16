package i69.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a	// class@002639
{
    public int a;
    public File b;
    public final Object c;

    public void a(Object p0){
       a.p(p0, "mContext");
       super();
       this.c = p0;
    }
    public final Object a(){
       return this.c;
    }
    public final int b(){
       return this.a;
    }
    public final File c(){
       return this.b;
    }
    public final void d(int p0){
       this.a = p0;
    }
    public final void e(File p0){
       this.b = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mPercent="+this.a+' '+this.b;
    }
}
