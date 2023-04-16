package io.b;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.b$a;
import com.kwai.robust.PatchProxyResult;

public class b	// class@00180e
{

    public void b(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       try{
          p0.run();
       }catch(java.lang.UnsatisfiedLinkError e0){
          try{
             p0.run();
          }catch(java.lang.UnsatisfiedLinkError e0){
             p0.run();
          }
       }
       return;
    }
    public static Object b(b$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.get();
       }catch(java.lang.UnsatisfiedLinkError e0){
          try{
             return p0.get();
          }catch(java.lang.UnsatisfiedLinkError e0){
             return p0.get();
          }
       }
    }
    public static void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       try{
          p0.run();
          return;
       }catch(java.lang.UnsatisfiedLinkError e0){
       }
    }
}
