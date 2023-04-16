package d7a.a;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import d7a.a$a;
import java.lang.String;
import ok.x;
import java.lang.Object;
import v6a.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uw9.q3;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class a extends ConfigAutoParseJsonConsumer	// class@001eb5
{
    public static final a e;

    static {
       a.e = new a();
    }
    public void a(){
       super("pymlFollowingIntensifyConfig", a$a.b);
    }
    public void b(Object p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else if(p0 != null){
          a = q3.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putString("pyml_following_intensify_triggers", b.e(p0.triggers));
          g.a(uEditor);
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putInt("pyml_limit_count_per_day", p0.timesPerDay);
          g.a(uEditor1);
          PatchProxy.onMethodExit(a.class, "1");
       }else {
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
}
