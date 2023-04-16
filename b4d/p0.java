package b4d.p0;
import android.view.View$OnClickListener;
import b4d.v0;
import java.lang.Object;
import android.view.View;
import k2b.e0;
import java.lang.String;
import a4d.s;

public final class p0 implements View$OnClickListener	// class@000385
{
    public final v0 b;

    public void p0(v0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p0 tb = this.b;
       v0 x = tb.x;
       e0 uoe0 = tb.S8();
       String str = (tb.y != null)? "PICTURE": "GIF";
       x.b(uoe0, "CLOSE", str);
       tb.V8(true);
       return;
    }
}
