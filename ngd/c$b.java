package ngd.c$b;
import com.yxcorp.plugin.setting.widget.SlideSelector$d;
import ngd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.widget.SlideSelector;
import io.reactivex.subjects.PublishSubject;

public final class c$b implements SlideSelector$d	// class@001e35
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       float f;
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       FontScaleHelper uFontScaleHe = FontScaleHelper.class;
       if (PatchProxy.isSupport(uFontScaleHe)) {
          float[] obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uFontScaleHe, "3");
          if (obj != PatchProxyResult.class) {
             f = obj.floatValue();
          }else {
          label_0037 :
             obj = FontScaleHelper.a;
             p0 = (p0 >= 0 && p0 <= ArraysKt___ArraysKt.Od(obj))? obj[p0]: 0x3f800000;
          }
       }else {
          goto label_0037 ;
       }
       uob.R8(f);
       c a = this.a.A;
       if (a == null) {
          a.S("fontScaleSelectSubject");
       }
       a.onNext(c.P8(this.a));
       return;
    }
}
