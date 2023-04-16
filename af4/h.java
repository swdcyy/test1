package af4.h;
import xs3.f;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import wkd.b;
import com.kuaishou.android.model.feed.k;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.HashMap;
import com.kuaishou.merchant.basic.util.f;
import java.util.Map;
import java.lang.Boolean;
import ig4.b;
import com.kuaishou.merchant.router.base.RouterRequest;
import android.net.Uri;
import us3.f;
import com.kuaishou.merchant.transaction.detail.skupanel.TransactionSkuPanelFragment;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import t45.c;
import af4.h$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import af4.g;
import ii4.h;
import crd.b;
import lnc.b9;
import ekd.x0;
import lnc.o5;
import ji4.b;
import af4.f;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$a;
import di4.b;
import ii4.b;
import ii4.g;

public class h implements f	// class@0000b9
{
    public ConcurrentHashMap b;

    public void h(){
       super();
       this.b = new ConcurrentHashMap(10);
    }
    public String Ee(String p0,LiveMerchantBaseContext p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getLiveFeed() != null) {
          p0 = b.a(0x5f22eaa1).w(p0, p1.getLiveFeed().get("AD"));
       }
       if (!TextUtils.x(p1.getJumpParams())) {
          p0 = TextUtils.d(p0, p1.getJumpParams());
       }
       if (p1.getLiveFeed() != null && p1.getLiveFeed() instanceof LiveStreamFeed) {
          obj = new HashMap();
          obj.put(f.c, p1.getLiveFeed().getId());
          obj.put(f.d, p1.getLiveStreamId());
          p0 = TextUtils.e(p0, obj);
       }
       return p0;
    }
    public boolean OT(){
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a().a;
    }
    public void X7(RouterRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "8")) {
          return;
       }
       String str = p0.d().toString();
       f uof = p0.b();
       TransactionSkuPanelFragment transactionS = PatchProxy.applyTwoRefs(str, uof, null, TransactionSkuPanelFragment.class, "2");
       if (transactionS != PatchProxyResult.class) {
       }else {
          transactionS = TransactionSkuPanelFragment.Ch(str);
          transactionS.F = uof;
       }
       transactionS.show(p0.a().getSupportFragmentManager(), "");
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void pO(String p0,Context p1,LiveMerchantBaseContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
          return;
       }
       c.c().submit(new h$a(this, p0, p1, p2));
       return;
    }
    public boolean v9(RouterRequest p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, h.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = new g();
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, g.class, "1");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          HashMap hashMap = h.b(p0.d().toString());
          String str = "showToast";
          boolean b1 = (hashMap.get(str) != null)? Boolean.parseBoolean(hashMap.get(str)): true;
          if (b1) {
             hashMap.put("bottomButtonToast", g.b);
          }
          b9.a(obj.a);
          obj.a = g.a(o5.d(x0.a(p0.d(), "skuId"), 0), o5.b(x0.a(p0.d(), "itemCount"), 0), hashMap, b.a(hashMap), null, null, new f(obj, p0));
       }
       return b;
    }
}
