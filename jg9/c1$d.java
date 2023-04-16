package jg9.c1$d;
import com.yxcorp.gifshow.bubble.b$c;
import jg9.c1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.b;
import oa0.a;
import android.content.SharedPreferences;

public final class c1$d implements b$c	// class@002a8a
{
    public final c1 a;

    public void c1$d(c1 p0){
       this.a = p0;
       super();
    }
    public final boolean c(){
       d obj = PatchProxy.apply(null, this, c1$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.d;
       a.o(obj, "mCallerContext");
       boolean b = true;
       if (obj.k() || !a.a.getBoolean("first_show_multi_take_tips", b)) {
          b = false;
       }
       return b;
    }
}
