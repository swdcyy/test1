package a37.c;
import bv7.b;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.Object;

public final class c implements b	// class@00003e
{
    public final HttpTransaction a;

    public void c(HttpTransaction p0){
       this.a = p0;
    }
    public final Object get(){
       return HttpTransaction.u(this.a);
    }
}
