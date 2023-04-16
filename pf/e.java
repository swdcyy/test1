package pf.e;
import jd.c;
import java.util.List;
import java.lang.Object;
import java.util.LinkedList;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.cache.common.CacheKey;
import java.util.Iterator;
import ta.b;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;
import java.lang.StringBuilder;

public class e implements c	// class@00291f
{
    public final List a;

    public void e(List p0){
       super();
       this.a = new LinkedList(p0);
    }
    public static c d(List p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, e.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       int i = p0.size();
       if (!i) {
          return obj;
       }
       if (i != 1) {
          return new e(p0);
       }
       return p0.get(0);
    }
    public CacheKey a(){
       LinkedList obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          obj.push(iterator.next().a());
       }
       return new b(obj);
    }
    public a b(Bitmap p0,d p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       Iterator iterator = this.a.iterator();
       a uoa = obj;
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          Bitmap uBitmap = (uoa != null)? uoa.j(): p0;
          obj = uoc.b(uBitmap, p1);
          a.f(uoa);
          uoa = obj.a();
       }
       a.f(obj);
       return obj.a();
    }
    public String getName(){
       StringBuilder obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (obj.length() > 0) {
             obj = obj+",";
          }
          obj = obj+uoc.getName();
       }
       obj.insert(0, "MultiPostProcessor \(");
       return obj+"\)";
    }
}
