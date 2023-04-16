package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.b;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ij4.d;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import androidx.fragment.app.Fragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class b implements View$OnClickListener	// class@0007a3
{
    public final SkuSpecification b;
    public final ViewGroup c;
    public final ImageView d;
    public final TextView e;
    public final c f;

    public void b(c p0,SkuSpecification p1,ViewGroup p2,ImageView p3,TextView p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       c c = this.f.C;
       SkuSpecification mStyle = this.b.mStyle;
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(c, Integer.valueOf(mStyle), null, uod, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SKU_SELECT_LABEL";
          i3 oi3 = i3.f();
          oi3.d("type", String.valueOf(mStyle));
          uElementPack.params = oi3.e();
          ClickMetaData uClickMetaDa = new ClickMetaData();
          uClickMetaDa.setType(1);
          uClickMetaDa.setElementPackage(uElementPack);
          uClickMetaDa.setLogPage(d.b(c));
          uClickMetaDa.setContentPackage(new ClientContent$ContentPackage());
          u1.B(uClickMetaDa);
       }
       b tb = this.b;
       tb.mStyle = tb.mStyle - 3;
       this.f.q9(this.c, tb, this.d, this.e);
       if (!q.f(this.f.A)) {
          this.f.A.get(0).k0();
       }
       return;
    }
}
