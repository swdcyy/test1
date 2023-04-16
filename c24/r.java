package c24.r;
import cb4.e;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.x;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import java.util.Map;
import ot3.h0;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import ss3.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class r implements e	// class@000496
{
    public final LiveMerchantBaseContext a;
    public final x b;

    public void r(LiveMerchantBaseContext p0,x p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String obj = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = h0.a(p0.d()).get("id");
          if (obj == null) {
             obj = "";
          }
          GifshowActivity gifshowActiv = p0.a();
          if (gifshowActiv != null) {
             d.a(0x50a4ea96).lD(this.a, obj, this.b, gifshowActiv.getSupportFragmentManager());
          }
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
