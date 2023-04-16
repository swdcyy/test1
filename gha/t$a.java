package gha.t$a;
import gha.t;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class t$a extends t	// class@002ae5
{

    public void t$a(String p0){
       super(p0);
    }
    public Object a(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, t$a.class, "2");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(t.b.getInt(this.a, p0.intValue()));
       }
       return integer;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
       }else {
          g.a(t.b.edit().putInt(this.a, p0.intValue()));
       }
       return;
    }
}
