package v2b.e;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import v2b.d;
import java.lang.Runnable;
import android.os.Handler;
import v2b.f;
import v2b.g;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import v2b.b;
import java.lang.StringBuilder;
import android.content.Context;
import f3b.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import f3b.j;
import v2b.e$a;
import java.lang.reflect.Type;
import el.a;
import v2b.a;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import java.lang.Throwable;

public class e	// class@002667
{
    public Context a;
    public Handler b;
    public Map c;
    public a d;
    public boolean e;
    public static final e f;

    static {
       e.f = new e();
    }
    public void e(){
       super();
       this.e = false;
       this.c = new HashMap();
    }
    public static e d(){
       return e.f;
    }
    public void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e.class, "6")) {
          return;
       }
       if (!n.A1().O()) {
          return;
       }
       this.b.post(new d(this, p0, p1, p2));
       return;
    }
    public final g b(f p0){
       f obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mFields;
       if (obj == null || !obj.size()) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.mFields.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          b uob = new b();
          uob.mField = uEntry.getKey();
          uob.mValue = uEntry.getValue().intValue();
          uArrayList.add(uob);
       }
       g og = new g();
       og.fieldNodes = uArrayList;
       return og;
    }
    public final String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NFB_"+p0;
    }
    public final void e(){
       String str1;
       g og;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       if (!n.A1().O()) {
          return;
       }
       String str = PatchProxy.apply(objArray, this, uoe, "8");
       if (str != PatchProxyResult.class) {
       }else {
          str = d.b(this.a, "log_bucket_info_key", "");
       }
       if (TextUtils.x(str)) {
          return;
       }else {
          Iterator iterator = j.a().i(str, new e$a(this).getType()).entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             f value = uEntry.getValue();
             f mFields = value.mFields;
             if (mFields == null || !mFields.size()) {
                continue ;
             }else {
                str1 = this.c(uEntry.getKey());
                try{
                   og = this.b(value);
                   if (og == null) {
                      continue ;
                   }
                }catch(java.lang.Exception e2){
                   Log.d("LogBucketManager", "BucketManager value to json error £º"+e2.getMessage());
                   goto label_0052 ;
                }
             }
             this.d.a(str1, j.a().q(og), value.mBiz);
          }
          return;
       }
    }
}
