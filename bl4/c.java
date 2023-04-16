package bl4.c;
import erd.g;
import bl4.e;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.model.UpdateOrderAddressResponse;
import java.util.Objects;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionAddressJumpPayloadInfo;
import java.lang.String;
import lnc.o5;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import cl4.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import el4.a$a;
import el4.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import lnc.a1;
import ot3.p0;
import u07.t$a;
import bl4.a;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class c implements g	// class@00038e
{
    public final e b;
    public final EventPayloadInfo c;
    public final AddressInfo d;

    public void c(e p0,EventPayloadInfo p1,AddressInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e uoe1;
       PatchProxyResult patchProxyRe1;
       UpdateOrderAddressResponse updateOrderA;
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       c d = uoc.d;
       Objects.requireNonNull(b);
       long l = o5.d(c.mAddressId, 0);
       ActionAddressJumpPayloadInfo mFee = c.mFee;
       UpdateOrderAddressResponse mNewExpressF = p0.mNewExpressFee;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          uoe1 = uoe;
          patchProxyRe1 = patchProxyRe;
          updateOrderA = mNewExpressF;
          if (!PatchProxy.applyVoidFourRefs(Long.valueOf(l), d, Long.valueOf(mFee), Long.valueOf(mNewExpressF), b, e.class, "3")) {
          label_004f :
             if (!b.f()) {
                a$a uoa = a.e0(b.d());
                StringBuilder str = PatchProxy.applyOneRefs(d, b, uoe1, "5");
                String str1 = "¡¡";
                if (str != patchProxyRe1) {
                }else {
                   str = d.mProvince+str1+d.mCity+str1+d.mDistrict;
                }
                uoa.Z0(str);
                uoa.b1(d.mAddress);
                str = PatchProxy.applyOneRefs(d, b, uoe1, "6");
                if (str != patchProxyRe1) {
                }else {
                   str = d.mConsignee+str1+d.mMobile;
                }
                uoa.a1(str);
                if (PatchProxy.isSupport(uoe1)) {
                   str = PatchProxy.applyThreeRefs(Long.valueOf(l), Long.valueOf(mFee), Long.valueOf(updateOrderA), b, e.class, "4");
                   if (str != patchProxyRe1) {
                   }else if(l - null <= 0 || !mFee - updateOrderA){
                      str = "";
                   }else {
                      Object[] objArray = new Object[]{p0.e(p0.m(mFee), a1.d(0x7f070267), a1.d(0x7f070267)),p0.e(p0.m(updateOrderA), a1.d(0x7f070267), a1.d(0x7f070267))};
                      str = String.format(a1.p(R.string.arg_RES_7f1033b1), objArray);
                   }
                }else {
                   goto label_00cf ;
                }
                uoa.c1(str);
                uoa.X0(a1.p(R.string.arg_RES_7f1033b2));
                uoa.T0(a1.p(R.string.arg_RES_7f10019b));
                uoa.u0(new a(b));
                uoa.A(false);
                uoa.z(false);
                a uoa1 = uoa.Y0();
                b.g = uoa1;
                uoa1.Z();
             }
          }
       }else {
          uoe1 = uoe;
          patchProxyRe1 = patchProxyRe;
          updateOrderA = mNewExpressF;
          goto label_004f ;
       }
       return;
    }
}
