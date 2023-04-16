package okio.l;
import java.io.File;
import okio.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.FileOutputStream;
import java.io.OutputStream;
import cud.d;
import okio.c;
import cud.j;
import okio.n;
import okio.d;
import cud.k;
import java.lang.AssertionError;
import java.lang.Throwable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import cud.g;
import okio.o;
import java.net.Socket;
import cud.n;
import okio.a;
import java.io.FileInputStream;
import java.io.InputStream;
import cud.e;

public final class l	// class@0020f8
{

    public static final m a(File p0){
       a.q(p0, "$receiver");
       return l.g(new FileOutputStream(p0, true));
    }
    public static final m b(){
       return new d();
    }
    public static final c c(m p0){
       a.q(p0, "$receiver");
       return new j(p0);
    }
    public static final d d(n p0){
       a.q(p0, "$receiver");
       return new k(p0);
    }
    public static final boolean e(AssertionError p0){
       a.q(p0, "$receiver");
       boolean b = false;
       if (p0.getCause() != null) {
          String message = p0.getMessage();
          boolean b1 = (message != null)? StringsKt__StringsKt.O2(message, "getsockname failed", b, 2, null): false;
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public static final m f(File p0){
       return l.i(p0, false, 1, null);
    }
    public static final m g(OutputStream p0){
       a.q(p0, "$receiver");
       return new g(p0, new o());
    }
    public static final m h(Socket p0){
       a.q(p0, "$receiver");
       n on = new n(p0);
       OutputStream outputStream = p0.getOutputStream();
       a.h(outputStream, "getOutputStream\(\)");
       return on.sink(new g(outputStream, on));
    }
    public static m i(File p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       a.q(p0, "$receiver");
       return l.g(new FileOutputStream(p0, p1));
    }
    public static final n j(File p0){
       a.q(p0, "$receiver");
       return l.k(new FileInputStream(p0));
    }
    public static final n k(InputStream p0){
       a.q(p0, "$receiver");
       return new e(p0, new o());
    }
    public static final n l(Socket p0){
       a.q(p0, "$receiver");
       n on = new n(p0);
       InputStream inputStream = p0.getInputStream();
       a.h(inputStream, "getInputStream\(\)");
       return on.source(new e(inputStream, on));
    }
}
