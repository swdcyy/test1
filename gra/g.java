package gra.g;
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
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareAwardDialog;
import fra.a;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.text.TextUtils;
import android.text.Spanned;
import android.text.Html;
import gra.g$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.content.Context;
import ea9.a;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import era.a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gra.f;
import androidx.recyclerview.widget.RecyclerView$r;
import dra.f;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gra.g$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import gra.e;
import java.lang.Enum;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.a;
import fda.d;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;

public final class g extends h	// class@002bae
{
    public final e A;
    public final e B;
    public final e C;
    public JsonObject D;
    public a r;
    public final e s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final e y;
    public final e z;
    public static final n[] E;

    static {
       n[] onArray = new n[11];
       onArray[0] = m0.r(new PropertyReference1Impl(g.class, "mBackground", "getMBackground\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[1] = m0.r(new PropertyReference1Impl(g.class, "mTitle", "getMTitle\(\)Landroid/widget/TextView;", 0));
       onArray[2] = m0.r(new PropertyReference1Impl(g.class, "mImgClose", "getMImgClose\(\)Landroid/widget/ImageView;", 0));
       onArray[3] = m0.r(new PropertyReference1Impl(g.class, "mLightingEffect", "getMLightingEffect\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[4] = m0.r(new PropertyReference1Impl(g.class, "mTicketListBg", "getMTicketListBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[5] = m0.r(new PropertyReference1Impl(g.class, "mBottomBg", "getMBottomBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[6] = m0.r(new PropertyReference1Impl(g.class, "mSubTitle", "getMSubTitle\(\)Landroid/widget/TextView;", 0));
       onArray[7] = m0.r(new PropertyReference1Impl(g.class, "mBottomContent", "getMBottomContent\(\)Landroid/widget/TextView;", 0));
       onArray[8] = m0.r(new PropertyReference1Impl(g.class, "mBtnLayout", "getMBtnLayout\(\)Landroid/view/View;", 0));
       onArray[9] = m0.r(new PropertyReference1Impl(g.class, "mListHead", "getMListHead\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[10] = m0.r(new PropertyReference1Impl(g.class, "mRecyclerView", "getMRecyclerView\(\)Landroidx/recyclerview/widget/RecyclerView;", 0));
       g.E = onArray;
    }
    public void g(){
       super();
       this.s = this.S8(0x7f0a03a0);
       this.t = this.S8(0x7f0a3f2c);
       this.u = this.S8(0x7f0a13a9);
       this.v = this.S8(0x7f0a1772);
       this.w = this.S8(0x7f0a3eda);
       this.x = this.S8(0x7f0a0482);
       this.y = this.S8(0x7f0a3bd1);
       this.z = this.S8(0x7f0a0494);
       this.A = this.S8(0x7f0a0549);
       this.B = this.S8(0x7f0a3edb);
       this.C = this.S8(0x7f0a3ed9);
       this.D = new JsonObject();
    }
    public void E8(){
       Context context;
       ViewGroup$LayoutParams layoutParams1;
       Context context2;
       GrowthVfcLogger$a a;
       Object[] objArray1;
       float f2;
       JsonObject jsonObject = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, jsonObject, og, "15")) {
          return;
       }
       g r = jsonObject.r;
       if (r == null) {
          a.S("mCallContext");
       }
       ShowShareAwardDialog showShareAwa = r.b();
       if (showShareAwa != null) {
          ShowShareAwardDialog logTracker = showShareAwa.logTracker;
          if (logTracker != null) {
             jsonObject.D = c.d(logTracker);
          }
          KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, jsonObject, og, "6");
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = jsonObject.v.a(jsonObject, g.E[3]);
          }
          kwaiImageVie.setImageURI(showShareAwa.topShadow);
          kwaiImageVie = PatchProxy.apply(objArray, jsonObject, og, "3");
          int i = 0;
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = jsonObject.s.a(jsonObject, g.E[i]);
          }
          kwaiImageVie.setImageURI(showShareAwa.background);
          String str = "7";
          KwaiImageView kwaiImageVie1 = PatchProxy.apply(objArray, jsonObject, og, str);
          Context uContext = 4;
          if (kwaiImageVie1 == patchProxyRe) {
             kwaiImageVie1 = jsonObject.w.a(jsonObject, g.E[uContext]);
          }
          kwaiImageVie1.setImageURI(showShareAwa.couponBg);
          this.a9().setImageURI(showShareAwa.couponFg);
          this.c9().setImageURI(showShareAwa.scrollShadow);
          TextView textView = PatchProxy.apply(objArray, jsonObject, og, "4");
          if (textView == patchProxyRe) {
             textView = jsonObject.t.a(jsonObject, g.E[1]);
          }
          textView.setText(showShareAwa.title);
          textView = PatchProxy.apply(objArray, jsonObject, og, "9");
          if (textView == patchProxyRe) {
             textView = jsonObject.y.a(jsonObject, g.E[6]);
          }
          textView.setText(showShareAwa.subTitle);
          View view = this.m8();
          a.o(view, "rootView");
          jsonObject.Y8(view, showShareAwa.btnText, showShareAwa.btnBgImg);
          textView = PatchProxy.apply(objArray, jsonObject, og, "10");
          if (textView == patchProxyRe) {
             textView = jsonObject.z.a(jsonObject, g.E[7]);
          }
          float f = 68.00f;
          String str1 = 8;
          if (!TextUtils.isEmpty(showShareAwa.assistBtnTitle)) {
             textView.setVisibility(i);
             textView.setText(Html.fromHtml(showShareAwa.assistBtnTitle));
             textView.setOnClickListener(new g$a(showShareAwa, jsonObject));
             context = this.a9().getContext();
             a.o(context, "mBottomBg.context");
             this.a9().getLayoutParams().height = (int)a.a(context, 190.00f);
          }else {
             textView.setVisibility(str1);
             f = 40.00f;
          }
          View view1 = PatchProxy.apply(objArray, jsonObject, og, "11");
          if (view1 == patchProxyRe) {
             view1 = jsonObject.A.a(jsonObject, g.E[str1]);
          }
          ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          Context context1 = textView.getContext();
          a.o(context1, "context");
          layoutParams.bottomMargin = (int)a.a(context1, f);
          ShowShareAwardDialog couponList = showShareAwa.couponList;
          if (!PatchProxy.applyVoidOneRefs(couponList, jsonObject, og, "18")) {
             RecyclerView recyclerView = PatchProxy.apply(objArray, jsonObject, og, "13");
             if (recyclerView == patchProxyRe) {
                recyclerView = jsonObject.C.a(jsonObject, g.E[10]);
             }
             recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
             float f1 = 144.00f;
             Object[] obj1 = (couponList.size() > 1)? 1: null;
             obj1 = (obj1)? recyclerView: objArray;
             if (obj1 != null) {
                f2 = 140.00f;
                f1 = 199.00f;
             }else {
                f2 = 88.00f;
             }
             layoutParams1 = this.a9().getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             uContext = recyclerView.getContext();
             a.o(uContext, "context");
             layoutParams1.topMargin = (int)a.a(uContext, f1);
             uContext = recyclerView.getContext();
             a.o(uContext, "context");
             recyclerView.getLayoutParams().height = (int)a.a(uContext, f2);
             context2 = recyclerView.getContext();
             a.o(context2, "context");
             a uoa = new a(couponList, context2, false, 4, null);
             recyclerView.setAdapter(layoutParams1);
             recyclerView.addOnScrollListener(new f(recyclerView, jsonObject, couponList));
             f.b.b(recyclerView);
          }
          if (showShareAwa.couponList.size() > 1) {
             layoutParams1 = this.a9().getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             context2 = this.a9().getContext();
             a.o(context2, "mBottomBg.context");
             layoutParams1.topMargin = (int)a.a(context2, 199.00f);
          }
          a = GrowthVfcLogger.a;
          showShareAwa = showShareAwa.logTracker;
          Objects.requireNonNull(a);
          if (PatchProxy.applyVoidOneRefs(showShareAwa, a, GrowthVfcLogger$a.class, str)) {
             objArray1 = null;
          }else {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "V_F_C_GET_COUPON_POP";
             uElementPack.params = showShareAwa;
             objArray1 = null;
             u1.u0(4, uElementPack, objArray1);
          }
       }else {
          objArray1 = objArray;
       }
       Object obj = PatchProxy.apply(objArray1, jsonObject, og, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = jsonObject.u.a(jsonObject, g.E[2]);
       }
       obj.setOnClickListener(new g$b(jsonObject));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "16")) {
          return;
       }
       f.b.a();
       return;
    }
    public final KwaiImageView a9(){
       Object obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.a(this, g.E[5]);
    }
    public final a b9(){
       g obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mCallContext");
       }
       return obj;
    }
    public final KwaiImageView c9(){
       Object obj = PatchProxy.apply(null, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.a(this, g.E[9]);
    }
    public void j6(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "17")) {
          return;
       }
       super.j6();
       c uoc = this.X8();
       if (uoc != null) {
          GrowthVfcUtilKt.a(uoc);
       }
       g tr = this.r;
       if (tr == null) {
          a.S("mCallContext");
       }
       ShowShareAwardDialog showShareAwa = tr.b();
       if (showShareAwa != null) {
          int i = e.a[showShareAwa.btnActionType.ordinal()];
          if (i != 1) {
             if (i == 2 && !TextUtils.isEmpty(showShareAwa.assistLink)) {
                RxBus f = RxBus.f;
                showShareAwa = showShareAwa.assistLink;
                if (showShareAwa != null) {
                   objArray = new a(showShareAwa);
                }
                f.b(objArray);
             }
          }else {
             RxBus.f.b(new d());
          }
       }
       GrowthVfcLogger.a.a(this.D, GrowthVfcLogger$VfcButtonType.MAIN_BUTTON);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "14")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.r = obj;
       return;
    }
}
