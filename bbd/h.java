package bbd.h;
import ddd.c;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Object;
import nfd.a0$c;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import nfd.a0$a;
import med.a;
import ufd.l;
import android.view.View;
import i2b.a;
import vfd.a;
import nfd.o3;
import nfd.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fed.k2;
import bbd.g;
import fed.m2;
import bbd.i;
import bbd.f;
import y9d.f;
import ucd.a;
import ml8.c;
import y8c.g;
import y8c.f$b;
import ddd.b;

public class h implements c	// class@0003d9
{
    public a a;
    public SearchPage b;

    public void h(SearchPage p0){
       super();
       this.a = new a0$c();
       this.b = p0;
    }
    public f a(ViewGroup p0,int p1){
       a0$a obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a0$a();
       obj.f(true);
       obj.c(new a());
       obj.b(this.a);
       obj.d(R.drawable.arg_RES_7f081e90);
       obj.e(false);
       obj.h(true);
       obj.g(true);
       a0 uoa0 = obj.a();
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new k2(uoa0));
       presenterV2.U7(new g(uoa0));
       presenterV2.U7(new m2());
       presenterV2.U7(new i(uoa0));
       presenterV2.U7(new f());
       presenterV2.U7(new f());
       presenterV2.U7(new a());
       return new f(a.i(p0, 0x7f0d1454), presenterV2);
    }
    public f$b b(g p0,f$b p1){
       return b.a(this, p0, p1);
    }
}
