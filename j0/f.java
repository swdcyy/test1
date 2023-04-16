package j0.f;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.Object;
import java.util.Objects;
import aegon.chrome.net.impl.CronetUrlRequestContext$e;
import aegon.chrome.net.impl.g;
import java.lang.String;
import a0.n;
import K.S;

public final class f implements Runnable	// class@001996
{
    public final CronetUrlRequestContext b;

    public void f(CronetUrlRequestContext p0){
       this.b = p0;
    }
    public final void run(){
       Objects.requireNonNull(this.b);
       g.o();
       String t = CronetUrlRequestContext.t;
       int i = 3;
       if (n.f(t, 2)) {
          i = -2;
       }else if(n.f(t, i)){
          i = -1;
       }
       S.MnO2u2DQ(i);
       return;
    }
}
