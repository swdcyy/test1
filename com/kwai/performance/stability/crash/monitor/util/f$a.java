package com.kwai.performance.stability.crash.monitor.util.f$a;
import java.io.Writer;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class f$a extends Writer	// class@001214
{

    public void f$a(){
       super();
    }
    public void close(){
       throw new UnsupportedOperationException("Shouldn\'t be here");
    }
    public void flush(){
       this.close();
       throw null;
    }
    public void write(char[] p0,int p1,int p2){
       a.p(p0, "buf");
       this.close();
       throw null;
    }
}
