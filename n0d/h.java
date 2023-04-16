package n0d.h;
import pb.e;
import android.content.Context;
import pb.b;
import vc.j;
import java.util.Set;
import com.facebook.imagepipeline.core.ImagePipeline;
import pb.f;
import android.content.res.Resources;
import tb.a;
import zc.a;
import ya.i;
import tc.v;
import com.facebook.common.internal.ImmutableList;
import ab.h;
import java.util.concurrent.Executor;
import rb.g;
import pb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n0d.g;
import java.util.HashSet;
import e0d.h;
import e0d.d;
import p0d.a;
import rb.b;
import java.util.Collection;

public class h extends e	// class@001efc
{
    public final Context g;
    public final ImagePipeline h;
    public final f i;
    public final Set j;
    public final Set k;
    public final g l;

    public void h(Context p0){
       super(p0, null);
    }
    public void h(Context p0,b p1){
       ImagePipeline this;
       h oh = this;
       Context uContext = p0;
       j oj = j.j();
       super(p0, oj, null, null, p1);
       oh.g = uContext;
       this = oj.h();
       oh.h = this;
       oh.i = (p1 != null && p1.d() != null)? p1.d(): new f();
       h i = oh.i;
       Resources resources = p0.getResources();
       a uoa = a.b();
       a uoa1 = oj.b(uContext);
       i oi = i.d();
       v bitmapMemory = this.getBitmapMemoryCache();
       Set this1 = null;
       ImmutableList immutableLis = (p1 != null)? p1.a(): this1;
       h oh1 = (p1 != null)? p1.b(): this1;
       i.a(resources, uoa, uoa1, oi, bitmapMemory, immutableLis, oh1);
       oh.j = this1;
       oh.k = this1;
       if (p1 != null) {
          this1 = p1.c();
       }
       oh.l = this1;
       return;
    }
    public d b(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       g og = new g(this.g, this.i, this.h, this.j, this.k);
       HashSet hashSet = new HashSet();
       d a = h.a;
       a uoa = (a == null || a.C != null)? 1: null;
       if (uoa) {
          hashSet.add(new a());
       }
       h tl = this.l;
       if (tl != null) {
          hashSet.add(tl);
       }
       return obj.C(new b(hashSet));
    }
    public Object get(){
       return this.b();
    }
}
