package com.kwai.tokenshare.presenter.g;
import erd.g;
import com.kwai.tokenshare.presenter.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import eu7.b;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.Button;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;

public class g implements g	// class@001943
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, h.class, "7")) {
             h v = p0.v;
             v.mFollowed = true;
             p0.s.setText(v.mFollowedTitle);
             p0.t.setText(p0.v.mFollowedSubtitle);
             p0.u.setText(p0.v.mFollowedButtonText);
          }
       }else if(QCurrentUser.ME.isLogined()){
          this.b.p.c();
       }
       return;
    }
}
