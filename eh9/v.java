package eh9.v;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.e;
import java.lang.Object;
import eh9.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bn8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class v implements g	// class@00215d
{
    public final e b;

    public void v(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt("last_send_message_selected_tab_id", p0.getTabId());
          g.a(uEditor);
       }
       return;
    }
}
