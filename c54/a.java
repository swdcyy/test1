package c54.a;
import mu4.d;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import java.lang.Object;
import java.lang.String;
import k34.g0;
import android.view.ViewGroup;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.communication.method.UltronPoint$Response;
import java.lang.Class;
import ur3.d;
import c54.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.view.View;
import e17.i;
import android.content.Context;
import com.kwai.library.widget.popup.common.e;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import e17.i$b;
import java.lang.CharSequence;
import c54.b;
import e17.i$e;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import mu4.c;

public final class a implements d	// class@0004b2
{
    public final Fragment a;
    public final LiveShopFrameModel$Toast b;

    public void a(Fragment p0,LiveShopFrameModel$Toast p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0){
       int i;
       a ta = this.a;
       a tb = this.b;
       if (ta instanceof g0) {
          a uoa = ta;
          if (uoa.j0() == null) {
          label_00a6 :
             b.a.e(ta, LiveCartNode.SIGNAL_UPDATE, "LiveCartToastHelper", "header view is null");
          }else {
             UltronPoint$Response response = d.b(p0, UltronPoint$Response.class);
             i obj = PatchProxy.applyTwoRefs(ta, response, null, c.class, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                int i1 = a1.e(0x41f00000);
                if (response != null) {
                   UltronPoint$Response mY = response.mY;
                   int[] ointArray = new int[2];
                   ViewGroup viewGroup = uoa.j0();
                   if (viewGroup != null) {
                      viewGroup.getLocationOnScreen(ointArray);
                   }
                   if (mY > 0 && ointArray[1] > 0) {
                      i = (int)(mY - (double)ointArray[1]) + a1.e(0x41f80000);
                   }
                }
             label_005e :
                i = i1;
             }
             obj = i.l();
             if (obj == null || !obj.s()) {
                tb.mHasShowed = true;
                Context uContext = e.b();
                if (uContext != null) {
                   PluginManager.H.I(uContext.getResources());
                }
                i$b uob = i.m();
                uob.n(uoa.j0());
                uob.s(R.layout.arg_RES_7f0d0dc6);
                uob.y(tb.mMessage);
                uob.o(tb.mDurationType);
                uob.A(new b(i));
                i.c(R.style.arg_RES_7f11066a, uob);
             }
          }
       }else {
          goto label_00a6 ;
       }
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
