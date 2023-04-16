package by9.f;
import android.text.style.ClickableSpan;
import by9.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import android.text.TextPaint;
import lnc.a1;

public final class f extends ClickableSpan	// class@000515
{
    public final g b;

    public void f(g p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       a.b(b.j(uActivityCon.e(), this.b.t), null);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "ds");
       super.updateDrawState(p0);
       p0.setColor(a1.a(R.color.arg_RES_7f0607c1));
       p0.setUnderlineText(false);
       return;
    }
}
