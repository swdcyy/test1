package f4a.c;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.detail.plc.helper.c;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;

public final class c implements DialogInterface$OnClickListener	// class@00229e
{
    public final c b;
    public final Activity c;
    public final ApkDownloadTaskInfo d;

    public void c(c p0,Activity p1,ApkDownloadTaskInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(DialogInterface p0,int p1){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f10081a) {
          tb.a = tb.c(tc, td);
       }
       return;
    }
}
