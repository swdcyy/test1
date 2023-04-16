package com.kwai.library.wolverine.utility.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.wolverine.utility.a$b;
import java.lang.Runtime;
import java.lang.Process;
import com.kwai.library.wolverine.utility.a$a;
import kotlin.jvm.internal.a;
import java.io.InputStream;
import java.lang.Thread;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import y27.a;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;

public final class a	// class@000ad2
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object a(String p0,a$b p1){
       Process process = Runtime.getRuntime().exec(p0);
       a.o(process, "process");
       InputStream errorStream = process.getErrorStream();
       a.o(errorStream, "process.errorStream");
       a$a uoa = new a$a(errorStream);
       uoa.start();
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
       b.a(uBufferedRea, null);
       uoa.join();
       process.waitFor();
       process.destroy();
       return p1.a(uBufferedRea);
    }
}
