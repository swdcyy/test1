package com.kuaishou.aegon.okhttp.impl.e;
import aegon.chrome.net.o;
import okhttp3.RequestBody;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import i0.k;
import java.nio.ByteBuffer;
import com.kuaishou.aegon.okhttp.impl.a;
import java.lang.Exception;
import java.util.Objects;
import java.io.IOException;
import java.lang.Thread;
import java.lang.InterruptedException;
import com.kuaishou.aegon.okhttp.impl.e$a;
import java.lang.Runnable;

public class e extends o	// class@0007be
{
    public Long b;
    public RequestBody c;
    public a d;
    public Thread e;

    public void e(RequestBody p0,long p1){
       super();
       this.b = Long.valueOf(p1);
       this.c = p0;
       this.f();
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.c.contentLength();
    }
    public void b(k p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       try{
          boolean b = this.d.a(p1);
          b = (this.c.contentLength() < 0 && b)? true: false;
          p0.b(b);
       }catch(java.io.IOException e7){
          p0.a(e7);
       }
       return;
    }
    public void c(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.e();
       this.f();
       p0.d();
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.e();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e td = this.d;
       if (td != null) {
          try{
             Objects.requireNonNull(td);
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
          this.d = null;
       }
       td = this.e;
       if (td != null) {
          try{
             td.join();
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
          this.e = null;
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       a uoa = new a(this.b.longValue());
       this.d = uoa;
       e$a uoa1 = new e$a(this, uoa);
       Thread thread = new Thread(uoa1, "k-video-aegon-uploader");
       this.e = thread;
       thread.start();
       return;
    }
}
