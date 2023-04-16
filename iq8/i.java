package iq8.i;
import erd.o;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import brd.a0;
import com.tachikoma.core.utility.b;
import brd.t;
import com.tachikoma.core.utility.a;

public final class i implements o	// class@002712
{
    public final Context b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public void i(Context p0,String p1,String p2,int p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       return b.g(this.b, p0, this.c, this.d, this.e, this.f).d0().onErrorResumeNext(a.b);
    }
}
