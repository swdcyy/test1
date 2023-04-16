package b04.a;
import qw3.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import mrd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import qc5.a;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import b04.a$a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.home2.main.Prefetch;

public class a extends a	// class@0002f0
{
    public boolean b;
    public final c c;
    public long d;
    public List e;
    public String f;
    public FeedPage g;
    public MerchantHomePerfRepository h;
    public static boolean i;

    public void a(MerchantHomePerfRepository p0){
       super();
       this.b = true;
       this.c = a.g();
       this.h = p0;
    }
    public static String p0(){
       String str;
       Object obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.i && !QCurrentUser.ME.isLogined()) {
          a.i = true;
          str = b.a(-515139006).a();
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putBoolean(b.d("user")+"merchant_home_ext_info_sent", true);
          g.a(uEditor);
       }else {
          str = "";
       }
       return str;
    }
    public static a r0(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewModelProvider(p0, new a$a(p0)).get(a.class);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       super.onCleared();
       Prefetch.x.a();
       a tg = this.g;
       if (tg != null) {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString(b.d("user")+"merchant_home_feed_cache", b.e(tg));
          g.a(uEditor);
       }
       return;
    }
    public long q0(){
       return this.d;
    }
}
