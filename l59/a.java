package l59.a;
import com.kuaishou.webkit.DownloadListener;
import com.kuaishou.webkit.WebView;
import l59.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.ad.webview.blackurl.a;
import java.util.List;
import erd.o;

public class a implements DownloadListener	// class@002c84
{
    public DownloadListener a;
    public WebView b;
    public b c;

    public void a(DownloadListener p0,WebView p1,b p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void onDownloadStart(String p0,String p1,String p2,String p3,long p4){
       a uoa = a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       if (this.c != null && this.b != null) {
          Object obj = PatchProxy.applyOneRefs(p0, null, BlackUrlUtil.class, "10");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else if(TextUtils.isEmpty(p0) || TextUtils.isEmpty(p0.trim())){
             i = BlackUrlUtil.c(BlackUrlUtil.b, "landingPageApkBlackList", a.b).contains(BlackUrlUtil.e(p0));
          }
          if (i) {
             this.c.a(this.b, p0);
             return;
          }
       }
    label_0072 :
       uoa = this.a;
       if (uoa != null) {
          uoa.onDownloadStart(p0, p1, p2, p3, p4);
       }
       return;
    }
}
