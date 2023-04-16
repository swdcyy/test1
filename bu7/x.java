package bu7.x;
import java.lang.Runnable;
import com.kwai.tokenshare.KwaiTokenInitModule;
import android.app.Activity;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import android.content.ClipboardManager;
import n4d.c;
import lnc.i3;
import java.lang.Boolean;
import k2b.u1;

public final class x implements Runnable	// class@0004a0
{
    public final KwaiTokenInitModule b;
    public final Activity c;

    public void x(KwaiTokenInitModule p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = this.c.getSystemService("clipboard").hasPrimaryClip();
       i3 oi3 = i3.f();
       oi3.a("authorized", Boolean.valueOf((tb.l0() ^ 0x01)));
       oi3.a("hasStrings", Boolean.valueOf(b));
       String str = oi3.e();
       u1.R("SHARE_SDK_READ_PASTE_BOARD", str, 9);
       return;
    }
}
