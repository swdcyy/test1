package hg9.t0;
import java.util.concurrent.Callable;
import java.io.File;
import java.lang.Object;
import android.content.Context;
import lnc.a1;
import com.kuaishou.gifshow.files.a;
import android.app.Application;
import o56.a;
import qkd.a;

public final class t0 implements Callable	// class@002677
{
    public final File b;

    public void t0(File p0){
       this.b = p0;
    }
    public final Object call(){
       File uFile = a.g(a1.c(), this.b);
       a.b(a.b(), uFile);
       return uFile;
    }
}
