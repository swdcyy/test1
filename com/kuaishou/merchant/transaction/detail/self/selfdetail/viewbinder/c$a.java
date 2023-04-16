package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.c$a;
import android.text.style.ClickableSpan;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.c;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo$DeliveryTipsInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo$DetailCrossBorderInfo;
import kg4.a;
import u07.t$a;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.c;

public class c$a extends ClickableSpan	// class@000768
{
    public final int b;
    public final ItemInfo$DeliveryTipsInfo c;
    public final c d;

    public void c$a(c p0,int p1,ItemInfo$DeliveryTipsInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a td = this.d;
       td.C.m.z(td.u.d.mSpType, this.b);
       t$a uoa = new t$a(this.d.P8());
       uoa.z0(this.c.mTipsText);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.p();
       uoa = f.e(uoa);
       uoa.v(true);
       uoa.X();
       return;
    }
}
