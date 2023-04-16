package ac4.g;
import java.lang.Runnable;
import com.kuaishou.merchant.support.bridge.MerchantBridgeModuleImpl;
import p55.a;
import com.kuaishou.merchant.support.bridge.params.BlankCheckParams$Request;
import f55.g;
import java.lang.Object;
import java.util.Objects;
import js6.a;
import wi0.e;
import android.view.View;
import java.lang.String;
import android.os.Bundle;
import ac4.i;
import j74.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import android.graphics.Bitmap;
import j74.g;
import j74.f$a;
import t45.c;

public final class g implements Runnable	// class@000079
{
    public final MerchantBridgeModuleImpl b;
    public final a c;
    public final BlankCheckParams$Request d;
    public final g e;

    public void g(MerchantBridgeModuleImpl p0,a p1,BlankCheckParams$Request p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       g tb = this.b;
       g td = this.d;
       g te = this.e;
       Objects.requireNonNull(tb);
       View view = a.b.cn(this.c.getKrnContext(), td.viewTag);
       if (view == null) {
          te.a(-1, "view is null", null);
       }else {
          BlankCheckParams$Request scale = td.scale;
          BlankCheckParams$Request threshold = td.threshold;
          i oi = new i(tb, te);
          if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(view, Integer.valueOf(scale), Float.valueOf(threshold), oi, null, f.class, "1")) {
             a.u(MerchantCommonLogBiz.SCREEN_SHOT, "MerchantScreenShotTools", "checkWhiteView", "scale", Integer.valueOf(scale), "threshold", Float.valueOf(threshold));
             Bitmap uBitmap = f.a(view, scale);
             if (uBitmap == null) {
                oi.onError("bitmap is null");
             }else {
                c.a(new g(uBitmap, threshold, oi));
             }
          }
       }
       return;
    }
}
