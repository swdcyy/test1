package bjd.c;
import bjd.c$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import vid.b;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import java.lang.Class;
import java.lang.StringBuilder;
import mjd.a;
import java.util.Collection;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import android.content.SharedPreferences$Editor;
import java.util.Map$Entry;
import java.lang.CharSequence;
import oe6.g;

public final class c	// class@00026c
{
    public final Gson a;
    public final SharedPreferences b;
    public static final c$a c;

    static {
       c.c = new c$a(null);
    }
    public void c(Context p0){
       a.q(p0, "context");
       super();
       this.a = new Gson();
       this.b = b.c(p0, "sp_cdn_host_group", 0);
    }
    public final Map a(){
       CdnHostGroup uCdnHostGrou;
       c tb = this.b;
       Map map = null;
       if (tb != null) {
          Set set = b.a(tb);
          if (set != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                String str = "";
                String str1 = this.b.getString(iterator.next(), str);
                if (str1 != null) {
                   str = str1;
                }
                try{
                   uCdnHostGrou = this.a.h(str, CdnHostGroup.class);
                }catch(java.lang.Exception e0){
                   a.c("CdnSelectorLocalDataSource", "Couldn\'t parse json for "+iterator.next()+". "+str);
                   uCdnHostGrou = map;
                }
                if (uCdnHostGrou != null) {
                   uArrayList.add(uCdnHostGrou);
                }
             }
             map = new LinkedHashMap(q.n(s0.j(u.Y(uArrayList, 10)), 16));
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                map.put(obj.getTypeName(), obj);
             }
          }
       }
       return map;
    }
    public final void b(Map p0){
       String str;
       a.q(p0, "newGroups");
       c tb = this.b;
       if (tb != null) {
          SharedPreferences$Editor uEditor = tb.edit();
          if (uEditor != null) {
             uEditor.clear();
             LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(p0.size()));
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Object key = uEntry.getKey();
                str = this.a.q(uEntry.getValue());
                if (str != null) {
                   int i = (str.length() > 0)? 1: 0;
                   if (i) {
                   label_0053 :
                      linkedHashMa.put(key, str);
                   }
                }
                str = null;
                goto label_0053 ;
             }
             iterator = linkedHashMa.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry1 = iterator.next();
                str = uEntry1.getKey();
                uEditor.putString(str, uEntry1.getValue());
             }
             g.a(uEditor);
          }
       }
       return;
    }
}
