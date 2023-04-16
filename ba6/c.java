package ba6.c;
import erd.g;
import java.lang.String;
import java.lang.Object;
import ba6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ba6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.log.urt.RestDyeConfig;
import w96.d;
import java.lang.StringBuilder;
import q87.c;

public final class c implements g	// class@00044d
{
    public final String b;

    public void c(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(p0 != null){
          g.a(e.b.edit().putLong("urt_config_version", p0.a()).putString("urt_request_date", this.b));
          b.a(0x4b316083).G0(p0.mUrtConfig);
          Object[] objArray = new Object[0];
          d.C().w("UrtConfigManager", "°æ±¾ºÅ£º"+p0.a(), objArray);
       }
       return;
    }
}
