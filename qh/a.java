package qh.a;
import hf5.c;
import sh.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import java.lang.StringBuilder;

public final class a implements c	// class@0029d7
{
    public final a a;

    public void a(a p0){
       a.p(p0, "mFrontViewController");
       super();
       this.a = p0;
    }
    public void setVisibility(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uoa1, "2")) {
          uoa.b("setVisibility: "+p0);
          uoa.b = p0;
          uoa.a();
       }
       return;
    }
}
