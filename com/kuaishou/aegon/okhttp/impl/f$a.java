package com.kuaishou.aegon.okhttp.impl.f$a;
import java.io.OutputStream;
import com.kuaishou.aegon.okhttp.impl.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;
import okio.b;
import okio.c;
import java.io.IOException;

public class f$a extends OutputStream	// class@0007bf
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "4")) {
          return;
       }
       this.b.close();
       return;
    }
    public void flush(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "3")) {
          return;
       }
       f$a tb = this.b;
       if (tb.d == null) {
          tb.flush();
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b+".outputStream\(\)";
    }
    public void write(int p0){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       if (tb.d != null) {
          throw new IOException("closed");
       }
       tb.b.y((byte)p0);
       this.b.emitCompleteSegments();
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "2")) {
          return;
       }
       f$a tb = this.b;
       if (tb.d != null) {
          throw new IOException("closed");
       }
       tb.b.x(p0, p1, p2);
       this.b.emitCompleteSegments();
       return;
    }
}
