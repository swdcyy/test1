package eaa.a;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import eaa.a$a;
import ok.x;
import java.lang.Object;
import daa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z9a.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class a extends ConfigAutoParseJsonConsumer	// class@0020f7
{
    public static final a e;

    static {
       a.e = new a();
    }
    public void a(){
       super(a$a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"businessConfigs", b.e(p0.configs));
          g.a(uEditor);
       }
       return;
    }
}
