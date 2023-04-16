package nz9.h;
import erd.g;
import nz9.z0;
import java.lang.Object;
import fda.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import nz9.u1;
import nz9.f1;
import android.view.View;
import qp7.b;

public final class h implements g	// class@003225
{
    public final z0 b;

    public void h(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "8")) {
       }else if(tb.J != null && (p0 != null && (!TextUtils.isEmpty(p0.a()) && ("flow_follow").equals(p0.a())))){
          p0 = tb.B;
          String str = "f";
          if (p0 == null || p0.c()) {
             tb.K0(str);
          }else {
             p0 = tb.B;
             if (p0 != null) {
                p0.j = new f1(tb);
                tb.B.d();
                tb.B.e(tb.z());
             }else {
                tb.K0(str);
             }
          }
       }
       return;
    }
}
