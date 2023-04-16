package f0d.b;
import tc.h;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jd.c;
import tc.b;
import uc.d;
import uc.e;
import uc.b;
import android.net.Uri;
import ta.d;
import com.yxcorp.image.cache.CacheKeyOptions;
import f0d.b$a;
import java.lang.Enum;
import s0d.e;
import java.util.Locale;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import e0d.h;
import ib.c;

public class b implements h	// class@0015b8
{

    public void b(){
       super();
    }
    public CacheKey a(ImageRequest p0,Object p1){
       String str;
       CacheKey uCacheKey1;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.j();
       CacheKey uCacheKey = null;
       if (obj != null) {
          str = obj.getClass().getName();
          uCacheKey1 = obj.a();
       }else {
          uCacheKey1 = uCacheKey;
          str = uCacheKey1;
       }
       b uob = new b(this.f(p0), p0.p(), p0.q(), p0.g(), uCacheKey1, str, p1);
       return obj;
    }
    public CacheKey b(ImageRequest p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(p0, p0.s(), p1);
    }
    public CacheKey c(ImageRequest p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(this.f(p0), p0.p(), p0.q(), p0.g(), null, null, p1);
       return obj;
    }
    public CacheKey d(ImageRequest p0,Uri p1,Object p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new d(this.f(p0));
    }
    public final String e(CacheKeyOptions p0,ImageRequest p1){
       String str;
       Uri obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.s();
       int i = b$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             return obj.toString();
          }else {
             str = this.g(obj);
             if (str != null && p1 instanceof e) {
                Object[] objArray = new Object[]{str,Integer.valueOf(p1.z()),Integer.valueOf(p1.y())};
                return String.format(Locale.US, "%s_%d_%d", objArray);
             }else {
                return obj.toString();
             }
          }
       }else {
          str = this.g(obj);
          if (str == null) {
             str = obj.toString();
          }
          return str;
       }
    }
    public final String f(ImageRequest p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return String.valueOf(this.hashCode());
       }
       obj = p0.s();
       if (obj == null) {
          return String.valueOf(this.hashCode());
       }
       if (obj.isHierarchical()) {
          String queryParamet = obj.getQueryParameter("clientCacheKey");
          if (!TextUtils.isEmpty(queryParamet)) {
             return queryParamet;
          }
       }
       if (p0 instanceof e) {
          e uoe = p0;
          e y = uoe.y;
          if (y != null) {
             return this.e(y, p0);
          }else {
             return uoe.x();
          }
       }else {
          return this.e(h.b(), p0);
       }
    }
    public final String g(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isHierarchical() && (c.k(p0) && !TextUtils.isEmpty(p0.getPath()))) {
          return p0.getPath();
       }
       return null;
    }
}
