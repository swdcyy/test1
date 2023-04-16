package e5.b;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import e5.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import java.lang.Boolean;
import java.util.Set;

public class b	// class@001eff
{
    public Map a;
    public Map b;

    public void b(Map p0){
       super();
       this.a = p0;
       if (p0 == null) {
          this.a = new HashMap();
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       return;
    }
    public a a(String p0){
       if (TextUtils.isEmpty(p0) || !this.a.containsKey(p0)) {
          return null;
       }
       return this.a.get(p0);
    }
    public View b(String p0){
       if (TextUtils.isEmpty(p0) || !this.a.containsKey(p0)) {
          return null;
       }
       return this.a.get(p0).c;
    }
    public boolean c(String p0){
       if (TextUtils.isEmpty(p0) || !this.b.containsKey(p0)) {
          return false;
       }
       return this.b.get(p0).booleanValue();
    }
    public Set d(){
       b ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.keySet();
    }
    public void e(String p0){
       this.b.put(p0, Boolean.TRUE);
    }
}
