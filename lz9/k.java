package lz9.k;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import lz9.b0;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;

public final class k implements g	// class@002ee1
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void accept(Object p0){
       if (p0.booleanValue()) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putBoolean(b.d("user")+"appearedDanmakuTipBubbleGuide", true);
          g.a(uEditor);
       }
       return;
    }
}
