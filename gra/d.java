package gra.d;
import gra.h;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel;
import fra.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import ea9.a;
import era.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.ImageView;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import gra.d$a;
import android.view.View$OnClickListener;
import gra.d$b;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import gra.c;
import java.lang.Enum;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.a;
import fda.d;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;

public final class d extends h	// class@002ba9
{
    public e r;
    public final e s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final e y;
    public final e z;
    public static final n[] A;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(d.class, "mBackground", "getMBackground\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mTopShadow", "getMTopShadow\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mTicketListBg", "getMTicketListBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mBottomBg", "getMBottomBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mSubTitle", "getMSubTitle\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mTitle", "getMTitle\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mImgClose", "getMImgClose\(\)Landroid/widget/ImageView;", 0)),m0.r(new PropertyReference1Impl(d.class, "mRecyclerView", "getMRecyclerView\(\)Landroidx/recyclerview/widget/RecyclerView;", 0))};
       d.A = onArray;
    }
    public void d(){
       super();
       this.s = this.S8(0x7f0a03a0);
       this.t = this.S8(0x7f0a1772);
       this.u = this.S8(0x7f0a3eda);
       this.v = this.S8(0x7f0a0482);
       this.w = this.S8(0x7f0a3bd1);
       this.x = this.S8(0x7f0a3f2c);
       this.y = this.S8(0x7f0a13a9);
       this.z = this.S8(0x7f0a3ed9);
    }
    public void E8(){
       Context context;
       GrowthVfcLogger$a a;
       Object[] objArray;
       Context context2;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "13")) {
          return;
       }
       d tr = this.r;
       String str = "mCallContext";
       if (tr == null) {
          a.S(str);
       }
       NormalReceiveCouponDialogModel normalReceiv = tr.b();
       if (normalReceiv != null) {
          KwaiImageView kwaiImageVie = PatchProxy.apply(null, this, uod, "4");
          String str1 = 1;
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = this.t.a(this, d.A[str1]);
          }
          kwaiImageVie.setImageURI(normalReceiv.topShadow);
          this.a9().setImageURI(normalReceiv.background);
          kwaiImageVie = PatchProxy.apply(null, this, uod, "5");
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = this.u.a(this, d.A[2]);
          }
          kwaiImageVie.setImageURI(normalReceiv.couponBg);
          this.b9().setImageURI(normalReceiv.couponFg);
          TextView textView = PatchProxy.apply(null, this, uod, "8");
          if (textView == patchProxyRe) {
             textView = this.x.a(this, d.A[5]);
          }
          textView.setText(normalReceiv.title);
          textView = PatchProxy.apply(null, this, uod, "7");
          if (textView == patchProxyRe) {
             textView = this.w.a(this, d.A[4]);
          }
          textView.setText(normalReceiv.subTitle);
          View view = this.m8();
          a.o(view, "rootView");
          this.Y8(view, normalReceiv.btnText, normalReceiv.btnBgImg);
          NormalReceiveCouponDialogModel couponList = normalReceiv.couponList;
          if (!PatchProxy.applyVoidOneRefs(couponList, this, uod, "14")) {
             RecyclerView recyclerView = PatchProxy.apply(null, this, uod, "10");
             if (recyclerView == patchProxyRe) {
                recyclerView = this.z.a(this, d.A[7]);
             }
             recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
             ViewGroup$LayoutParams layoutParams2 = recyclerView.getLayoutParams();
             String str2 = "context";
             if (couponList.size() <= str1) {
                context2 = recyclerView.getContext();
                a.o(context2, str2);
                f = a.a(context2, 88.00f);
             }else {
                context2 = recyclerView.getContext();
                a.o(context2, str2);
                f = a.a(context2, 176.00f);
             }
             layoutParams2.height = (int)f;
             context2 = recyclerView.getContext();
             a.o(context2, str2);
             recyclerView.setAdapter(new a(couponList, context2, false));
          }
          ViewGroup$LayoutParams layoutParams = this.b9().getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          if (normalReceiv.couponList.size() > str1) {
             context = this.b9().getContext();
             a.o(context, "mBottomBg.context");
             layoutParams.topMargin = (int)a.a(context, 233.00f);
          }
          context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          layoutParams.height = (int)a.a(context, 166.00f);
          View view1 = this.k8(R.id.btn_layout);
          ViewGroup$LayoutParams layoutParams1 = (view1 != null)? view1.getLayoutParams(): null;
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          Context context1 = this.b9().getContext();
          a.o(context1, "mBottomBg.context");
          layoutParams1.bottomMargin = (int)a.a(context1, 40.00f);
       }
       NormalReceiveCouponDialogModel obj = PatchProxy.apply(null, this, uod, "9");
       if (obj != patchProxyRe) {
       }else {
          obj = this.y.a(this, d.A[6]);
       }
       obj.setOnClickListener(new d$a(this));
       this.a9().setOnClickListener(d$b.b);
       a = GrowthVfcLogger.a;
       uod = this.r;
       if (uod == null) {
          a.S(str);
       }
       obj = uod.b();
       obj = (obj != null)? obj.logTracker: null;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(obj, a, GrowthVfcLogger$a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "V_F_C_CODE_BACK_POP";
          uElementPack.params = obj;
          u1.u0(4, uElementPack, null);
       }
       return;
    }
    public final KwaiImageView a9(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a(this, d.A[0]);
    }
    public final KwaiImageView b9(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.a(this, d.A[3]);
    }
    public void j6(){
       d uod;
       GrowthVfcLogger$a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "12")) {
          return;
       }
       c uoc = this.X8();
       if (uoc != null) {
          GrowthVfcUtilKt.a(uoc);
       }
       d tr = this.r;
       String str = "mCallContext";
       if (tr == null) {
          a.S(str);
       }
       NormalReceiveCouponDialogModel normalReceiv = tr.b();
       if (normalReceiv != null) {
          int i = c.a[normalReceiv.btnActionType.ordinal()];
          uod = 1;
          if (i != uod) {
             if (i == 2) {
                normalReceiv = normalReceiv.linkUrl;
                if (normalReceiv != null) {
                   if (!(TextUtils.isEmpty(normalReceiv) ^ uod)) {
                      Object[] objArray1 = objArray;
                   }
                   if (normalReceiv != null) {
                      RxBus.f.b(new a(normalReceiv));
                   }
                }
             }
          }else {
             RxBus.f.b(new d());
          }
       }
       a = GrowthVfcLogger.a;
       GrowthVfcLogger$VfcButtonType mAIN_BUTTON = GrowthVfcLogger$VfcButtonType.MAIN_BUTTON;
       uod = this.r;
       if (uod == null) {
          a.S(str);
       }
       NormalReceiveCouponDialogModel normalReceiv1 = uod.b();
       if (normalReceiv1 != null) {
          objArray = normalReceiv1.logTracker;
       }
       a.c(mAIN_BUTTON, objArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.r = obj;
       return;
    }
}
