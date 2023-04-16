package b56.a0;
import android.view.View$OnClickListener;
import com.kwai.feed.player.ui.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feed.player.ui.e;

public final class a0 implements View$OnClickListener	// class@0003f4
{
    public final f b;

    public void a0(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       Log.g("QualitySwitchPanel", "on click panel");
       tb.b();
       if (PatchProxy.applyVoid(null, tb, f.class, "6")) {
       }else {
          tb.d.a();
       }
       return;
    }
}
