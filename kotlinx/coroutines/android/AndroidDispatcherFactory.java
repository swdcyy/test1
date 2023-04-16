package kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import java.lang.Object;
import java.util.List;
import ftd.j2;
import kotlinx.coroutines.android.HandlerContext;
import java.lang.String;
import android.os.Looper;
import android.os.Handler;
import gtd.b;

public final class AndroidDispatcherFactory implements MainDispatcherFactory	// class@001ce2
{

    public void AndroidDispatcherFactory(){
       super();
    }
    public j2 a(List p0){
       return this.d(p0);
    }
    public int b(){
       return 0x3fffffff;
    }
    public String c(){
       return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
    public HandlerContext d(List p0){
       return new HandlerContext(b.b(Looper.getMainLooper(), true), "Main");
    }
}
