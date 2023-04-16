package o81.b;
import android.text.style.ClickableSpan;
import h81.e;
import h81.b;
import tyc.q0;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.a;
import android.view.View$OnClickListener;
import android.text.TextPaint;

public class b extends ClickableSpan	// class@0034a7
{
    public final b b;
    public final WeakReference c;
    public final q0 d;

    public void b(e p0,b p1){
       super();
       this.d = new q0();
       this.b = p1;
       this.c = new WeakReference(p0);
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       e uoe = this.c.get();
       if (uoe != null && this.b != null) {
          this.d.a(p0, new a(this, p0, uoe));
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
    }
}
