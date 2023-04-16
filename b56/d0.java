package b56.d0;
import android.view.View$OnClickListener;
import com.kwai.feed.player.ui.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feed.player.ui.e;

public final class d0 implements View$OnClickListener	// class@0003fa
{
    public final g b;

    public void d0(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       Log.g("SpeedSwitchPanel", "on click speed panel");
       tb.c();
       if (PatchProxy.applyVoid(null, tb, g.class, "5")) {
       }else {
          tb.c.a();
       }
       return;
    }
}
