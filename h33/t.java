package h33.t;
import u07.u;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.login.TencentPlatform;
import android.content.Context;
import h33.b;
import n3d.a;

public final class t implements u	// class@002c2f
{
    public final y b;
    public final SlipSwitchButton c;

    public void t(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       p0 = this.b;
       new TencentPlatform(p0.b).login(p0.b, new b(p0, this.c));
    }
}
