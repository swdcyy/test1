package ip8.b;
import android.text.style.MetricAffectingSpan;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b extends MetricAffectingSpan	// class@002705
{
    public final float b;

    public void b(float p0){
       super();
       this.b = p0;
    }
    public final void a(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       p0.setLetterSpacing(this.b);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
}
