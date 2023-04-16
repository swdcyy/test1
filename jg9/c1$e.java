package jg9.c1$e;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class c1$e implements b$c	// class@002a8b
{
    public static final c1$e a;

    static {
       c1$e.a = new c1$e();
    }
    public void c1$e(){
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1$e.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_multi_take_tips", false);
       g.a(uEditor);
       return;
    }
}
