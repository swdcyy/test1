package o2.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import o2.b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStore;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p2.a;
import android.os.Bundle;
import o2.a$a;

public abstract class a	// class@002748
{

    public void a(){
       super();
    }
    public static a c(LifecycleOwner p0){
       return new b(p0, p0.getViewModelStore());
    }
    public abstract void a(int p0);
    public abstract void b(String p0,FileDescriptor p1,PrintWriter p2,String[] p3);
    public abstract a d(int p0);
    public abstract a e(int p0,Bundle p1,a$a p2);
    public abstract void f();
    public abstract a g(int p0,Bundle p1,a$a p2);
}
