package glb.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import glb.c;
import ok.x;
import java.lang.Object;
import oa0.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class d extends ConfigAutoParseJsonConsumer	// class@002b23
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("EnableBodySlimming", p0.mEnableBodySlimming);
          g.a(uEditor);
       }
       return;
    }
}
