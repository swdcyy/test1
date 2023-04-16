package gra.j;
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
import java.util.ArrayList;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.ShowShareDialog;
import fra.c;
import gra.i;
import java.lang.Enum;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.content.Context;
import ea9.a;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import com.yxcorp.gifshow.growth.vfc.model.NormalInviteInfo;
import android.text.Spanned;
import android.text.Html;
import java.lang.CharSequence;
import android.graphics.Typeface;
import ekd.d0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.text.TextUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import gra.j$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;

public final class j extends h	// class@002bb6
{
    public final float r;
    public final float s;
    public c t;
    public final e u;
    public final e v;
    public final e w;
    public final ArrayList x;
    public static final n[] y;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(j.class, "mBottomBg", "getMBottomBg\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(j.class, "mNormalInviteLayout", "getMNormalInviteLayout\(\)Landroid/view/View;", 0)),m0.r(new PropertyReference1Impl(j.class, "mSubTitle", "getMSubTitle\(\)Landroid/widget/TextView;", 0))};
       j.y = onArray;
    }
    public void j(){
       super();
       this.r = 228.00f;
       this.s = 166.00f;
       this.u = this.S8(0x7f0a0482);
       this.v = this.S8(0x7f0a32ed);
       this.w = this.S8(0x7f0a3bd1);
       this.x = new ArrayList();
    }
    public void E8(){
       Context context;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "7")) {
          return;
       }
       j tx = this.x;
       tx.add(this.m8().findViewById(R.id.avatar1));
       tx.add(this.m8().findViewById(R.id.avatar2));
       tx.add(this.m8().findViewById(R.id.avatar3));
       tx.add(this.m8().findViewById(R.id.avatar4));
       tx.add(this.m8().findViewById(R.id.avatar5));
       tx = this.t;
       if (tx == null) {
          a.S("mCallContext");
       }
       ShowShareDialog showShareDia = tx.b();
       if (showShareDia != null) {
          ShowShareDialog inviteSelect = showShareDia.inviteSelector;
          String str = "context!!";
          if (inviteSelect == null || i.a[inviteSelect.ordinal()] != 1) {
             this.b9().setVisibility(8);
             ViewGroup$LayoutParams layoutParams = this.a9().getLayoutParams();
             if (layoutParams != null) {
                context = this.getContext();
                a.m(context);
                a.o(context, str);
                layoutParams.height = (int)a.a(context, this.s);
             }
             View view = this.k8(R.id.btn_layout);
             if (view != null) {
                objArray = view.getLayoutParams();
             }
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             Context context1 = this.getContext();
             a.m(context1);
             a.o(context1, str);
             objArray.bottomMargin = (int)a.a(context1, 40.00f);
          }else {
             this.b9().setVisibility(0);
             ViewGroup$LayoutParams layoutParams1 = this.a9().getLayoutParams();
             if (layoutParams1 != null) {
                Context context2 = this.getContext();
                a.m(context2);
                a.o(context2, str);
                layoutParams1.height = (int)a.a(context2, this.r);
             }
             ShowShareDialog normalInvite = showShareDia.normalInviteInfo;
             if (normalInvite != null) {
                this.c9().setText(Html.fromHtml(normalInvite.subTitle));
                this.c9().setTypeface(d0.a("alte-din.ttf", this.getContext()));
                NormalInviteInfo totalInviteC = normalInvite.totalInviteCount;
                i = 0;
                while (i < totalInviteC) {
                   KwaiImageView kwaiImageVie = this.x.get(i);
                   if (kwaiImageVie != null) {
                      if (!TextUtils.isEmpty(CollectionsKt___CollectionsKt.F2(normalInvite.inviteList, i))) {
                         kwaiImageVie.setImageURI(normalInvite.inviteList.get(i));
                      }else {
                         kwaiImageVie.setOnClickListener(new j$a(normalInvite, i, showShareDia, this));
                      }
                      kwaiImageVie.setVisibility(0);
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public final KwaiImageView a9(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.a(this, j.y[0]);
    }
    public final View b9(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.a(this, j.y[1]);
    }
    public final TextView c9(){
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.a(this, j.y[2]);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.t = obj;
       return;
    }
}
