package com.tachikoma.core.bridge.e;
import com.tkruntime.v8.V8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Object;
import android.os.Handler;
import com.tachikoma.core.bridge.e$a;
import java.lang.Runnable;
import android.os.Message;

public class e extends V8	// class@000d48
{
    public int b;
    public boolean c;

    public void e(long p0,boolean p1){
       super(p0, p1);
       this.b = 0;
       this.c = false;
    }
    public static e a(long p0,boolean p1){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), null, e.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new e(p0, p1);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (this.c == null) {
          this.c = true;
          super.close();
       }
       return;
    }
    public Object callObjectJavaMethod(long p0,V8Object p1,Object[] p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, e.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = this.b + 1;
       this.b = this.b - 1;
       return super.callObjectJavaMethod(p0, p1, p2);
    }
    public void callVoidJavaMethod(long p0,V8Object p1,Object[] p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, e.class, "5")) {
          return;
       }
       this.b = this.b + 1;
       super.callVoidJavaMethod(p0, p1, p2);
       this.b = this.b - 1;
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       if (this.b > null) {
          Handler handler = new Handler();
          handler.sendMessageAtFrontOfQueue(Message.obtain(handler, new e$a(this)));
       }else {
          this.c();
       }
       return;
    }
}
