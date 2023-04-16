package d93.c$a;
import java.lang.Object;
import com.kuaishou.live.service.ServiceHolderImpl$b;
import com.kuaishou.live.service.ServiceProvider;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.live.service.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.IllegalStateException;

public final class c$a	// class@0024be
{
    public ServiceProvider a;
    public final ServiceHolderImpl$b b;
    public final Object c;

    public void c$a(Object p0){
       super();
       this.c = p0;
       this.b = new ServiceHolderImpl$b();
    }
    public final Object a(){
       return this.c;
    }
    public final boolean b(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public final void c(ServiceProvider p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, str)) {
          return;
       }
       c$a uoa = null;
       c$a uoa1 = (p0 != null)? 1: null;
       String str1 = "Check failed.";
       if (uoa1) {
          if (this.a == null) {
             uoa = 1;
          }
          if (uoa) {
             this.a = p0;
             uoa = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(uoa, p0, ServiceProvider.class, "3")) {
                a.p(uoa, "mediator");
                p0 = p0.a;
                Objects.requireNonNull(uoa);
                if (!PatchProxy.applyVoidOneRefs(p0, uoa, ServiceHolderImpl$b.class, str)) {
                   a.p(p0, "sourceProvider");
                   if (uoa.b ^ 1) {
                      uoa.b = true;
                      p0.observeForever(new a(uoa));
                   }else {
                      throw new IllegalStateException("This holder is already linked to provider".toString());
                   }
                }
             }
             return;
          }else {
             throw new IllegalStateException(str1.toString());
          }
       }else {
          throw new IllegalStateException(str1.toString());
       }
    }
}
