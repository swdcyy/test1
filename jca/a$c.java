package jca.a$c;
import androidx.lifecycle.Observer;
import jca.a;
import java.lang.Object;
import rwc.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kwai.feature.post.api.widget.RecordSeekBar;

public final class a$c implements Observer	// class@002a49
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.d.setProgress((int)p0.getValue().floatValue());
       }
       return;
    }
}
