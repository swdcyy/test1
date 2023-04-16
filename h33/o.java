package h33.o;
import u07.u;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class o implements u	// class@002c2a
{
    public final y b;
    public final SlipSwitchButton c;

    public void o(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       o tb = this.b;
       o tc = this.c;
       Objects.requireNonNull(tb);
       tb.a(tc, (tc.getSwitch() ^ 0x01));
       PermissionUtils.s(tb.b);
    }
}
