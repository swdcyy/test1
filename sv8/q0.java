package sv8.q0;
import java.lang.Runnable;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.Exception;

public abstract class q0 implements Runnable	// class@003873
{
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public void q0(Activity p0,WebView p1,String p2){
       super();
       this.b = new WeakReference(p0);
       this.c = new WeakReference(p1);
       this.d = p2;
    }
    public abstract void a(Activity p0,WebView p1);
    public void run(){
       StringBuilder str;
       String str1;
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       Activity uActivity = this.b.get();
       if (uActivity == null || uActivity.isFinishing()) {
          str = "";
          str1 = "PayYodaSafeRunnable: run failed, activity invalid, bridgeCommand:";
       }else {
          WebView webView = this.c.get();
          if (webView == null) {
             str = "PayYodaSafeRunnable: run failed, webView "+webView;
             str1 = ", bridgeCommand:";
          }else {
             try{
                this.a(uActivity, webView);
             }catch(java.lang.Exception e0){
                g.d("PayYodaSafeRunnable: run failed, "+e0.getMessage());
                e0.printStackTrace();
             }
             return;
          }
       }
       g.d(str+str1+this.d);
       return;
    }
}
