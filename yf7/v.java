package yf7.v;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class v implements Runnable	// class@0028ad
{
    public final a b;

    public void v(a p0){
       this.b = p0;
    }
    public final void run(){
       a.h(this.b.invoke(), "invoke\(...\)");
    }
}
