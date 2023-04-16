package hg9.u0;
import java.util.concurrent.Callable;
import java.io.File;
import java.lang.Object;
import android.content.Context;
import lnc.a1;
import com.kuaishou.gifshow.files.a;

public final class u0 implements Callable	// class@002679
{
    public final File b;

    public void u0(File p0){
       this.b = p0;
    }
    public final Object call(){
       u0 tb = this.b;
       a.f(tb, a1.c());
       return tb;
    }
}
