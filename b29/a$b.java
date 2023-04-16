package b29.a$b;
import erd.g;
import b29.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import p1a.a$a;
import w19.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import n49.e;
import android.app.Activity;
import n49.o;
import java.util.HashMap;
import java.lang.Integer;
import b29.b;

public final class a$b implements g	// class@00035b
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "3")) {
             a w = p0.w;
             if (w == null) {
                a.S("mLogListener");
             }
             a$a uoa = a$a.a(884, "click_nickname");
             a z = p0.z;
             if (z == null) {
                a.S("mCallerContext");
             }
             int i = (z.n != null)? 1: 2;
             uoa.n(i);
             w.a(uoa);
             w = p0.u;
             String str = "mPhoto";
             if (w == null) {
                a.S(str);
             }
             i = 14;
             if (s.q(w, i)) {
                w = p0.y;
                if (w == null) {
                   a.S("mPhotoAdActionBarClickProcessor");
                }
                a u = p0.u;
                if (u == null) {
                   a.S(str);
                }
                p0 = p0.t;
                if (p0 == null) {
                   a.S("mActivity");
                }
                w.a(u, p0, new e(i));
             }else {
                HashMap hashMap = new HashMap();
                hashMap.put("clickType", Integer.valueOf(i));
                p0.o0(hashMap, b.b);
             }
          }
       }
       return;
    }
}
