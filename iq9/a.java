package iq9.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.corona.common.manager.a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.LinkedHashMap;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;

public final class a	// class@0028a2
{
    public static boolean a;
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public static final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       try{
          if (!a.a) {
             a.b.c();
          label_0015 :
             if (p0 != null) {
                a uoa = a.b.a();
                Objects.requireNonNull(uoa);
                a uoa1 = a.class;
                if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, uoa, uoa1, "2") && uoa.a("put"))) {
                   uoa.a.put(p0, Boolean.TRUE);
                   uoa.c();
                }
             }
          }else {
             goto label_0015 ;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x6406b20);
       a.o(obj, "Singleton.get\(VideoWatch¡­StateManager::class.java\)");
       return obj;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (!a.a) {
             this.c();
          }
          if (p0 != null) {
             return a.b.a().b(p0);
          }else {
             return b;
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return b;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (!a.a) {
          a.a = true;
          this.a().b("");
       }
       return;
    }
}
