package e83.c;
import cc3.a;
import java.lang.Object;
import tkd.b;
import tkd.d;
import fs5.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import mrd.c;
import brd.y;
import brd.t;
import com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatReady;

public final class c implements a	// class@0026ac
{
    public final boolean a;
    public final boolean b;
    public final c c;

    public void c(){
       super();
       this.a = d.a(-1397441499).a70();
       this.b = d.a(-1397441499).mf();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.c = publishSubje;
    }
    public void a(LiveShopMessages$LiveInteractiveRoomShopCartStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       boolean b = (p0 != null && p0.hiddenShopCart != null)? true: false;
       b.d0(LiveLiteLogTag.LITE_MERCHANT_FORBIDDEN, "updatePkShopCartStatus", "hiddenShopCart", Boolean.valueOf(b), "shouldDisableMerchantForbiddenWhenPk", Boolean.valueOf(this.b));
       if (this.b == null) {
          this.f().onNext(Boolean.valueOf(b));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       b.c0(LiveLiteLogTag.LITE_MERCHANT_FORBIDDEN, "resetMerchantForbiddenStatusOnPkEnd", "shouldDisableMerchantForbiddenWhenPk", Boolean.valueOf(this.b));
       if (this.b == null) {
          this.f().onNext(Boolean.FALSE);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       b.c0(LiveLiteLogTag.LITE_MERCHANT_FORBIDDEN, "resetMerchantForbiddenStatusOnChatEnd", "shouldDisableMerchantForbiddenWhenChat", Boolean.valueOf(this.a));
       if (this.a == null) {
          this.f().onNext(Boolean.FALSE);
       }
       return;
    }
    public t d(){
       return this.f();
    }
    public void e(LiveStreamAuthorChatMessages$SCAuthorChatReady p0){
       LiveShopMessages$LiveInteractiveRoomShopCartStatus hiddenShopCa;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.shopCartStatus;
          if (p0 != null) {
             hiddenShopCa = p0.hiddenShopCart;
          label_0015 :
             b.d0(LiveLiteLogTag.LITE_MERCHANT_FORBIDDEN, "updateMerchantForbiddenStatusOnChatReady", "hiddenShopCart", Boolean.valueOf(hiddenShopCa), "shouldDisableMerchantForbiddenWhenChat", Boolean.valueOf(this.a));
             if (this.a == null) {
                this.f().onNext(Boolean.valueOf(hiddenShopCa));
             }
             return;
          }
       }
       hiddenShopCa = false;
       goto label_0015 ;
    }
    public c f(){
       return this.c;
    }
}
