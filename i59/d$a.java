package i59.d$a;
import com.yxcorp.download.k;
import i59.d;
import android.app.Activity;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import e17.i;

public class d$a extends k	// class@002631
{
    public final Activity c;
    public final d d;

    public void d$a(d p0,Activity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void o(DownloadTask p0){
       int i;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (this.c.isFinishing()) {
          return;
       }
       PhotoAdvertisement photoAdverti = this.d.b.get("AD");
       if (photoAdverti != null && !TextUtils.x(photoAdverti.mAppName)) {
          photoAdverti = photoAdverti.mAppName;
          i = photoAdverti.lastIndexOf(".");
          if (i > 0) {
             str = photoAdverti.substring(0, i);
          }
       }else {
          str = "";
       }
       i.d(R.style.arg_RES_7f11066a, str+a.B.getResources().getString(R.string.arg_RES_7f100ac0));
       return;
    }
}
