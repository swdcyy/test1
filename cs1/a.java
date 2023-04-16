package cs1.a;
import android.view.View$OnClickListener;
import cs1.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import as1.c;
import sq1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements View$OnClickListener	// class@001e3c
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       tb.k.k(tb.j.d());
       b.c0(LiveLogTag.LIVE_LINE_PUZZLE, "bindMultiLinePuzzleTag", "layRoleUrl", this.b.j.d());
       return;
    }
}
