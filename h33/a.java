package h33.a;
import u07.u;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;

public final class a implements u	// class@002c19
{
    public final y b;
    public final SlipSwitchButton c;

    public void a(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       tb.a(tc, (tc.getSwitch() ^ 0x01));
    }
}
