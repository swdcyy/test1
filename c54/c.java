package c54.c;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.FragmentActivity;
import c54.a;
import android.app.Activity;
import mu4.d;
import ju4.e;

public class c	// class@0004b4
{

    public void c(){
       super();
    }
    public static void a(Fragment p0,LiveShopFrameModel$Toast p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       String str = "LiveCartToastHelper";
       if (p1 != null && (TextUtils.x(p1.mMessage) || p1.mHasShowed != null)) {
          b.a.e(p0, LiveCartNode.SIGNAL_UPDATE, str, "toast is null or already showed");
          return;
       }else if(p0 == null){
          b.a.e(p0, LiveCartNode.SIGNAL_UPDATE, str, "fragment is null");
          return;
       }else {
          e.k(p0.getActivity(), "getHeaderPosition", "", new a(p0, p1));
          return;
       }
    }
}
