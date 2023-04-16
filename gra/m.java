package gra.m;
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
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import fra.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import gra.m$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import ea9.a;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import era.a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gra.l;
import androidx.recyclerview.widget.RecyclerView$r;
import dra.f;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gra.m$b;
import gra.m$c;
import gra.k;
import java.lang.Enum;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import android.app.Activity;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;

public final class m extends h	// class@002bbc
{
    public final e A;
    public final e B;
    public String C;
    public c r;
    public final e s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final e y;
    public final e z;
    public static final n[] D;

    static {
       n[] onArray = new n[10];
       onArray[0] = m0.r(new PropertyReference1Impl(m.class, "mBackground", "getMBackground\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[1] = m0.r(new PropertyReference1Impl(m.class, "mAvatar", "getMAvatar\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[2] = m0.r(new PropertyReference1Impl(m.class, "mTitle", "getMTitle\(\)Landroid/widget/TextView;", 0));
       onArray[3] = m0.r(new PropertyReference1Impl(m.class, "mRuleTxt", "getMRuleTxt\(\)Landroid/widget/TextView;", 0));
       onArray[4] = m0.r(new PropertyReference1Impl(m.class, "mImgClose", "getMImgClose\(\)Landroid/widget/ImageView;", 0));
       onArray[5] = m0.r(new PropertyReference1Impl(m.class, "mBottomBg", "getMBottomBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[6] = m0.r(new PropertyReference1Impl(m.class, "mTicketListBg", "getMTicketListBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[7] = m0.r(new PropertyReference1Impl(m.class, "mLightingEffect", "getMLightingEffect\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[8] = m0.r(new PropertyReference1Impl(m.class, "mListHead", "getMListHead\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0));
       onArray[9] = m0.r(new PropertyReference1Impl(m.class, "mRecyclerView", "getMRecyclerView\(\)Landroidx/recyclerview/widget/RecyclerView;", 0));
       m.D = onArray;
    }
    public void m(){
       super();
       this.s = this.S8(0x7f0a03a0);
       this.t = this.S8(0x7f0a0333);
       this.u = this.S8(0x7f0a3f2c);
       this.v = this.S8(0x7f0a36b9);
       this.w = this.S8(0x7f0a13a9);
       this.x = this.S8(0x7f0a0482);
       this.y = this.S8(0x7f0a3eda);
       this.z = this.S8(0x7f0a1772);
       this.A = this.S8(0x7f0a3edb);
       this.B = this.S8(0x7f0a3ed9);
       this.C = "";
    }
    public void E8(){
       Drawable drawable;
       GrowthVfcLogger$a a;
       Context context1;
       ViewGroup$LayoutParams layoutParams;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (PatchProxy.applyVoid(null, this, om, "14")) {
          return;
       }
       m tr = this.r;
       if (tr == null) {
          a.S("mCallContext");
       }
       ShowShareDialog showShareDia = tr.b();
       if (showShareDia != null) {
          this.C = showShareDia.logTracker;
          KwaiImageView kwaiImageVie = PatchProxy.apply(null, this, om, "10");
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = this.z.a(this, m.D[7]);
          }
          kwaiImageVie.setImageURI(showShareDia.topShadow);
          this.b9().setImageURI(showShareDia.background);
          this.a9().setImageURI(showShareDia.headImg);
          kwaiImageVie = PatchProxy.apply(null, this, om, "9");
          if (kwaiImageVie == patchProxyRe) {
             kwaiImageVie = this.y.a(this, m.D[6]);
          }
          kwaiImageVie.setImageURI(showShareDia.couponBg);
          this.d9().setImageURI(showShareDia.scrollShadow);
          this.c9().setImageURI(showShareDia.couponFg);
          kwaiImageVie = this.a9();
          Context context = this.getContext();
          if (context != null) {
             Resources resources = context.getResources();
             if (resources != null) {
                drawable = resources.getDrawable(R.drawable.arg_RES_7f080d25);
             label_0095 :
                kwaiImageVie.setBackground(drawable);
                View view = this.m8();
                a.o(view, "rootView");
                this.Y8(view, showShareDia.btnText, showShareDia.btnBgImg);
                String str = "5";
                TextView textView = PatchProxy.apply(null, this, om, str);
                if (textView == patchProxyRe) {
                   textView = this.u.a(this, m.D[2]);
                }
                textView.setText(showShareDia.title);
                this.e9().setText(showShareDia.ruleName);
                this.e9().setOnClickListener(new m$a(showShareDia, this));
                showShareDia = showShareDia.couponList;
                if (!PatchProxy.applyVoidOneRefs(showShareDia, this, om, "16")) {
                   RecyclerView recyclerView = PatchProxy.apply(null, this, om, "12");
                   if (recyclerView == patchProxyRe) {
                      recyclerView = this.B.a(this, m.D[9]);
                   }
                   recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                   String str1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                   String str2 = "context";
                   if (showShareDia.size() <= 1) {
                      context1 = recyclerView.getContext();
                      a.o(context1, str2);
                      recyclerView.getLayoutParams().height = (int)a.a(context1, 88.00f);
                      layoutParams = this.c9().getLayoutParams();
                      Objects.requireNonNull(layoutParams, str1);
                      context1 = recyclerView.getContext();
                      a.o(context1, str2);
                      layoutParams.topMargin = (int)a.a(context1, 144.00f);
                   }else {
                      context1 = recyclerView.getContext();
                      a.o(context1, str2);
                      recyclerView.getLayoutParams().height = (int)a.a(context1, 140.00f);
                      layoutParams = this.c9().getLayoutParams();
                      Objects.requireNonNull(layoutParams, str1);
                      context1 = recyclerView.getContext();
                      a.o(context1, str2);
                      layoutParams.topMargin = (int)a.a(context1, 199.00f);
                   }
                   Context context2 = recyclerView.getContext();
                   a.o(context2, str2);
                   Context uContext = context2;
                   a uoa = new a(showShareDia, uContext, 0, 4, 0);
                   recyclerView.setAdapter(layoutParams);
                   recyclerView.addOnScrollListener(new l(recyclerView, this, showShareDia));
                   f.b.b(recyclerView);
                }
                a = GrowthVfcLogger.a;
                m tC = this.C;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(tC, a, GrowthVfcLogger$a.class, str)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "V_F_C_SHARE_GET_COUPON_POP";
                   uElementPack.params = tC;
                   u1.u0(4, uElementPack, null);
                }
             }
          }
          drawable = null;
          goto label_0095 ;
       }
       this.b9().setOnClickListener(m$b.b);
       Object obj = PatchProxy.apply(null, this, om, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = this.w.a(this, m.D[4]);
       }
       obj.setOnClickListener(new m$c(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "15")) {
          return;
       }
       f.b.a();
       return;
    }
    public final KwaiImageView a9(){
       Object obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.a(this, m.D[1]);
    }
    public final KwaiImageView b9(){
       Object obj = PatchProxy.apply(null, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a(this, m.D[0]);
    }
    public final KwaiImageView c9(){
       Object obj = PatchProxy.apply(null, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.a(this, m.D[5]);
    }
    public final KwaiImageView d9(){
       Object obj = PatchProxy.apply(null, this, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.a(this, m.D[8]);
    }
    public final TextView e9(){
       Object obj = PatchProxy.apply(null, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.a(this, m.D[3]);
    }
    public void j6(){
       if (PatchProxy.applyVoid(null, this, m.class, "17")) {
          return;
       }
       m tr = this.r;
       String str = "mCallContext";
       if (tr == null) {
          a.S(str);
       }
       ShowShareDialog showShareDia = tr.b();
       if (showShareDia != null) {
          ShowShareDialog inviteSelect = showShareDia.inviteSelector;
          if (inviteSelect == null || k.a[inviteSelect.ordinal()] != 1) {
             c uoc = this.X8();
             if (uoc != null) {
                GrowthVfcUtilKt.a(uoc);
             }
          }else {
             m tr1 = this.r;
             if (tr1 == null) {
                a.S(str);
             }
             this.Z8(tr1.c(), showShareDia.shareObjectId, showShareDia.tokenExtParams, this.getActivity());
          }
       }
       GrowthVfcLogger.a.e(this.C, GrowthVfcLogger$VfcButtonType.MAIN_BUTTON);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "13")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.r = obj;
       return;
    }
}
