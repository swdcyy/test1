package isd.f;
import java.io.ByteArrayOutputStream;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class f extends ByteArrayOutputStream	// class@001505
{

    public void f(int p0){
       super(p0);
    }
    public final byte[] a(){
       ByteArrayOutputStream tbuf = this.buf;
       a.o(tbuf, "buf");
       return tbuf;
    }
}
