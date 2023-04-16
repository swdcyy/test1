package isd.n;
import wsd.m;
import java.io.BufferedReader;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import isd.n$a;

public final class n implements m	// class@001512
{
    public final BufferedReader a;

    public void n(BufferedReader p0){
       a.p(p0, "reader");
       super();
       this.a = p0;
    }
    public Iterator iterator(){
       return new n$a(this);
    }
}
