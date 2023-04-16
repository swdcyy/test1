package c79.a;
import c79.a$a;
import nsd.u;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import g79.a;
import w69.r0;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import c79.c;
import c79.e;
import c79.d;

public final class a	// class@0004f3
{
    public static final a$a a;

    static {
       a.a = new a$a(null);
    }
    public void a(){
       super();
    }
    public static final void a(Uri p0){
       a$a a;
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "10")) {
          return;
       }
       a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, a$a.class, "10")) {
          a.q(p0, "uri");
          a.c.e().c(p0);
       }
       return;
    }
    public static final void b(CompatImageView p0,Uri p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "6")) {
          return;
       }
       a.a.a(p0, p1, p2);
       return;
    }
    public static final void c(CompatImageView p0,Uri p1,c p2,e p3,d p4){
       object oobject;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,oobject,p4};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, uoa, "8")) {
             return;
          }
       }
       a.a.c(p0, p1, p2, null, p4);
       return;
    }
}
