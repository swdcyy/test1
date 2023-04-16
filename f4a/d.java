package f4a.d;
import erd.g;
import com.yxcorp.gifshow.detail.plc.helper.c;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import java.lang.Object;
import zq8.a;
import java.util.Objects;

public final class d implements g	// class@0022a0
{
    public final c b;
    public final Activity c;
    public final ApkDownloadTaskInfo d;

    public void d(c p0,Activity p1,ApkDownloadTaskInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          tb.d(tc, td);
       }
       return;
    }
}
