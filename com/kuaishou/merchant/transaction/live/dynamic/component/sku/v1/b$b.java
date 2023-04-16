package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.base.sku.b;
import android.view.View;
import ej4.d;
import android.view.View$OnClickListener;

public class b$b extends PresenterV2	// class@00079f
{
    public SkuSpecification$PropValue p;
    public TextView q;
    public final b r;

    public void b$b(b p0){
       this.r = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "3")) {
          return;
       }
       this.q.setText(this.p.mPropValueName);
       if (this.r.z.g()) {
          this.q.setEnabled(false);
       }else {
          this.q.setEnabled(this.p.mEnabled);
       }
       this.q.setSelected(this.p.mSelected);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       this.q = p0;
       p0.setOnClickListener(new d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.p = this.q8(SkuSpecification$PropValue.class);
       return;
    }
}
