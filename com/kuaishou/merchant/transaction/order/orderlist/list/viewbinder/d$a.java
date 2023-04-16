package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import rk0.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import jl4.k;
import com.yxcorp.gifshow.widget.m;
import jl4.l;
import android.graphics.Bitmap;
import m0d.l;

public class d$a implements ImageCallback	// class@0008a7
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (!this.b.R8().isAdded()) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       d obj = PatchProxy.apply(null, tb, d.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.u != null){
          obj = tb.t;
          if (obj == null || obj.getParent() == null) {
             b = false;
          }else {
             View view = tb.t.inflate();
             tb.u = view;
             tb.v = m1.f(view, 0x7f0a2f24);
             MerchantOrderShadowLayout merchantOrde = m1.f(tb.u, R.id.order_pendant_shadow_view);
             tb.w = merchantOrde;
             merchantOrde.setRepeatCount(3);
             m1.b(tb.u, new k(tb), R.id.order_pendant_close);
             m1.b(tb.u, new l(tb), R.id.order_pendant_img);
          }
       }
       b = true;
       if (!b) {
          return;
       }else {
          this.b.v.setImageDrawable(p0);
          return;
       }
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
