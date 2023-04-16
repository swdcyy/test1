package gj0.i;
import erd.a;
import gj0.d;
import java.lang.Object;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.String;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.StringBuilder;
import ek0.d;

public final class i implements a	// class@0024f7
{
    public final d b;

    public void i(d p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       KrnReactRootPreloadManager.a.remove(tb.b());
       d.e("remove preloading: "+tb);
    }
}
