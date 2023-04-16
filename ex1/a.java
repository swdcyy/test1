package ex1.a;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import km8.b;
import oe6.g;

public final class a implements g	// class@002215
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("live_play_check_resolution_response", b.e(p0));
       g.a(uEditor);
    }
}
