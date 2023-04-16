package bk0.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import fi0.a;
import java.util.Map;
import java.lang.StringBuilder;
import ekd.e0;
import android.content.Context;

public class a	// class@00039b
{

    public void a(){
       super();
    }
    public boolean a(String p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       this.c(p0).edit().clear();
       return true;
    }
    public Object b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.c(p0).getString(p1, "");
       if (!TextUtils.isEmpty(p0)) {
          return a.a().h(p0, Map.class);
       }
       return null;
    }
    public SharedPreferences c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e0.a(e0.b, p0+"_krn_sdk_page_report_log_storage", 0);
    }
}
