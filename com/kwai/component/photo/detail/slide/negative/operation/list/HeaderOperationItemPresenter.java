package com.kwai.component.photo.detail.slide.negative.operation.list.HeaderOperationItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mf5.w0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import kf5.g;
import crd.a;
import crd.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.component.photo.detail.slide.negative.operation.list.HeaderOperationItemPresenter$onBind$2;
import msd.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kwai.component.photo.detail.slide.negative.operation.list.HeaderOperationItemPresenter$a;
import android.view.View$OnClickListener;
import ekd.m1;

public final class HeaderOperationItemPresenter extends PresenterV2	// class@000a85
{
    public w0 p;
    public g q;
    public View r;
    public TextView s;
    public KwaiImageView t;

    public void HeaderOperationItemPresenter(){
       super();
    }
    public static final w0 P8(HeaderOperationItemPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mOperationListItem");
       }
       return p0;
    }
    public void E8(){
       HeaderOperationItemPresenter tp1;
       if (PatchProxy.applyVoid(null, this, HeaderOperationItemPresenter.class, "3")) {
          return;
       }
       HeaderOperationItemPresenter tag = this.m8().getTag(R.id.item_view_bind_data);
       Objects.requireNonNull(tag, "null cannot be cast to non-null type com.kwai.component.photo.detail.slide.negative.operation.list.OperationListItem");
       this.p = tag;
       HeaderOperationItemPresenter tq = this.q;
       if (tq == null) {
          a.S("mIMoreOperationPanel");
       }
       tag.f(tq);
       tag = this.p;
       String str = "mOperationListItem";
       if (tag == null) {
          a.S(str);
       }
       this.X7(tag.j());
       tag = this.r;
       if (tag == null) {
          a.S("mRootView");
       }
       ViewGroup$LayoutParams layoutParams = tag.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       HeaderOperationItemPresenter tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       layoutParams.setMarginStart(tp.r());
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       layoutParams.setMarginEnd(tp.s());
       tag.setLayoutParams(layoutParams);
       tag = this.p;
       if (tag == null) {
          a.S(str);
       }
       if (!tag.E()) {
          tag = this.p;
          if (tag == null) {
             a.S(str);
          }
          tag.O(HeaderOperationItemPresenter$onBind$2.INSTANCE);
          tag = this.p;
          if (tag == null) {
             a.S(str);
          }
          tag.S(R.color.arg_RES_7f061691);
       }
       tag = this.p;
       if (tag == null) {
          a.S(str);
       }
       HeaderOperationItemPresenter headerOperat = 1;
       tag = (tag.w().length() > 0)? 1: null;
       String str1 = "mTitle";
       if (tag) {
          tag = this.s;
          if (tag == null) {
             a.S(str1);
          }
          tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          tag.setText(tp1.w());
       }else {
          tag = this.s;
          if (tag == null) {
             a.S(str1);
          }
          tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          tag.setText(tp1.y());
       }
       tag = this.s;
       if (tag == null) {
          a.S(str1);
       }
       tp1 = this.s;
       if (tp1 == null) {
          a.S(str1);
       }
       Context context = tp1.getContext();
       tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       tag.setTextColor(ContextCompat.getColorStateList(context, tp1.x()));
       tag = this.p;
       if (tag == null) {
          a.S(str);
       }
       if (!tag.E()) {
          tag = this.p;
          if (tag == null) {
             a.S(str);
          }
          if (tag.B()) {
             tag = this.t;
             if (tag == null) {
                a.S("mIcon");
             }
             headerOperat = this.p;
             if (headerOperat == null) {
                a.S(str);
             }
             tag.setImageResource(headerOperat.B());
          }else {
          label_0130 :
             tag = this.p;
             if (tag == null) {
                a.S(str);
             }
             if (tag.n().length() <= 0) {
                headerOperat = null;
             }
             if (headerOperat != null) {
                tag = this.t;
                if (tag == null) {
                   a.S("mIcon");
                }
                headerOperat = this.p;
                if (headerOperat == null) {
                   a.S(str);
                }
                tag.L(headerOperat.n());
             }else {
                tag = this.t;
                if (tag == null) {
                   a.S("mIcon");
                }
                headerOperat = this.p;
                if (headerOperat == null) {
                   a.S(str);
                }
                tag.setImageResource(headerOperat.p());
             }
          }
       }else {
          goto label_0130 ;
       }
       tag = this.t;
       if (tag == null) {
          a.S("mIcon");
       }
       tag.setPressed(false);
       tag = this.r;
       if (tag == null) {
          a.S("mRootView");
       }
       tag.setOnClickListener(new HeaderOperationItemPresenter$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HeaderOperationItemPresenter.class, "4")) {
          return;
       }
       HeaderOperationItemPresenter tp = this.p;
       if (tp == null) {
          a.S("mOperationListItem");
       }
       tp.h();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HeaderOperationItemPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.r = p0;
       View view = m1.f(p0, R.id.item_title);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.item_title\)");
       this.s = view;
       p0 = m1.f(p0, R.id.item_icon);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.item_icon\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HeaderOperationItemPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FEEDBACK_OPERATION_PANEL");
       a.o(obj, "inject\(DetailSlideAccess¡­FEEDBACK_OPERATION_PANEL\)");
       this.q = obj;
       return;
    }
}
