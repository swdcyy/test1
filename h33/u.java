package h33.u;
import u07.u;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import h33.c;
import android.content.Context;
import java.util.Map;
import java.lang.String;
import n3d.a;

public final class u implements u	// class@002c30
{
    public final y b;
    public final SlipSwitchButton c;

    public void u(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       u tb = this.b;
       Objects.requireNonNull(tb);
       BindPhoneParams$b uob = new BindPhoneParams$b();
       uob.j(201);
       d.a(-1712118428).ew(tb.b, uob.a(), null, "private_option", new c(tb, this.c));
    }
}
