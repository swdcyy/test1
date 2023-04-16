package eia.a;
import im8.g;
import eia.a$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cha.a;
import bia.j;
import bia.g;
import bia.c;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Boolean;
import bia.d;
import lnc.a1;
import android.app.Activity;
import wha.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eia.o;
import java.util.Map;
import java.util.HashMap;

public final class a implements g	// class@002689
{
    public final a b;
    public final j c;
    public g d;
    public c e;
    public final b f;
    public final b g;
    public final d h;
    public int i;
    public int j;
    public final int k;
    public boolean l;
    public Object m;
    public static final long n = 0x9c9fff574ee2fe03;
    public static final a$a o;

    static {
       a.o = new a$a(null);
    }
    public void a(GifshowActivity p0){
       a.p(p0, "activity");
       super();
       this.b = new a(p0);
       this.c = new j(p0);
       this.d = new g(p0);
       this.e = new c(p0);
       this.f = new b(new PymiTipsShowResponse());
       this.g = new b(Boolean.FALSE);
       this.h = new d(p0);
       this.i = e.c(p0, a1.d(0x7f070285));
       this.j = a1.d(0x7f070fdf);
       this.k = 2;
    }
    public final Object a(){
       return this.m;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new o());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
