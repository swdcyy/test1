package jg9.o0;
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

public final class o0 implements b$c	// class@002aa8
{
    public static final o0 a;

    static {
       o0.a = new o0();
    }
    public void o0(){
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_new_multi_take_action", false);
       g.a(uEditor);
       return;
    }
}
