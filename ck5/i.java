package ck5.i;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.core.j;
import java.util.Objects;
import brd.a0;
import com.kwai.emotionsdk.core.d;
import java.util.concurrent.Callable;
import jl5.m;
import brd.z;
import com.kwai.emotionsdk.core.a;
import erd.g;
import com.kwai.emotionsdk.core.b;
import erd.o;
import ck5.i$a;
import ck5.i$b;
import ck5.i$c;
import ck5.i$d;
import kotlin.jvm.internal.a;
import java.util.List;
import jl5.b;
import kotlin.collections.ArraysKt___ArraysKt;
import android.net.Uri;
import ekd.x0;
import ekd.a0;
import java.lang.StringBuilder;
import ok5.a;
import ck5.m;
import java.util.Collection;
import ekd.q;
import hk5.a;
import ik5.b;
import com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;

public final class i	// class@0006db
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public static final t c(){
       z b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, objArray, i.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       a0 uoa0 = PatchProxy.apply(objArray, obj, j.class, "4");
       if (uoa0 != patchProxyRe) {
       }else {
          uoa0 = a0.y(d.b).T(m.b).r(a.b).I(b.b);
       }
       b = m.b;
       t ot = uoa0.d0().observeOn(b).doOnNext(i$a.b).observeOn(b).flatMapSingle(i$b.b).onErrorReturn(i$c.b).observeOn(b);
       ot = ot.doOnNext(i$d.b);
       a.o(ot, "EmotionDataManagerIntern¡­mojis, newEmojis\)\n      }");
       return ot;
    }
    public final String a(List p0){
       String str;
       StringBuilder str1;
       String obj = PatchProxy.applyOneRefs(p0, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String[] stringArray = b.a(p0, obj);
       if (stringArray != null) {
          str = ArraysKt___ArraysKt.ke(stringArray, 0);
          if (str != null) {
          label_0022 :
             Uri uri = x0.f(str);
             if (uri != null) {
                str1 = a0.c(uri.getPath());
                if (str1 != null) {
                   obj = str1;
                }
             }
             str1 = "getCDNUrlMd5,path = ";
             str = (uri != null)? uri.getPath(): null;
             a.a("EmotionDataProcessor", str1+str+" === md5 = "+obj);
             return obj;
          }
       }
       str = obj;
       goto label_0022 ;
    }
    public final m b(){
       Object obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.e().d(1);
    }
    public final void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       j.e().k(p0);
       a uoa = a.b();
       a.o(uoa, "EmotionDbManager.getInstance\(\)");
       b uob = uoa.a();
       a.o(uob, "EmotionDbManager.getInstance\(\).daosession");
       uob.a().insertOrReplaceInTx(p0);
       return;
    }
}
