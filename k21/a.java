package k21.a;
import android.view.View$OnClickListener;
import k21.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class a implements View$OnClickListener	// class@002c65
{
    public final k b;

    public void a(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "15")) {
       }else {
          LivePlayLogger.onFloatOrientationClick(true, tb.r.Z2.a());
          tb.a9();
       }
       return;
    }
}
