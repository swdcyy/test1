package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$b;
import xz6.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import xm4.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$b$a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$RollingInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;

public class l$b extends a	// class@000832
{
    public List b;

    public void l$b(){
       super();
    }
    public void l$b(l$a p0){
       super();
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, l$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public Object getItem(int p0){
       if (PatchProxy.isSupport(l$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, l$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = (p0 < 0 || p0 >= this.getCount())? null: this.b.get(p0);
       return obj1;
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       l$b$a uob$a;
       if (PatchProxy.isSupport(l$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, l$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          p1 = a.e(p2, R.layout.arg_RES_7f0d0683);
          uob$a = new l$b$a(p1);
          p1.setTag(uob$a);
       }else {
          uob$a = p1.getTag();
       }
       MerchantLivePurchasePanelResponse$RollingInfo item = this.getItem(p0);
       if (item != null) {
          uob$a.b.L(item.mBuyerImage);
          uob$a.c.setText(TextUtils.k(item.mRollingMessage));
       }
       return p1;
    }
}
