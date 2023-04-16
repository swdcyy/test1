package ag9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.DateUtils;
import bn8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class g	// class@0000c1
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("last_show_record_reco_collect_music_time", DateUtils.l());
       g.a(uEditor);
       return;
    }
}
