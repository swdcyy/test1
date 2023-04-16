package kx8.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$d;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lx8.a;
import ok.x;
import com.yxcorp.gifshow.activity.web.memory.ActivityTabMemoryOptConfig;
import java.util.Iterator;
import java.util.List;
import java.lang.ref.WeakReference;
import android.content.Intent;
import kx8.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;

public class b implements KwaiYodaWebViewActivity$d	// class@002c38
{

    public void b(){
       super();
    }
    public void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          ActivityTabMemoryOptConfig uActivityTab = a.b.get();
          if (uActivityTab != null && uActivityTab.mFullScreenWebViewCount > null) {
             Iterator iterator = a.a.iterator();
             while (iterator.hasNext()) {
                WeakReference weakReferenc = iterator.next();
                if (weakReferenc.get() == p0) {
                   a.a.remove(weakReferenc);
                   break ;
                }
             }
          }
       }
       return;
    }
    public void b(Activity p0,Intent p1,String p2){
       boolean b;
       List a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       v.a(p0, p2);
       a uoa = a.class;
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, p2, obj, uoa, "1")) {
          ActivityTabMemoryOptConfig uActivityTab = a.b.get();
          if (uActivityTab != null && uActivityTab.mFullScreenWebViewCount > null) {
             uoa = PatchProxy.applyOneRefs(p2, obj, uoa, "3");
             if (uoa != PatchProxyResult.class) {
                b = uoa.booleanValue();
             }else if(TextUtils.x(p2)){
                b = false;
             }else {
                b = TextUtils.n(Uri.parse(p2).getQueryParameter("optMemory"), "1");
             }
             if (b) {
                if (uActivityTab.mFullScreenWebViewCount > null) {
                   a = a.a;
                   if (a.size() >= uActivityTab.mFullScreenWebViewCount) {
                      WeakReference weakReferenc = a.get(0);
                      if (weakReferenc.get() != null) {
                         weakReferenc.get().finish();
                      }
                      a.remove(weakReferenc);
                   }
                }
                a.a.add(new WeakReference(p0));
             }
          }
       }
       return;
    }
}
