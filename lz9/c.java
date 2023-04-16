package lz9.c;
import erd.g;
import lz9.b0;
import java.lang.Object;
import java.lang.Boolean;
import im8.f;
import uw9.r3;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class c implements g	// class@002ed9
{
    public final b0 b;

    public void c(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (tb.H != null) {
          tb.W.set(Boolean.TRUE);
       }
       SharedPreferences$Editor uEditor = r3.a.edit();
       uEditor.putBoolean("isShowNewGuyDirection", p0.booleanValue());
       g.a(uEditor);
       return;
    }
}
