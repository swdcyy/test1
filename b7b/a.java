package b7b.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public final class a	// class@000381
{

    public void a(){
       super();
    }
    public static void a(BaseFeed p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "4")) {
          return;
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          oi3.d("feedId", p0.getId());
       }
       oi3.c("default_type", Integer.valueOf(p1));
       u1.R("AD_MERCHANT_PHOTO_ITEM_FLOAT_WINDOW_CLICK", oi3.e(), 7);
       return;
    }
    public static void b(BaseFeed p0,int p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "3")) {
          return;
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          oi3.d("feedId", p0.getId());
       }
       oi3.c("default_type", Integer.valueOf(p1));
       oi3.d("expand_type", p2);
       u1.R("AD_MERCHANT_PHOTO_ITEM_FLOAT_WINDOW_IMPRESSION", oi3.e(), 7);
       return;
    }
    public static void c(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       if (p0 != null) {
          oi3.d("feedId", p0.getId());
       }
       u1.R("AD_MERCHANT_YELLOW_SHOPPING_TROLLEY_IMPRESSION", oi3.e(), 7);
       return;
    }
}
