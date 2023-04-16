package jh9.d$g;
import erd.g;
import jh9.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import ih9.s;

public final class d$g implements g	// class@002adc
{
    public final d b;

    public void d$g(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$g.class, "1")) {
       }else {
          d$g tb = this.b;
          tb.w = p0;
          a.o(p0, "it");
          if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "8")) {
             Objects.requireNonNull(p0);
             ToolBoxHeaderConfig obj = PatchProxy.apply(null, p0, ToolBoxHeaderConfig.class, "3");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = p0.c;
                b = (obj == null || !obj.length())? 1: 0;
                b = b ^ true;
             }
             if (b) {
                if (!TextUtils.isEmpty(p0.a())) {
                   RxBus.f.b(new s(p0.a()));
                   tb.z = true;
                }else {
                   RxBus.f.b(new s(""));
                   tb.z = false;
                }
             }
          }
       }
       return;
    }
}
