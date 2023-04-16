package ac8.j;
import jm.i;
import com.mini.js.jsapi.ui.MiniModalInvokeApi;
import ja8.c;
import ja8.e;
import java.lang.Object;
import jm.h;
import android.view.View;
import org.json.JSONObject;
import java.lang.String;
import com.mini.js.helper.a;

public final class j implements i	// class@000068
{
    public final MiniModalInvokeApi a;
    public final c b;
    public final e c;

    public void j(MiniModalInvokeApi p0,c p1,e p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(h p0,View p1){
       this.b.a(a.f(this.c, true, this.a.J(false, true), null, false));
    }
}
