package en7.q;
import java.lang.Object;
import android.content.SharedPreferences;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;
import android.content.SharedPreferences$Editor;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import java.lang.Float;
import oe6.g;
import java.lang.IllegalArgumentException;

public abstract class q	// class@002319
{

    public void q(){
       super();
    }
    public abstract SharedPreferences a();
    public final void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "2")) {
          return;
       }
       a.p(p0, "key");
       if (u.S1(p0)) {
          throw new IllegalArgumentException("pref key is empty");
       }
       SharedPreferences$Editor uEditor = this.a().edit();
       if (p1 == null) {
          uEditor.remove(p0);
       }else if(p1 instanceof Boolean){
          uEditor.putBoolean(p0, p1.booleanValue());
       }else if(p1 instanceof String){
          uEditor.putString(p0, p1);
       }else if(p1 instanceof Integer){
          uEditor.putInt(p0, p1.intValue());
       }else if(p1 instanceof Long){
          uEditor.putLong(p0, p1.longValue());
       }else if(p1 instanceof Float){
          uEditor.putFloat(p0, p1.floatValue());
       }else {
          uEditor.putString(p0, p1.toString());
       }
       g.a(uEditor);
       return;
    }
}
