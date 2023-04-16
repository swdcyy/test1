package ew9.a;
import y8c.g;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import g9c.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import gw9.a;
import ml8.c;

public final class a extends g	// class@002240
{
    public final int w;
    public final String x;

    public void a(int p0,String p1){
       a.p(p1, "userId");
       super();
       this.w = p0;
       this.x = p1;
    }
    public ArrayList a1(int p0,f p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new c("CREATION_TEMPLATE", this.N0(p0)));
       uArrayList.add(new c("CREATION_USER_ID", this.x));
       uArrayList.add(new c("CREATION_TAB_TYPE", Integer.valueOf(this.w)));
       return uArrayList;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.k(p0, 0x7f0d11e2, false), new a());
    }
}
