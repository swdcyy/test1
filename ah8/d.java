package ah8.d;
import erd.g;
import com.mini.plcmanager.live.a;
import com.mini.plcmanager.PlcModel;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.mini.misc.api.UploadFileResponse;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class d implements g	// class@000098
{
    public final a b;
    public final PlcModel c;
    public final WeakReference d;

    public void d(a p0,PlcModel p1,WeakReference p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       int i;
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0 != null && (p0.result == 1 && !TextUtils.isEmpty(p0.url))) {
          tc.d = p0.url;
          tb.b(td, tc);
       }else if(p0 == null){
          i = 0;
       }else {
          p0 = p0.result;
       }
       tb.d(false, i);
       return;
    }
}
