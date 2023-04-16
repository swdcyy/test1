package zb6.c;
import io7.a;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.util.Map;
import java.util.Collections;
import zb6.d;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;

public final class c implements a	// class@002916
{
    public final Type b;

    public void c(Type p0){
       this.b = p0;
    }
    public final void a(String p0,f p1){
       c tb = this.b;
       Map map = p1.d(tb, Collections.emptyMap());
       d.d.put(p0, map);
       g.a(d.b.edit().putString(d.b("inner_sesdk_kconf"), a.a.q(map)));
       p1.d(tb, Collections.emptyMap()).size();
    }
}
