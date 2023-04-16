package iq8.f;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.tachikoma.core.utility.b;
import zp8.a;

public final class f implements g	// class@00270f
{
    public final String b;

    public void f(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a.g("load bitmap fail, uri is "+b.c(this.b), p0);
    }
}
