package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.c;
import xf4.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo$DetailCrossBorderInfo;
import java.util.List;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailExpressInfo;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import com.kuaishou.ksmvvm.command.KSCommand;
import ei4.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import android.text.SpannableStringBuilder;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import mt3.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.TaxFarmingTipsInfo;
import android.graphics.drawable.Drawable;
import ei4.f;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo$DeliveryProcessInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.Color;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import android.view.View;
import rk0.b;
import xf4.c;
import java.util.Objects;
import kg4.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import y17.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo$DeliveryTipsInfo;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.c$a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import ei4.k;
import ekd.m1;
import java.util.ArrayList;

public class c extends b	// class@000769
{
    public List A;
    public TextView B;
    public j C;
    public TextView x;
    public List y;
    public List z;

    public void c(Fragment p0){
       super(p0);
    }
    public void E8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "4")) {
          return;
       }
       super.E8();
       b d = this.u.d;
       this.a9(d.mDeliveryTipsInfos, d.mExpressInfo);
       this.J0(this.C.y.h, new e(this, d));
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(d, this, uoc, "8")) {
          int i2 = 1;
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(a.j(a1.p(R.string.arg_RES_7f10343e)+"   ").g(i2).f(a1.d(R.dimen.arg_RES_7f070f70)).c(a1.a(R.color.arg_RES_7f061d77)).h()).append(a.j(d.mTaxDesc).g(i).f(a1.d(R.dimen.arg_RES_7f070f70)).c(a1.a(R.color.arg_RES_7f061d96)).h());
          ItemInfo$DetailCrossBorderInfo mTaxFarmingT = d.mTaxFarmingTipsInfo;
          if (mTaxFarmingT != null && mTaxFarmingT.mPopupWindowInfo != null) {
             this.Z8(spannableStr, a1.f(R.drawable.arg_RES_7f081757));
             spannableStr.setSpan(new f(this, mTaxFarmingT), (spannableStr.length() - i2), spannableStr.length(), 33);
             this.B.setMovementMethod(LinkMovementMethod.getInstance());
          }
          this.B.setText(spannableStr);
       }
       int i1 = 0;
       while (i1 < d.mDeliveryProcessInfos.size()) {
          ItemInfo$DeliveryProcessInfo uDeliveryPro = d.mDeliveryProcessInfos.get(i1);
          if (uDeliveryPro != null) {
             this.y.get(i1).L(uDeliveryPro.mIconUrl);
             this.z.get(i1).setText(uDeliveryPro.mContent);
          }
          i1 = i1 + 1;
       }
       for (; i < d.mDeliveryLineColors.size(); i = i + 1) {
          i1 = a1.a(R.color.arg_RES_7f061dc8);
          try{
             i1 = Color.parseColor(d.mDeliveryLineColors.get(i));
          }catch(java.lang.Exception e3){
             a.l(MerchantTransactionLogBiz.DETAIL, "DetailGlobalItemViewBinder", "parse color error", e3);
          }
          this.A.get(i).setBackgroundColor(i1);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.C = c.a(this);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       j m = this.C.m;
       ItemInfo$DetailCrossBorderInfo mSpType = this.u.d.mSpType;
       Objects.requireNonNull(m);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mSpType), m, uoa, "26")) {
          String str = "SHIPPING_BAR";
          if (!m.k.contains(str)) {
             m.k.add(str);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str;
             i3 oi3 = i3.f();
             oi3.d("sp_type", String.valueOf(mSpType));
             m.j(oi3);
             uElementPack.params = oi3.e();
             m.I(3, uElementPack);
          }
       }
       return;
    }
    public final void Z8(SpannableStringBuilder p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       p0.append(" ");
       int i = p0.length();
       a uoa = new a(p1, " ");
       uoa.b(false);
       uoa.c(p1.getIntrinsicWidth(), p1.getIntrinsicHeight());
       p0.setSpan(uoa, (i - 1), i, 33);
       return;
    }
    public final void a9(List p0,DetailExpressInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       this.x.setMovementMethod(LinkMovementMethod.getInstance());
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(a.j(a1.p(0x7f10343d)+"   ").g(1).f(a1.d(0x7f070f70)).c(a1.a(0x7f061d77)).h());
       int i = 0;
       if (!q.f(p0)) {
          int i1 = 0;
          while (i1 < p0.size()) {
             ItemInfo$DeliveryTipsInfo uDeliveryTip = p0.get(i1);
             if (uDeliveryTip != null) {
                if (i1) {
                   this.Z8(spannableStr, this.b9());
                }
                spannableStr.append(a.j(uDeliveryTip.mText).f(a1.d(R.dimen.arg_RES_7f070f70)).c(a1.a(R.color.arg_RES_7f061d96)).h());
                if (uDeliveryTip.hasTipsMore()) {
                   this.Z8(spannableStr, a1.f(R.drawable.arg_RES_7f081757));
                   int i2 = spannableStr.length() - 1;
                   spannableStr.setSpan(new c$a(this, i1, uDeliveryTip), i2, spannableStr.length(), 33);
                   a tu = this.u;
                   if (tu.d.mIsDeliveryIconLogged == null) {
                      tu.d.mIsDeliveryIconLogged = true;
                      this.C.m.L(tu.d.mSpType, i1);
                   }
                }
             }
          label_00dc :
             i1 = i1 + 1;
          }
       }
       if (p1 != null && !TextUtils.x(p1.mPostageText)) {
          this.Z8(spannableStr, this.b9());
          SpannableStringBuilderUtils.h(spannableStr, p1.mPostageText, a1.d(R.dimen.arg_RES_7f070f70), a1.a(R.color.arg_RES_7f061d96));
       }
       c tx = this.x;
       if (TextUtils.x(spannableStr)) {
          i = 8;
       }
       tx.setVisibility(i);
       this.x.setText(spannableStr);
       return;
    }
    public final Drawable b9(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BitmapDrawable(a1.m(), BitmapUtil.f(n.G(a1.c(), 0x7f0d0f3c)));
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a3856);
       ArrayList uArrayList = new ArrayList();
       this.y = uArrayList;
       uArrayList.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_start_iv));
       this.y.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_center_iv));
       this.y.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_end_iv));
       uArrayList = new ArrayList();
       this.z = uArrayList;
       uArrayList.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_start_tv));
       this.z.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_center_tv));
       this.z.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_end_tv));
       uArrayList = new ArrayList();
       this.A = uArrayList;
       uArrayList.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_start_line));
       this.A.add(m1.f(p0, R.id.self_detail_item_global_delivery_process_end_line));
       this.B = m1.f(p0, 0x7f0a3858);
       return;
    }
}
