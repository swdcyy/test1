package b66.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import b66.a;
import ok.x;
import java.lang.Object;
import com.kwai.framework.preference.startup.FeedConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@00041b
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString("videoModelCrowdTag", p0.videoModelCrowdTag);
          g.a(uEditor);
       }
       return;
    }
}
