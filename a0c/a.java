package a0c.a;
import erd.g;
import android.app.Activity;
import qm6.b$a;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import qm6.b;
import android.content.Context;
import o56.f;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.String;

public final class a implements g	// class@000006
{
    public final Activity b;
    public final b$a c;

    public void a(Activity p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       p0.J20(tb, this.c.f());
       tb.overridePendingTransition(R.anim.arg_RES_7f010033, 0x7f0100f2);
       if (f.b(tb)) {
          b.a(0x4b316083).p0("RECORD_CAMERA", true);
       }
       return;
    }
}
