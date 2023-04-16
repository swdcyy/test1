package bsa.b$j;
import zq6.u;
import bsa.b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import q87.c;
import android.view.View;

public final class b$j implements u	// class@00045a
{
    public final b a;

    public void b$j(b p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$j.class, "1")) {
       }else {
          a.o(p0, "it");
          Object[] objArray = new Object[0];
          b.C().w("BLOCK_FLOAT_TAB", "X_BLOCK_TAB_BACKGROUND "+Integer.toHexString(p0.intValue()), objArray);
          b.R8(this.a).setBackgroundColor(p0.intValue());
          b.P8(this.a).setBackgroundColor(p0.intValue());
       }
       return;
    }
}
