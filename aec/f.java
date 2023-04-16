package aec.f;
import android.view.View$OnClickListener;
import aec.d;
import sx5.i;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;

public final class f implements View$OnClickListener	// class@000100
{
    public final d b;
    public final i c;
    public final OpenServiceBarResponse d;

    public void f(d p0,i p1,OpenServiceBarResponse p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       this.b.R8();
       SocialPushKt.d(this.c);
       this.b.P8();
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
