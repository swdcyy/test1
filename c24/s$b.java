package c24.s$b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import tkd.b;
import tkd.d;
import ss3.a;
import ts3.b;
import java.util.Map;
import java.lang.Integer;
import java.lang.Boolean;
import js6.a;

public final class s$b implements DialogInterface$OnDismissListener	// class@000498
{
    public final Fragment b;
    public final GifshowActivity c;
    public final String d;
    public final int e;

    public void s$b(Fragment p0,GifshowActivity p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s$b.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       String str = "cmd";
       if (d.a(0x50a4ea96).no().d(this.d)) {
          hashMap.put(str, "open");
       }else {
          hashMap.put(str, "close");
       }
       HashMap hashMap1 = new HashMap();
       hashMap1.put("type", Integer.valueOf(12));
       hashMap1.put("result", Boolean.TRUE);
       hashMap.put("data", hashMap1);
       a.b.go(this.e, "MerchantAnchorSwitchStatusUpdate", hashMap);
       PatchProxy.onMethodExit(s$b.class, "1");
       return;
    }
}
