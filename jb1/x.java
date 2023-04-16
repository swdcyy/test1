package jb1.x;
import android.text.style.ClickableSpan;
import jb1.y$a;
import com.kwai.framework.model.user.User;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.r;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import android.text.TextPaint;

public class x extends ClickableSpan	// class@002b27
{
    public final User b;
    public final y$a c;

    public void x(y$a p0,User p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       d.a(-1718536792).Y7(this.c.C(), ProfileStartParam.l(this.b));
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       return;
    }
}
