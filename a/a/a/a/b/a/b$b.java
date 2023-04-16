package a.a.a.a.b.a.b$b;
import java.lang.Runnable;
import a.a.a.a.b.a.b;
import f.g;
import java.lang.String;
import f.i;
import android.os.ConditionVariable;
import java.lang.Object;
import org.json.JSONArray;
import org.json.JSONObject;
import a.a.a.a.b.a.c;
import org.json.JSONException;
import f.k;
import a.a.a.a.b.a.a;
import android.util.Pair;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import com.kuaishou.security.kste.logic.event.KSTEException;
import java.lang.StringBuilder;
import a.a.a.a.b.e.b$b;
import a.a.a.a.b.e.b;
import java.util.HashMap;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import d.b;
import a.a.a.a.b.a.c$a;
import android.content.Context;
import d.c;
import java.lang.Throwable;

public class b$b implements Runnable	// class@00000b
{
    public final g b;
    public final String c;
    public final i d;
    public final ConditionVariable e;
    public final b f;

    public void b$b(b p0,g p1,String p2,i p3,ConditionVariable p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       int i;
       b$b c;
       i oi;
       b$b uob = this;
       JSONArray jSONArray = new JSONArray();
       JSONObject jSONObject = new JSONObject();
       try{
          i = 0;
          jSONObject.put(c.k0, uob.b.j());
          jSONObject.put(c.l0, i);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       jSONArray.put(jSONObject);
       b$b f = uob.f;
       c = uob.c;
       b$b d = uob.d;
       String str = "\\|";
       if (f.e.c == null) {
          m$c.b("doSingleLoadBc bcupdate needupdate is 0");
          oi = null;
       }else {
          Pair pair = a.a().c(c, jSONArray);
          if (!pair.first.booleanValue()) {
             JSONArray jSONArray2 = new JSONArray();
             Iterator iterator1 = pair.second.iterator();
             while (iterator1.hasNext()) {
                jSONArray2.put(iterator1.next());
             }
             int i3 = 200;
             f.a.initCallback().onError(new KSTEException("bc single update fail list: "+jSONArray2, i3));
             b.a(b$b.a, "doSingleLoadBc SEC_ERROR_BC_UPDATE_FAILS "+jSONArray2, i3);
          }
          oi = 1;
       }
       i oi1 = null;
       Iterator iterator = f.d.iterator();
       while (iterator.hasNext()) {
          i oi2 = iterator.next();
          if (oi2 != null && (oi2.a).equals(d.a)) {
             oi1 = oi2;
          }
       }
       HashMap hashMap = new HashMap();
       if (oi1 != null) {
          m$c.b("bcHistorySingle load vm begin  "+oi1.toString());
          d.m = oi1.m;
          if (!KSTEContext.bInterpLoadStatus) {
             KSTEContext.bInterpLoadStatus = b.a().b(c, f.e);
          }
          if (!KSTEContext.bInterpLoadStatus) {
             m$c.d("interp library load failure after retry");
             f.a.initCallback().onError(new KSTEException(102));
             b.a(b$b.a, "SEC_ERROR_INTERP_LOAD_UPDATE_LIBRARY_ERROR", 102);
          }else {
             JSONArray jSONArray1 = new JSONArray();
             if (oi1.m != c$a.b) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put(c.k0, oi1.a);
                jSONObject1.put(c.l0, oi1.b);
                jSONObject1.put(c.n0, oi1.d);
                jSONObject1.put(c.o0, oi1.e);
                jSONObject1.put(c.p0, oi1.g);
                jSONObject1.put(c.q0, oi1.h);
                jSONArray1.put(jSONObject1);
             }
             String[] stringArray = c.c(f.a.context(), jSONArray1.toString());
             int len = stringArray.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = stringArray[i1];
                hashMap.put(oobject.split(str)[i], Boolean.valueOf((oobject.split(str)[1]).equals("1")));
                i1 = i1 + 1;
                String str1 = null;
             }
             m$c.b("bcHistorySingle load vm finish "+oi1);
             d.b = oi1.b;
             d.c = oi1.c;
             d.d = oi1.d;
             d.e = oi1.e;
             d.g = oi1.g;
             d.h = oi1.h;
             if (hashMap.containsKey(d.a)) {
                d.i = hashMap.get(d.a).booleanValue();
             }
             d.j = true;
          }
       }else {
          m$c.d("bcHistorySingle is null");
          d.j = false;
          d.i = false;
          c = b$b.a;
          String str2 = "SEC_ERROR_BC_UPDATE_SINGLE_FETCH_ERROR "+d.a+"bcNeedUpdate:"+f.e.c+" preBCHistory:"+f.d.size()+" isFetched:"+oi;
          int i2 = 201;
          b.a(c, str2, i2);
       }
       uob.e.open();
       c = uob.d;
       if (c.j != null && c.l == null) {
          c.l = true;
       }
       c.k.open();
       return;
    }
}
