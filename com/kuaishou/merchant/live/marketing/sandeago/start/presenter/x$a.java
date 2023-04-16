package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.x$a;
import tyc.u4;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.x;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel$InputFormat;
import android.text.TextUtils;
import android.widget.TextView;
import n64.d0;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemResponseModel;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;

public class x$a extends u4	// class@001a9b
{
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       x$a tb;
       if (PatchProxy.isSupport(x$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, x$a.class, "1")) {
          return;
       }
       x z = this.b.z;
       if (z != null) {
          if (!TextUtils.isEmpty(z.mMessage)) {
             tb = this.b;
             tb.x.setText(tb.z.mMessage);
          }
          if (d0.c(p0.toString(), this.b.z)) {
             this.b.x.setVisibility(8);
          }else {
             this.b.x.setVisibility(0);
          }
       }
       if (TextUtils.isEmpty(p0)) {
          x$a tb1 = this.b;
          tb1.v.b(d0.b(tb1.u, ""));
       }else {
          tb = this.b;
          tb.v.c(d0.b(tb.u, p0.toString()));
       }
       return;
    }
}
