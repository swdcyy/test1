package caa.f$b;
import erd.g;
import java.lang.Object;
import daa.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z9a.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import daa.g;
import java.lang.Integer;
import java.util.Map;
import caa.f;

public final class f$b implements g	// class@00058f
{
    public static final f$b b;

    static {
       f$b.b = new f$b();
    }
    public void f$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"pokes", b.e(p0.configs));
          g.a(uEditor);
          p0 = p0.configs;
          LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             linkedHashMa.put(Integer.valueOf(obj.id), obj);
          }
          f.a = linkedHashMa;
       }
       return;
    }
}
