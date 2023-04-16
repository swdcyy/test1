package bg3.l$a;
import ks3.i0$a;
import bg3.l;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import ks3.i0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import hb2.g$b;
import ks3.h0;

public class l$a implements i0$a	// class@0003ab
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void D2(MerchantLivePlayConfig p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       l$a tb = this.b;
       Objects.requireNonNull(tb);
       RelativeLayout$LayoutParams obj = PatchProxy.apply(null, tb, l.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a0 o2 = tb.q.O2;
          b = (o2 != null && o2.d())? true: false;
       }
       if (b) {
          ViewStub viewStub = this.b.getActivity().findViewById(R.id.merchant_photo_feed_side_bar_layout_stub);
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0f4b);
             viewStub.inflate();
          }
          View view = this.b.getActivity().findViewById(R.id.merchant_photo_feed_side_bar_layout);
          if (view == null) {
             return;
          }else if(view.getLayoutParams() instanceof RelativeLayout$LayoutParams){
             obj = view.getLayoutParams();
             obj.addRule(11);
             obj.width = a1.d(0x7f070c56);
             view.setLayoutParams(obj);
          }
          view.setVisibility(0);
          l p = this.b.p;
          if (p != null) {
             p.c(view);
          }
       }
       return;
    }
    public void r5(){
       h0.a(this);
    }
}
