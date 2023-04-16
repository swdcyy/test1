package bdc.b;
import bdc.n;
import bdc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import qvb.i;
import la6.b;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import bdc.b$a;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import ekd.e0;
import zcc.o;
import java.lang.StringBuilder;
import nsd.r0;
import java.util.Arrays;
import q87.c;
import bdc.b$b;
import java.lang.Runnable;
import t45.c;

public final class b implements n	// class@000452
{
    public final c a;

    public void b(c p0){
       a.p(p0, "policy");
       super();
       this.a = p0;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(this, p0, c.class, "2")) {
       }else {
          a.p(this, "<set-?>");
          p0.b = this;
       }
       return;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.c;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.b();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.a.c();
       return;
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.e;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       this.a.e();
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.g;
    }
    public void g(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       a.p(p0, "pageList");
       this.a.g(p0);
       return;
    }
    public String getCacheKey(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d;
    }
    public final boolean h(){
       boolean b;
       c obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this.a.b()) {
          obj = this.a.a;
          if (obj != null && obj.isEmpty() == b) {
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
    public final b i(Class p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       b uob = b.a(0x5f2ddeb4).g(this.getCacheKey(), p0);
       if (uob != null) {
          obj = new Object[0];
          this.j("Cached hit", obj);
          List items = uob.getItems();
          a.o(items, "items");
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             e.h(qPhoto.mEntity, PhotoMeta.class, b$a.b);
             w.z1(qPhoto.mEntity, true);
          }
       }else {
          uob = null;
       }
       return uob;
    }
    public final void j(String p0,Object[] p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "4")) {
          return;
       }
       a.p(p0, "format");
       a.p(p1, "args");
       if (e0.a) {
          o oo = o.C();
          StringBuilder str = "FriendsCache{biz:=[";
          Object obj = PatchProxy.apply(null, this, uob, "5");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): this.a.c;
          p1 = Arrays.copyOf(p1, p1.length);
          p0 = String.format(p0, Arrays.copyOf(p1, p1.length));
          a.o(p0, "java.lang.String.format\(format, *args\)");
          p1 = new Object[0];
          oo.s("FriendsCache", str+i+"], key=["+this.getCacheKey()+"], "+"info="+p0, p1);
       }
       return;
    }
    public final void k(b p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "clazz");
       c.a(new b$b(this, p0, p1));
       return;
    }
}
