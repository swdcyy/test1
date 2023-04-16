package nmd.f;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;

public final class f	// class@001e57
{

    public static final void a(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "1")) {
          return;
       }
       a.p(p0, "$this$adjustFontForAlteDIN1451Mittelschrift");
       p0.setTypeface(d0.a("alte-din.ttf", a1.c()));
       return;
    }
}
