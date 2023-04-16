package a09.a$a;
import q09.a;
import a09.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.ReplaceTemplateData;

public final class a$a implements a	// class@000009
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "throwable");
       this.a.V8();
       return;
    }
    public void e(ReplaceTemplateData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "data");
       this.a.V8();
       return;
    }
}
